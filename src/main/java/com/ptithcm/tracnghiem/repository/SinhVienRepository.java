/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.tracnghiem.repository;

import com.microsoft.sqlserver.jdbc.SQLServerDataTable;
import com.ptithcm.tracnghiem.entity.SinhVien;
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
public class SinhVienRepository implements SelectDataRepositoryInterface {
    @Override
    public Object find(Object object) throws SQLException {
        String sql = "{call SP_LAYTHONGTINSINHVIEN(?)}";
        
        try (Connection connection = LoginVariables.databaseConnector.getConnection();) {
            CallableStatement cstm = connection.prepareCall(sql);
            cstm.setString(1, String.valueOf(object));
            ResultSet rs = cstm.executeQuery();
            
           Object student = null;
            while (rs.next()) {
                student = new SinhVien(
                        rs.getString(1), rs.getString(2), 
                        rs.getString(3), new Date(rs.getTimestamp(4).getTime()),
                        rs.getString(5), rs.getString(6)
                );
            }
            return student;
        }
    }

    @Override
    public List<Object> findAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public static List<SinhVien> findAllStudentOfClass(String maLop) throws SQLException {
        String sql = "{call SP_LAYDANHSACHSINHVIENCUALOP(?)}";
        
        try (Connection connection = LoginVariables.databaseConnector.getConnection();) {
            CallableStatement cstm = connection.prepareCall(sql);
            cstm.setString(1, maLop);
            ResultSet rs = cstm.executeQuery();
            
           List<SinhVien> students = new ArrayList<>();
            while (rs.next()) {
                students.add(
                        new SinhVien(
                        rs.getString(1), rs.getString(2), 
                        rs.getString(3), new Date(rs.getTimestamp(4).getTime()),
                        rs.getString(5), rs.getString(6)
                    )
                );
            }
            return students;
        }
    }
    
    //hàm này dùng để lưu dữ liệu vào cơ sở dữ liệu
    public void saveAll(SQLServerDataTable sqlServerDataTable) throws SQLException {
        String sql = "{call SP_GHIDANHSACHSINHVIEN(?)}";
        
        try (Connection connection = LoginVariables.databaseConnector.getConnection();) {
            CallableStatement cstm = connection.prepareCall(sql);
            cstm.setObject(1, sqlServerDataTable);
            cstm.execute();
        }
    }
    
     //hàm này dùng để gọi sp kiểm tra xem giản viên có tồn tại hay chưa
    public static boolean checkMaSV(String magv) throws SQLException {
        String sql = "{call SP_CHECKMASINHVIEN(?)}";
        try (Connection connection = LoginVariables.databaseConnector.getConnection();) {
            CallableStatement cstm = connection.prepareCall(sql);
            cstm.setObject(1, magv);
            ResultSet rs = cstm.executeQuery();
            if (rs.next()) {
                int result = rs.getInt(1);
                return result == 1;
            }
        }
        return false;
    }
}
