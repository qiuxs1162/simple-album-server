package com.qiuxs.sdriver.biz.dao;

import org.springframework.stereotype.Repository;

import com.qiuxs.cuteframework.core.persistent.dao.IBaseDao;
import com.qiuxs.sdriver.biz.entity.User;

@Repository
public interface UserDao extends IBaseDao<Long, User> {

}