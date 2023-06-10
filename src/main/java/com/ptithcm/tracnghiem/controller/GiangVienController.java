/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.tracnghiem.controller;

import com.ptithcm.tracnghiem.entity.Khoa;
import com.ptithcm.tracnghiem.repository.KhoaRepository;
import com.ptithcm.tracnghiem.service.GiaoVienService;
import com.ptithcm.tracnghiem.view.PnlTeacherManager;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author HP
 */
public class GiangVienController {
    
    public static void renderData(PnlTeacherManager pnlWorkSection) throws SQLException {
        
        pnlWorkSection.setObjectActions(new GiaoVienService().getAllGiaoVien());
        pnlWorkSection.fillTableForTeacher(pnlWorkSection.getObjectActions());
        List<Khoa> khoa = KhoaRepository.findAll();
        pnlWorkSection.getPnlTeacherInfo().fillKhoaComboBox(khoa);
       
        
        
    }

}
