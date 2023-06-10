/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.tracnghiem.controller;

import com.ptithcm.tracnghiem.configuration.DatabaseConnectors;
import com.ptithcm.tracnghiem.exception.InvalidInputException;
import com.ptithcm.tracnghiem.global_variable.SubscribersVariables;
import com.ptithcm.tracnghiem.model.dto.Account;
import com.ptithcm.tracnghiem.service.LoginService;
import com.ptithcm.tracnghiem.service.SubscriberService;
import com.ptithcm.tracnghiem.service.ValidateFormService;
import com.ptithcm.tracnghiem.view.FrmLogin;
import com.ptithcm.tracnghiem.view.MessageBox;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author MINHDAT
 */
public class LoginController {
//    Khởi động login
    public static void startFrmLogin(FrmLogin frmLogin) {
        PrepareController.findAndSaveSubscriberInformation();
        frmLogin.setLocationRelativeTo(null);
        frmLogin.setVisible(true);
        LoginController.renderActiveSubcribers(frmLogin);
    }
    
//    Hiển thị danh sách các server phân mảnh lên combobox
    public static void renderActiveSubcribers(FrmLogin frmLogin) {
        try {
            frmLogin.fillSideComboBox(
                    new SubscriberService().getActiveSubcribers(
                            SubscribersVariables.subscribers
                    )
            );
        } catch (IOException ex) {
            MessageBox.showErrorBox(ex.getClass().getName(), ex.getMessage());
        }
    }
    
    public static void login(FrmLogin frmLogin) {
        try {
            new ValidateFormService().validateFrmLogin(frmLogin);
            Account loginData = frmLogin.getLoginData();
            LoginService loginService = new LoginService(
                    DatabaseConnectors.databaseSubConnectors.get(loginData.getSubscriber().getServerName()));
            
            loginService.login(loginData);
            frmLogin.directFrmMain(loginData);
        } catch (InvalidInputException ex) {
            MessageBox.showErrorBox(frmLogin, ex.getClass().getName(), ex.getMessage());
        } catch (IOException ex) {
            MessageBox.showErrorBox(frmLogin, ex.getClass().getName(), ex.getMessage());
        } catch (SQLException ex) {
            MessageBox.showErrorBox(frmLogin, ex.getClass().getName(), ex.getMessage());
        }
    }
}
