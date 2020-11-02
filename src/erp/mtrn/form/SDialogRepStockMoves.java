/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SDialogRepStockMoves.java
 *
 * Created on 1/06/2010, 04:33:36 PM
 */

package erp.mtrn.form;

import erp.data.SDataConstants;
import erp.data.SDataConstantsSys;
import erp.data.SDataUtilities;
import erp.gui.SGuiUtilities;
import erp.lib.SLibConstants;
import erp.lib.SLibTimeUtilities;
import erp.lib.SLibUtilities;
import erp.lib.form.SFormComboBoxGroup;
import erp.lib.form.SFormComponentItem;
import erp.lib.form.SFormField;
import erp.lib.form.SFormUtilities;
import erp.lib.form.SFormValidation;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.util.Map;
import java.util.Vector;
import javax.swing.AbstractAction;
import javax.swing.JRadioButton;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import sa.lib.SLibConsts;

/**
 *
 * @author Alfonso Flores, Daniel López
 */
public class SDialogRepStockMoves extends javax.swing.JDialog implements erp.lib.form.SFormInterface, java.awt.event.ActionListener, java.awt.event.ItemListener {

    private int mnFormType;
    private int mnFormResult;
    private int mnFormStatus;
    private boolean mbFirstTime;
    private boolean mbResetingForm;
    private java.util.Vector<erp.lib.form.SFormField> mvFields;
    private erp.client.SClientInterface miClient;

    private erp.lib.form.SFormField moFieldDateStart;
    private erp.lib.form.SFormField moFieldDateEnd;
    private erp.lib.form.SFormField moFieldCompanyBranch;
    private erp.lib.form.SFormField moFieldWarehouse;
    private erp.lib.form.SFormField moFieldItemGeneric;
    private erp.lib.form.SFormField moFieldMovementCategory;
    private erp.lib.form.SFormField moFieldMovementClass;
    private erp.lib.form.SFormField moFieldMovementType;
    private erp.lib.form.SFormComboBoxGroup moGroupMovement;
    private erp.lib.form.SFormComboBoxGroup moGroupCompanyBranch;

    /** Creates new form SDialogRepStockMoves */
    public SDialogRepStockMoves(erp.client.SClientInterface client) {
        super(client.getFrame(), false);
        miClient =  client;

        initComponents();
        initComponentsExtra();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbgReportType = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jlDateStart = new javax.swing.JLabel();
        jftDateStart = new javax.swing.JFormattedTextField();
        jbPickDateStart = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jlDateEnd = new javax.swing.JLabel();
        jftDateEnd = new javax.swing.JFormattedTextField();
        jbPickDateEnd = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jlReportType = new javax.swing.JLabel();
        jrbReportTypeDetailedItem = new javax.swing.JRadioButton();
        jrbReportTypeDetailedMove = new javax.swing.JRadioButton();
        jrbReportTypeSummary = new javax.swing.JRadioButton();
        jPanel19 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jlMovementCategory = new javax.swing.JLabel();
        jcbMovementCategory = new javax.swing.JComboBox<SFormComponentItem>();
        jPanel15 = new javax.swing.JPanel();
        jlMovementClass = new javax.swing.JLabel();
        jcbMovementClass = new javax.swing.JComboBox<SFormComponentItem>();
        jPanel16 = new javax.swing.JPanel();
        jlMovementType = new javax.swing.JLabel();
        jcbMovementType = new javax.swing.JComboBox<SFormComponentItem>();
        jPanel20 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jlCompanyBranch = new javax.swing.JLabel();
        jcbCompanyBranch = new javax.swing.JComboBox<SFormComponentItem>();
        jPanel9 = new javax.swing.JPanel();
        jlWarehouse = new javax.swing.JLabel();
        jcbWarehouse = new javax.swing.JComboBox<SFormComponentItem>();
        jPanel10 = new javax.swing.JPanel();
        jlItemGeneric = new javax.swing.JLabel();
        jcbItemGeneric = new javax.swing.JComboBox<SFormComponentItem>();
        jPanel1 = new javax.swing.JPanel();
        jbPrint = new javax.swing.JButton();
        jbExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reporte de movimientos de inventarios");
        setPreferredSize(new java.awt.Dimension(400, 250));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Configuración del reporte:"));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel12.setLayout(new java.awt.GridLayout(3, 1, 0, 5));

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder("Período y tipo de reporte:"));
        jPanel18.setLayout(new java.awt.GridLayout(3, 1, 0, 5));

        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlDateStart.setText("Fecha inicial: *");
        jlDateStart.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel4.add(jlDateStart);

