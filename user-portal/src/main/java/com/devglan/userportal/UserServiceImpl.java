package com.devglan.userportal;

import java.util.List;
import org.springframework.stereotype.Service;


import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repository;
	@Override
	public User create(User user) {
		return repository.save(user);
	}

	@Override
	public User delete(int id) {
		User user = findById(id);
		if(user != null) {
			repository.delete(user);
		}
		return user;
	}

	@Override
	public List<User> findAll() {
		return repository.findAll();
	}

	@Override
	public User findById(int id) {
		return repository.findOne(id);
	}

	@Override
	public User update(User user) {
		return null;
	}

}
