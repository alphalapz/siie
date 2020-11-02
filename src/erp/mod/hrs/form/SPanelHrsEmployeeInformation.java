/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.mod.hrs.form;

import erp.mod.SModConsts;
import erp.mod.hrs.db.SDbEmployee;
import sa.lib.SLibConsts;
import sa.lib.SLibUtils;
import sa.lib.db.SDbRegistry;
import sa.lib.gui.SGuiClient;
import sa.lib.gui.SGuiConsts;
import sa.lib.gui.SGuiUtils;
import sa.lib.gui.SGuiValidation;
import sa.lib.gui.bean.SBeanPanel;

/**
 *
 * @author Juan Barajas, Sergio Flores
 */
public class SPanelHrsEmployeeInformation extends SBeanPanel {
    
    protected SDbEmployee moEmployee;
    
    /**
     * Creates new form SPanelHrsEmployeeInformation
     * @param client
     */
    public SPanelHrsEmployeeInformation(final SGuiClient client) {
        setPanelSettings(client);
        initComponents();
        initComponentsCustom();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpEmployee = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jlName = new javax.swing.JLabel();
        moTextName = new sa.lib.gui.bean.SBeanFieldText();
        moTextNumber = new sa.lib.gui.bean.SBeanFieldText();
        jPanel17 = new javax.swing.JPanel();
        jlPaymentType = new javax.swing.JLabel();
        moTextPaymentType = new sa.lib.gui.bean.SBeanFieldText();
        jlDateBirth = new javax.swing.JLabel();
        moTextDateBirth = new sa.lib.gui.bean.SBeanFieldText();
        jlDepartament = new javax.swing.JLabel();
        moTextDepartament = new sa.lib.gui.bean.SBeanFieldText();
        jlSalaryType = new javax.swing.JLabel();
        moTextSalaryType = new sa.lib.gui.bean.SBeanFieldText();
        jlFiscalId = new javax.swing.JLabel();
        moTextFiscalId = new sa.lib.gui.bean.SBeanFieldText();
        jPanel29 = new javax.swing.JPanel();
        jlSalary = new javax.swing.JLabel();
        moDecSalary = new sa.lib.gui.bean.SBeanFieldDecimal();
        jlDateBenefits = new javax.swing.JLabel();
        moTextDateBenefits = new sa.lib.gui.bean.SBeanFieldText();
        jlPosition = new javax.swing.JLabel();
        moTextPosition = new sa.lib.gui.bean.SBeanFieldText();
        jlEmployeeType = new javax.swing.JLabel();
        moTextEmployeeType = new sa.lib.gui.bean.SBeanFieldText();
        jlAlternativeId = new javax.swing.JLabel();
        moTextAlternativeId = new sa.lib.gui.bean.SBeanFieldText();
        jPanel18 = new javax.swing.JPanel();
        jlWage = new javax.swing.JLabel();
        moDecWage = new sa.lib.gui.bean.SBeanFieldDecimal();
        jlDateLastHire = new javax.swing.JLabel();
        moTextDateLastHire = new sa.lib.gui.bean.SBeanFieldText();
        jlShift = new javax.swing.JLabel();
        moTextShift = new sa.lib.gui.bean.SBeanFieldText();
        jlWorkerType = new javax.swing.JLabel();
        moTextWorkerType = new sa.lib.gui.bean.SBeanFieldText();
        jlSocialSecurityNumber = new javax.swing.JLabel();
        moTextSocialSecurityNumber = new sa.lib.gui.bean.SBeanFieldText();
        jPanel19 = new javax.swing.JPanel();
        jlSalarySscBase = new javax.swing.JLabel();
        moDecSalarySscBase = new sa.lib.gui.bean.SBeanFieldDecimal();
        jlDateLastDismissal_n = new javax.swing.JLabel();
        moTextDateLastDismissal_n = new sa.lib.gui.bean.SBeanFieldText();
        jlWorkingHoursDay = new javax.swing.JLabel();
        moIntWorkingHoursDay = new sa.lib.gui.bean.SBeanFieldInteger();
        jLabel1 = new javax.swing.JLabel();
        jlRecruitmentSchemeType = new javax.swing.JLabel();
        moTextRecruitmentSchemeType = new sa.lib.gui.bean.SBeanFieldText();

        setLayout(new java.awt.BorderLayout());

        jpEmployee.setLayout(new java.awt.BorderLayout());

        jPanel12.setLayout(new java.awt.BorderLayout());

        jPanel15.setLayout(new java.awt.GridLayout(5, 1, 0, 5));

        jPanel16.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 5, 0));

        jlName.setText("Nombre:");
        jlName.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel16.add(jlName);

        moTextName.setText("sBeanFieldText1");
        moTextName.setFocusable(false);
        moTextName.setPreferredSize(new java.awt.Dimension(250, 23));
        jPanel16.add(moTextName);

        moTextNumber.setText("sBeanFieldText1");
        moTextNumber.setToolTipText("clave");
        moTextNumber.setPreferredSize(new java.awt.Dimension(50, 23));
        jPanel16.add(moTextNumber);

        jPanel15.add(jPanel16);

        jPanel17.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 5, 0));

        jlPaymentType.setText("Periodo pago:");
        jlPaymentType.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel17.add(jlPaymentType);

        moTextPaymentType.setText("sBeanFieldText1");
        jPanel17.add(moTextPaymentType);

        jlDateBirth.setText("Nacimiento:");
        jlDateBirth.setPreferredSize(new java.awt.Dimension(95, 23));
        jPanel17.add(jlDateBirth);

        moTextDateBirth.setText("sBeanFieldText1");
        jPanel17.add(moTextDateBirth);

        jlDepartament.setText("Departamento:");
        jlDepartament.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel17.add(jlDepartament);

        moTextDepartament.setText("sBeanFieldText1");
        jPanel17.add(moTextDepartament);

        jlSalaryType.setText("Tipo salario:");
        jlSalaryType.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel17.add(jlSalaryType);

        moTextSalaryType.setText("sBeanFieldText1");
        jPanel17.add(moTextSalaryType);

        jlFiscalId.setText("RFC:");
        jlFiscalId.setPreferredSize(new java.awt.Dimension(40, 23));
        jPanel17.add(jlFiscalId);

        moTextFiscalId.setText("sBeanFieldText1");
        jPanel17.add(moTextFiscalId);

        jPanel15.add(jPanel17);

        jPanel29.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlSalary.setText("Salario diario:");
        jlSalary.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel29.add(jlSalary);

        moDecSalary.setFocusable(false);
        jPanel29.add(moDecSalary);

        jlDateBenefits.setText("Inicio beneficios:");
        jlDateBenefits.setPreferredSize(new java.awt.Dimension(95, 23));
        jPanel29.add(jlDateBenefits);

        moTextDateBenefits.setText("sBeanFieldText1");
        moTextDateBenefits.setToolTipText("");
        jPanel29.add(moTextDateBenefits);

        jlPosition.setText("Puesto:");
        jlPosition.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel29.add(jlPosition);

        moTextPosition.setText("sBeanFieldText1");
        jPanel29.add(moTextPosition);

        jlEmployeeType.setText("Tipo empleado:");
        jlEmployeeType.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel29.add(jlEmployeeType);

        moTextEmployeeType.setText("sBeanFieldText1");
        jPanel29.add(moTextEmployeeType);

        jlAlternativeId.setText("CURP:");
        jlAlternativeId.setPreferredSize(new java.awt.Dimension(40, 23));
        jPanel29.add(jlAlternativeId);

        moTextAlternativeId.setText("sBeanFieldText1");
        moTextAlternativeId.setPreferredSize(new java.awt.Dimension(125, 23));
        jPanel29.add(moTextAlternativeId);

        jPanel15.add(jPanel29);

        jPanel18.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 5, 0));

        jlWage.setText("Sueldo mensual:");
        jlWage.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel18.add(jlWage);

        moDecWage.setFocusable(false);
        jPanel18.add(moDecWage);

        jlDateLastHire.setText("Última alta:");
        jlDateLastHire.setPreferredSize(new java.awt.Dimension(95, 23));
        jPanel18.add(jlDateLastHire);

        moTextDateLastHire.setText("sBeanFieldText1");
        jPanel18.add(moTextDateLastHire);

        jlShift.setText("Turno:");
        jlShift.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel18.add(jlShift);

        moTextShift.setText("sBeanFieldText1");
        jPanel18.add(moTextShift);

        jlWorkerType.setText("Tipo obrero:");
        jlWorkerType.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel18.add(jlWorkerType);

        moTextWorkerType.setText("sBeanFieldText1");
        jPanel18.add(moTextWorkerType);

        jlSocialSecurityNumber.setText("NSS:");
        jlSocialSecurityNumber.setPreferredSize(new java.awt.Dimension(40, 23));
        jPanel18.add(jlSocialSecurityNumber);

        moTextSocialSecurityNumber.setText("sBeanFieldText1");
        jPanel18.add(moTextSocialSecurityNumber);

        jPanel15.add(jPanel18);

        jPanel19.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 5, 0));

        jlSalarySscBase.setText("SBC:");
        jlSalarySscBase.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel19.add(jlSalarySscBase);

        moDecSalarySscBase.setFocusable(false);
        jPanel19.add(moDecSalarySscBase);

        jlDateLastDismissal_n.setText("Última baja:");
        jlDateLastDismissal_n.setPreferredSize(new java.awt.Dimension(95, 23));
        jPanel19.add(jlDateLastDismissal_n);

        moTextDateLastDismissal_n.setText("sBeanFieldText1");
        jPanel19.add(moTextDateLastDismissal_n);

        jlWorkingHoursDay.setText("Horas jornada:");
        jlWorkingHoursDay.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel19.add(jlWorkingHoursDay);

        moIntWorkingHoursDay.setPreferredSize(new java.awt.Dimension(50, 23));
        jPanel19.add(moIntWorkingHoursDay);

        jLabel1.setPreferredSize(new java.awt.Dimension(45, 23));
        jPanel19.add(jLabel1);

        jlRecruitmentSchemeType.setText("Régimen:");
        jlRecruitmentSchemeType.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel19.add(jlRecruitmentSchemeType);

        moTextRecruitmentSchemeType.setText("sBeanFieldText1");
        moTextRecruitmentSchemeType.setPreferredSize(new java.awt.Dimension(275, 23));
        jPanel19.add(moTextRecruitmentSchemeType);

        jPanel15.add(jPanel19);

        jPanel12.add(jPanel15, java.awt.BorderLayout.CENTER);

        jpEmployee.add(jPanel12, java.awt.BorderLayout.NORTH);

        add(jpEmployee, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void resetPanel() {
        moTextName.resetField();
        moTextNumber.resetField();
        moTextPaymentType.resetField();
        moDecSalary.resetField();
        moDecWage.resetField();
        moDecSalarySscBase.resetField();
        moTextDateBirth.resetField();
        moTextDateBenefits.resetField();
        moTextDateLastHire.resetField();
        moTextDateLastDismissal_n.resetField();
        moTextDepartament.resetField();
        moTextPosition.resetField();
        moTextShift.resetField();
        moIntWorkingHoursDay.resetField();
        moTextSalaryType.resetField();
        moTextEmployeeType.resetField();
        moTextWorkerType.resetField();
        moTextFiscalId.resetField();
        moTextAlternativeId.resetField();
        moTextSocialSecurityNumber.resetField();
        moTextRecruitmentSchemeType.resetField();
    }
    
    private void renderEmployee() {
        if (moEmployee == null) {
            resetPanel();
        }
        else {
            moTextName.setValue(moEmployee.getXtaEmployeeName());
            moTextNumber.setValue(moEmployee.getNumber());
            moTextPaymentType.setValue(miClient.getSession().readField(SModConsts.HRSS_TP_PAY, new int[] { moEmployee.getFkPaymentTypeId() }, SDbRegistry.FIELD_NAME));
            moDecSalary.setValue(moEmployee.getSalary());
            moDecWage.setValue(moEmployee.getWage());
            moDecSalarySscBase.setValue(moEmployee.getSalarySscBase());
            moTextDateBirth.setValue(SLibUtils.DateFormatDate.format(moEmployee.getDateBirth()));
            moTextDateBenefits.setValue(SLibUtils.DateFormatDate.format(moEmployee.getDateBenefits()));
            moTextDateLastHire.setValue(SLibUtils.DateFormatDate.format(moEmployee.getDateLastHire()));
            moTextDateLastDismissal_n.setValue(moEmployee.getDateLastDismissal_n() != null ? SLibUtils.DateFormatDate.format(moEmployee.getDateLastDismissal_n()) : "");
            moTextDepartament.setValue(miClient.getSession().readField(SModConsts.HRSU_DEP, new int[] { moEmployee.getFkDepartmentId() }, SDbRegistry.FIELD_NAME));
            moTextPosition.setValue(miClient.getSession().readField(SModConsts.HRSU_POS, new int[] { moEmployee.getFkPositionId() }, SDbRegistry.FIELD_NAME));
            moTextShift.setValue(miClient.getSession().readField(SModConsts.HRSU_SHT, new int[] { moEmployee.getFkShiftId() }, SDbRegistry.FIELD_NAME));
            moIntWorkingHoursDay.setValue(moEmployee.getWorkingHoursDay());
            moTextSalaryType.setValue(miClient.getSession().readField(SModConsts.HRSS_TP_SAL, new int[] { moEmployee.getFkSalaryTypeId() }, SDbRegistry.FIELD_NAME));
            moTextEmployeeType.setValue(miClient.getSession().readField(SModConsts.HRSU_TP_EMP, new int[] { moEmployee.getFkEmployeeTypeId() }, SDbRegistry.FIELD_NAME));
            moTextWorkerType.setValue(miClient.getSession().readField(SModConsts.HRSU_TP_WRK, new int[] { moEmployee.getFkWorkerTypeId() }, SDbRegistry.FIELD_NAME));
            moTextFiscalId.setValue(moEmployee.getXtaEmployeeRfc());
            moTextAlternativeId.setValue(moEmployee.getXtaEmployeeCurp());
            moTextSocialSecurityNumber.setValue(moEmployee.getSocialSecurityNumber());
            moTextRecruitmentSchemeType.setValue(miClient.getSession().readField(SModConsts.HRSS_TP_REC_SCHE, new int[] { moEmployee.getFkRecruitmentSchemeTypeId()}, SDbRegistry.FIELD_NAME));
        }
    }
    
    private void initComponentsCustom() {
        moTextName.setTextSettings(SGuiUtils.getLabelName(jlName), 202);
        moTextNumber.setTextSettings(SGuiUtils.getLabelName(jlName), 10);
        moTextPaymentType.setTextSettings(SGuiUtils.getLabelName(jlName), 50);
        moDecSalary.setDecimalSettings(SGuiUtils.getLabelName(jlSalary), SGuiConsts.GUI_TYPE_DEC_AMT, false);
        moDecWage.setDecimalSettings(SGuiUtils.getLabelName(jlWage), SGuiConsts.GUI_TYPE_DEC_AMT, false);
        moDecSalarySscBase.setDecimalSettings(SGuiUtils.getLabelName(jlSalarySscBase), SGuiConsts.GUI_TYPE_DEC_AMT, false);
        moTextDateBirth.setTextSettings(SGuiUtils.getLabelName(jlName), 50);
        moTextDateBenefits.setTextSettings(SGuiUtils.getLabelName(jlName), 50);
        moTextDateLastHire.setTextSettings(SGuiUtils.getLabelName(jlName), 50);
        moTextDateLastDismissal_n.setTextSettings(SGuiUtils.getLabelName(jlName), 50);
        moTextDepartament.setTextSettings(SGuiUtils.getLabelName(jlName), 50);
        moTextPosition.setTextSettings(SGuiUtils.getLabelName(jlName), 50);
        moTextShift.setTextSettings(SGuiUtils.getLabelName(jlName), 50);
        moIntWorkingHoursDay.setIntegerSettings(SGuiUtils.getLabelName(jlName), SGuiConsts.GUI_TYPE_INT, false);
        moTextSalaryType.setTextSettings(SGuiUtils.getLabelName(jlName), 50);
        moTextEmployeeType.setTextSettings(SGuiUtils.getLabelName(jlName), 50);
        moTextWorkerType.setTextSettings(SGuiUtils.getLabelName(jlName), 50);
        moTextFiscalId.setTextSettings(SGuiUtils.getLabelName(jlName), 25);
        moTextAlternativeId.setTextSettings(SGuiUtils.getLabelName(jlName), 25);
        moTextSocialSecurityNumber.setTextSettings(SGuiUtils.getLabelName(jlName), 15);
        moTextRecruitmentSchemeType.setTextSettings(SGuiUtils.getLabelName(jlRecruitmentSchemeType), 100);
        
        moTextName.setEditable(false);
        moTextNumber.setEditable(false);
        moTextPaymentType.setEditable(false);
        moDecSalary.setEditable(false);
        moDecWage.setEditable(false);
        moDecSalarySscBase.setEditable(false);
        moTextDateBirth.setEditable(false);
        moTextDateBenefits.setEditable(false);
        moTextDateLastHire.setEditable(false);
        moTextDateLastDismissal_n.setEditable(false);
        moTextDepartament.setEditable(false);
        moTextPosition.setEditable(false);
        moTextShift.setEditable(false);
        moIntWorkingHoursDay.setEditable(false);
        moTextSalaryType.setEditable(false);
        moTextEmployeeType.setEditable(false);
        moTextWorkerType.setEditable(false);
        moTextFiscalId.setEditable(false);
        moTextAlternativeId.setEditable(false);
        moTextSocialSecurityNumber.setEditable(false);
        moTextRecruitmentSchemeType.setEditable(false);
        
        resetPanel();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JLabel jlAlternativeId;
    private javax.swing.JLabel jlDateBenefits;
    private javax.swing.JLabel jlDateBirth;
    private javax.swing.JLabel jlDateLastDismissal_n;
    private javax.swing.JLabel jlDateLastHire;
    private javax.swing.JLabel jlDepartament;
    private javax.swing.JLabel jlEmployeeType;
    private javax.swing.JLabel jlFiscalId;
    private javax.swing.JLabel jlName;
    private javax.swing.JLabel jlPaymentType;
    private javax.swing.JLabel jlPosition;
    private javax.swing.JLabel jlRecruitmentSchemeType;
    private javax.swing.JLabel jlSalary;
    private javax.swing.JLabel jlSalarySscBase;
    private javax.swing.JLabel jlSalaryType;
    private javax.swing.JLabel jlShift;
    private javax.swing.JLabel jlSocialSecurityNumber;
    private javax.swing.JLabel jlWage;
    private javax.swing.JLabel jlWorkerType;
    private javax.swing.JLabel jlWorkingHoursDay;
    private javax.swing.JPanel jpEmployee;
    private sa.lib.gui.bean.SBeanFieldDecimal moDecSalary;
    private sa.lib.gui.bean.SBeanFieldDecimal moDecSalarySscBase;
    private sa.lib.gui.bean.SBeanFieldDecimal moDecWage;
    private sa.lib.gui.bean.SBeanFieldInteger moIntWorkingHoursDay;
    private sa.lib.gui.bean.SBeanFieldText moTextAlternativeId;
    private sa.lib.gui.bean.SBeanFieldText moTextDateBenefits;
    private sa.lib.gui.bean.SBeanFieldText moTextDateBirth;
    private sa.lib.gui.bean.SBeanFieldText moTextDateLastDismissal_n;
    private sa.lib.gui.bean.SBeanFieldText moTextDateLastHire;
    private sa.lib.gui.bean.SBeanFieldText moTextDepartament;
    private sa.lib.gui.bean.SBeanFieldText moTextEmployeeType;
    private sa.lib.gui.bean.SBeanFieldText moTextFiscalId;
    private sa.lib.gui.bean.SBeanFieldText moTextName;
    private sa.lib.gui.bean.SBeanFieldText moTextNumber;
    private sa.lib.gui.bean.SBeanFieldText moTextPaymentType;
    private sa.lib.gui.bean.SBeanFieldText moTextPosition;
    private sa.lib.gui.bean.SBeanFieldText moTextRecruitmentSchemeType;
    private sa.lib.gui.bean.SBeanFieldText moTextSalaryType;
    private sa.lib.gui.bean.SBeanFieldText moTextShift;
    private sa.lib.gui.bean.SBeanFieldText moTextSocialSecurityNumber;
    private sa.lib.gui.bean.SBeanFieldText moTextWorkerType;
    // End of variables declaration//GEN-END:variables

    @Override
    public void addAllListeners() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeAllListeners() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reloadCatalogues() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setRegistry(SDbRegistry registry) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SDbRegistry getRegistry() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SGuiValidation validatePanel() {
        SGuiValidation validation = moFields.validateFields();
        
        return validation;
    }
    
    @Override
    public void setValue(int type, Object value) {
        switch (type) {
            case SGuiConsts.PARAM_BPR:
                moEmployee = (SDbEmployee) value;
                renderEmployee();
                break;
            default:
                miClient.showMsgBoxError(SLibConsts.ERR_MSG_OPTION_UNKNOWN);
        }
    }
    
    @Override
    public Object getValue(int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}