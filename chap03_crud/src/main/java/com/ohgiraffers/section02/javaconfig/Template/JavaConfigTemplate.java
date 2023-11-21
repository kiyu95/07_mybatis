package com.ohgiraffers.section02.javaconfig.Template;

import com.ohgiraffers.section02.javaconfig.model.JavaMenuDAO;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

// common의 Template로 옮겼음
//public class JavaConfigTemplate {
//    private static SqlSessionFactory sessionFactory;


