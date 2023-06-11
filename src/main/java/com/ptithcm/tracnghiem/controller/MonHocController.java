/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.tracnghiem.controller;

import com.ptithcm.tracnghiem.repository.MonHocRepository;
import com.ptithcm.tracnghiem.view.PnlMonHocManager;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author HP
 */
public class MonHocController {
    
    public static void renderData(PnlMonHocManager pnlWorkSection) throws SQLException {
        
        pnlWorkSection.setObjectActions(new MonHocRepository().findAll());
        pnlWorkSection.fillTableForTeacher(pnlWorkSection.getObjectActions());
    }
    
    public static void renderData(PnlMonHocManager pnlWorkSection , boolean check) throws SQLException {
        
        pnlWorkSection.setObjectActions(new MonHocRepository().findAll(check));
        pnlWorkSection.fillTableForTeacher(pnlWorkSection.getObjectActions());
    }
    
    

}
