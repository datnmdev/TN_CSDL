/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.tracnghiem.repository;

import com.microsoft.sqlserver.jdbc.SQLServerDataTable;
import com.ptithcm.tracnghiem.global_variable.LoginVariables;
import com.ptithcm.tracnghiem.model.dto.BoDeDto;
import com.ptithcm.tracnghiem.model.dto.GiaoVienDangKyDto;
import com.ptithcm.tracnghiem.model.dto.KetQuaThi;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author MINHDAT
 */
public class ThiRepository implements SelectDataRepositoryInterface {

    @Override
    public Object find(Object object) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Object> findAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static List<GiaoVienDangKyDto> findAllExamCalendar(String maLop, String maSV) throws SQLException {
        String sql = "{call SP_LAYDANHSACHTHICUASINHVIEN(?,?)}";

        try (Connection connection = LoginVariables.databaseConnector.getConnection();) {
            CallableStatement cstm = connection.prepareCall(sql);
            cstm.setString(1, maLop);
            cstm.setString(2, maSV);
            ResultSet rs = cstm.executeQuery();

            List<GiaoVienDangKyDto> giaoVienDangKyDtos = new ArrayList<>();
            while (rs.next()) {
                giaoVienDangKyDtos.add(new GiaoVienDangKyDto(
                        rs.getString(1), new Date(rs.getTimestamp(2).getTime()),
                        rs.getShort(3), rs.getString(4),
                        rs.getShort(5), rs.getShort(6)
                ));
            }
            return giaoVienDangKyDtos;
        }
    }

    public static List<BoDeDto> getBaiThi(String maMH, String trinhDo, short soCauThi) throws SQLException {
        String sql = "{call SP_TAOBAITHI(?,?,?)}";

        try (Connection connection = LoginVariables.databaseConnector.getConnection();) {
            CallableStatement cstm = connection.prepareCall(sql);
            cstm.setString(1, maMH);
            cstm.setString(2, trinhDo);
            cstm.setShort(3, soCauThi);
            ResultSet rs = cstm.executeQuery();

            List<BoDeDto> baiThi = new ArrayList<>();
            short stt = 1;
            while (rs.next()) {
                baiThi.add(new BoDeDto(stt, rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
                ++stt;
            }
            return baiThi;
        }
    }
    
    public static KetQuaThi saveExamResult(String maSV, String maMH, short lanThi, Date ngayThi, short soCauthi, SQLServerDataTable sqlServerDataTable) throws SQLException {
        String sql = "{call SP_GHIKETQUATHI(?,?,?,?,?,?)}";

        try (Connection connection = LoginVariables.databaseConnector.getConnection();) {
            CallableStatement cstm = connection.prepareCall(sql);
            cstm.setString(1, maSV);
            cstm.setString(2, maMH);
            cstm.setShort(3, lanThi);
            cstm.setTimestamp(4, new Timestamp(ngayThi.getTime()));
            cstm.setShort(5, soCauthi);
            cstm.setObject(6, sqlServerDataTable);
            ResultSet rs = cstm.executeQuery();
            
            KetQuaThi result = null;
            while (rs.next()) {
                result = new KetQuaThi(rs.getShort(1), rs.getShort(2), rs.getFloat(3));
            }
            return result;
        }
    }
    
    public static KetQuaThi getExamResult(short soCauthi, SQLServerDataTable sqlServerDataTable) throws SQLException {
        String sql = "{call SP_LAYKETQUATHI(?,?)}";

        try (Connection connection = LoginVariables.databaseConnector.getConnection();) {
            CallableStatement cstm = connection.prepareCall(sql);
            cstm.setShort(1, soCauthi);
            cstm.setObject(2, sqlServerDataTable);
            ResultSet rs = cstm.executeQuery();
            
            KetQuaThi result = null;
            while (rs.next()) {
                result = new KetQuaThi(rs.getShort(1), rs.getShort(2), rs.getFloat(3));
            }
            return result;
        }
    }
}
