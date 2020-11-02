/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.mod.hrs.form;

import erp.mod.SModConsts;
import erp.mod.SModSysConsts;
import erp.mod.hrs.db.SDbBenefitTable;
import erp.mod.hrs.db.SDbBenefitTableRow;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import sa.lib.SLibConsts;
import sa.lib.SLibUtils;
import sa.lib.db.SDbRegistry;
import sa.lib.grid.SGridColumnForm;
import sa.lib.grid.SGridConsts;
import sa.lib.grid.SGridPaneForm;
import sa.lib.grid.SGridRow;
import sa.lib.gui.SGuiClient;
import sa.lib.gui.SGuiConsts;
import sa.lib.gui.SGuiParams;
import sa.lib.gui.SGuiUtils;
import sa.lib.gui.SGuiValidation;
import sa.lib.gui.bean.SBeanForm;

/**
 *
 * @author Juan Barajas, Sergio Flores
 * 2018-12-04, Sergio Flores: Improvement of UI usability.
 */
public class SFormBenefitTable extends SBeanForm implements ActionListener, ItemListener {

    private SDbBenefitTable moRegistry;
    private SGridPaneForm moGridTableRows;

    /**
     * Creates new form SFormBenefitTable
     * @param client
     * @param title
     */
    public SFormBenefitTable(SGuiClient client, String title) {
        setFormSettings(client, SGuiConsts.BEAN_FORM_EDIT, SModConsts.HRS_BEN, SLibConsts.UNDEFINED, title);
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
        jPanel15 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jlCode = new javax.swing.JLabel();
        moTextCode = new sa.lib.gui.bean.SBeanFieldText();
        jPanel13 = new javax.swing.JPanel();
        jlName = new javax.swing.JLabel();
        moTextName = new sa.lib.gui.bean.SBeanFieldText();
        jPanel4 = new javax.swing.JPanel();
        jlDateStart = new javax.swing.JLabel();
        moDateDateStart = new sa.lib.gui.bean.SBeanFieldDate();
        jPanel16 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jlBenefitType = new javax.swing.JLabel();
        moKeyBenefitType = new sa.lib.gui.bean.SBeanFieldKey();
        jPanel12 = new javax.swing.JPanel();
        jlEarning = new javax.swing.JLabel();
        moKeyEarning = new sa.lib.gui.bean.SBeanFieldKey();
        jPanel17 = new javax.swing.JPanel();
        jlDeduction = new javax.swing.JLabel();
        moKeyDeduction = new sa.lib.gui.bean.SBeanFieldKey();
        jPanel14 = new javax.swing.JPanel();
        jlPaymentType = new javax.swing.JLabel();
        moKeyPaymentType = new sa.lib.gui.bean.SBeanFieldKey();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jlMonths = new javax.swing.JLabel();
        jlBenefitDays = new javax.swing.JLabel();
        jlBenefitBonusPercentage = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        moIntMonths = new sa.lib.gui.bean.SBeanFieldInteger();
        moIntBenefitDays = new sa.lib.gui.bean.SBeanFieldInteger();
        moDecBenefitBonusPercentage = new sa.lib.gui.bean.SBeanFieldDecimal();
        jbRowAdd = new javax.swing.JButton();
        jpGrid = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jbRowUp = new javax.swing.JButton();
        jbRowDown = new javax.swing.JButton();
        jbRowRemove = new javax.swing.JButton();

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de la tabla:"));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel15.setLayout(new java.awt.GridLayout(4, 1, 0, 5));

        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlCode.setText("Código:*");
        jlCode.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel5.add(jlCode);

        moTextCode.setText("sBeanFieldText1");
        jPanel5.add(moTextCode);

        jPanel15.add(jPanel5);

        jPanel13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlName.setText("Nombre:*");
        jlName.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel13.add(jlName);

        moTextName.setText("sBeanFieldText1");
        moTextName.setPreferredSize(new java.awt.Dimension(200, 23));
        jPanel13.add(moTextName);

        jPanel15.add(jPanel13);

        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlDateStart.setText("Inicio vigencia:*");
        jlDateStart.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel4.add(jlDateStart);
        jPanel4.add(moDateDateStart);

        jPanel15.add(jPanel4);

        jPanel2.add(jPanel15, java.awt.BorderLayout.WEST);

        jPanel16.setLayout(new java.awt.GridLayout(4, 1, 0, 5));

        jPanel18.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlBenefitType.setForeground(new java.awt.Color(0, 0, 255));
        jlBenefitType.setText("Tipo prestación:*");
        jlBenefitType.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel18.add(jlBenefitType);

        moKeyBenefitType.setPreferredSize(new java.awt.Dimension(200, 23));
        jPanel18.add(moKeyBenefitType);

        jPanel16.add(jPanel18);

        jPanel12.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlEarning.setText("Percepción:*");
        jlEarning.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel12.add(jlEarning);

        moKeyEarning.setPreferredSize(new java.awt.Dimension(200, 23));
        jPanel12.add(moKeyEarning);

        jPanel16.add(jPanel12);

        jPanel17.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlDeduction.setText("Deducción:");
        jlDeduction.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel17.add(jlDeduction);

        moKeyDeduction.setPreferredSize(new java.awt.Dimension(200, 23));
        jPanel17.add(moKeyDeduction);

        jPanel16.add(jPanel17);

        jPanel14.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlPaymentType.setText("Período pago:");
        jlPaymentType.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel14.add(jlPaymentType);

        moKeyPaymentType.setPreferredSize(new java.awt.Dimension(200, 23));
        jPanel14.add(moKeyPaymentType);

        jPanel16.add(jPanel14);

        jPanel2.add(jPanel16, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle de la tabla:"));
        jPanel6.setLayout(new java.awt.BorderLayout(0, 5));

        jPanel7.setLayout(new java.awt.GridLayout(2, 1, 0, 5));

        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 5, 0));

