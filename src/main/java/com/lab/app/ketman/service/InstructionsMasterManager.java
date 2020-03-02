package com.lab.app.ketman.service;

import java.util.HashMap;

import com.lab.app.ketman.data.InstructionsMaster;
import com.lab.app.ketman.model.AccessTokenDto;
import com.lab.app.ketman.model.similarity.SimilarityDto;

public class InstructionsMasterManager {
	InstructionsMaster im = new InstructionsMaster();
	HashMap<String, String> instructionsMap = im.getInstructionsMap();

	public String getInstruction(AccessTokenDto accessTokenDto, String sentence){
		String instruction = null;
		Double score = 0.0;
		// compare with MasterSentences
		for (String key : instructionsMap.keySet()) {
			SimilarityManager similarityManager = new SimilarityManager();
			SimilarityDto sd = similarityManager.getSimilarityResult(accessTokenDto, sentence, key);

			// update return module
			Double tmpScore = (Double)sd.getResult().getScore();
			if(score < tmpScore) {
				instruction = instructionsMap.get(key);
				score = tmpScore;
				System.out.println(tmpScore + ":" + sentence + "：" + key + "：" +instruction);
			}
		}
		return instruction;
	}
}
