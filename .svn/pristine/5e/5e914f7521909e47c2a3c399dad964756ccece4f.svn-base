package com.cw.mybatis.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCTest {
	
	public static void main(String[] args) throws Exception {
		//注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		
		//获取连接
		String url = "jdbc:mysql:///mybatis";
		String user = "root";
		String password = "123";
		Connection connection = DriverManager.getConnection(url, user, password);
		
		//获取传输对象
		String sql = "select * from tb_user where id = ? ";
		PreparedStatement prepareStatement = connection.prepareStatement(sql);
		
		//设置参数
		prepareStatement.setLong(1, 1L);
		
		//查询
		ResultSet resultSet = prepareStatement.executeQuery();
		
		//对查询结果进行遍历
		while(resultSet.next()){
			System.out.println(resultSet.getString("user_name"));
			System.out.println(resultSet.getString("password"));
			System.out.println(resultSet.getString("name"));
		}
	
		//关闭流资源---先开后关
		resultSet.close();
		prepareStatement.close();
		connection.close();
	}
	
}
