package com.cw.mybatis.dao;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.cw.mybatis.dao.impl.UserDaoImpl;
import com.cw.mybatis.pojo.User;


/**
 * 测试类
 * @author CW
 *
 */
public class UserDaoTest {
	
	//定义UserDao的成员变量
	private UserDao userDao;
	
	@Before
	/**
	 * 在执行UserDaoImpl中的方法之前,完成sqlSession的初始化
	 * @throws Exception
	 */
	public void setUp() throws Exception {
		SqlSession sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml")).openSession();
		userDao = new UserDaoImpl(sqlSession);
	}

	@Test
	public void testQueryUserById() {
		System.out.println(userDao.queryUserById(1L));
	}

	@Test
	public void testQueryAllUser() {
		List<User> list = userDao.queryAllUser();
		for (User user : list) {
			System.out.println(user);
		}
	}

	@Test
	public void testInsertUser() {
		User user = new User();
		user.setUserName("林允儿");
		user.setPassword("123");
		user.setName("yuner");
		user.setAge(18);
		user.setSex(2);
		user.setBirthday(new Date());
		user.setCreated(new Date());
		user.setUpdated(new Date());
		//插入数据
		userDao.insertUser(user);
	}

	@Test
	public void testUpdateUser() {
		User user = new User();
		user.setId(10L);
		user.setUserName("linyuner");
		user.setPassword("123456");
		user.setName("允儿");
		user.setAge(28);
		user.setSex(2);
		user.setBirthday(new Date());
		user.setCreated(new Date());
		user.setUpdated(new Date());
		
		userDao.updateUser(user);
	}

	@Test
	public void testDeleteUser() {
		userDao.deleteUser(10L);
	}

}
