package com.ohgiraffers.common;

import com.ohgiraffers.section02.javaconfig.model.JavaMenuDAO;
import com.ohgiraffers.section03.remix.model.RemixMenuDAO;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Template {
    private static SqlSessionFactory sessionFactory;

    public static SqlSession getSqlSession(){
        if (sessionFactory == null){
            try {
                InputStream inputStream = Resources.getResourceAsStream("xmlconfig/mybatis-config.xml");
                sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return sessionFactory.openSession(false);
    }

    public static SqlSession getJavaSqlSession(){
        if (sessionFactory == null){
            try {
                Properties properties = new Properties();
                properties.load(new FileReader("src/main/resources/javaconfig/javaconfig.properties"));
                String driver = properties.getProperty("DRIVER");
                String url = properties.getProperty("URL");
                String user = properties.getProperty("USER");
                String pass = properties.getProperty("PASS");
//                System.out.println("test ------------");
//                System.out.println(driver);
//                System.out.println(url);
//                System.out.println(user);
//                System.out.println(pass);

                Environment environment = new Environment("dev",
                        new JdbcTransactionFactory(),
                        new PooledDataSource(driver,url,user,pass)
                );
                Configuration configuration = new Configuration(environment);
                configuration.addMapper(JavaMenuDAO.class);

                sessionFactory = new SqlSessionFactoryBuilder().build(configuration);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return sessionFactory.openSession(false);
    }

    public static SqlSession getRemixSqlSession(){
        if (sessionFactory == null){
            try {
                Properties properties = new Properties();
                properties.load(new FileReader("src/main/resources/javaconfig/javaconfig.properties"));
                String driver = properties.getProperty("DRIVER");
                String url = properties.getProperty("URL");
                String user = properties.getProperty("USER");
                String pass = properties.getProperty("PASS");

                Environment environment = new Environment("dev",
                        new JdbcTransactionFactory(),
                        new PooledDataSource(driver,url,user,pass)
                );
                Configuration configuration = new Configuration(environment);
                configuration.addMapper(RemixMenuDAO.class);

                sessionFactory = new SqlSessionFactoryBuilder().build(configuration);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return sessionFactory.openSession(false);
    }

}
