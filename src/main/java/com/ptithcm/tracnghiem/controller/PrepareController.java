/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.tracnghiem.controller;

import com.ptithcm.tracnghiem.global_variable.SubscribersVariables;
import com.ptithcm.tracnghiem.service.DatabaseConnectorService;
import com.ptithcm.tracnghiem.service.SubscriberService;
import com.ptithcm.tracnghiem.view.MessageBox;
import java.sql.SQLException;

/**
 *
 * @author MINHDAT
 */
public class PrepareController {
    public static void findAndSaveSubscriberInformation() {
        try {
//            Lấy và lưu thông tin của các side phân mảnh
            SubscriberService subscriberService = new SubscriberService();
            subscriberService.saveSubscribers(subscriberService.findAllSubscribers());
            
//            Tạo và lưu các thông tin kết nối của các server phân mảnh
            DatabaseConnectorService databaseConnectorService = new DatabaseConnectorService();
            databaseConnectorService.saveDatabaseSubscriberConnectors(
                    databaseConnectorService.createDatabaseSubscriberConnectors(SubscribersVariables.subscribers)
            );
        } catch (SQLException ex) {
            MessageBox.showErrorBox(ex.getClass().getName(), ex.getMessage());
            System.exit(0);
        }
    }
}
