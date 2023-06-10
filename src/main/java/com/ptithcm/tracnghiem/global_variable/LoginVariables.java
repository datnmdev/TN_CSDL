/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.tracnghiem.global_variable;

import com.ptithcm.tracnghiem.configuration.DatabaseConnector;

/**
 *
 * @author MINHDAT
 */
public class LoginVariables implements ResetInterface {
    public static DatabaseConnector databaseConnector;

    @Override
    public void reset() {
        databaseConnector = null;
    }
}