        jftDateStart.setText("dd/mm/yyyy");
        jftDateStart.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel4.add(jftDateStart);

        jbPickDateStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/erp/img/cal_date_day.gif"))); // NOI18N
        jbPickDateStart.setToolTipText("Seleccionar fecha inicial");
        jbPickDateStart.setFocusable(false);
        jbPickDateStart.setPreferredSize(new java.awt.Dimension(23, 23));
        jPanel4.add(jbPickDateStart);

        jPanel18.add(jPanel4);

        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlDateEnd.setText("Fecha final: *");
        jlDateEnd.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel5.add(jlDateEnd);

        jftDateEnd.setText("dd/mm/yyyy");
        jftDateEnd.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel5.add(jftDateEnd);

        jbPickDateEnd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/erp/img/cal_date_day.gif"))); // NOI18N
        jbPickDateEnd.setToolTipText("Seleccionar fecha final");
        jbPickDateEnd.setFocusable(false);
        jbPickDateEnd.setPreferredSize(new java.awt.Dimension(23, 23));
        jPanel5.add(jbPickDateEnd);

        jPanel18.add(jPanel5);

        jPanel17.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlReportType.setText("Tipo reporte: *");
        jlReportType.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel17.add(jlReportType);

        jbgReportType.add(jrbReportTypeDetailedItem);
        jrbReportTypeDetailedItem.setText("Detalle por producto");
        jrbReportTypeDetailedItem.setPreferredSize(new java.awt.Dimension(150, 23));
        jPanel17.add(jrbReportTypeDetailedItem);

        jbgReportType.add(jrbReportTypeDetailedMove);
        jrbReportTypeDetailedMove.setText("Detalle por documento");
        jrbReportTypeDetailedMove.setPreferredSize(new java.awt.Dimension(150, 23));
        jPanel17.add(jrbReportTypeDetailedMove);

        jbgReportType.add(jrbReportTypeSummary);
        jrbReportTypeSummary.setText("Resumen por producto");
        jrbReportTypeSummary.setPreferredSize(new java.awt.Dimension(150, 23));
        jPanel17.add(jrbReportTypeSummary);

        jPanel18.add(jPanel17);

