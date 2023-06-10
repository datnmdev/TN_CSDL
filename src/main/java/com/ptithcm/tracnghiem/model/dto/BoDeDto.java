/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.tracnghiem.model.dto;

/**
 *
 * @author MINHDAT
 */
public class BoDeDto {
    private short stt;
    private int cauHoi;
    private String noiDung;
    private String a;
    private String b;
    private String c;
    private String d;
    
//    Constructors
    public BoDeDto(short stt, int cauHoi, String noiDung, String a, String b, String c, String d) {
        this.stt = stt;
        this.cauHoi = cauHoi;
        this.noiDung = noiDung;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
//    Getters and setters
    public short getStt() {
        return stt;
    }

    public void setStt(short stt) {
        this.stt = stt;
    }

    public int getCauHoi() {
        return cauHoi;
    }

    public void setCauHoi(int cauHoi) {
        this.cauHoi = cauHoi;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }
}
