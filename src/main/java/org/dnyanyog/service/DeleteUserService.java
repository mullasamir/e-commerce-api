package org.dnyanyog.service;

import org.dnyanyog.dao.UsersDao;
import org.dnyanyog.dto.DeleteUserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteUserService {
	
	@Autowired
	UsersDao usersDao;
	
	@Autowired
	DeleteUserResponse deleteUserResponse;
	
	public DeleteUserResponse deleteUserById(Integer user_id) {
		usersDao.deleteById(user_id);
		
		deleteUserResponse.setResponseMsg("User Delete Successfully...");
		deleteUserResponse.setResponseCode("000");
		return deleteUserResponse;
	}

}
