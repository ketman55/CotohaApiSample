package com.lab.app.ketman.model;

// COTOHA API Access Token Responce Data Object
public class AccessTokenDto {
	// request info
	private final String url = "https://api.ce-cotoha.com/v1/oauth/accesstokens";
	private final String grantType = "client_credentials";
	private final String clientId = "";
	private final String clientSecret = "";

	// response data
	private String access_token;
	private String token_type;
	private String expires_in;
	private String scope;
	private String issued_at;

	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public String getToken_type() {
		return token_type;
	}
	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}
	public String getExpires_in() {
		return expires_in;
	}
	public void setExpires_in(String expires_in) {
		this.expires_in = expires_in;
	}
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	public String getIssued_at() {
		return issued_at;
	}
	public void setIssued_at(String issued_at) {
		this.issued_at = issued_at;
	}
	public String getUrl() {
		return url;
	}
	public String getGrantType() {
		return grantType;
	}
	public String getClientId() {
		return clientId;
	}
	public String getClientSecret() {
		return clientSecret;
	}
}
