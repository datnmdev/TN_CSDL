/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.tracnghiem.controller;

import com.ptithcm.tracnghiem.repository.LopRepository;
import com.ptithcm.tracnghiem.view.PnlLopManager;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class LopController {
    
    public static void renderData(PnlLopManager pnlWorkSection , String Makh) throws SQLException {
        pnlWorkSection.setObjectActions(new LopRepository().findAllMAKH(Makh));
        pnlWorkSection.fillTableForTeacher(pnlWorkSection.getObjectActions());
    }

}
