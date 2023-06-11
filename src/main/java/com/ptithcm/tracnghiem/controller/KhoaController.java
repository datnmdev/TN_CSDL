/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.tracnghiem.controller;

import com.ptithcm.tracnghiem.repository.CoSoRepository;
import com.ptithcm.tracnghiem.repository.KhoaRepository;
import com.ptithcm.tracnghiem.view.PnlKhoaManager;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class KhoaController {
    
    public static void renderData(PnlKhoaManager pnlWorkSection) throws SQLException {
        pnlWorkSection.setObjectActions(new KhoaRepository().findAllOb());
        pnlWorkSection.fillTableForTeacher(pnlWorkSection.getObjectActions());
        String macs = CoSoRepository.findMacs();
        pnlWorkSection.setMacs(macs);
    }
    
     public static void renderData(PnlKhoaManager pnlWorkSection , boolean check) throws SQLException {
        pnlWorkSection.setObjectActions(new KhoaRepository().findAllOb(check));
        pnlWorkSection.fillTableForTeacher(pnlWorkSection.getObjectActions());
        String macs = CoSoRepository.findMacs();
        pnlWorkSection.setMacs(macs);
    }

}
