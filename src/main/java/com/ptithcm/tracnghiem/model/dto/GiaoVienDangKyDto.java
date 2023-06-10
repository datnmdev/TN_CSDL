/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.tracnghiem.model.dto;

import java.util.Date;

/**
 *
 * @author MINHDAT
 */
public class GiaoVienDangKyDto {
    private String maMH;
    private Date ngayThi;
    private short lan;
    private String trinhDo;
    private short soCauThi;
    private short thoiGian;
    
//    Constructors
    public GiaoVienDangKyDto(String maMH, Date ngayThi, short lan, String trinhDo, short soCauThi, short thoiGian) {
        this.maMH = maMH;
        this.ngayThi = ngayThi;
        this.lan = lan;
        this.trinhDo = trinhDo;
        this.soCauThi = soCauThi;
        this.thoiGian = thoiGian;
    }
    
//    Getters and setters
    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public Date getNgayThi() {
        return ngayThi;
    }

    public void setNgayThi(Date ngayThi) {
        this.ngayThi = ngayThi;
    }

    public short getLan() {
        return lan;
    }

    public void setLan(short lan) {
        this.lan = lan;
    }

    public short getSoCauThi() {
        return soCauThi;
    }

    public void setSoCauThi(short soCauThi) {
        this.soCauThi = soCauThi;
    }

    public short getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(short thoiGian) {
        this.thoiGian = thoiGian;
    }
}
