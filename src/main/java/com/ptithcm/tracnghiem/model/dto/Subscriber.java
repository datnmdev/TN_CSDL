/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.tracnghiem.model.dto;

/**
 *
 * @author MINHDAT
 */
public class Subscriber {
    private String tenCS; // The description of the local publications
     private String serverName;
    
//    Constructors
    public Subscriber(String tenCS, String serverName) {
        this.tenCS = tenCS;
        this.serverName = serverName;
    }
    
//    Methods
    @Override
    public String toString() {
        return tenCS;
    }

//    Getters and setters
    public String getTenCS() {
        return tenCS;
    }

    public void setTenCS(String tenCS) {
        this.tenCS = tenCS;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }
}
