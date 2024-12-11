package org.dnyanyog.service;

import java.sql.SQLException;

import org.dnyanyog.dto.LoginRequest;
import org.dnyanyog.dto.LoginResponse;

public class LoginService {
	public LoginResponse login(LoginRequest loginbody) throws SQLException {

		LoginResponse response = new LoginResponse();
		if (loginbody.loginValidate()) {
			response.errorCode = "0000";
			response.msg = "success";
			return response;
		}else {
			response.errorCode ="0001";
			response.msg = "failed to authenticate";
			return response;
		}
			

	}

}
