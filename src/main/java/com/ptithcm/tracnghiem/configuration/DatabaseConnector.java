/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.tracnghiem.configuration;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import com.ptithcm.tracnghiem.model.dto.Account;
import java.sql.Connection;

/**
 *
 * @author MINHDAT
 */
public class DatabaseConnector {
    private SQLServerDataSource sqlServerDataSource;
    private Account account;

//    Constructors
    public DatabaseConnector(SQLServerDataSource sqlServerDataSource, Account account) {
        this.sqlServerDataSource = sqlServerDataSource;
        this.account = account;
    }
    
//    Methods
    public Connection getConnection() throws SQLServerException {
       return sqlServerDataSource.getConnection();
    }
    
//    Getters and setters
    public SQLServerDataSource getSqlServerDataSource() {
        return sqlServerDataSource;
    }

    public void setSqlServerDataSource(SQLServerDataSource sqlServerDataSource) {
        this.sqlServerDataSource = sqlServerDataSource;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
