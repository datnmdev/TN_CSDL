/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.ptithcm.tracnghiem.view;

import com.ptithcm.tracnghiem.entity.BoDe;
import com.ptithcm.tracnghiem.entity.MonHoc;
import com.ptithcm.tracnghiem.model.dto.ObjectAction;
import java.awt.Cursor;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author MINHDAT
 */
public class PnlQuestionInfo extends javax.swing.JPanel {
    private int idCauHoi;
    
    /**
     * Creates new form PnlQuestionInfo
     */
    public PnlQuestionInfo() {
        this.idCauHoi = 0;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnResetForm = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cboSubject = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cboLevel = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTeacherCode = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaContent = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaQuestionA = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAreaQuestionB = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtAreaQuestionC = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtAreaQuestionD = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        cboAnswer = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtQuestionId = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(400, 624));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnResetForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/24x24/reset.png"))); // NOI18N
        btnResetForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetFormMouseClicked(evt);
            }
        });
        btnResetForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnResetForm.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnResetForm.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });

        btnResetForm.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnResetForm.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
        });
        jPanel1.add(btnResetForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 30, 40));

        jLabel1.setBackground(new java.awt.Color(0, 0, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thông tin câu hỏi thi");
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(110, 40));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel3.setPreferredSize(new java.awt.Dimension(400, 582));

        jLabel2.setText("Môn học:");

        jLabel3.setText("Trình độ:");

        jLabel4.setText("Nội dung:");

        jLabel5.setText("Giáo viên soạn:");

        txtTeacherCode.setEditable(false);

        txtAreaContent.setColumns(20);
        txtAreaContent.setLineWrap(true);
        txtAreaContent.setRows(5);
        txtAreaContent.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtAreaContent);

        jLabel6.setText("Câu A:");

        txtAreaQuestionA.setColumns(20);
        txtAreaQuestionA.setLineWrap(true);
        txtAreaQuestionA.setRows(5);
        txtAreaQuestionA.setWrapStyleWord(true);
        jScrollPane3.setViewportView(txtAreaQuestionA);

        jLabel7.setText("Câu B:");

        txtAreaQuestionB.setColumns(20);
        txtAreaQuestionB.setLineWrap(true);
        txtAreaQuestionB.setRows(5);
        txtAreaQuestionB.setWrapStyleWord(true);
        jScrollPane4.setViewportView(txtAreaQuestionB);

        jLabel8.setText("Câu C:");

        txtAreaQuestionC.setColumns(20);
        txtAreaQuestionC.setLineWrap(true);
        txtAreaQuestionC.setRows(5);
        txtAreaQuestionC.setWrapStyleWord(true);
        jScrollPane5.setViewportView(txtAreaQuestionC);

        jLabel9.setText("Câu D:");

        txtAreaQuestionD.setColumns(20);
        txtAreaQuestionD.setLineWrap(true);
        txtAreaQuestionD.setRows(5);
        txtAreaQuestionD.setWrapStyleWord(true);
        jScrollPane6.setViewportView(txtAreaQuestionD);

        jLabel10.setText("Đáp án:");

        cboAnswer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D" }));

        jLabel11.setText("Id câu hỏi:");

        txtQuestionId.setEditable(false);
        txtQuestionId.setText("-1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboAnswer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboLevel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboSubject, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTeacherCode))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuestionId, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtQuestionId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTeacherCode, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        jScrollPane1.setViewportView(jPanel3);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetFormMouseClicked
        reset();
    }//GEN-LAST:event_btnResetFormMouseClicked

