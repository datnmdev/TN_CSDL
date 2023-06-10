/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.ptithcm.tracnghiem.view;

import com.ptithcm.tracnghiem.entity.GiaoVienDangKy;
import com.ptithcm.tracnghiem.entity.Lop;
import com.ptithcm.tracnghiem.entity.MonHoc;
import com.ptithcm.tracnghiem.entity.SinhVien;
import com.ptithcm.tracnghiem.global_variable.LoginVariables;
import com.ptithcm.tracnghiem.model.dto.GiaoVienDangKyDto;
import com.ptithcm.tracnghiem.service.GiaoVienDangKyService;
import com.ptithcm.tracnghiem.service.LopService;
import com.ptithcm.tracnghiem.service.SinhVienService;
import com.ptithcm.tracnghiem.service.ThiService;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author MINHDAT
 */
public class PnlExamManageBar extends javax.swing.JPanel {

    /**
     * Creates new form PnlExamManageBar
     */
    public PnlExamManageBar() {
        initComponents();
        renderData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel7 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cboClassroomCode = new javax.swing.JComboBox<>();
        jPanel10 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtClassName = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        cboFullName = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cboSubject = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cboDateTime = new javax.swing.JComboBox<>();
        jPanel12 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        cboTimes = new javax.swing.JComboBox<>();
        jPanel13 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtQuestionQuantity = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtDuration = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtLevel = new javax.swing.JTextField();
        pnlEastContainer = new javax.swing.JPanel();
        btnStart = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(875, 70));
        setLayout(new java.awt.BorderLayout());

        jPanel5.setPreferredSize(new java.awt.Dimension(140, 34));
        jPanel5.setLayout(new java.awt.BorderLayout(10, 0));

        jLabel5.setText("Mã lớp:");
        jPanel5.add(jLabel5, java.awt.BorderLayout.WEST);

        cboClassroomCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboClassroomCodeActionPerformed(evt);
            }
        });
        jPanel5.add(cboClassroomCode, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel5);

        jPanel10.setMinimumSize(new java.awt.Dimension(160, 22));
        jPanel10.setPreferredSize(new java.awt.Dimension(180, 34));
        jPanel10.setLayout(new java.awt.BorderLayout(10, 0));

        jLabel8.setText("Tên lớp:");
        jPanel10.add(jLabel8, java.awt.BorderLayout.WEST);

        txtClassName.setEditable(false);
        txtClassName.setBackground(new java.awt.Color(255, 255, 255));
        txtClassName.setPreferredSize(new java.awt.Dimension(180, 34));
        jPanel10.add(txtClassName, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel10);

        jPanel11.setPreferredSize(new java.awt.Dimension(180, 34));
        jPanel11.setLayout(new java.awt.BorderLayout(10, 0));

        jLabel9.setText("Họ và tên:");
        jPanel11.add(jLabel9, java.awt.BorderLayout.WEST);

        jPanel11.add(cboFullName, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel11);

        jPanel6.setPreferredSize(new java.awt.Dimension(180, 34));
        jPanel6.setLayout(new java.awt.BorderLayout(10, 0));

        jLabel6.setText("Môn học:");
        jPanel6.add(jLabel6, java.awt.BorderLayout.WEST);

        cboSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSubjectActionPerformed(evt);
            }
        });
        jPanel6.add(cboSubject, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel6);

        jPanel9.setPreferredSize(new java.awt.Dimension(180, 34));
        jPanel9.setLayout(new java.awt.BorderLayout(10, 0));

        jLabel7.setText("Ngày thi:");
        jPanel9.add(jLabel7, java.awt.BorderLayout.WEST);

        cboDateTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDateTimeActionPerformed(evt);
            }
        });
        jPanel9.add(cboDateTime, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel9);

        jPanel12.setPreferredSize(new java.awt.Dimension(120, 34));
        jPanel12.setLayout(new java.awt.BorderLayout(10, 0));

        jLabel10.setText("Lần thi:");
        jPanel12.add(jLabel10, java.awt.BorderLayout.WEST);

        cboTimes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTimesActionPerformed(evt);
            }
        });
        jPanel12.add(cboTimes, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel12);

        jPanel13.setPreferredSize(new java.awt.Dimension(180, 34));
        jPanel13.setLayout(new java.awt.BorderLayout(10, 0));

        jLabel11.setText("Số câu thi:");
        jPanel13.add(jLabel11, java.awt.BorderLayout.WEST);

        txtQuestionQuantity.setEditable(false);
        jPanel13.add(txtQuestionQuantity, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel13);

        jPanel14.setPreferredSize(new java.awt.Dimension(180, 34));
        jPanel14.setLayout(new java.awt.BorderLayout(10, 0));

        jLabel12.setText("Thời gian:");
        jPanel14.add(jLabel12, java.awt.BorderLayout.WEST);

        txtDuration.setEditable(false);
        jPanel14.add(txtDuration, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel14);

        jPanel15.setPreferredSize(new java.awt.Dimension(180, 34));
        jPanel15.setLayout(new java.awt.BorderLayout(10, 0));

        jLabel13.setText("Trình độ:");
        jPanel15.add(jLabel13, java.awt.BorderLayout.WEST);

        txtLevel.setEditable(false);
        jPanel15.add(txtLevel, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel15);

        jScrollPane1.setViewportView(jPanel7);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pnlEastContainer.setLayout(new java.awt.GridBagLayout());

        btnStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/16x16/play.png"))); // NOI18N
        btnStart.setText("Bắt đầu thi");
        btnStart.setEnabled(false);
        btnStart.setPreferredSize(new java.awt.Dimension(120, 34));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pnlEastContainer.add(btnStart, gridBagConstraints);

        add(pnlEastContainer, java.awt.BorderLayout.EAST);
    }// </editor-fold>//GEN-END:initComponents

    private void cboClassroomCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboClassroomCodeActionPerformed
        try {
            txtClassName.setText(LopService.getClassroom(String.valueOf(cboClassroomCode.getSelectedItem())).getTenLop());
            
            fillCboFullName(String.valueOf(cboClassroomCode.getSelectedItem()));
            
            if (cboClassroomCode.getSelectedItem() != null && cboFullName.getSelectedItem() != null) {
                List<GiaoVienDangKyDto> giaoVienDangKyDtos = ThiService.getAllExamCalendar(
                    String.valueOf(cboClassroomCode.getSelectedItem()),
                    ((SinhVien) cboFullName.getSelectedItem()).getMaSV()
                );
                if (giaoVienDangKyDtos != null) {
                    fillSubjectComboBox(ThiService.getAllSubject(giaoVienDangKyDtos));
                }
            }
        } catch (SQLException ex) {
            MessageBox.showErrorBox(ex.getClass().getName(), ex.getMessage());
        }
    }//GEN-LAST:event_cboClassroomCodeActionPerformed

    private void cboSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSubjectActionPerformed
//        Disable and reset and clear
        cboTimes.setEnabled(false);
        txtQuestionQuantity.setText("");
        txtDuration.setText("");
        txtLevel.setText("");
        
        try {
            fillDateTimeComboBox();
        } catch (SQLException ex) {
            MessageBox.showErrorBox(ex.getClass().getName(), ex.getMessage());
        }
    }//GEN-LAST:event_cboSubjectActionPerformed

    private void cboDateTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDateTimeActionPerformed
//        Disable and reset
        cboTimes.setModel(new DefaultComboBoxModel<>());
        txtQuestionQuantity.setText("");
        txtDuration.setText("");
        txtLevel.setText("");
        
        try {
            fillExamTimesComboBox();
        } catch (SQLException ex) {
            MessageBox.showErrorBox(ex.getClass().getName(), ex.getMessage());
        } catch (ParseException ex) {
            MessageBox.showErrorBox(ex.getClass().getName(), ex.getMessage());
        }
    }//GEN-LAST:event_cboDateTimeActionPerformed

    private void cboTimesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTimesActionPerformed
        try {
            fillExamInfos();
            btnStart.setEnabled(true);
        } catch (SQLException ex) {
            MessageBox.showErrorBox(ex.getClass().getName(), ex.getMessage());
        } catch (ParseException ex) {
            MessageBox.showErrorBox(ex.getClass().getName(), ex.getMessage());
        }
    }//GEN-LAST:event_cboTimesActionPerformed

