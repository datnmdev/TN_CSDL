/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.tracnghiem.model.dto;

/**
 *
 * @author MINHDAT
 */
public class KetQuaThi {
    private short soCauDung;
    private short soCauthi;
    private float diem;
    
//    Constructors
    public KetQuaThi(short soCauDung, short soCauthi, float diem) {
        this.soCauDung = soCauDung;
        this.soCauthi = soCauthi;
        this.diem = diem;
    }
    
//    Getters and setters
    public short getSoCauDung() {
        return soCauDung;
    }

    public void setSoCauDung(short soCauDung) {
        this.soCauDung = soCauDung;
    }

    public short getSoCauthi() {
        return soCauthi;
    }

    public void setSoCauthi(short soCauthi) {
        this.soCauthi = soCauthi;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }
}
