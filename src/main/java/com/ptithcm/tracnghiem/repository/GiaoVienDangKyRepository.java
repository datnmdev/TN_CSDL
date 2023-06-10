/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.tracnghiem.repository;

import com.microsoft.sqlserver.jdbc.SQLServerDataTable;
import com.ptithcm.tracnghiem.entity.GiaoVienDangKy;
import com.ptithcm.tracnghiem.global_variable.LoginVariables;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author MINHDAT
 */
public class GiaoVienDangKyRepository implements SelectDataRepositoryInterface, SaveDataRepositoryInterface {

    @Override
    public Object find(Object object) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public static GiaoVienDangKy find(String maLop, String maMH, short lan) throws SQLException {
        String sql = "{call SP_LAYTHONGTINGIAOVIENDANGKY(?,?,?)}";

        try (Connection connection = LoginVariables.databaseConnector.getConnection();) {
            CallableStatement cstm = connection.prepareCall(sql);
            cstm.setString(1, maLop);
            cstm.setString(2, maMH);
            cstm.setShort(3, lan);
            ResultSet rs = cstm.executeQuery();

            GiaoVienDangKy gvdk = null;
            while (rs.next()) {
                gvdk = new GiaoVienDangKy(
                        rs.getString(1), rs.getString(2), 
                        rs.getString(3), rs.getString(4), 
                        new Date(rs.getTimestamp(5).getTime()), 
                        rs.getShort(6), rs.getShort(7), rs.getShort(8)
                );
            }
            return gvdk;
        }
    }

    @Override
    public List<Object> findAll() throws SQLException {
        String sql = "{call SP_LAYDANHSACHGIAOVIENDANGKY(?,?)}";

        try (Connection connection = LoginVariables.databaseConnector.getConnection();) {
            CallableStatement cstm = connection.prepareCall(sql);
            cstm.setString(1, LoginVariables.databaseConnector.getAccount().getGroupName());
            cstm.setString(2, LoginVariables.databaseConnector.getAccount().getUsername());
            ResultSet rs = cstm.executeQuery();

            List<Object> gvdks = new ArrayList<>();
            while (rs.next()) {
                gvdks.add(
                        new GiaoVienDangKy(
                                rs.getString(1), rs.getString(2),
                                rs.getString(3), rs.getString(4),
                                new Date(rs.getTimestamp(5).getTime()), 
                                rs.getShort(6), rs.getShort(7),
                                rs.getShort(8)
                        )
                );
            }
            return gvdks;
        }
    }
    
    @Override
    public void saveAll(SQLServerDataTable sqlServerDataTable) throws SQLException {
        String sql = "{call SP_GHIDANHSACHGIAOVIENDANGKY(?)}";

        try (Connection connection = LoginVariables.databaseConnector.getConnection();) {
            CallableStatement cstm = connection.prepareCall(sql);
            cstm.setObject(1, sqlServerDataTable);
            cstm.execute();
        }
    }

    public boolean checkGVDKExistInAllTable(String maLop, String maMH, int lanThi) throws SQLException {
        String sql = "{? = call SP_KIEMTRASUTONTAIGIAOVIENDANGKY(?, ?, ?)}";

        try (Connection connection = LoginVariables.databaseConnector.getConnection();) {
            CallableStatement cstm = connection.prepareCall(sql);
            cstm.registerOutParameter(1, java.sql.Types.INTEGER);
            cstm.setString(2, maLop);
            cstm.setString(3, maMH);
            cstm.setInt(4, lanThi);
            cstm.execute();
            return cstm.getInt(1) == 1 ? true : false;
        }
    }
}
