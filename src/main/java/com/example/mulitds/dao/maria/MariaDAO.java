package com.example.mulitds.dao.maria;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MariaDAO {

  String selectNow();
}
