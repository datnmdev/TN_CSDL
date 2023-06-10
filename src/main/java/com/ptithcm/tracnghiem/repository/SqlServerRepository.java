/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.tracnghiem.repository;

import com.ptithcm.tracnghiem.configuration.DatabaseConnector;
import com.ptithcm.tracnghiem.model.dto.Subscriber;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MINHDAT
 */
public class SqlServerRepository implements SelectDataRepositoryInterface {
    private DatabaseConnector databaseConnector;

    public SqlServerRepository(DatabaseConnector databaseConnector) {
        this.databaseConnector = databaseConnector;
    }
    
    @Override
    public List<Object> findAll() throws SQLException {
        String sql = "SELECT * FROM V_DS_PHANMANH";
        
        try (Connection cnn = databaseConnector.getConnection();
            Statement stmt = cnn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);) {
            
            List<Object> subscribers = new ArrayList<>();
            while (rs.next()) {
                subscribers.add(
                        new Subscriber(
                                rs.getString("TENCS"),
                                rs.getString("TENSERVER")
                        )
                );
            }
            return subscribers;
        }
    }

    @Override
    public Object find(Object object) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
