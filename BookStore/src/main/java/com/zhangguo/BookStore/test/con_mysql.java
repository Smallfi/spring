package com.zhangguo.BookStore.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class con_mysql {

	public static void main(String[] args) {
		
		String source="mybatis-config.xml";
        int count=0;
        SqlSession sqlSession=null;
 
        try {
            //1 获取mybatis-config.xml的输入流
            InputStream is = Resources.getResourceAsStream(source);
            //2 创建一个工厂，完成对配置文件的读取
            SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
            //3 创建sqlSession，开启工厂
            sqlSession=sqlSessionFactory.openSession();
            //4 根据放入工厂的sql语句执行不同的方法
            count=sqlSession.selectOne("com.bdqn.dao.TUserMapper.queryCount");
            System.out.println(count);
        } catch (IOException e)
        { e.printStackTrace(); }finally { sqlSession.close(); } }

}
