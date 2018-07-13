package com.cw.mybatis.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.cw.mybatis.dao.UserDao;
import com.cw.mybatis.pojo.User;

public class UserDaoImpl implements UserDao {
	
	//提供成员变量
	private SqlSession sqlSession;
	
	//提供有参构造
	public UserDaoImpl(SqlSession sqlSession){
		this.sqlSession = sqlSession;
	}
	

	@Override
	/**
	 * 根据用户的id查询user
	 */
	public User queryUserById(Long id) {
		User user = this.sqlSession.selectOne("UserDaoMapper.queryUserById", 1L);
		return user;
	}

	@Override
	/**
	 * 查询所有user
	 */
	public List<User> queryAllUser() {
		List<User> userList = this.sqlSession.selectList("UserDaoMapper.queryAllUser");
		return userList;
	}

	@Override
	/**
	 * 插入用户数据
	 */
	public void insertUser(User user) {
		this.sqlSession.insert("UserDaoMapper.insertUser", user);
		this.sqlSession.commit();
	}

	@Override
	/**
	 * 根据用户信息
	 */
	public void updateUser(User user) {
		this.sqlSession.update("UserDaoMapper.updateUser", user);
		this.sqlSession.commit();
	}

	@Override
	/**
	 * 根据id删除对应的用户
	 */
	public void deleteUser(Long id) {
		this.sqlSession.delete("UserDaoMapper.deleteUser", id);
		this.sqlSession.commit();
	}

}
