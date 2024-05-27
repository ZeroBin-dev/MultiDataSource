package com.example.mulitds.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.example.mulitds.dao.maria", sqlSessionFactoryRef = "mariadbSqlSessionFactory")
public class MariaMybatisConfig {

  @Bean
  public SqlSessionFactory mariadbSqlSessionFactory(@Qualifier("mariadbDataSource") DataSource dataSource) throws Exception {
    SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
    factoryBean.setDataSource(dataSource);
    factoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/maria/*.xml"));
    return factoryBean.getObject();
  }

}