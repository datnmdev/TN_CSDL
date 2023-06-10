/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.tracnghiem.model.mapper;

import com.ptithcm.tracnghiem.entity.GiaoVienDangKy;
import com.ptithcm.tracnghiem.model.dto.GiaoVienDangKyDto;

/**
 *
 * @author MINHDAT
 */
public class GiaoVienDangKyMapper {
    public static GiaoVienDangKyDto toGiaoVienDangKyDto(GiaoVienDangKy giaoVienDangKy) {
        return new GiaoVienDangKyDto(
                giaoVienDangKy.getMaMH(), giaoVienDangKy.getNgayThi(), 
                giaoVienDangKy.getLan(), giaoVienDangKy.getTrinhDo(), 
                giaoVienDangKy.getSoCauThi(), giaoVienDangKy.getThoiGian()
        );
    }
}
