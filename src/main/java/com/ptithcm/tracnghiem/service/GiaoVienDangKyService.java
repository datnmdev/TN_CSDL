/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.tracnghiem.service;

import com.microsoft.sqlserver.jdbc.SQLServerDataTable;
import com.ptithcm.tracnghiem.entity.GiaoVienDangKy;
import com.ptithcm.tracnghiem.entity.Lop;
import com.ptithcm.tracnghiem.model.dto.ObjectAction;
import com.ptithcm.tracnghiem.repository.GiaoVienDangKyRepository;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MINHDAT
 */
public class GiaoVienDangKyService {
    public static GiaoVienDangKy getGVDK(String maLop, String maMH, short lan) throws SQLException {
        return GiaoVienDangKyRepository.find(maLop, maMH, lan);
    }
    
    public static List<Object> getAllGVDK() throws SQLException {
        return new GiaoVienDangKyRepository().findAll();
    }
    
    public static List<Lop> getAllRegisteredClassroom() throws SQLException {
        List<GiaoVienDangKy> gvdks = new ArrayList<>(toGiaoVienDangKy(getAllGVDK()));
        List<Lop> classrooms = new ArrayList<>();
        for (int i = 0; i < gvdks.size(); ++i) {
            boolean exist = false;
            for (int j = 0; j < i; ++j) {
                if (gvdks.get(j).getMaLop().equals(gvdks.get(i).getMaLop())) {
                    exist = true;
                    break;
                }
            }
            if (!exist) {
                classrooms.add(LopService.getClassroom(gvdks.get(i).getMaLop()));
            }
        }
        return classrooms;
    }
    
    public static void saveAll(List<ObjectAction> objectActions) throws SQLException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        SQLServerDataTable sqlServerDataTable = SQLConvert.toT_GVDK(Filter.getChangedObjectActions(objectActions));
        GiaoVienDangKyRepository giaoVienDangKyRepository = new GiaoVienDangKyRepository();
        giaoVienDangKyRepository.saveAll(sqlServerDataTable);
    }
    
    public static boolean checkGVDKExistInAllTable(String maLop, String maMH, int lanThi) throws SQLException {
        return new GiaoVienDangKyRepository().checkGVDKExistInAllTable(maLop, maMH, lanThi);
    }
    
    public static List<GiaoVienDangKy> toGiaoVienDangKy(List<Object> objects) {
        List<GiaoVienDangKy> GVDK = new ArrayList<>();
        objects.forEach(object -> GVDK.add((GiaoVienDangKy) object));
        return GVDK;
    }
}
