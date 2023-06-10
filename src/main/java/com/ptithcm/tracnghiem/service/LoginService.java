/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.tracnghiem.service;

import com.ptithcm.tracnghiem.configuration.DatabaseConnector;
import com.ptithcm.tracnghiem.exception.InvalidInputException;
import com.ptithcm.tracnghiem.global_variable.LoginVariables;
import com.ptithcm.tracnghiem.model.dto.Account;
import com.ptithcm.tracnghiem.repository.LoginRepository;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author MINHDAT
 */
public class LoginService {
    private DatabaseConnector databaseConnector;

    public LoginService(DatabaseConnector databaseConnector) {
        this.databaseConnector = databaseConnector;
    }
    
    public void login(Account account) throws SQLException, IOException, InvalidInputException {
        String url = databaseConnector.getSqlServerDataSource().getURL();
        if (account.getObject().equals("Sinh viên")) {
            if (url.lastIndexOf("username") != -1) {
                url = url.replace(url.substring(url.lastIndexOf("username")), "");
            }
            databaseConnector.getSqlServerDataSource().setURL(url + String.format("username=%s;password=%s", "SV", "123456"));
            databaseConnector.setAccount(account);
            if (!(new LoginRepository(databaseConnector).getLoginResult(account))) {
                throw new InvalidInputException("Tên đăng nhập hoặc mật khẩu không đúng!");
            }
        } else {
            if (url.lastIndexOf("username") != -1) {
                url = url.replace(url.substring(url.lastIndexOf("username")), "");
            }
            databaseConnector.getSqlServerDataSource().setURL(url + String.format("username=%s;password=%s", account.getLoginName(), account.getPassword()));
            databaseConnector.setAccount(account);
        }
        
        try (Connection conn = databaseConnector.getConnection();) {
            new LoginRepository(databaseConnector).getUserInfo(account);
            databaseConnector.setAccount(account);
        }
        
//        Gán thông tin đăng nhập và kết nối vào biến toàn cục
        LoginVariables.databaseConnector = databaseConnector;
    }
}