        jlMonths.setText("Meses tope (hasta):*");
        jlMonths.setPreferredSize(new java.awt.Dimension(115, 23));
        jPanel8.add(jlMonths);

        jlBenefitDays.setText("Días prestación:*");
        jlBenefitDays.setPreferredSize(new java.awt.Dimension(115, 23));
        jPanel8.add(jlBenefitDays);

        jlBenefitBonusPercentage.setText("Prima prestación:*");
        jlBenefitBonusPercentage.setPreferredSize(new java.awt.Dimension(115, 23));
        jPanel8.add(jlBenefitBonusPercentage);

        jPanel7.add(jPanel8);

        jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 5, 0));

        moIntMonths.setPreferredSize(new java.awt.Dimension(115, 23));
        jPanel9.add(moIntMonths);

        moIntBenefitDays.setPreferredSize(new java.awt.Dimension(115, 23));
        jPanel9.add(moIntBenefitDays);

        moDecBenefitBonusPercentage.setPreferredSize(new java.awt.Dimension(115, 23));
        jPanel9.add(moDecBenefitBonusPercentage);

        jbRowAdd.setText("Agregar");
        jbRowAdd.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel9.add(jbRowAdd);

        jPanel7.add(jPanel9);

        jPanel6.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        jpGrid.setLayout(new java.awt.BorderLayout());
        jPanel6.add(jpGrid, java.awt.BorderLayout.CENTER);

        jPanel10.setLayout(new java.awt.BorderLayout());

        jPanel11.setLayout(new java.awt.GridLayout(3, 1, 0, 5));

        jbRowUp.setText("Subir");
        jbRowUp.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel11.add(jbRowUp);

        jbRowDown.setText("Bajar");
        jbRowDown.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel11.add(jbRowDown);

        jbRowRemove.setText("Eliminar");
        jbRowRemove.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel11.add(jbRowRemove);

        jPanel10.add(jPanel11, java.awt.BorderLayout.NORTH);

        jPanel6.add(jPanel10, java.awt.BorderLayout.LINE_END);

        jPanel1.add(jPanel6, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton jbRowAdd;
    private javax.swing.JButton jbRowDown;
    private javax.swing.JButton jbRowRemove;
    private javax.swing.JButton jbRowUp;
    private javax.swing.JLabel jlBenefitBonusPercentage;
    private javax.swing.JLabel jlBenefitDays;
    private javax.swing.JLabel jlBenefitType;
    private javax.swing.JLabel jlCode;
    private javax.swing.JLabel jlDateStart;
    private javax.swing.JLabel jlDeduction;
    private javax.swing.JLabel jlEarning;
    private javax.swing.JLabel jlMonths;
    private javax.swing.JLabel jlName;
    private javax.swing.JLabel jlPaymentType;
    private javax.swing.JPanel jpGrid;
    private sa.lib.gui.bean.SBeanFieldDate moDateDateStart;
    private sa.lib.gui.bean.SBeanFieldDecimal moDecBenefitBonusPercentage;
    private sa.lib.gui.bean.SBeanFieldInteger moIntBenefitDays;
    private sa.lib.gui.bean.SBeanFieldInteger moIntMonths;
    private sa.lib.gui.bean.SBeanFieldKey moKeyBenefitType;
    private sa.lib.gui.bean.SBeanFieldKey moKeyDeduction;
    private sa.lib.gui.bean.SBeanFieldKey moKeyEarning;
    private sa.lib.gui.bean.SBeanFieldKey moKeyPaymentType;
    private sa.lib.gui.bean.SBeanFieldText moTextCode;
    private sa.lib.gui.bean.SBeanFieldText moTextName;
    // End of variables declaration//GEN-END:variables

    private void initComponentsCustom() {
        SGuiUtils.setWindowBounds(this, 720, 450);

        moTextCode.setTextSettings(SGuiUtils.getLabelName(jlCode.getText()), 5);
        moTextName.setTextSettings(SGuiUtils.getLabelName(jlName.getText()), 50);
        moDateDateStart.setDateSettings(miClient, SGuiUtils.getLabelName(jlDateStart.getText()), true);
        moKeyBenefitType.setKeySettings(miClient, SGuiUtils.getLabelName(jlBenefitType.getText()), true);
        moKeyEarning.setKeySettings(miClient, SGuiUtils.getLabelName(jlEarning.getText()), true);
        moKeyDeduction.setKeySettings(miClient, SGuiUtils.getLabelName(jlDeduction.getText()), false);
        moKeyPaymentType.setKeySettings(miClient, SGuiUtils.getLabelName(jlPaymentType.getText()), false);
        moIntMonths.setIntegerSettings(SGuiUtils.getLabelName(jlMonths), SGuiConsts.GUI_TYPE_INT, false);
        moIntBenefitDays.setIntegerSettings(SGuiUtils.getLabelName(jlBenefitDays), SGuiConsts.GUI_TYPE_INT, false);
        moDecBenefitBonusPercentage.setDecimalSettings(SGuiUtils.getLabelName(jlBenefitBonusPercentage), SGuiConsts.GUI_TYPE_DEC_PER_DISC, false);

        moFields.addField(moTextCode);
        moFields.addField(moTextName);
        moFields.addField(moDateDateStart);
        moFields.addField(moKeyBenefitType);
        moFields.addField(moKeyEarning);
        moFields.addField(moKeyDeduction);
        moFields.addField(moKeyPaymentType);
        moFields.addField(moIntMonths);
        moFields.addField(moIntBenefitDays);
        moFields.addField(moDecBenefitBonusPercentage);

        moFields.setFormButton(jbRowAdd);

        moGridTableRows = new SGridPaneForm(miClient, SModConsts.HRS_BEN_ROW, SLibConsts.UNDEFINED, "Renglones tabla") {

            @Override
            public void initGrid() {
                setRowButtonsEnabled(false);
            }

            @Override
            public ArrayList<SGridColumnForm> createGridColumns() {
                ArrayList<SGridColumnForm> columns = new ArrayList<>();

                columns.add(new SGridColumnForm(SGridConsts.COL_TYPE_INT_1B, "#"));
                columns.add(new SGridColumnForm(SGridConsts.COL_TYPE_INT_4B, "Meses tope (hasta)"));
                columns.add(new SGridColumnForm(SGridConsts.COL_TYPE_DEC_AMT, "Años tope equivalentes (hasta)"));
                columns.add(new SGridColumnForm(SGridConsts.COL_TYPE_INT_4B, "Días prestación"));
                columns.add(new SGridColumnForm(SGridConsts.COL_TYPE_DEC_PER_DISC, "Prima prestación"));

                return columns;
            }
        };

        jpGrid.add(moGridTableRows, BorderLayout.CENTER);
        mvFormGrids.add(moGridTableRows);
    }

    private void itemStateKeyBenefitType() {
        if (moKeyBenefitType.getSelectedIndex() > 0) {
            if (moKeyBenefitType.getValue()[0] == SModSysConsts.HRSS_TP_BEN_VAC_BON) {
                moIntBenefitDays.setEditable(false);
                moIntBenefitDays.setValue(0);
                moDecBenefitBonusPercentage.setEditable(true);
            }
            else {
                moDecBenefitBonusPercentage.setEditable(false);
                moDecBenefitBonusPercentage.setValue(0d);
                moIntBenefitDays.setEditable(true);
            }
            miClient.getSession().populateCatalogue(moKeyEarning, SModConsts.HRS_EAR, SLibConsts.UNDEFINED, new SGuiParams(new int[] { moKeyBenefitType.getValue()[0] }));
            miClient.getSession().populateCatalogue(moKeyDeduction, SModConsts.HRS_DED, SLibConsts.UNDEFINED, new SGuiParams(new int[] { moKeyBenefitType.getValue()[0] }));
            moKeyEarning.setEnabled(true);
            moKeyDeduction.setEnabled(true);
            
            moKeyEarning.setValue(new int[] { moRegistry.getFkEarningId() });
            moKeyDeduction.setValue(new int[] { moRegistry.getFkDeductionId_n() });
        }
        else {
            moDecBenefitBonusPercentage.setEditable(false);
            moDecBenefitBonusPercentage.setValue(0d);
            moIntBenefitDays.setEditable(true);
            moKeyEarning.setEnabled(false);
            moKeyDeduction.setEnabled(false);
        }
    }
    
    private void enableFields(boolean enable) {
        moKeyBenefitType.setEnabled(enable);
    }

    private void cleanRowFields() {
        moIntMonths.setValue(0);
        moIntBenefitDays.setValue(0);
        moDecBenefitBonusPercentage.setValue(0d);
    }

    private void actionRowAdd() {
        if (moKeyBenefitType.getSelectedIndex() <= 0) {
            miClient.showMsgBoxWarning(SGuiConsts.ERR_MSG_FIELD_REQ + "'" + SGuiUtils.getLabelName(jlBenefitType) + "'.");
            moKeyBenefitType.requestFocus();
        }
        else if (moIntMonths.getValue() <= 0) {
            miClient.showMsgBoxWarning(SGuiConsts.ERR_MSG_FIELD_REQ + "'" + SGuiUtils.getLabelName(jlMonths) + "'.");
            moIntMonths.requestFocus();
        }
        else if (moIntBenefitDays.isEditable() && moIntBenefitDays.getValue() <= 0) {
            miClient.showMsgBoxWarning(SGuiConsts.ERR_MSG_FIELD_REQ + "'" + SGuiUtils.getLabelName(jlBenefitDays) + "'.");
            moIntBenefitDays.requestFocus();
        }
        else if (moDecBenefitBonusPercentage.isEditable() && moDecBenefitBonusPercentage.getValue() <= 0) {
            miClient.showMsgBoxWarning(SGuiConsts.ERR_MSG_FIELD_REQ + "'" + SGuiUtils.getLabelName(jlBenefitBonusPercentage) + "'.");
            moDecBenefitBonusPercentage.requestFocus();
        }
        else {
            SDbBenefitTableRow row = new SDbBenefitTableRow();
            row.setPkRowId(moGridTableRows.getTable().getRowCount() + 1);
            row.setMonths(moIntMonths.getValue());
            row.setBenefitDays(moIntBenefitDays.getValue());
            row.setBenefitBonusPercentage(moDecBenefitBonusPercentage.getValue());
            
            moGridTableRows.addGridRow(row);
            moGridTableRows.renderGridRows();
            moGridTableRows.setSelectedGridRow(moGridTableRows.getTable().getRowCount() - 1);
            
            cleanRowFields();
            enableFields(moGridTableRows.getTable().getRowCount() <= 0);
            moIntMonths.requestFocus();
        }
    }

    private void actionRowUp() {
        int index = moGridTableRows.getTable().getSelectedRow();
        SDbBenefitTableRow rowA = null;
        SDbBenefitTableRow rowB = null;

        if (index == -1) {
            miClient.showMsgBoxWarning(SGridConsts.MSG_SELECT_ROW);
        }
        else if (index > 0) {
            rowA = (SDbBenefitTableRow) moGridTableRows.getGridRow(index - 1);
            rowB = (SDbBenefitTableRow) moGridTableRows.getGridRow(index);
            rowA.setPkRowId(rowA.getPkRowId() + 1);
            rowB.setPkRowId(rowA.getPkRowId() - 1);
            moGridTableRows.setGridRow(rowB, index - 1);
            moGridTableRows.setGridRow(rowA, index);
            moGridTableRows.renderGridRows();
            moGridTableRows.setSelectedGridRow(index - 1);
        }
    }

    private void actionRowDown() {
        int index = moGridTableRows.getTable().getSelectedRow();
        SDbBenefitTableRow rowA = null;
        SDbBenefitTableRow rowB = null;

        if (index == -1) {
            miClient.showMsgBoxWarning(SGridConsts.MSG_SELECT_ROW);
        }
        else if (index < moGridTableRows.getTable().getRowCount() - 1) {
            rowA = (SDbBenefitTableRow) moGridTableRows.getGridRow(index);
            rowB = (SDbBenefitTableRow) moGridTableRows.getGridRow(index + 1);
            rowA.setPkRowId(rowA.getPkRowId() + 1);
            rowB.setPkRowId(rowA.getPkRowId() - 1);
            moGridTableRows.setGridRow(rowB, index);
            moGridTableRows.setGridRow(rowA, index + 1);
            moGridTableRows.renderGridRows();
            moGridTableRows.setSelectedGridRow(index + 1);
        }
    }

    private void actionRowRemove() {
        int index = moGridTableRows.getTable().getSelectedRow();
        int count = 0;

        if (index == -1) {
            miClient.showMsgBoxWarning(SGridConsts.MSG_SELECT_ROW);
        }
        else if (miClient.showMsgBoxConfirm(SGridConsts.MSG_CONFIRM_REG_DEL) == JOptionPane.YES_OPTION) {
            count = moGridTableRows.getTable().getRowCount();
            moGridTableRows.removeGridRow(index);

            for (int i = 0; i < count - 1; i++) {
                ((SDbBenefitTableRow) moGridTableRows.getGridRow(i)).setPkRowId(i + 1);
            }

            moGridTableRows.renderGridRows();

            if (moGridTableRows.getTable().getRowCount() > 0) {
                moGridTableRows.setSelectedGridRow(index < moGridTableRows.getTable().getRowCount() ? index : index - 1);
            }
            enableFields(moGridTableRows.getTable().getRowCount() <= 0);
        }
    }

    @Override
    public void addAllListeners() {
        moKeyBenefitType.addItemListener(this);
        jbRowAdd.addActionListener(this);
        jbRowUp.addActionListener(this);
        jbRowDown.addActionListener(this);
        jbRowRemove.addActionListener(this);
    }

    @Override
    public void removeAllListeners() {
        moKeyBenefitType.removeItemListener(this);
        jbRowAdd.removeActionListener(this);
        jbRowUp.removeActionListener(this);
        jbRowDown.removeActionListener(this);
        jbRowRemove.removeActionListener(this);
    }

    @Override
    public void reloadCatalogues() {
        miClient.getSession().populateCatalogue(moKeyBenefitType, SModConsts.HRSS_TP_BEN, SModConsts.HRS_BEN, null);
        miClient.getSession().populateCatalogue(moKeyEarning, SModConsts.HRS_EAR, SLibConsts.UNDEFINED, null);
        miClient.getSession().populateCatalogue(moKeyDeduction, SModConsts.HRS_DED, SLibConsts.UNDEFINED, null);
        miClient.getSession().populateCatalogue(moKeyPaymentType, SModConsts.HRSS_TP_PAY, SLibConsts.UNDEFINED, null);
    }

    @Override
    public void setRegistry(SDbRegistry registry) throws Exception {
        Vector<SGridRow> rows = new Vector<SGridRow>();

        moRegistry = (SDbBenefitTable) registry;

        mnFormResult = SLibConsts.UNDEFINED;
        mbFirstActivation = true;

        removeAllListeners();
        reloadCatalogues();

        if (moRegistry.isRegistryNew()) {
            moRegistry.initPrimaryKey();
            moRegistry.setDateStart(miClient.getSession().getCurrentDate());
            jtfRegistryKey.setText("");
        }
        else {
            jtfRegistryKey.setText(SLibUtils.textKey(moRegistry.getPrimaryKey()));
        }

        moTextCode.setValue(moRegistry.getCode());
        moTextName.setValue(moRegistry.getName());
        moDateDateStart.setValue(moRegistry.getDateStart());
        moKeyBenefitType.setValue(new int[] { moRegistry.getFkBenefitTypeId() });
        moKeyEarning.setValue(new int[] { moRegistry.getFkEarningId() });
        moKeyDeduction.setValue(new int[] { moRegistry.getFkDeductionId_n() });
        moKeyPaymentType.setValue(new int[] { moRegistry.getFkPaymentTypeId_n() });

        for (SDbBenefitTableRow row : moRegistry.getChildRows()) {
            rows.add(row);
        }

        moGridTableRows.populateGrid(rows);
        moGridTableRows.resetSortKeys();
        moGridTableRows.setSelectedGridRow(0);
        moGridTableRows.getTable().getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        setFormEditable(true);
        itemStateKeyBenefitType();
        cleanRowFields();
        enableFields(rows.isEmpty());

        addAllListeners();
    }

    @Override
    public SDbRegistry getRegistry() throws Exception {
        SDbBenefitTable registry = moRegistry.clone();

        if (registry.isRegistryNew()) { }

        registry.setCode(moTextCode.getValue());
        registry.setName(moTextName.getValue());
        registry.setDateStart(moDateDateStart.getValue());
        registry.setFkBenefitTypeId(moKeyBenefitType.getValue()[0]);
        registry.setFkEarningId(moKeyEarning.getValue()[0]);
        registry.setFkDeductionId_n(moKeyDeduction.getSelectedIndex() <= 0 ? SLibConsts.UNDEFINED : moKeyDeduction.getValue()[0]);
        registry.setFkPaymentTypeId_n(moKeyPaymentType.getSelectedIndex() <= 0 ? SLibConsts.UNDEFINED : moKeyPaymentType.getValue()[0]);

        registry.getChildRows().clear();

        for (int i = 0; i < moGridTableRows.getTable().getRowCount(); i++) {
            registry.getChildRows().add((SDbBenefitTableRow) moGridTableRows.getGridRow(i));
        }

        return registry;
    }

    @Override
    public SGuiValidation validateForm() {
        SGuiValidation validation = moFields.validateFields();

        if (validation.isValid()) {
            if (moGridTableRows.getTable().getRowCount() == 0) {
                validation.setMessage("La tabla no tiene renglones.");
                validation.setComponent(moIntMonths.getComponent());
            }
        }

        return validation;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton button = (JButton) e.getSource();

            if (button == jbRowAdd) {
                actionRowAdd();
            }
            else if (button == jbRowUp) {
                actionRowUp();
            }
            else if (button == jbRowDown) {
                actionRowDown();
            }
            else if (button == jbRowRemove) {
                actionRowRemove();
            }
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() instanceof JComboBox && e.getStateChange() == ItemEvent.SELECTED) {
            JComboBox comboBox = (JComboBox)  e.getSource();

            if (comboBox == moKeyBenefitType) {
                itemStateKeyBenefitType();
            }
        }
    }
}
