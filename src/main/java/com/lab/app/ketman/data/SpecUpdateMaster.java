package com.lab.app.ketman.data;

import com.lab.app.ketman.model.SpecDto;
import com.lab.app.ketman.model.sentiment.SentimentDto;

public class SpecUpdateMaster {

	public SpecDto updateSpec(SpecDto specDto, SentimentDto sentimentDto) {
		String sentiment = sentimentDto.getResult().getSentiment();

		if(sentiment.equals("Positive")) {
			specDto.updateAllStatus(0.05, 0.05, 0.0, 0.0, 0.0);
		}else if(sentiment.equals("Negative")) {
			specDto.updateAllStatus(0.0, -0.05, 0.05, 0.05, -0.05);
		}else if(sentiment.equals("Neutral")){
			// no update
		}

		if (sentimentDto.getResult().getEmotionalPhrase() != null) {
			for(int i = 0; i < sentimentDto.getResult().getEmotionalPhrase().size(); i++) {

				String[] emotionalPhrases = sentimentDto.getResult().getEmotionalPhrase().get(i).getEmotion().split(",");

				for(int j = 0; j < emotionalPhrases.length; j++) {
					String emotionalPhrase = emotionalPhrases[j];
					System.out.println(sentimentDto.getResult().getEmotionalPhrase().get(i).getForm() + ":" + emotionalPhrase);

					if(emotionalPhrase.equals("喜ぶ")) {
						specDto.updateAllStatus(0.05, 0.0, 0.0, -0.05, 0.05);

					}else if(emotionalPhrase.equals("怒る")) {
						specDto.updateAllStatus(0.05, 0.05, -0.05, 0.05, -0.05);

					}else if(emotionalPhrase.equals("悲しい")) {
						specDto.updateAllStatus(-0.05, 0.05, -0.05, 0.05, -0.05);

					}else if(emotionalPhrase.equals("不安")) {
						specDto.updateAllStatus(0.0, -0.05, 0.05, -0.05, 0.05);

					}else if(emotionalPhrase.equals("恥ずかしい")) {
						specDto.updateAllStatus(-0.05, 0.05, 0.05, -0.05, 0.05);

					}else if(emotionalPhrase.equals("好ましい")) {
						specDto.updateAllStatus(0.05, -0.05, 0.05, 0.0, 0.0);

					}else if(emotionalPhrase.equals("嫌")) {
						specDto.updateAllStatus(0.0, -0.05, 0.05, 0.0, 0.0);

					}else if(emotionalPhrase.equals("興奮")) {
						specDto.updateAllStatus(0.05, 0.05, -0.05, 0.05, -0.05);

					}else if(emotionalPhrase.equals("安心")) {
						specDto.updateAllStatus(-0.05, 0.0, 0.05, -0.05, 0.05);

					}else if(emotionalPhrase.equals("驚く")) {
						specDto.updateAllStatus(0.0, 0.05, -0.05, 0.0, 0.0);

					}else if(emotionalPhrase.equals("切ない")) {
						specDto.updateAllStatus(-0.05, 0.0, 0.05, -0.05, 0.05);

					}else if(emotionalPhrase.equals("願望")) {
						specDto.updateAllStatus(0.05, 0.0, -0.05, 0.05, -0.05);

					}
				}
			}
		}
		return specDto;
	}
}