//    Methods
    public void renderData() {
        try {
            fillClassroomCodeComboBox();
        } catch (SQLException ex) {
            MessageBox.showErrorBox(ex.getClass().getName(), ex.getMessage());
        }
    }
    
    public void fillClassroomCodeComboBox() throws SQLException {
        switch (LoginVariables.databaseConnector.getAccount().getGroupName()) {
            case "GIANGVIEN": {
                List<Lop> classrooms = new ArrayList<>(GiaoVienDangKyService.getAllRegisteredClassroom());
                List<String> classroomCodes = new ArrayList<>();
                classrooms.forEach(classroom -> {
                    classroomCodes.add(classroom.getMaLop());
                });

                DefaultComboBoxModel model = new DefaultComboBoxModel();
                model.addAll(classroomCodes);
                cboClassroomCode.setModel(model);
                cboClassroomCode.setSelectedIndex(0);
                break;
            }
            case "SINHVIEN": {
                DefaultComboBoxModel model = new DefaultComboBoxModel();
                model.addElement(SinhVienService.getStudent(LoginVariables.databaseConnector.getAccount().getUsername()).getMaLop());
                cboClassroomCode.setModel(model);
                cboClassroomCode.setSelectedIndex(0);
                break;
            }
            default:
                throw new AssertionError();
        }

    }

    public void fillCboFullName(String maLop) throws SQLException {
        switch (LoginVariables.databaseConnector.getAccount().getGroupName()) {
            case "GIANGVIEN": {
                if (maLop != null) {
                    List<SinhVien> students = new ArrayList<>(SinhVienService.getAllStudentOfClass(maLop));
                        DefaultComboBoxModel model = new DefaultComboBoxModel();
                        
//                        Thêm danh sách sinh viên của lớp tương ứng vào combobox
                        model.addAll(students);
                        
//                        Giả định giáo viên là sinh viên
                        SinhVien student = new SinhVien();
                        student.setMaSV(LoginVariables.databaseConnector.getAccount().getUsername());
                        student.setHo(LoginVariables.databaseConnector.getAccount().getFullName());
                        student.setTen("(GV)"); // Mục đích để phân biệt với sinh viên
                        model.addElement(student);
                        
                        cboFullName.setModel(model);
                        cboFullName.setSelectedIndex(0);
                }
                break;
            }
            case "SINHVIEN": {
                DefaultComboBoxModel model = new DefaultComboBoxModel();
                model.addElement(SinhVienService.getStudent(LoginVariables.databaseConnector.getAccount().getUsername()));
                cboFullName.setModel(model);
                cboFullName.setSelectedIndex(0);
                break;
            }
            default:
                throw new AssertionError();
        }
    }

    public void fillSubjectComboBox(List<MonHoc> subjects) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        model.addAll(subjects);
        cboSubject.setModel(model);
        cboSubject.setSelectedIndex(0);
    }
    
    public void fillDateTimeComboBox() throws SQLException {
        if (cboClassroomCode.getSelectedItem() != null && cboFullName.getSelectedItem() != null && cboSubject.getSelectedItem() != null) {
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            model.addAll(
                    ThiService.getAllDateTimeString(
                        ((MonHoc) cboSubject.getSelectedItem()).getMaMH(), 
                        ThiService.getAllExamCalendar(String.valueOf(cboClassroomCode.getSelectedItem()), ((SinhVien) cboFullName.getSelectedItem()).getMaSV())
                    )
            );
            cboDateTime.setModel(model);
            cboDateTime.setSelectedIndex(0);
        }
    }
    
    public void fillExamTimesComboBox() throws SQLException, ParseException {
        if (cboClassroomCode.getSelectedItem() != null 
                && cboFullName.getSelectedItem() != null 
                && cboSubject.getSelectedItem() != null
                && cboDateTime.getSelectedItem() != null) {
                DefaultComboBoxModel model = new DefaultComboBoxModel();
                model.addAll(
                        ThiService.getAllExamTimes(
                                ((MonHoc) cboSubject.getSelectedItem()).getMaMH(), 
                                String.valueOf(cboDateTime.getSelectedItem()), 
                                ThiService.getAllExamCalendar(String.valueOf(cboClassroomCode.getSelectedItem()), ((SinhVien) cboFullName.getSelectedItem()).getMaSV())
                        )
                );
                cboTimes.setModel(model);
                cboTimes.setSelectedIndex(0);
                cboTimes.setEnabled(true);
        }
    }
    
    public void fillExamInfos() throws SQLException, ParseException {
        if (cboClassroomCode.getSelectedItem() != null 
                && cboSubject.getSelectedItem() != null
                && cboTimes.getSelectedItem() != null) {
                GiaoVienDangKy gvdk = GiaoVienDangKyService.getGVDK(
                                String.valueOf(cboClassroomCode.getSelectedItem()), 
                                ((MonHoc) cboSubject.getSelectedItem()).getMaMH(), 
                                Short.parseShort(String.valueOf(cboTimes.getSelectedItem()))
                        );
                txtQuestionQuantity.setText(String.valueOf(gvdk.getSoCauThi()));
                txtDuration.setText(String.valueOf(gvdk.getThoiGian()));
                txtLevel.setText(gvdk.getTrinhDo());
        }
    }
    
    public void disableAll() {
        cboClassroomCode.setEnabled(false);
        txtClassName.setEnabled(false);
        cboFullName.setEnabled(false);
        cboSubject.setEnabled(false);
        cboDateTime.setEnabled(false);
        cboTimes.setEnabled(false);
        txtQuestionQuantity.setEnabled(false);
        txtDuration.setEnabled(false);
        txtLevel.setEnabled(false);
    }

