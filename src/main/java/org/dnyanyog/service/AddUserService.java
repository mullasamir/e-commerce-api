package org.dnyanyog.service;

import java.sql.SQLException;

import org.dnyanyog.dao.UsersDao;
import org.dnyanyog.dto.AddUserRequest;
import org.dnyanyog.dto.AddUserResponse;
import org.dnyanyog.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AddUserService {

	@Autowired
	UsersDao usersDao;

	public AddUserResponse addUser(AddUserRequest adduserbody) throws SQLException {

		Users userTable = new Users();

		userTable.setFirstName(adduserbody.getFname());
		userTable.setLastName(adduserbody.getLname());
		userTable.setEmail(adduserbody.getEmail());
		userTable.setLoginName(adduserbody.getLogin_name());
		userTable.setPassword(adduserbody.getPassword());

		Users dataInsertByDaoUsers = usersDao.save(userTable);

		AddUserResponse response = new AddUserResponse();
		response.setErrorCode("0000");
		response.setMessage("User Added Sucessfully!!");
		response.setRequest(adduserbody);

		response.setUser_id(dataInsertByDaoUsers.getUser_id());

		return response;

//		AddUserResponse response = new AddUserResponse();
//		if (adduserbody.addUserIntoDb()) {
//			response.errorCode = "0000";
//			response.msg = "success";
//			return response;
//		} else {
//			response.errorCode = "0001";
//			response.msg = "failed !!!!";
//			return response;
//		}

	}

}
