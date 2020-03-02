package com.lab.app.ketman.service;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.lab.app.ketman.model.AccessTokenDto;
import com.lab.app.ketman.model.sentencetype.SentenceTypeDto;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class SentenceTypeManager {
	public SentenceTypeDto getSentenceTypeResult(AccessTokenDto accessTokenDto, String sentence) {
		SentenceTypeDto std = null;

		String url = "https://api.ce-cotoha.com/api/dev" + "/nlp/v1/sentence_type";
	    String type = "default";
	    String access_token = accessTokenDto.getAccess_token();

	    Gson gson = new Gson();
	    JsonObject jsonObj = new JsonObject();
	    jsonObj.addProperty("sentence", sentence);
	    jsonObj.addProperty("type", type);

	    OkHttpClient client = new OkHttpClient();
	    MediaType JSON = MediaType.get("application/json; charset=utf-8");
	    RequestBody body = RequestBody.create(JSON, jsonObj.toString());
	    Request request = new Request.Builder() //
	            .addHeader("Authorization", "Bearer " + access_token) //
	            .url(url)
	            .post(body)
	            .build();

	    try (Response response = client.newCall(request).execute()) {
	        String originalResponseBody = response.body().string();
	        System.out.println(originalResponseBody);
	        std = (SentenceTypeDto)gson.fromJson(originalResponseBody, SentenceTypeDto.class);
	        System.out.println(std.toString());

	    } catch (Exception e) {
			e.printStackTrace();
		}

	    return std;
	}
}
