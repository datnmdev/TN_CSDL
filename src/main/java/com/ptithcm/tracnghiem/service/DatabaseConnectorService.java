/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.tracnghiem.service;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.ptithcm.tracnghiem.configuration.DatabaseConnector;
import com.ptithcm.tracnghiem.configuration.DatabaseConnectors;
import com.ptithcm.tracnghiem.model.dto.Account;
import com.ptithcm.tracnghiem.model.dto.Subscriber;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MINHDAT
 */
public class DatabaseConnectorService {
    public Map<String, DatabaseConnector> createDatabaseSubscriberConnectors(List<Subscriber> subscribers) throws SQLException {
        Map<String, DatabaseConnector> databaseSubConnectors = new HashMap<>();
        
        for (Subscriber subscriber : subscribers) {
            try {
                InputStream input = DatabaseConnectors.class.getClassLoader().getResourceAsStream("config-files/datasource.properties");
                Properties prop = new Properties();
                prop.load(input);
                SQLServerDataSource sqlServerDataSource = new SQLServerDataSource();
                sqlServerDataSource.setURL(prop.getProperty(subscriber.getServerName()));
                Account account = new Account();
                account.setLoginName(sqlServerDataSource.getUser());
                databaseSubConnectors.put(
                        subscriber.getServerName(),
                        new DatabaseConnector(sqlServerDataSource, account)
                );
            } catch (IOException ex) {
                Logger.getLogger(DatabaseConnectorService.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return databaseSubConnectors;
    }
    
    public void saveDatabaseSubscriberConnectors(Map<String, DatabaseConnector> databaseSubscriberConnectors) {
        DatabaseConnectors.databaseSubConnectors = databaseSubscriberConnectors;
    }
}
