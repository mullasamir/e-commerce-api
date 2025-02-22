package org.dnyanyog.dao;

import org.dnyanyog.entity.Users;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersDao extends JpaRepository<Users, Integer> {

	public Users findByfirstName(String firstName);

	public Users findByloginName(String loginName);

}
