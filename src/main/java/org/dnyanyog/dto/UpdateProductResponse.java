package org.dnyanyog.dto;

public class UpdateProductResponse {

	private String errorCode;
	private String message;
	private UpdateProductRequest updateProductRequest;

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

	public UpdateProductRequest getUpdateProductRequest() {
		return updateProductRequest;
	}

	public void setUpdateProductRequest(UpdateProductRequest updateProductRequest) {
		this.updateProductRequest = updateProductRequest;
	}

}
