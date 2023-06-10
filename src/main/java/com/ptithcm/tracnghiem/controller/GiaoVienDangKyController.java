/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.tracnghiem.controller;

import com.ptithcm.tracnghiem.global_variable.LoginVariables;
import com.ptithcm.tracnghiem.model.dto.ObjectAction;
import com.ptithcm.tracnghiem.service.BoDeService;
import com.ptithcm.tracnghiem.service.GiaoVienDangKyService;
import com.ptithcm.tracnghiem.service.LopService;
import com.ptithcm.tracnghiem.service.MonHocService;
import com.ptithcm.tracnghiem.view.FrmMain;
import com.ptithcm.tracnghiem.view.MessageBox;
import com.ptithcm.tracnghiem.view.PnlTeacherRegisterInfo;
import com.ptithcm.tracnghiem.view.PnlWorkSection;
import java.sql.SQLException;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MINHDAT
 */
public class GiaoVienDangKyController {
//    Hiển thị tất cả câu hỏi của giáo viên lên bảng
    public static void renderData(FrmMain frmMain, PnlWorkSection pnlWorkSection) {
        try {
            pnlWorkSection.setObjectActions(GiaoVienDangKyService.getAllGVDK());
            pnlWorkSection.fillDataTable(pnlWorkSection.getObjectActions());
            ((PnlTeacherRegisterInfo) pnlWorkSection.getPnlObjectInfo()).fillClassroomComboBox(new LopService().getAllClassrooms());
            ((PnlTeacherRegisterInfo) pnlWorkSection.getPnlObjectInfo()).fillSubjectComboBox(new MonHocService().getAllSubjects());
            ((PnlTeacherRegisterInfo) pnlWorkSection.getPnlObjectInfo()).fillLevelComboBox(new BoDeService().getLevelList());
            ((PnlTeacherRegisterInfo) pnlWorkSection.getPnlObjectInfo()).getTxtTeacherCode().setText(LoginVariables.databaseConnector.getAccount().getUsername());
        } catch (SQLException ex) {
            MessageBox.showErrorBox(ex.getClass().getName(), ex.getMessage());
        }
    }

//    Ghi tất cả dữ liệu đã thay đổi lên csdl
    public static void save(FrmMain frmMain, PnlWorkSection pnlWorkSection, List<ObjectAction> objectActions) {
        try {
            GiaoVienDangKyService.saveAll(objectActions);
//            Hiển thị hộp thoại thông báo khi nó ghi thành công
            MessageBox.showConfirmSuccessBox("Thông báo", "Ghi thành công!");

//            Tiến hành load lại trang sau khi ghi thành công
//            Reset dữ liệu của bộ nhớ tạm, undo, redo
            objectActions.clear();
            pnlWorkSection.getUndoRedo().reset();
            ((DefaultTableModel) pnlWorkSection.getTblData().getModel()).setRowCount(0);

//            Load lại dữ liệu
            renderData(frmMain, pnlWorkSection);

//            Reset form nhập liệu
            ((PnlTeacherRegisterInfo) pnlWorkSection.getPnlObjectInfo()).reset();

//            Reset thanh công cụ
            pnlWorkSection.getPnlManageBar().disableManageButtons(pnlWorkSection.getPnlManageBar().getBtnReload().getName());
        } catch (IllegalArgumentException ex) {
            MessageBox.showErrorBox(ex.getClass().getName(), ex.getMessage());
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            MessageBox.showErrorBox(ex.getClass().getName(), ex.getMessage());
            ex.printStackTrace();
        } catch (SQLException ex) {
            MessageBox.showErrorBox(ex.getClass().getName(), ex.getMessage());
            ex.printStackTrace();
        } catch (NoSuchFieldException ex) {
            MessageBox.showErrorBox(ex.getClass().getName(), ex.getMessage());
            ex.printStackTrace();
        }
    }
}
