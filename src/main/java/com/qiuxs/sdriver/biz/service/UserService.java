package com.qiuxs.sdriver.biz.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qiuxs.cuteframework.core.persistent.modal.PropertyWrapper;
import com.qiuxs.cuteframework.core.persistent.service.AbstractDataService;
import com.qiuxs.sdriver.biz.dao.UserDao;
import com.qiuxs.sdriver.biz.entity.User;

@Service
public class UserService extends AbstractDataService<Long, User, UserDao> {

	private static final String TABLE_NAME = "user";

	@Resource
	private UserDao userDao;

	public UserService() {
		super(Long.class, User.class, TABLE_NAME);
	}

	@Override
	protected UserDao getDao() {
		return this.userDao;
	}

	@Override
	protected void initProps(List<PropertyWrapper<?>> props) {
		
	}
}
