/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.tracnghiem.global_variable;

import com.ptithcm.tracnghiem.model.dto.Subscriber;
import java.util.List;

/**
 *
 * @author MINHDAT
 */
public class SubscribersVariables implements ResetInterface {
    public static List<Subscriber> subscribers;
    
    @Override
    public void reset() {
        subscribers = null;
    }
}
