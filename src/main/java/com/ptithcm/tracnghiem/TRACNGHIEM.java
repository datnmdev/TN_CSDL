/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ptithcm.tracnghiem;

import com.ptithcm.tracnghiem.controller.LoginController;
import com.ptithcm.tracnghiem.view.FrmLogin;

/**
 *
 * @author MINHDAT
 */
public class TRACNGHIEM {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginController.startFrmLogin(new FrmLogin());
            }
        });
    }
}
