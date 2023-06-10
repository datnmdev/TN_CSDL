/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.tracnghiem.repository;

import com.ptithcm.tracnghiem.entity.MonHoc;
import com.ptithcm.tracnghiem.global_variable.LoginVariables;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MINHDAT
 */
public class BangDiemRepository {
    public static List<MonHoc> findAllExamSubjects(String maSV) throws SQLException {
        String sql = "{call SP_LAYDANHSACHMONHOCDATHICUASINHVIEN(?)}";

        try (Connection connection = LoginVariables.databaseConnector.getConnection();) {
            CallableStatement cstm = connection.prepareCall(sql);
            cstm.setString(1, maSV);
            ResultSet rs = cstm.executeQuery();

            List<MonHoc> subjects = new ArrayList<>();
            while (rs.next()) {
                subjects.add(new MonHoc(rs.getString(1), rs.getString(2)));
            }
            return subjects;
        }
    }
    
    public static List<Short> findAllExamTimesOfSubject(String maSV, String maMH) throws SQLException {
        String sql = "{call SP_LAYDANHSACHLANTHITHEOMONHOCCUASINHVIEN(?,?)}";

        try (Connection connection = LoginVariables.databaseConnector.getConnection();) {
            CallableStatement cstm = connection.prepareCall(sql);
            cstm.setString(1, maSV);
            cstm.setString(2, maMH);
            ResultSet rs = cstm.executeQuery();

            List<Short> times = new ArrayList<>();
            while (rs.next()) {
                times.add(rs.getShort(1));
            }
            return times;
        }
    }
}
