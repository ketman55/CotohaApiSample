package com.lab.app.ketman.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lab.app.ketman.data.SpecUpdateMaster;
import com.lab.app.ketman.model.AccessTokenDto;
import com.lab.app.ketman.model.PostInputDto;
import com.lab.app.ketman.model.SpecDto;
import com.lab.app.ketman.model.parse.ParseDto;
import com.lab.app.ketman.model.sentencetype.SentenceTypeDto;
import com.lab.app.ketman.model.sentiment.SentimentDto;
import com.lab.app.ketman.model.similarity.SimilarityDto;
import com.lab.app.ketman.service.AccessTokenManager;
import com.lab.app.ketman.service.InstructionsMasterManager;
import com.lab.app.ketman.service.ParseManager;
import com.lab.app.ketman.service.SentenceTypeManager;
import com.lab.app.ketman.service.SentimentManager;
import com.lab.app.ketman.service.SimilarityManager;

@RestController
public class BusinessLogicController {
	// AccessToken is shared
	AccessTokenDto accessTokenDto = new AccessTokenDto();
	// SpecDto is permanent
	SpecDto specDto = new SpecDto();

	// Fetch access token (do at first)
	@PostMapping("/accesstoken")
	public AccessTokenDto requestAccessToken() {
		AccessTokenManager atManager = new AccessTokenManager();
		accessTokenDto = atManager.postAccessToken(accessTokenDto);
		return accessTokenDto;
	}

	// Fetch parse result
	@PostMapping("/parse")
	public ParseDto requestParse(@RequestParam("sentence") String sentence) {
		ParseManager parseManager = new ParseManager();
		return parseManager.getParseResult(accessTokenDto, sentence);
	}

	// Fetch similarity
	@PostMapping("/similarity")
	public SimilarityDto requestSimilarity(
			@RequestParam("s1") String s1,
			@RequestParam("s2") String s2) {
		SimilarityManager similarityManager = new SimilarityManager();
		return similarityManager.getSimilarityResult(accessTokenDto, s1, s2);
	}

	// Fetch sentence type
	@PostMapping("/sentence_type")
	public SentenceTypeDto requestSentenceType(@RequestParam("sentence") String sentence) {
		SentenceTypeManager sentenceTypeManager = new SentenceTypeManager();
		return sentenceTypeManager.getSentenceTypeResult(accessTokenDto, sentence);
	}

	// Fetch sentiment
	@PostMapping("/sentiment")
	public SentimentDto requestSentiment(@RequestParam("sentence") String sentence) {
		SentimentManager sentimentManager = new SentimentManager();
		return sentimentManager.getSimilarityResult(accessTokenDto, sentence);
	}

	// judge instruction
	@PostMapping("/instruction")
	public String requestInstruction(
			@ModelAttribute PostInputDto postInputDto,
			Model model) {
		// get input sentence
		String sentence = postInputDto.getSentence();

		// get access token
		requestAccessToken();

		// get sentence type
		boolean instructionFlag = false;
		SentenceTypeDto sentenceTypeDto = new SentenceTypeManager().getSentenceTypeResult(accessTokenDto, sentence);
		if (sentenceTypeDto.getResult().getModality().equals("imperative")) {
			instructionFlag = true;
		} else if (sentenceTypeDto.getResult().getModality().equals("declarative")) {
			for(String s : sentenceTypeDto.getResult().getDialogAct()) {
				if(s.equals("information-providing")) instructionFlag = true;
			}
		}

		// get instruction
		String instruction = "";
		if (instructionFlag) {
			instruction = new InstructionsMasterManager().getInstruction(accessTokenDto, sentence);
		} else {
			instruction = "指示ではない入力と判断しました。";
		}
		model.addAttribute("instruction", instruction);
		return instruction;
	}

	// update spec
	@PostMapping("/spec")
	public SpecDto updateSpec(@RequestParam("sentence") String sentence) {
		// get access token
		requestAccessToken();

		// get sentiment
		SentimentManager sentimentManager = new SentimentManager();
		SentimentDto sentimentDto = sentimentManager.getSimilarityResult(accessTokenDto, sentence);
		System.out.println(sentimentDto.getResult().getSentiment());

		// update spec
		SpecUpdateMaster specUpdateMaster = new SpecUpdateMaster();
		specDto = specUpdateMaster.updateSpec(specDto, sentimentDto);

		return specDto;
	}
}
