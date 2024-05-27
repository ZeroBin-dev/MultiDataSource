package com.example.mulitds.service;

import com.example.mulitds.dao.maria.MariaDAO;
import com.example.mulitds.dao.oracle.OracleDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MainService {

  private final OracleDAO oracleDAO;
  private final MariaDAO mariaDAO;

  public void getQuery() {
    String oraResult = oracleDAO.selectSysdate();
    String marResult = mariaDAO.selectNow();

    System.out.println("ora : " + oraResult + " / maria : " + marResult);
  }

}