        jPanel12.add(jPanel18);

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder("Movimiento de almacén:"));
        jPanel19.setLayout(new java.awt.GridLayout(3, 1, 0, 5));

        jPanel14.setMinimumSize(new java.awt.Dimension(185, 20));
        jPanel14.setPreferredSize(new java.awt.Dimension(390, 23));
        jPanel14.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlMovementCategory.setText("Categoría: *");
        jlMovementCategory.setMaximumSize(new java.awt.Dimension(114, 14));
        jlMovementCategory.setMinimumSize(new java.awt.Dimension(114, 14));
        jlMovementCategory.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel14.add(jlMovementCategory);

        jcbMovementCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbMovementCategory.setPreferredSize(new java.awt.Dimension(300, 23));
        jPanel14.add(jcbMovementCategory);

        jPanel19.add(jPanel14);

        jPanel15.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlMovementClass.setText("Clase:");
        jlMovementClass.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlMovementClass.setMaximumSize(new java.awt.Dimension(114, 14));
        jlMovementClass.setMinimumSize(new java.awt.Dimension(114, 14));
        jlMovementClass.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel15.add(jlMovementClass);

        jcbMovementClass.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbMovementClass.setPreferredSize(new java.awt.Dimension(300, 23));
        jPanel15.add(jcbMovementClass);

        jPanel19.add(jPanel15);

        jPanel16.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlMovementType.setText("Tipo:");
        jlMovementType.setMaximumSize(new java.awt.Dimension(114, 14));
        jlMovementType.setMinimumSize(new java.awt.Dimension(114, 14));
        jlMovementType.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel16.add(jlMovementType);

        jcbMovementType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbMovementType.setPreferredSize(new java.awt.Dimension(300, 23));
        jPanel16.add(jcbMovementType);

        jPanel19.add(jPanel16);

        jPanel12.add(jPanel19);

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtros del reporte:"));
        jPanel20.setLayout(new java.awt.GridLayout(3, 1, 0, 5));

        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlCompanyBranch.setText("Sucursal:");
        jlCompanyBranch.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel8.add(jlCompanyBranch);

        jcbCompanyBranch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbCompanyBranch.setPreferredSize(new java.awt.Dimension(300, 23));
        jPanel8.add(jcbCompanyBranch);

        jPanel20.add(jPanel8);

        jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlWarehouse.setText("Almacén:");
        jlWarehouse.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel9.add(jlWarehouse);

        jcbWarehouse.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbWarehouse.setPreferredSize(new java.awt.Dimension(300, 23));
        jPanel9.add(jcbWarehouse);

        jPanel20.add(jPanel9);

        jPanel10.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlItemGeneric.setText("Ítem genérico:");
        jlItemGeneric.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel10.add(jlItemGeneric);

        jcbItemGeneric.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbItemGeneric.setPreferredSize(new java.awt.Dimension(300, 23));
        jPanel10.add(jcbItemGeneric);

        jPanel20.add(jPanel10);

        jPanel12.add(jPanel20);

        jPanel2.add(jPanel12, java.awt.BorderLayout.NORTH);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel1.setPreferredSize(new java.awt.Dimension(392, 33));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jbPrint.setText("Imprimir");
        jbPrint.setToolTipText("[Ctrl + Enter]");
        jbPrint.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel1.add(jbPrint);

        jbExit.setText("Cerrar");
        jbExit.setToolTipText("[Escape]");
        jbExit.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel1.add(jbExit);

        getContentPane().add(jPanel1, java.awt.BorderLayout.SOUTH);

        setSize(new java.awt.Dimension(656, 439));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        windowActivated();
    }//GEN-LAST:event_formWindowActivated

    private void initComponentsExtra() {
        mvFields = new Vector<SFormField>();

        moFieldDateStart = new SFormField(miClient, SLibConstants.DATA_TYPE_DATE, true, jftDateStart, jlDateStart);
        moFieldDateStart.setPickerButton(jbPickDateStart);
        moFieldDateEnd = new SFormField(miClient, SLibConstants.DATA_TYPE_DATE, true, jftDateEnd, jlDateEnd);
        moFieldDateEnd.setPickerButton(jbPickDateEnd);
        moFieldMovementCategory = new SFormField(miClient, SLibConstants.DATA_TYPE_KEY, true, jcbMovementCategory, jlMovementCategory);
        moFieldMovementClass = new SFormField(miClient, SLibConstants.DATA_TYPE_KEY, false, jcbMovementClass, jlMovementClass);
        moFieldMovementType = new SFormField(miClient, SLibConstants.DATA_TYPE_KEY, false, jcbMovementType, jlMovementType);
        moFieldCompanyBranch = new SFormField(miClient, SLibConstants.DATA_TYPE_KEY, false, jcbCompanyBranch, jlCompanyBranch);
        moFieldWarehouse = new SFormField(miClient, SLibConstants.DATA_TYPE_KEY, false, jcbWarehouse, jlWarehouse);
        moFieldItemGeneric = new SFormField(miClient, SLibConstants.DATA_TYPE_KEY, false, jcbItemGeneric, jlItemGeneric);

        mvFields.add(moFieldDateStart);
        mvFields.add(moFieldDateEnd);
        mvFields.add(moFieldMovementCategory);
        mvFields.add(moFieldMovementClass);
        mvFields.add(moFieldMovementType);
        mvFields.add(moFieldCompanyBranch);
        mvFields.add(moFieldWarehouse);
        mvFields.add(moFieldItemGeneric);

        jbPrint.addActionListener(this);
        jbExit.addActionListener(this);
        jbPickDateStart.addActionListener(this);
        jbPickDateEnd.addActionListener(this);
        jrbReportTypeDetailedItem.addItemListener(this);
        jrbReportTypeDetailedMove.addItemListener(this);
        jrbReportTypeSummary.addItemListener(this);
        
        moGroupMovement = new SFormComboBoxGroup(miClient);
        moGroupCompanyBranch = new SFormComboBoxGroup(miClient);

        AbstractAction actionOk = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) { actionPrint(); }
        };

        SFormUtilities.putActionMap(getRootPane(), actionOk, "print", KeyEvent.VK_ENTER, KeyEvent.CTRL_DOWN_MASK);

        AbstractAction action = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) { actionExit(); }
        };

        SFormUtilities.putActionMap(getRootPane(), action, "exit", KeyEvent.VK_ESCAPE, 0);
    }

    private void windowActivated() {
        if (mbFirstTime) {
            mbFirstTime = false;
            jftDateStart.requestFocus();
        }
    }

    private void printReportDetailedItem(){
        Cursor cursor = getCursor();
        SFormValidation validation = formValidate();
        Map<String, Object> map = null;
        JasperPrint jasperPrint = null;
        JasperViewer jasperViewer = null;

        if (validation.getIsError()) {
            if (validation.getComponent() != null) {
                validation.getComponent().requestFocus();
            }
            if (validation.getMessage().length() > 0) {
                miClient.showMsgBoxWarning(validation.getMessage());
            }
        }
        else {
            try {
                setCursor(new Cursor(Cursor.WAIT_CURSOR));

                map = miClient.createReportParams();
                map.put("tDtInitial", moFieldDateStart.getDate());
                map.put("tDtEnd", moFieldDateEnd.getDate());
                map.put("nWorkingYear", SLibTimeUtilities.digestYear(moFieldDateEnd.getDate())[0]);
                map.put("sCompanyBranch", moFieldCompanyBranch.getKeyAsIntArray()[0] == 0 ? "(TODAS)" : jcbCompanyBranch.getSelectedItem().toString());
                map.put("sWarehouse", jcbWarehouse.isEnabled() ? (moFieldWarehouse.getKeyAsIntArray()[0] == 0 ? "(TODOS)" : jcbWarehouse.getSelectedItem().toString().substring(jcbWarehouse.getSelectedItem().toString().indexOf("-") + 1)) : "(TODOS)");
                map.put("sItemGeneric", moFieldItemGeneric.getKeyAsIntArray()[0] == 0 ? "(TODOS)" : jcbItemGeneric.getSelectedItem().toString().substring(0, jcbItemGeneric.getSelectedItem().toString().indexOf("(") - 1));
                map.put("sSqlWhereCompanyBranch", moFieldCompanyBranch.getKeyAsIntArray()[0] == 0 ? "" : " AND stk.id_cob = " + moFieldCompanyBranch.getKeyAsIntArray()[0]);
                map.put("sSqlWhereWarehouse", jcbWarehouse.isEnabled() ? moFieldWarehouse.getKeyAsIntArray()[0] == 0 ? "" : " AND stk.id_wh = " + moFieldWarehouse.getKeyAsIntArray()[1] : "");
                map.put("sSqlWhereItemGeneric", moFieldItemGeneric.getKeyAsIntArray()[0] == 0 ? "" : " AND i.fid_igen = " + moFieldItemGeneric.getKeyAsIntArray()[0]);
                map.put("sSqlWhere", " WHERE stk.b_del = FALSE AND stk.dt BETWEEN '" + miClient.getSessionXXX().getFormatters().getDbmsDateFormat().format(moFieldDateStart.getDate()) + "' AND '" +
                        miClient.getSessionXXX().getFormatters().getDbmsDateFormat().format( moFieldDateEnd.getDate()) + "' ");
                map.put("nFidCtEnt", SDataConstantsSys.CFGS_CT_ENT_WH);
                map.put("bSortItemByKey", miClient.getSessionXXX().getParamsErp().getFkSortingItemTypeId() == SDataConstantsSys.CFGS_TP_SORT_KEY_NAME ? true : false);

                jasperPrint = SDataUtilities.fillReport(miClient, SDataConstantsSys.REP_TRN_STK_MOV, map);
                jasperViewer = new JasperViewer(jasperPrint, false);
                jasperViewer.setTitle(getTitle());
                jasperViewer.setVisible(true);
            }
            catch(Exception e) {
                SLibUtilities.renderException(this, e);
            }
            finally {
                setCursor(cursor);
            }
        }
    }
    
    private void printReportMovements() {
        Cursor cursor = getCursor();
        SFormValidation validation = formValidate();
        Map<String, Object> map = null;
        JasperPrint jasperPrint = null;
        JasperViewer jasperViewer = null;

        if (validation.getIsError()) {
            if (validation.getComponent() != null) {
                validation.getComponent().requestFocus();
            }
            if (validation.getMessage().length() > 0) {
                miClient.showMsgBoxWarning(validation.getMessage());
            }
        }
        else {
            try {
                setCursor(new Cursor(Cursor.WAIT_CURSOR));

                int report = SLibConsts.UNDEFINED;
                String alias = "";
                String prefix = "";
                String sqlWhere = "";
                
                if (jrbReportTypeDetailedMove.isSelected()) {
                    report = SDataConstantsSys.REP_TRN_STK_MOV_MOV;
                    alias = "d";
                    prefix = "f";
                }
                else if (jrbReportTypeSummary.isSelected()) {
                    report = SDataConstantsSys.REP_TRN_STK_MOV_SUM;
                    alias = "s";
                    prefix = "";
                }
                
                if (jcbMovementType.getSelectedIndex() > 0) {
                    sqlWhere += "AND " + alias + ".fid_ct_iog = " + moFieldMovementType.getKeyAsIntArray()[0] + " "
                            + "AND " + alias + ".fid_cl_iog = " + moFieldMovementType.getKeyAsIntArray()[1] + " "
                            + "AND " + alias + ".fid_tp_iog = " + moFieldMovementType.getKeyAsIntArray()[2] + " ";
                }
                else if (jcbMovementClass.getSelectedIndex() > 0) {
                    sqlWhere += "AND " + alias + ".fid_ct_iog = " + moFieldMovementClass.getKeyAsIntArray()[0] + " "
                            + "AND " + alias + ".fid_cl_iog = " + moFieldMovementClass.getKeyAsIntArray()[1] + " ";
                }
                else {
                    sqlWhere += "AND " + alias + ".fid_ct_iog = " + moFieldMovementCategory.getKeyAsIntArray()[0] + " ";
                }
                
                if (jcbCompanyBranch.getSelectedIndex() > 0) {
                    sqlWhere += "AND " + alias + "." + prefix + "id_cob = " + moFieldCompanyBranch.getKeyAsIntArray()[0] + " ";
                    
                    if (jcbWarehouse.getSelectedIndex() > 0) {
                        sqlWhere += "AND " + alias + "." + prefix + "id_wh = " + moFieldWarehouse.getKeyAsIntArray()[1] + " ";
                    }
                }
                
                if (jcbItemGeneric.getSelectedIndex() > 0) {
                    sqlWhere += "AND i.fid_igen = " + moFieldItemGeneric.getKeyAsIntArray()[0] + " ";
                }
                
                map = miClient.createReportParams();
                map.put("tDateStart", moFieldDateStart.getDate());
                map.put("tDateEnd", moFieldDateEnd.getDate());
                map.put("nYear", SLibTimeUtilities.digestYear(moFieldDateStart.getDate())[0]);
                map.put("sCompanyBranch", jcbCompanyBranch.getSelectedIndex() <= 0 ? "(TODAS)" : jcbCompanyBranch.getSelectedItem().toString());
                map.put("sWarehouse", jcbWarehouse.isEnabled() ? (moFieldWarehouse.getKeyAsIntArray()[0] == 0 ? "(TODOS)" : jcbWarehouse.getSelectedItem().toString().substring(jcbWarehouse.getSelectedItem().toString().indexOf("-") + 1)) : "(TODOS)");
                map.put("sItemGeneric", moFieldItemGeneric.getKeyAsIntArray()[0] == 0 ? "(TODOS)" : jcbItemGeneric.getSelectedItem().toString().substring(0, jcbItemGeneric.getSelectedItem().toString().indexOf("(") - 1));
                map.put("sMovement", jcbMovementType.getSelectedIndex() > 0 ? jcbMovementType.getSelectedItem().toString() : jcbMovementClass.getSelectedIndex() > 0 ? jcbMovementClass.getSelectedItem().toString() : jcbMovementCategory.getSelectedItem().toString());
                map.put("sSqlWhere", sqlWhere);
                
                jasperPrint = SDataUtilities.fillReport(miClient, report, map);
                jasperViewer = new JasperViewer(jasperPrint, false);
                jasperViewer.setTitle(getTitle());
                jasperViewer.setVisible(true);
            }
            catch(Exception e) {
                SLibUtilities.renderException(this, e);
            }
            finally {
                setCursor(cursor);
            }
        }
    }

    private void actionPrint() {
        if (jrbReportTypeDetailedItem.isSelected()) {
            printReportDetailedItem();
        }
        if (jrbReportTypeDetailedMove.isSelected()) {
            printReportMovements();
        }
        else if (jrbReportTypeSummary.isSelected()) {
            printReportMovements();
        }
    }
    
    private void actionExit() {
        dispose();
    }
    
    private void actionDateStart() {
        miClient.getGuiDatePickerXXX().pickDate(moFieldDateStart.getDate(), moFieldDateStart);
    }

    private void actionDateEnd() {
        miClient.getGuiDatePickerXXX().pickDate(moFieldDateEnd.getDate(), moFieldDateEnd);
    }
    
    private void itemStateChangedReportTypeDetailedItem() {
        moGroupMovement.reset();
        jcbMovementCategory.setEnabled(false);
    }

    private void itemStateChangedReportTypeDetailedMove() {
        jcbMovementCategory.setEnabled(true);
    }

    private void itemStateChangedReportTypeSummary() {
        jcbMovementCategory.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton jbExit;
    private javax.swing.JButton jbPickDateEnd;
    private javax.swing.JButton jbPickDateStart;
    private javax.swing.JButton jbPrint;
    private javax.swing.ButtonGroup jbgReportType;
    private javax.swing.JComboBox<SFormComponentItem> jcbCompanyBranch;
    private javax.swing.JComboBox<SFormComponentItem> jcbItemGeneric;
    private javax.swing.JComboBox<SFormComponentItem> jcbMovementCategory;
    private javax.swing.JComboBox<SFormComponentItem> jcbMovementClass;
    private javax.swing.JComboBox<SFormComponentItem> jcbMovementType;
    private javax.swing.JComboBox<SFormComponentItem> jcbWarehouse;
    private javax.swing.JFormattedTextField jftDateEnd;
    private javax.swing.JFormattedTextField jftDateStart;
    private javax.swing.JLabel jlCompanyBranch;
    private javax.swing.JLabel jlDateEnd;
    private javax.swing.JLabel jlDateStart;
    private javax.swing.JLabel jlItemGeneric;
    private javax.swing.JLabel jlMovementCategory;
    private javax.swing.JLabel jlMovementClass;
    private javax.swing.JLabel jlMovementType;
    private javax.swing.JLabel jlReportType;
    private javax.swing.JLabel jlWarehouse;
    private javax.swing.JRadioButton jrbReportTypeDetailedItem;
    private javax.swing.JRadioButton jrbReportTypeDetailedMove;
    private javax.swing.JRadioButton jrbReportTypeSummary;
    // End of variables declaration//GEN-END:variables

    @Override
    public void formClearRegistry() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void formReset() {
        mnFormResult = SLibConstants.UNDEFINED;
        mnFormStatus = SLibConstants.UNDEFINED;
        mbFirstTime = true;
        mbResetingForm = false;

        for (int i = 0; i < mvFields.size(); i++) {
            ((erp.lib.form.SFormField) mvFields.get(i)).resetField();
        }

        moFieldDateStart.setFieldValue(SLibTimeUtilities.getBeginOfMonth(miClient.getSessionXXX().getWorkingDate()));
        moFieldDateEnd.setFieldValue(SLibTimeUtilities.getEndOfMonth(miClient.getSessionXXX().getWorkingDate()));
        jrbReportTypeDetailedItem.setSelected(true);
        itemStateChangedReportTypeDetailedItem();
        moGroupMovement.reset();
        moGroupCompanyBranch.reset();
    }

    @Override
    public void formRefreshCatalogues() {
        mbResetingForm = true;
        
        moGroupMovement.clear();
        moGroupMovement.addComboBox(SDataConstants.TRNS_CT_IOG, jcbMovementCategory);
        moGroupMovement.addComboBox(SDataConstants.TRNS_CL_IOG, jcbMovementClass);
        moGroupMovement.addComboBox(SDataConstants.TRNS_TP_IOG, jcbMovementType);
        
        moGroupCompanyBranch.clear();
        moGroupCompanyBranch.addComboBox(SDataConstants.BPSU_BPB, jcbCompanyBranch, new int[] { miClient.getSessionXXX().getCurrentCompany().getPkCompanyId() });
        moGroupCompanyBranch.addComboBox(SDataConstants.CFGU_COB_ENT, jcbWarehouse, new int[] { SDataConstantsSys.CFGS_CT_ENT_WH });
        
        SFormUtilities.populateComboBox(miClient, jcbItemGeneric, SDataConstants.ITMU_IGEN);
        
        mbResetingForm = false;
    }

    @Override
    public erp.lib.form.SFormValidation formValidate() {
        SFormValidation validation = new SFormValidation();

        for (int i = 0; i < mvFields.size(); i++) {
            if (!((erp.lib.form.SFormField) mvFields.get(i)).validateField()) {
                validation.setIsError(true);
                validation.setComponent(((erp.lib.form.SFormField) mvFields.get(i)).getComponent());
                break;
            }
        }

        if (!validation.getIsError()) {
            String msg = SGuiUtilities.validateDateRange(moFieldDateStart.getDate(), moFieldDateEnd.getDate());
            if (!msg.isEmpty()) {
                validation.setMessage(msg);
                validation.setComponent(jftDateStart);
            }
        }

        return validation;
    }

    @Override
    public void setFormStatus(int status) {
        mnFormStatus = status;
    }

    @Override
    public void setFormVisible(boolean visible) {
        setVisible(visible);
    }

    @Override
    public int getFormStatus() {
        return mnFormStatus;
    }

    @Override
    public int getFormResult() {
        return mnFormResult;
    }

    @Override
    public void setRegistry(erp.lib.data.SDataRegistry registry) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public erp.lib.data.SDataRegistry getRegistry() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setValue(int type, java.lang.Object value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public java.lang.Object getValue(int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public javax.swing.JLabel getTimeoutLabel() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        if (e.getSource() instanceof javax.swing.JButton) {
            javax.swing.JButton button = (javax.swing.JButton) e.getSource();

            if (button == jbPrint) {
                actionPrint();
            }
            else if (button == jbExit) {
                actionExit();
            }
            else if (button == jbPickDateStart) {
                actionDateStart();
            }
            else if (button == jbPickDateEnd) {
                actionDateEnd();
            }
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() instanceof JRadioButton) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                JRadioButton radioButton = (JRadioButton) e.getSource();
                if (radioButton == jrbReportTypeDetailedItem) {
                    itemStateChangedReportTypeDetailedItem();
                }
                else if (radioButton == jrbReportTypeDetailedMove) {
                    itemStateChangedReportTypeDetailedMove();
                }
                else if (radioButton == jrbReportTypeSummary) {
                    itemStateChangedReportTypeSummary();
                }
            }
        }
    }
}
