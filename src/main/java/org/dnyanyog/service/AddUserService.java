package org.dnyanyog.service;

import java.sql.SQLException;

import org.dnyanyog.dto.AddUserRequest;
import org.dnyanyog.dto.AddUserResponse;

public class AddUserService {
	public AddUserResponse addUser(AddUserRequest adduserbody) throws SQLException {

		AddUserResponse response = new AddUserResponse();
		if (adduserbody.addUserIntoDb()) {
			response.errorCode = "0000";
			response.msg = "success";
			return response;
		} else {
			response.errorCode = "0001";
			response.msg = "failed to authenticate";
			return response;
		}

	}

}
