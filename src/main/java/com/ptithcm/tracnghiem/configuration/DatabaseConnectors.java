/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.tracnghiem.configuration;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.ptithcm.tracnghiem.global_variable.ResetInterface;
import com.ptithcm.tracnghiem.model.dto.Account;
import com.ptithcm.tracnghiem.view.MessageBox;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

/**
 *
 * @author MINHDAT
 */

public class DatabaseConnectors implements ResetInterface {
    public static DatabaseConnector databasePubConnector;
    public static Map<String,DatabaseConnector> databaseSubConnectors = null;
    
    static {
        try {
            InputStream input = DatabaseConnectors.class.getClassLoader().getResourceAsStream("config-files/datasource.properties");
            Properties prop = new Properties();
            prop.load(input);
            SQLServerDataSource sqlServerDataSource = new SQLServerDataSource();
            sqlServerDataSource.setURL(prop.getProperty("DESKTOP-N52G36K"));
            Account account = new Account();
            account.setLoginName(sqlServerDataSource.getUser());
            databasePubConnector = new DatabaseConnector(sqlServerDataSource, account);
        } catch (IOException ex) {
            MessageBox.showErrorBox(ex.getClass().getName(), ex.getMessage());
        }
    }

    @Override
    public void reset() {
        databaseSubConnectors = null;
    }
}
