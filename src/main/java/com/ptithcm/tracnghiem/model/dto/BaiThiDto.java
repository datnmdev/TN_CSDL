/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.tracnghiem.model.dto;

/**
 *
 * @author MINHDAT
 */
public class BaiThiDto {
    private int cauHoi;
    private short stt;
    private String luaChon;
    
//    Constructors
    public BaiThiDto(int cauHoi, short stt, String luaChon) {
        this.cauHoi = cauHoi;
        this.stt = stt;
        this.luaChon = luaChon;
    }
    
//    Getters and setters
    public int getCauHoi() {
        return cauHoi;
    }

    public void setCauHoi(int cauHoi) {
        this.cauHoi = cauHoi;
    }

    public short getStt() {
        return stt;
    }

    public void setStt(short stt) {
        this.stt = stt;
    }

    public String getLuaChon() {
        return luaChon;
    }

    public void setLuaChon(String luaChon) {
        this.luaChon = luaChon;
    }
}
