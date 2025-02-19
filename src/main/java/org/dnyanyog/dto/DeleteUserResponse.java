package org.dnyanyog.dto;

import org.springframework.stereotype.Component;

@Component
public class DeleteUserResponse {

	private String responseMsg;
	private String responseCode;

	public String getResponseMsg() {
		return responseMsg;
	}

	public void setResponseMsg(String responseMsg) {
		this.responseMsg = responseMsg;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

}
