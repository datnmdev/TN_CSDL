/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.tracnghiem.view;

import com.toedter.calendar.JCalendar;
import java.awt.BorderLayout;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

/**
 *
 * @author MINHDAT
 */
public class JDateTimePicker extends JPanel {
    private JCalendar calendar;
    private JSpinner timeSpinner;

    public JDateTimePicker() {
        super(new BorderLayout());

        // Initialize calendar
        calendar = new JCalendar();
        calendar.setMinSelectableDate(Calendar.getInstance().getTime());
        add(calendar, BorderLayout.CENTER);

        // Initialize time spinner
        SpinnerDateModel timeModel = new SpinnerDateModel();
        timeModel.setCalendarField(Calendar.MINUTE);
        timeSpinner = new JSpinner(timeModel);
        timeSpinner.setEditor(new JSpinner.DateEditor(timeSpinner, "HH:mm"));
        add(timeSpinner, BorderLayout.SOUTH);
    }

    public Calendar getDateTime() {
        Calendar calendar = this.calendar.getCalendar();
        Calendar timeCalendar = Calendar.getInstance();
        timeCalendar.setTime((Date) this.timeSpinner.getValue());
        calendar.set(Calendar.HOUR_OF_DAY, timeCalendar.get(Calendar.HOUR_OF_DAY));
        calendar.set(Calendar.MINUTE, timeCalendar.get(Calendar.MINUTE));
        calendar.set(Calendar.SECOND, timeCalendar.get(Calendar.SECOND));
        return calendar;
    }
    
    public void setDateTime(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        calendar.setCalendar(cal);
        SpinnerDateModel timeModel = new SpinnerDateModel();
        timeModel.setCalendarField(Calendar.MINUTE);
        timeModel.setValue(date);
        timeSpinner.setModel(timeModel);
        timeSpinner.setEditor(new JSpinner.DateEditor(timeSpinner, "HH:mm"));
    }
    
    public void reset() {
        this.calendar.setMinSelectableDate(Calendar.getInstance().getTime());
        SpinnerDateModel timeModel = new SpinnerDateModel();
        timeModel.setCalendarField(Calendar.MINUTE);
        timeSpinner.setModel(timeModel);
        timeSpinner.setEditor(new JSpinner.DateEditor(timeSpinner, "HH:mm"));
    }
}
