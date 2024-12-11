package org.dnyanyog.controller;

import java.sql.SQLException;

import org.dnyanyog.dto.AddUserRequest;
import org.dnyanyog.dto.AddUserResponse;
import org.dnyanyog.service.AddUserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddUserController {
	@PostMapping("/adduser")
	public AddUserResponse adduser(@RequestBody AddUserRequest adduserbody) throws SQLException {

		System.out.println(adduserbody.fname);
		System.out.println(adduserbody.lname);
		System.out.println(adduserbody.age);
		System.out.println(adduserbody.gender);
		System.out.println(adduserbody.email);
		System.out.println(adduserbody.password);

		return new AddUserService().addUser(adduserbody);

	}

}
