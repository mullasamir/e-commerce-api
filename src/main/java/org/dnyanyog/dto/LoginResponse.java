package org.dnyanyog.dto;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Component
public class LoginResponse {
	public String errorCode;
	public String msg;
	public String firstName;
	public String lastName;
//	public String loginName;
	

}
