/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.tracnghiem.service;

import com.microsoft.sqlserver.jdbc.SQLServerDataTable;
import com.ptithcm.tracnghiem.entity.MonHoc;
import com.ptithcm.tracnghiem.model.dto.ObjectAction;
import com.ptithcm.tracnghiem.repository.MonHocRepository;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MINHDAT
 */
public class MonHocService {
     public static MonHoc getSubject(String maMH) throws SQLException {
        return (MonHoc) (new MonHocRepository().find(maMH));
    }
    
    public static List<MonHoc> getAllSubjects() throws SQLException {
        return toSubjects(new MonHocRepository().findAll());
    }
    
    public static List<MonHoc> toSubjects(List<Object> objects) {
        List<MonHoc>  subjects = new ArrayList<>();
        objects.forEach(object -> subjects.add((MonHoc) object));
        return subjects;
    }
    
     public static void saveAll(List<ObjectAction> objectActions) throws SQLException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        SQLServerDataTable sqlServerDataTable = SQLConvert.toT_MONHOC(Filter.getChangedObjectActions(objectActions));
        MonHocRepository monHocRepository = new MonHocRepository();
        monHocRepository.saveAll(sqlServerDataTable);
    }
}
