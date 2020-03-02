package com.lab.app.ketman.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.lab.app.ketman.model.AccessTokenDto;

public class AccessTokenManager {

	public AccessTokenDto postAccessToken(AccessTokenDto accessTokenDto) {
		// create an instance of RestTemplate
		RestTemplate restTemplate = new RestTemplate();

		// request body parameters
		Map<String, String> map = new HashMap<>();
		map.put("grantType", accessTokenDto.getGrantType());
		map.put("clientId", accessTokenDto.getClientId());
		map.put("clientSecret", accessTokenDto.getClientSecret());

		// send POST request
		ResponseEntity<AccessTokenDto> response = restTemplate.postForEntity(accessTokenDto.getUrl(), map, AccessTokenDto.class);

	    return response.getBody();
	}
}
