package me.tspace.account.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import me.tspace.account.dao.UserMapper;
import me.tspace.account.model.Login;
import me.tspace.account.model.User;
import me.tspace.account.model.UserExample;
import me.tspace.account.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	@Transactional(readOnly=false,rollbackFor=DataAccessException.class)
	public User createCreate(Login login) {
		User user = new User();
		user.setUserEmail(login.getLoginEmail());
		user.setUserFamilyId(0);
		user.setUserLevel(1);
		user.setUserLoginId(login.getLoginId());
		user.setUserName(login.getLoginName());
		user.setUserRegdate(new Date());
		userMapper.insert(user);
		return user;
	}

	@Override
	@Transactional(readOnly = true)
	public boolean checkNameExists(String name) {
		boolean flag = false;
		UserExample example = new UserExample();
		List<User> users = new ArrayList<User>();
		example.createCriteria().andUserNameEqualTo(name);
		users = userMapper.selectByExample(example);
		if(users.size()>0){
			flag = true;
		}
		return flag;
	}

	@Override
	@Transactional(readOnly = true)
	public boolean checkEmailExists(String email) {
		boolean flag = false;
		UserExample example = new UserExample();
		List<User> users = new ArrayList<User>();
		example.createCriteria().andUserEmailEqualTo(email);
		users = userMapper.selectByExample(example);
		if(users.size()>0){
			flag = true;
		}
		return flag;
	}

}