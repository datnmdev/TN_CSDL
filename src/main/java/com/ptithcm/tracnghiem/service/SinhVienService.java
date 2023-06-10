/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.tracnghiem.service;

import com.microsoft.sqlserver.jdbc.SQLServerDataTable;
import com.ptithcm.tracnghiem.entity.SinhVien;
import com.ptithcm.tracnghiem.model.dto.ObjectAction;
import com.ptithcm.tracnghiem.repository.SinhVienRepository;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author MINHDAT
 */
public class SinhVienService {
    public List<Object> getAllSinhVien() throws SQLException {
        return new SinhVienRepository().findAll();
    }
    
    public static SinhVien getStudent(String maSV) throws SQLException {
        return (SinhVien) new SinhVienRepository().find(maSV);
    }
    
    public static List<SinhVien> getAllStudentOfClass(String maLop) throws SQLException {
        return SinhVienRepository.findAllStudentOfClass(maLop);
    }
    
    public static void saveAll(List<ObjectAction> objectActions) throws SQLException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        SQLServerDataTable sqlServerDataTable = SQLConvert.toT_SINHVIEN(Filter.getChangedObjectActions(objectActions));
        SinhVienRepository sinhVienVienRepository = new SinhVienRepository();
        sinhVienVienRepository.saveAll(sqlServerDataTable);
    }
}
