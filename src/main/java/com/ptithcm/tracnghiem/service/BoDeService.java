/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.tracnghiem.service;

import com.microsoft.sqlserver.jdbc.SQLServerDataTable;
import com.ptithcm.tracnghiem.entity.BoDe;
import com.ptithcm.tracnghiem.model.dto.ObjectAction;
import com.ptithcm.tracnghiem.repository.BoDeRepository;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MINHDAT
 */
public class BoDeService {
    public static List<Object> getAllQuestions() throws SQLException {
        return new BoDeRepository().findAll();
    }
    
    public static void saveAll(List<ObjectAction> objectActions) throws SQLException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        SQLServerDataTable sqlServerDataTable = SQLConvert.toT_CAUHOI(Filter.getChangedObjectActions(objectActions));
        BoDeRepository boDeRepository = new BoDeRepository();
        boDeRepository.saveAll(sqlServerDataTable);
    }
    
    public static boolean checkQuestionExistInAllTable(int cauhoi) throws SQLException {
        return new BoDeRepository().checkQuestionExistInAllTable(cauhoi);
    }
    
    public static  List<String> getLevelList() throws SQLException {
        return new BoDeRepository().getLevelList();
    }
    
    public static  List<BoDe> toBoDe(List<Object> objects) {
        List<BoDe> questions = new ArrayList<>();
        objects.forEach(object -> questions.add((BoDe) object));
        return questions;
    }
}
