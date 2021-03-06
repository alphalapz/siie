/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.mod.hrs.form;

import erp.mod.SModConsts;
import erp.mod.hrs.db.SDbConfig;
import erp.mod.hrs.db.SDbWorkingDaySettings;
import sa.gui.util.SUtilConsts;
import sa.lib.SLibConsts;
import sa.lib.SLibUtils;
import sa.lib.db.SDbConsts;
import sa.lib.db.SDbRegistry;
import sa.lib.gui.SGuiClient;
import sa.lib.gui.SGuiConsts;
import sa.lib.gui.SGuiUtils;
import sa.lib.gui.SGuiValidation;
import sa.lib.gui.bean.SBeanFieldBoolean;
import sa.lib.gui.bean.SBeanForm;

/**
 *
 * @author Juan Barajas
 */
public class SFormWorkingDaySettings extends SBeanForm {

    private SDbWorkingDaySettings moRegistry;
    private SDbConfig moConfig;

    /**
     * Creates new form SFormWorkingDaySettings
     */
    public SFormWorkingDaySettings(SGuiClient client, String title) {
        setFormSettings(client, SGuiConsts.BEAN_FORM_EDIT, SModConsts.HRS_CFG, SLibConsts.UNDEFINED, title);
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

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jlPaymentType = new javax.swing.JLabel();
        moKeyPaymentType = new sa.lib.gui.bean.SBeanFieldKey();
        jPanel5 = new javax.swing.JPanel();
        jlWorkingHoursDay = new javax.swing.JLabel();
        moIntWorkingHoursDay = new sa.lib.gui.bean.SBeanFieldInteger();
        jPanel8 = new javax.swing.JPanel();
        jlWorkingDaysWeek = new javax.swing.JLabel();
        moIntWorkingDaysWeek = new sa.lib.gui.bean.SBeanFieldInteger();
        jPanel7 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        moBoolWeekdaySettingSunday = new sa.lib.gui.bean.SBeanFieldBoolean();
        moBoolWeekdaySettingMonday = new sa.lib.gui.bean.SBeanFieldBoolean();
        moBoolWeekdaySettingTuesday = new sa.lib.gui.bean.SBeanFieldBoolean();
        moBoolWeekdaySettingWednesday = new sa.lib.gui.bean.SBeanFieldBoolean();
        moBoolWeekdaySettingThursday = new sa.lib.gui.bean.SBeanFieldBoolean();
        moBoolWeekdaySettingFriday = new sa.lib.gui.bean.SBeanFieldBoolean();
        moBoolWeekdaySettingSaturday = new sa.lib.gui.bean.SBeanFieldBoolean();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del registro:"));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.GridLayout(1, 2));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Configuración general:"));
        jPanel6.setLayout(new java.awt.GridLayout(3, 1, 0, 5));

        jPanel14.setLayout(new java.awt.FlowLayout(0, 5, 0));

        jlPaymentType.setText("Periodo pago:*");
        jlPaymentType.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel14.add(jlPaymentType);

        moKeyPaymentType.setPreferredSize(new java.awt.Dimension(200, 23));
        jPanel14.add(moKeyPaymentType);

        jPanel6.add(jPanel14);

        jPanel5.setLayout(new java.awt.FlowLayout(0, 5, 0));

        jlWorkingHoursDay.setText("Horas jornada:*");
        jlWorkingHoursDay.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel5.add(jlWorkingHoursDay);

        moIntWorkingHoursDay.setPreferredSize(new java.awt.Dimension(50, 23));
        jPanel5.add(moIntWorkingHoursDay);

        jPanel6.add(jPanel5);

        jPanel8.setLayout(new java.awt.FlowLayout(0, 5, 0));

        jlWorkingDaysWeek.setText("Días lab. semana:*");
        jlWorkingDaysWeek.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel8.add(jlWorkingDaysWeek);

        moIntWorkingDaysWeek.setPreferredSize(new java.awt.Dimension(50, 23));
        jPanel8.add(moIntWorkingDaysWeek);

        jPanel6.add(jPanel8);

        jPanel2.add(jPanel6);

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Días laborables semana:"));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel4.setLayout(new java.awt.GridLayout(7, 0, 0, 5));

        moBoolWeekdaySettingSunday.setText("Domingo es laborable");
        jPanel4.add(moBoolWeekdaySettingSunday);

        moBoolWeekdaySettingMonday.setText("Lunes es laborable");
        jPanel4.add(moBoolWeekdaySettingMonday);

        moBoolWeekdaySettingTuesday.setText("Martes es laborable");
        jPanel4.add(moBoolWeekdaySettingTuesday);

        moBoolWeekdaySettingWednesday.setText("Miércoles es laborable");
        jPanel4.add(moBoolWeekdaySettingWednesday);

        moBoolWeekdaySettingThursday.setText("Jueves es laborable");
        jPanel4.add(moBoolWeekdaySettingThursday);

        moBoolWeekdaySettingFriday.setText("Viernes es laborable");
        jPanel4.add(moBoolWeekdaySettingFriday);

        moBoolWeekdaySettingSaturday.setText("Sábado es laborable");
        jPanel4.add(moBoolWeekdaySettingSaturday);

        jPanel7.add(jPanel4, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel7, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel jlPaymentType;
    private javax.swing.JLabel jlWorkingDaysWeek;
    private javax.swing.JLabel jlWorkingHoursDay;
    private sa.lib.gui.bean.SBeanFieldBoolean moBoolWeekdaySettingFriday;
    private sa.lib.gui.bean.SBeanFieldBoolean moBoolWeekdaySettingMonday;
    private sa.lib.gui.bean.SBeanFieldBoolean moBoolWeekdaySettingSaturday;
    private sa.lib.gui.bean.SBeanFieldBoolean moBoolWeekdaySettingSunday;
    private sa.lib.gui.bean.SBeanFieldBoolean moBoolWeekdaySettingThursday;
    private sa.lib.gui.bean.SBeanFieldBoolean moBoolWeekdaySettingTuesday;
    private sa.lib.gui.bean.SBeanFieldBoolean moBoolWeekdaySettingWednesday;
    private sa.lib.gui.bean.SBeanFieldInteger moIntWorkingDaysWeek;
    private sa.lib.gui.bean.SBeanFieldInteger moIntWorkingHoursDay;
    private sa.lib.gui.bean.SBeanFieldKey moKeyPaymentType;
    // End of variables declaration//GEN-END:variables

    private void initComponentsCustom() {
        SGuiUtils.setWindowBounds(this, 640, 400);

        moKeyPaymentType.setKeySettings(miClient, SGuiUtils.getLabelName(jlPaymentType.getText()), true);
        moIntWorkingHoursDay.setIntegerSettings(SGuiUtils.getLabelName(jlWorkingHoursDay.getText()), SGuiConsts.GUI_TYPE_INT, true);
        moIntWorkingHoursDay.setMinInteger(1);
        moIntWorkingHoursDay.setMaxInteger(24);
        moIntWorkingDaysWeek.setIntegerSettings(SGuiUtils.getLabelName(jlWorkingDaysWeek.getText()), SGuiConsts.GUI_TYPE_INT, true);
        moIntWorkingDaysWeek.setMinInteger(1);
        moIntWorkingDaysWeek.setMaxInteger(7);
        moBoolWeekdaySettingSunday.setBooleanSettings(SGuiUtils.getLabelName(moBoolWeekdaySettingSunday.getText()), true);
        moBoolWeekdaySettingMonday.setBooleanSettings(SGuiUtils.getLabelName(moBoolWeekdaySettingMonday.getText()), true);
        moBoolWeekdaySettingTuesday.setBooleanSettings(SGuiUtils.getLabelName(moBoolWeekdaySettingTuesday.getText()), true);
        moBoolWeekdaySettingWednesday.setBooleanSettings(SGuiUtils.getLabelName(moBoolWeekdaySettingWednesday.getText()), true);
        moBoolWeekdaySettingThursday.setBooleanSettings(SGuiUtils.getLabelName(moBoolWeekdaySettingThursday.getText()), true);
        moBoolWeekdaySettingFriday.setBooleanSettings(SGuiUtils.getLabelName(moBoolWeekdaySettingFriday.getText()), true);
        moBoolWeekdaySettingSaturday.setBooleanSettings(SGuiUtils.getLabelName(moBoolWeekdaySettingSaturday.getText()), true);

        moFields.addField(moKeyPaymentType);
        moFields.addField(moIntWorkingHoursDay);
        moFields.addField(moIntWorkingDaysWeek);
        moFields.addField(moBoolWeekdaySettingSunday);
        moFields.addField(moBoolWeekdaySettingMonday);
        moFields.addField(moBoolWeekdaySettingTuesday);
        moFields.addField(moBoolWeekdaySettingWednesday);
        moFields.addField(moBoolWeekdaySettingThursday);
        moFields.addField(moBoolWeekdaySettingFriday);
        moFields.addField(moBoolWeekdaySettingSaturday);

        moFields.setFormButton(jbSave);
    }

    @Override
    public void addAllListeners() {

    }

    @Override
    public void removeAllListeners() {

    }

    @Override
    public void reloadCatalogues() {
        miClient.getSession().populateCatalogue(moKeyPaymentType, SModConsts.HRSS_TP_PAY, SLibConsts.UNDEFINED, null);
    }

    @Override
    public void setRegistry(SDbRegistry registry) throws Exception {
        moRegistry = (SDbWorkingDaySettings) registry;

        mnFormResult = SLibConsts.UNDEFINED;
        mbFirstActivation = true;

        removeAllListeners();
        reloadCatalogues();
        
        moConfig = (SDbConfig) miClient.getSession().readRegistry(SModConsts.HRS_CFG, new int[] { SUtilConsts.BPR_CO_ID });

        if (moConfig == null) {
            throw new Exception(SDbConsts.ERR_MSG_REG_NOT_FOUND + " (Configuración del módulo)");
        }
        else {
            if (moRegistry.isRegistryNew()) {
                moRegistry.initPrimaryKey();
                moRegistry.setSystem(false);    // all editable registries are non-system
                jtfRegistryKey.setText("");
            }
            else {
                jtfRegistryKey.setText(SLibUtils.textKey(moRegistry.getPrimaryKey()));
            }

            moIntWorkingHoursDay.setValue(moRegistry.getWorkingHoursDay());
            moIntWorkingDaysWeek.setValue(moRegistry.getWorkingDaysWeek());
            moKeyPaymentType.setValue(new int[] { moRegistry.getFkPaymentTypeId() });
            moBoolWeekdaySettingSunday.setValue(moRegistry.isWeekdaySettingSunday());
            moBoolWeekdaySettingMonday.setValue(moRegistry.isWeekdaySettingMonday());
            moBoolWeekdaySettingTuesday.setValue(moRegistry.isWeekdaySettingTuesday());
            moBoolWeekdaySettingWednesday.setValue(moRegistry.isWeekdaySettingWednesday());
            moBoolWeekdaySettingThursday.setValue(moRegistry.isWeekdaySettingThursday());
            moBoolWeekdaySettingFriday.setValue(moRegistry.isWeekdaySettingFriday());
            moBoolWeekdaySettingSaturday.setValue(moRegistry.isWeekdaySettingSaturday());

            setFormEditable(true);

            if (!moRegistry.isRegistryNew()) {
                moKeyPaymentType.setEnabled(false);
            }
            addAllListeners();
        }
    }

    @Override
    public SDbRegistry getRegistry() throws Exception {
        SDbWorkingDaySettings registry = moRegistry.clone();

        if (registry.isRegistryNew()) {
        }

        registry.setWorkingDaysWeek(moIntWorkingDaysWeek.getValue());
        registry.setWorkingHoursDay(moIntWorkingHoursDay.getValue());
        registry.setFkPaymentTypeId(moKeyPaymentType.getValue()[0]);
        registry.setWeekdaySettingSunday(moBoolWeekdaySettingSunday.getValue());
        registry.setWeekdaySettingMonday(moBoolWeekdaySettingMonday.getValue());
        registry.setWeekdaySettingTuesday(moBoolWeekdaySettingTuesday.getValue());
        registry.setWeekdaySettingWednesday(moBoolWeekdaySettingWednesday.getValue());
        registry.setWeekdaySettingThursday(moBoolWeekdaySettingThursday.getValue());
        registry.setWeekdaySettingFriday(moBoolWeekdaySettingFriday.getValue());
        registry.setWeekdaySettingSaturday(moBoolWeekdaySettingSaturday.getValue());
        
        return registry;
    }

    @Override
    public SGuiValidation validateForm() {
        int count = 0;
        boolean[] weekdays = null;
        String[] weekdaysLabels = null;
        SBeanFieldBoolean[] weekdaysBeans = null;
        SGuiValidation validation = moFields.validateFields();

        if (validation.isValid()) {
            weekdays = new boolean[] {
                moBoolWeekdaySettingSunday.isSelected(),
                moBoolWeekdaySettingMonday.isSelected(),
                moBoolWeekdaySettingTuesday.isSelected(),
                moBoolWeekdaySettingWednesday.isSelected(),
                moBoolWeekdaySettingThursday.isSelected(),
                moBoolWeekdaySettingFriday.isSelected(),
                moBoolWeekdaySettingSaturday.isSelected()
            };

            weekdaysLabels = new String[] {
                moBoolWeekdaySettingSunday.getText(),
                moBoolWeekdaySettingMonday.getText(),
                moBoolWeekdaySettingTuesday.getText(),
                moBoolWeekdaySettingWednesday.getText(),
                moBoolWeekdaySettingThursday.getText(),
                moBoolWeekdaySettingFriday.getText(),
                moBoolWeekdaySettingSaturday.getText()
            };

            weekdaysBeans = new SBeanFieldBoolean[] {
                moBoolWeekdaySettingSunday,
                moBoolWeekdaySettingMonday,
                moBoolWeekdaySettingTuesday,
                moBoolWeekdaySettingWednesday,
                moBoolWeekdaySettingThursday,
                moBoolWeekdaySettingFriday,
                moBoolWeekdaySettingSaturday
            };

            for (boolean weekday : weekdays) {
                if (weekday) {
                    count++;
                }
            }

            if (moIntWorkingDaysWeek.getValue() != count) {
                validation.setMessage(SGuiConsts.ERR_MSG_FIELD_VAL_ + "'" + SGuiUtils.getLabelName(jlWorkingDaysWeek) + "'" + SGuiConsts.ERR_MSG_FIELD_VAL_EQUAL + count + ".");
                validation.setComponent(moIntWorkingDaysWeek);
            }
            else if (!weekdays[moConfig.getFirstDayWeek() - 1]) {
                validation.setMessage(SGuiConsts.ERR_MSG_FIELD_DIF + "'" + weekdaysLabels[moConfig.getFirstDayWeek() - 1] + "'.");
                validation.setComponent(weekdaysBeans[moConfig.getFirstDayWeek() - 1]);
            }
        }

        return validation;
    }
}
