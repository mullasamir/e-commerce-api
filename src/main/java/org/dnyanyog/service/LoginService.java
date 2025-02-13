package org.dnyanyog.service;

import java.sql.SQLException;

import org.dnyanyog.dao.UsersDao;
import org.dnyanyog.dto.LoginRequest;
import org.dnyanyog.dto.LoginResponse;
import org.dnyanyog.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginService {
	
	@Autowired
	UsersDao userDao;
	
	public LoginResponse login(LoginRequest loginbody) throws SQLException {

		LoginResponse response = new LoginResponse();
		
//		Users userRecievedFromDB = userDao.findById(1).get();
		Users userRecievedFromDB = userDao.findByloginName(loginbody.user);
		
		if (userRecievedFromDB.getLoginName().equals(loginbody.user) && userRecievedFromDB.getPassword().equals(loginbody.password)) {
			response.errorCode = "0000";
			response.msg = "success";
			response.firstName = userRecievedFromDB.getFirstName();
			response.lastName = userRecievedFromDB.getLastName();
			
			return response;
		}else {
			response.errorCode ="0001";
			response.msg = "failed to authenticate";
			return response;
		}
		
		
//		response.errorCode = "0000";
//		response.msg = "sucess";
//		response.firstName = userRecievedFromDB.getFirstName();
//		response.lastName = userRecievedFromDB.getLastName();
//		response.loginName = userRecievedFromDB.getLoginName();
//		return response;
			

	}

}
