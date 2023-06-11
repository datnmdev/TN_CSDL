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
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

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
        List<String> maLops = getAllGVDK().stream().map(object -> (GiaoVienDangKy) object).filter(distinctByKey(GiaoVienDangKy::getMaLop)).map(GiaoVienDangKy::getMaLop).toList();
        List<Lop> lops = new ArrayList<>();
        for (String maLop : maLops) {
            lops.add(LopService.getClassroom(maLop));
        }
        return lops;
    }
    
    public static List<Lop> getRegisteredClassroomByTeacherCode(String teacherCode) throws SQLException {
        List<String> maLops = getAllGVDK().stream().map(object -> (GiaoVienDangKy) object).filter(distinctByKey(GiaoVienDangKy::getMaLop)).filter(gvdk -> gvdk.getMaGV().trim().equals(teacherCode)).map(GiaoVienDangKy::getMaLop).toList();
        List<Lop> lops = new ArrayList<>();
        for (String maLop : maLops) {
            lops.add(LopService.getClassroom(maLop));
        }
        return lops;
    }
    
    public static List<String> getRegisteredSubjectByClassroomCode(String classroomCode) throws SQLException {
        return getAllGVDK().stream().map(object -> (GiaoVienDangKy) object).filter(gvdk -> gvdk.getMaLop().trim().equals(classroomCode.trim())).filter(distinctByKey(GiaoVienDangKy::getMaMH)).map(GiaoVienDangKy::getMaMH).toList();
    }
    
    public static int getTongSoLanThi(String classroomCode, String maMH) throws SQLException {
        return getAllGVDK().stream().map(object -> (GiaoVienDangKy) object).filter(gvdk -> gvdk.getMaLop().trim().equals(classroomCode.trim()) && gvdk.getMaMH().trim().equals(maMH.trim())).toList().size();
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
    
    public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
	Set<Object> seen = new HashSet<>();
	return t -> seen.add(keyExtractor.apply(t));
    }
}
