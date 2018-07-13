package com.cw.mybatis.test;

import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.cw.mybatis.pojo.User;

/**
 *
 *测试
 */
public class MybatisTest {
	
	public static void main(String[] args) throws Exception {
		
		//指定mybatis配制文件
		String resource = "mybatis-config.xml";
		
		//获取配制文件流对象
		InputStream inputStream = Resources.getResourceAsStream(resource);
		
		//构建sqlSessionFactory对象
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		//获取session对象
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		//执行查询,获取结果集(根据配置文件,找到namespace,然后找到id为queryUserById的语句进行执行;执行完毕后,返回结果)
		User user = sqlSession.selectOne("UserMapper.queryUserById", 1L);
		//打印结果
		System.out.println(user);
		
		//关闭流资源(关闭之前进行判断)
		if(sqlSession != null){
			sqlSession.close();
		}
	}
	
}
