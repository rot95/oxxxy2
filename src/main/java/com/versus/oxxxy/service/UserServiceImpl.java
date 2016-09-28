package com.versus.oxxxy.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.versus.oxxxy.model.User;
import com.versus.oxxxy.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserRepository userRepository;

	@Override
	@Transactional
	public User create(User user) {
		User createdUser = user;
		return userRepository.save(createdUser);
	}

	@Override
	@Transactional
	public User findById(long id) {
		return userRepository.findOne(id);
	}

	@Override
	@Transactional(rollbackFor = UserNotFound.class)
	public User delete(long id) throws UserNotFound {
		User deletedShop = userRepository.findOne(id);

		if (deletedShop == null)
			throw new UserNotFound();

		userRepository.delete(deletedShop);
		return deletedShop;
	}

	@Override
	@Transactional
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	@Transactional(rollbackFor = UserNotFound.class)
	public User update(User user) throws UserNotFound {
		User updatedUser = userRepository.findOne(user.getUserId());

		if (updatedUser == null)
			throw new UserNotFound();

		updatedUser.setNickName(user.getNickName());
		updatedUser.setFirstName(user.getFirstName());
		updatedUser.setLastName(user.getLastName());
		updatedUser.setEmail(user.getEmail());
		updatedUser.setPassword(user.getPassword());
		return updatedUser;
	}
}