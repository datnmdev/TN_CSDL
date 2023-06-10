/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.tracnghiem.service;

import com.ptithcm.tracnghiem.entity.MonHoc;
import com.ptithcm.tracnghiem.repository.BangDiemRepository;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author MINHDAT
 */
public class BangDiemService {
    public static List<MonHoc> findAllExamSubjects(String maSV) throws SQLException {
        return BangDiemRepository.findAllExamSubjects(maSV);
    }
    
    public static List<Short> findAllExamTimesOfSubject(String maSV, String maMH) throws SQLException {
        return BangDiemRepository.findAllExamTimesOfSubject(maSV, maMH);
    }
}
