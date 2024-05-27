package com.example.mulitds.dao.oracle;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OracleDAO {

  String selectSysdate();
}
