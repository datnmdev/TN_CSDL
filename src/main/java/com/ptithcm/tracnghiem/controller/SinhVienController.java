/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.tracnghiem.controller;

import com.ptithcm.tracnghiem.service.LopService;
import com.ptithcm.tracnghiem.service.SinhVienService;
import com.ptithcm.tracnghiem.view.PnlStudentManager;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author HP
 */
public class SinhVienController {
    
    public static void renderData(PnlStudentManager pnlWorkSection) throws SQLException {
        
        pnlWorkSection.setObjectActions(new SinhVienService().getAllSinhVien());
        pnlWorkSection.fillTableForTeacher(pnlWorkSection.getObjectActions());
        pnlWorkSection.getPnlStudentInfo().fillLopComboBox(LopService.getAllClassrooms());
    }

}
