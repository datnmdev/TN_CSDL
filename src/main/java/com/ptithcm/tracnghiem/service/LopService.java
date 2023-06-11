/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.tracnghiem.service;

import com.microsoft.sqlserver.jdbc.SQLServerDataTable;
import com.ptithcm.tracnghiem.entity.Lop;
import com.ptithcm.tracnghiem.model.dto.ObjectAction;
import com.ptithcm.tracnghiem.repository.LopRepository;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MINHDAT
 */
public class LopService {
    public static Lop getClassroom(String maLop) throws SQLException {
        return (Lop) (new LopRepository().find(maLop));
    }
    
    public static List<Lop> getAllClassrooms() throws SQLException {
        return toClassrooms(new LopRepository().findAll());
    }
    
    public static List<Lop> getAllClassroomByClassroomCode(String maKH) throws SQLException {
        return getAllClassrooms().stream().filter(lop -> lop.getMaKH().equals(maKH)).toList();
    }
    
    public static List<Lop> toClassrooms(List<Object> objects) {
        List<Lop> classrooms = new ArrayList<>();
        objects.forEach(object -> classrooms.add((Lop) object));
        return classrooms;
    }
    
     public static void saveAll(List<ObjectAction> objectActions) throws SQLException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        SQLServerDataTable sqlServerDataTable = SQLConvert.toT_LOP(Filter.getChangedObjectActions(objectActions));
        LopRepository lopRepository = new LopRepository();
        lopRepository.saveAll(sqlServerDataTable);
    }
}