//    Getters and setters
    public JButton getBtnStart() {
        return btnStart;
    }

    public void setBtnStart(JButton btnStart) {
        this.btnStart = btnStart;
    }

    public JComboBox<String> getCboDateTime() {
        return cboDateTime;
    }

    public void setCboDateTime(JComboBox<String> cboDateTime) {
        this.cboDateTime = cboDateTime;
    }

    public JComboBox<String> getCboSubject() {
        return cboSubject;
    }

    public void setCboSubject(JComboBox<String> cboSubject) {
        this.cboSubject = cboSubject;
    }

    public JComboBox<String> getCboTimes() {
        return cboTimes;
    }

    public void setCboTimes(JComboBox<String> cboTimes) {
        this.cboTimes = cboTimes;
    }

    public JTextField getTxtClassName() {
        return txtClassName;
    }

    public void setTxtClassName(JTextField txtClassName) {
        this.txtClassName = txtClassName;
    }

    public JComboBox<String> getCboClassroomCode() {
        return cboClassroomCode;
    }

    public void setCboClassroomCode(JComboBox<String> cboClassroomCode) {
        this.cboClassroomCode = cboClassroomCode;
    }

    public JComboBox<String> getCboFullName() {
        return cboFullName;
    }

    public void setCboFullName(JComboBox<String> cboFullName) {
        this.cboFullName = cboFullName;
    }

    public JTextField getTxtDuration() {
        return txtDuration;
    }

    public void setTxtDuration(JTextField txtDuration) {
        this.txtDuration = txtDuration;
    }

    public JTextField getTxtLevel() {
        return txtLevel;
    }

    public void setTxtLevel(JTextField txtLevel) {
        this.txtLevel = txtLevel;
    }

    public JTextField getTxtQuestionQuantity() {
        return txtQuestionQuantity;
    }

    public void setTxtQuestionQuantity(JTextField txtQuestionQuantity) {
        this.txtQuestionQuantity = txtQuestionQuantity;
    }

    public JPanel getPnlEastContainer() {
        return pnlEastContainer;
    }

    public void setPnlEastContainer(JPanel pnlEastContainer) {
        this.pnlEastContainer = pnlEastContainer;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStart;
    private javax.swing.JComboBox<String> cboClassroomCode;
    private javax.swing.JComboBox<String> cboDateTime;
    private javax.swing.JComboBox<String> cboFullName;
    private javax.swing.JComboBox<String> cboSubject;
    private javax.swing.JComboBox<String> cboTimes;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlEastContainer;
    private javax.swing.JTextField txtClassName;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtQuestionQuantity;
    // End of variables declaration//GEN-END:variables
}
