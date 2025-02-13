package org.dnyanyog.dto;

public class AddProductResponse {
	private String errorCode;
	private String message;
	private Integer pid;

	private AddProductRequest request;

	public AddProductRequest getRequest() {
		return request;
	}

	public void setRequest(AddProductRequest request) {
		this.request = request;
	}
	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

}
