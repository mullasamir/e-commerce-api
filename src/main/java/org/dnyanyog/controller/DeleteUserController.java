package org.dnyanyog.controller;

import org.dnyanyog.service.DeleteUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteUserController {
	@Autowired
	DeleteUserService deleteUserService;
	
	@DeleteMapping(path = "/api/user/deleteUserById/{user_id}")
	public void delteByUserId(@PathVariable Integer user_id) {
		deleteUserService.deleteUserById(user_id);
	}
	
	
	
	

}
