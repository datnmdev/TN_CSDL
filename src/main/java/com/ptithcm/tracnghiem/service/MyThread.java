/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.tracnghiem.service;

/**
 *
 * @author MINHDAT
 */
public class MyThread extends Thread {
    private boolean stop;

    public MyThread() {
        this.stop = false;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }
    
    public boolean isStop() {
        return stop;
    }
}