//    Methods
    public BoDe getQuestionData(String btnName, List<ObjectAction> objectActions) {
        BoDe question;
        switch (btnName) {
            case "Add":
                question = new BoDe(
                        idCauHoi = idCauHoi-1, String.valueOf(((MonHoc) cboSubject.getSelectedItem()).getMaMH()), 
                    String.valueOf(cboLevel.getSelectedItem()), txtAreaContent.getText(), 
                    txtAreaQuestionA.getText(), txtAreaQuestionB.getText(), 
                    txtAreaQuestionC.getText(), txtAreaQuestionD.getText(), 
                    String.valueOf(cboAnswer.getSelectedItem()), txtTeacherCode.getText().split(" - ")[0]
                );
                break;
            default:
                question = new BoDe(
                    Integer.parseInt(txtQuestionId.getText()), String.valueOf(((MonHoc) cboSubject.getSelectedItem()).getMaMH()), 
                    String.valueOf(cboLevel.getSelectedItem()), txtAreaContent.getText(), 
                    txtAreaQuestionA.getText(), txtAreaQuestionB.getText(), 
                    txtAreaQuestionC.getText(), txtAreaQuestionD.getText(), 
                    String.valueOf(cboAnswer.getSelectedItem()), txtTeacherCode.getText().split(" - ")[0]
                );
        }
        return question;
    }
    
    public void fillSubjectComboBox(List<MonHoc> subjects) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        model.addAll(subjects);
        cboSubject.setModel(model);
        cboSubject.setSelectedIndex(0);
    }
    
    public void fillLevelComboBox(List<String> levelList) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        model.addAll(levelList);
        cboLevel.setModel(model);
        cboLevel.setSelectedIndex(0);
    }
    
    public void setSelectedSubjectItem(String maMH) {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboSubject.getModel();
        for (int i = 0; i < model.getSize(); ++i) {
            MonHoc subject = (MonHoc) model.getElementAt(i);
            if (subject.getMaMH().equals(maMH)) {
                cboSubject.setSelectedItem(subject);
                break;
            }
        }
    }
    
    public void reset() {
        txtQuestionId.setText(String.valueOf(idCauHoi-1));
        cboSubject.setSelectedIndex(0);
        cboLevel.setSelectedIndex(0);
        txtAreaContent.setText("");
        txtAreaQuestionA.setText("");
        txtAreaQuestionB.setText("");
        txtAreaQuestionC.setText("");
        txtAreaQuestionD.setText("");
        cboAnswer.setSelectedIndex(0);
    }
    
//    Getters and setters
    public JComboBox<String> getCboAnswer() {
        return cboAnswer;
    }

    public void setCboAnswer(JComboBox<String> cboAnswer) {
        this.cboAnswer = cboAnswer;
    }

    public JComboBox<String> getCboLevel() {
        return cboLevel;
    }

    public void setCboLevel(JComboBox<String> cboLevel) {
        this.cboLevel = cboLevel;
    }

    public JComboBox<String> getCboSubject() {
        return cboSubject;
    }

    public void setCboSubject(JComboBox<String> cboSubject) {
        this.cboSubject = cboSubject;
    }

    public JTextArea getTxtAreaContent() {
        return txtAreaContent;
    }

    public void setTxtAreaContent(JTextArea txtAreaContent) {
        this.txtAreaContent = txtAreaContent;
    }

    public JTextArea getTxtAreaQuestionA() {
        return txtAreaQuestionA;
    }

    public void setTxtAreaQuestionA(JTextArea txtAreaQuestionA) {
        this.txtAreaQuestionA = txtAreaQuestionA;
    }

    public JTextArea getTxtAreaQuestionB() {
        return txtAreaQuestionB;
    }

    public void setTxtAreaQuestionB(JTextArea txtAreaQuestionB) {
        this.txtAreaQuestionB = txtAreaQuestionB;
    }

    public JTextArea getTxtAreaQuestionC() {
        return txtAreaQuestionC;
    }

    public void setTxtAreaQuestionC(JTextArea txtAreaQuestionC) {
        this.txtAreaQuestionC = txtAreaQuestionC;
    }

    public JTextArea getTxtAreaQuestionD() {
        return txtAreaQuestionD;
    }

    public void setTxtAreaQuestionD(JTextArea txtAreaQuestionD) {
        this.txtAreaQuestionD = txtAreaQuestionD;
    }

    public JTextField getTxtQuestionId() {
        return txtQuestionId;
    }

    public void setTxtQuestionId(JTextField txtQuestionId) {
        this.txtQuestionId = txtQuestionId;
    }

    public JTextField getTxtTeacherInfo() {
        return txtTeacherCode;
    }

    public void setTxtTeacherInfo(JTextField txtTeacherInfo) {
        this.txtTeacherCode = txtTeacherInfo;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnResetForm;
    private javax.swing.JComboBox<String> cboAnswer;
    private javax.swing.JComboBox<String> cboLevel;
    private javax.swing.JComboBox<String> cboSubject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea txtAreaContent;
    private javax.swing.JTextArea txtAreaQuestionA;
    private javax.swing.JTextArea txtAreaQuestionB;
    private javax.swing.JTextArea txtAreaQuestionC;
    private javax.swing.JTextArea txtAreaQuestionD;
    private javax.swing.JTextField txtQuestionId;
    private javax.swing.JTextField txtTeacherCode;
    // End of variables declaration//GEN-END:variables
}