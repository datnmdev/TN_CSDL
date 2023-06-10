/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.ptithcm.tracnghiem.view;

import com.ptithcm.tracnghiem.entity.GiaoVien;
import com.ptithcm.tracnghiem.repository.CreateLoginRepository;
import com.ptithcm.tracnghiem.service.GiaoVienService;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class PnlCreateLoginCoSo extends javax.swing.JPanel {

    private String magv;
    private String loginName;

    /**
     * Creates new form PnlCreateLoginCoSo
     */
    public PnlCreateLoginCoSo() {
        initComponents();
    }

    public PnlCreateLoginCoSo(String magv) throws SQLException {
        this.magv = magv;
        initComponents();
        txtMaGV.setText(magv);
        fillHoten(magv);
        fillLoginName(magv);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMaGV = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPassWord = new javax.swing.JPasswordField();
        btnCreateLogin = new javax.swing.JButton();
        btnClearLogin = new javax.swing.JButton();
        comboboxRule = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setText("HỌ TÊN GIÁO VIÊN :");

        txtHoTen.setEditable(false);
        txtHoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoTenActionPerformed(evt);
            }
        });

        jLabel2.setText("MÃ GIÁO VIÊN:");

        txtMaGV.setEditable(false);
        txtMaGV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaGVActionPerformed(evt);
            }
        });

        jLabel3.setText("LOGIN:");

        jLabel4.setText("PASS WORD:");

        btnCreateLogin.setText("TẠO TÀI KHOẢN");
        btnCreateLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateLoginActionPerformed(evt);
            }
        });

        btnClearLogin.setText("XÓA TÀI KHOẢN");
        btnClearLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearLoginActionPerformed(evt);
            }
        });

        comboboxRule.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COSO", "GIANGVIEN" }));

        jLabel5.setText("VAI TRÒ:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtHoTen)
                            .addComponent(txtMaGV, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCreateLogin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnClearLogin)
                                .addGap(30, 30, 30))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(comboboxRule, 0, 116, Short.MAX_VALUE)
                                    .addComponent(txtLogin))
                                .addGap(28, 28, 28)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboboxRule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateLogin)
                    .addComponent(btnClearLogin))
                .addContainerGap(43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtHoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoTenActionPerformed

    private void txtMaGVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaGVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaGVActionPerformed

    private void btnCreateLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateLoginActionPerformed
        try {
            // TODO add your handling code here:
            String login = txtLogin.getText();
            String password = txtPassWord.getText();
            String rule = (String) comboboxRule.getSelectedItem();

            CreateLoginRepository.createLogin(login, password, magv, rule);

            btnClearLogin.setEnabled(true);
            btnCreateLogin.setEnabled(false);

            JOptionPane.showMessageDialog(null, "Tạo thành công");

        } catch (SQLException ex) {
            MessageBox.showErrorBox(ex.getClass().getName(), ex.getMessage());
        }

    }//GEN-LAST:event_btnCreateLoginActionPerformed

    private void btnClearLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearLoginActionPerformed
        try {
            // TODO add your handling code here:
            CreateLoginRepository.clearLogin(loginName, magv);
            btnClearLogin.setEnabled(false);
            btnCreateLogin.setEnabled(true);
            JOptionPane.showMessageDialog(null, "Xóa thành công");
        } catch (SQLException ex) {
            MessageBox.showErrorBox(ex.getClass().getName(), ex.getMessage());
        }
    }//GEN-LAST:event_btnClearLoginActionPerformed

    //mether
    //hàm này lấy tên giáo viên đẩy lên 
    public void fillHoten(String magv) throws SQLException {
        GiaoVienService gvs = new GiaoVienService();
        GiaoVien gv = gvs.getTeacher(magv);
        txtHoTen.setText(gv.getHo().strip() + gv.getTen().strip());
    }

    //hàm này dùng để kiểm tra xem user đã tồn tại hay chưa nếu tồn tại thì khóa nút tạo tài khoản lại
    public boolean chechUserName(String magv) throws SQLException {
        int re = CreateLoginRepository.checkUserName(magv);
        if (re == 1) {
            btnCreateLogin.setEnabled(false);
            btnClearLogin.setEnabled(true);
            return true;
        } else {
            btnCreateLogin.setEnabled(true);
            btnClearLogin.setEnabled(false);
            return false;
        }
    }

    //hàm này dùng để nếu user tồn tại thì lấy tên login
    public void fillLoginName(String magv1) throws SQLException {

        if (chechUserName(magv1)) {

            String loginName1 = CreateLoginRepository.findLogin(magv1);

            txtLogin.setText(loginName1);
            loginName = loginName1;
        }
    }

    //getter và setter
    public JButton getBtnClearLogin() {
        return btnClearLogin;
    }

    public void setBtnClearLogin(JButton btnClearLogin) {
        this.btnClearLogin = btnClearLogin;
    }

    public JButton getBtnCreateLogin() {
        return btnCreateLogin;
    }

    public void setBtnCreateLogin(JButton btnCreateLogin) {
        this.btnCreateLogin = btnCreateLogin;
    }

    public JComboBox<String> getComboboxRule() {
        return comboboxRule;
    }

    public void setComboboxRule(JComboBox<String> comboboxRule) {
        this.comboboxRule = comboboxRule;
    }

    public JTextField getTxtHoTen() {
        return txtHoTen;
    }

    public void setTxtHoTen(JTextField txtHoTen) {
        this.txtHoTen = txtHoTen;
    }

    public JTextField getTxtLogin() {
        return txtLogin;
    }

    public void setTxtLogin(JTextField txtLogin) {
        this.txtLogin = txtLogin;
    }

    public JTextField getTxtMaGV() {
        return txtMaGV;
    }

    public void setTxtMaGV(JTextField txtMaGV) {
        this.txtMaGV = txtMaGV;
    }

    public JPasswordField getTxtPassWord() {
        return txtPassWord;
    }

    public void setTxtPassWord(JPasswordField txtPassWord) {
        this.txtPassWord = txtPassWord;
    }

    public String getMagv() {
        return magv;
    }

    public void setMagv(String magv) {
        this.magv = magv;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClearLogin;
    private javax.swing.JButton btnCreateLogin;
    private javax.swing.JComboBox<String> comboboxRule;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtMaGV;
    private javax.swing.JPasswordField txtPassWord;
    // End of variables declaration//GEN-END:variables
}
