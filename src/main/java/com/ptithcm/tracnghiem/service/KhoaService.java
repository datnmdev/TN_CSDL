/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.tracnghiem.service;

import com.microsoft.sqlserver.jdbc.SQLServerDataTable;
import com.ptithcm.tracnghiem.entity.Khoa;
import com.ptithcm.tracnghiem.model.dto.ObjectAction;
import com.ptithcm.tracnghiem.repository.KhoaRepository;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class KhoaService {
    
    public static List<Khoa> getAllKhoa() throws SQLException {
        List<Khoa> khoa = KhoaRepository.findAll();
        return khoa;
    }
    
     //hàm này dùng để kết nối 
     public static void saveAll(List<ObjectAction> objectActions) throws SQLException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        SQLServerDataTable sqlServerDataTable = SQLConvert.toT_KHOA(Filter.getChangedObjectActions(objectActions));
        KhoaRepository khoaRepository = new KhoaRepository();
        khoaRepository.saveAll(sqlServerDataTable);
    }
}
