/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.tracnghiem.service;

import com.ptithcm.tracnghiem.entity.MonHoc;
import com.ptithcm.tracnghiem.model.dto.BaiThiDto;
import com.ptithcm.tracnghiem.model.dto.BoDeDto;
import com.ptithcm.tracnghiem.model.dto.GiaoVienDangKyDto;
import com.ptithcm.tracnghiem.model.dto.KetQuaThi;
import com.ptithcm.tracnghiem.repository.ThiRepository;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author MINHDAT
 */
public class ThiService {
    public static List<BoDeDto> getBaiThi(String maMH, String trinhDo, short soCauThi) throws SQLException {
        return ThiRepository.getBaiThi(maMH, trinhDo, soCauThi);
    }
    
    public static List<GiaoVienDangKyDto> getAllExamCalendar(String maLop, String maSV) throws SQLException {
        return ThiRepository.findAllExamCalendar(maLop, maSV);
    }
    
    public static List<MonHoc> getAllSubject(List<GiaoVienDangKyDto> giaoVienDangKyDtos) throws SQLException {
        List<MonHoc> subjects = new ArrayList<>();
        for (int i = 0; i < giaoVienDangKyDtos.size(); ++i) {
            boolean exist = false;
            for (int j = 0; j < i; ++j) {
                if (giaoVienDangKyDtos.get(j).getMaMH().equals(giaoVienDangKyDtos.get(i).getMaMH())) {
                    exist = true;
                    break;
                }
            }
            if (!exist) {
                subjects.add(MonHocService.getSubject(giaoVienDangKyDtos.get(i).getMaMH()));
            }
        }
        return subjects;
    }
    
    public static List<String> getAllDateTimeString(String maMH, List<GiaoVienDangKyDto> giaoVienDangKyDtos) throws SQLException {
        List<String> dateTimeString = new ArrayList<>();
        giaoVienDangKyDtos.forEach(giaoVienDangKyDto -> {
            if (giaoVienDangKyDto.getMaMH().equals(maMH)) {
                dateTimeString.add(new SimpleDateFormat("dd/MM/yyyy HH:mm").format(giaoVienDangKyDto.getNgayThi()));
            }
        });
        return dateTimeString;
    }
    
    public static List<String> getAllExamTimes(String maMH, String ngayThi, List<GiaoVienDangKyDto> giaoVienDangKyDtos) throws SQLException {
        List<String> times = new ArrayList<>();
        giaoVienDangKyDtos.forEach(giaoVienDangKyDto -> {
            if (giaoVienDangKyDto.getMaMH().equals(maMH) && new SimpleDateFormat("dd/MM/yyyy HH:mm").format(giaoVienDangKyDto.getNgayThi()).equals(ngayThi)) {
                times.add(String.valueOf(giaoVienDangKyDto.getLan()));
            }
        });
        return times;
    }
    
    public static KetQuaThi saveExamResult(String maSV, String maMH, short lanThi, Date ngayThi, short soCauthi, List<BaiThiDto> dsLuaChon) throws SQLException {
        return ThiRepository.saveExamResult(maSV, maMH, lanThi, ngayThi, soCauthi, SQLConvert.toT_BAITHI(dsLuaChon));
    }
    
    public static KetQuaThi getExamResult(short soCauthi, List<BaiThiDto> dsLuaChon) throws SQLException {
        return ThiRepository.getExamResult(soCauthi, SQLConvert.toT_BAITHI(dsLuaChon));
    }
}
