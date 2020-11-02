/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package erp.mfin.form;

import erp.lib.SLibConstants;
import erp.lib.form.SFormField;
import erp.lib.form.SFormUtilities;
import erp.lib.form.SFormValidation;
import erp.lib.table.STableColumnForm;
import erp.lib.table.STableConstants;
import erp.lib.table.STablePaneGrid;
import erp.lib.table.STableRow;
import erp.mfin.data.SDataRecordEntry;
import erp.mfin.data.SDataRecordEntryRow;
import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.event.ListSelectionEvent;

/**
 *
 * @author  Sergio Flores
 */
public class SWizardExchangeDifference extends javax.swing.JDialog implements erp.lib.form.SFormInterface, java.awt.event.ActionListener, java.awt.event.ItemListener, javax.swing.event.ListSelectionListener {

    private static final int STEP_MIN = 1;
    private static final int STEP_MAX = 3;

    private int mnFormResult;
    private int mnFormStatus;
    private boolean mbFirstTime;
    private boolean mbResetingForm;
    private java.util.Vector<erp.lib.form.SFormField> mvFieldsStep1;
    private java.util.Vector<erp.lib.form.SFormField> mvFieldsStep2;
    private java.util.Vector<erp.lib.form.SFormField> mvFieldsStep3;
    private erp.client.SClientInterface miClient;

    private erp.mfin.data.SDataRecord moRecord;
    private erp.mfin.data.SDataAccountCash moAccountCash;
    private erp.lib.form.SFormField moFieldDate;
    private erp.lib.form.SFormField moFieldCurrency;
    private erp.lib.form.SFormField moFieldExchangeRate;
    private erp.lib.table.STablePaneGrid moPaneGridEntries;
    private int mnStep;


    /** Creates new form SFormRecord */
    public SWizardExchangeDifference(erp.client.SClientInterface client) {
        super(client.getFrame(), true);
        miClient = client;
        initComponents();
        initComponentsExtra();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbgGroup = new javax.swing.ButtonGroup();
        jpWizard = new javax.swing.JPanel();
        jtpSteps = new javax.swing.JTabbedPane();
        jpStep1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jrbDpsPayedSal = new javax.swing.JRadioButton();
        jrbDpsPayedPur = new javax.swing.JRadioButton();
        jrbDpsPendingSal = new javax.swing.JRadioButton();
        jrbDpsPendingPur = new javax.swing.JRadioButton();
        jrbCashCashBal = new javax.swing.JRadioButton();
        jrbCashBankBal = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jlDate = new javax.swing.JLabel();
        jftDate = new javax.swing.JFormattedTextField();
        jbDate = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jlCurrency = new javax.swing.JLabel();
        jcbCurrency = new javax.swing.JComboBox();
        jbCurrency = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jlExchangeRate = new javax.swing.JLabel();
        jtfExchangeRate = new javax.swing.JTextField();
        jbExchangeRate = new javax.swing.JButton();
        jpStep2 = new javax.swing.JPanel();
        jpStep3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jtfRecordManualDateRo = new javax.swing.JTextField();
        jtfRecordManualBranchRo = new javax.swing.JTextField();
        jtfRecordManualNumberRo = new javax.swing.JTextField();
        jbRecordManualSelect = new javax.swing.JButton();
        jbRecordManualView = new javax.swing.JButton();
        jpControls = new javax.swing.JPanel();
        jbStepPrev = new javax.swing.JButton();
        jbStepNext = new javax.swing.JButton();
        jbFinish = new javax.swing.JButton();
        jbCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Póliza contable"); // NOI18N
        setModal(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jpWizard.setLayout(new java.awt.BorderLayout(5, 5));

        jtpSteps.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        jpStep1.setBorder(javax.swing.BorderFactory.createTitledBorder("Paso 1. Tipo de ajuste por fluctuación cambiaria:"));
        jpStep1.setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de ajuste:"));
        jPanel1.setLayout(new java.awt.GridLayout(6, 1));

        jbgGroup.add(jrbDpsPayedSal);
        jrbDpsPayedSal.setText("Documentos de ventas liquidados");
        jPanel1.add(jrbDpsPayedSal);

        jbgGroup.add(jrbDpsPayedPur);
        jrbDpsPayedPur.setText("Documentos de compras liquidados");
        jPanel1.add(jrbDpsPayedPur);

        jbgGroup.add(jrbDpsPendingSal);
        jrbDpsPendingSal.setText("Documentos de ventas con saldo");
        jPanel1.add(jrbDpsPendingSal);

        jbgGroup.add(jrbDpsPendingPur);
        jrbDpsPendingPur.setText("Documentos de compras con saldo");
        jPanel1.add(jrbDpsPendingPur);

        jbgGroup.add(jrbCashCashBal);
        jrbCashCashBal.setText("Saldos de cajas");
        jPanel1.add(jrbCashCashBal);

        jbgGroup.add(jrbCashBankBal);
        jrbCashBankBal.setText("Saldos de cuentas bancarias");
        jPanel1.add(jrbCashBankBal);

        jpStep1.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Parámetros del ajuste:"));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(new java.awt.GridLayout(4, 1, 0, 1));

        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 2, 0));

        jlDate.setText("Fecha de corte:");
        jlDate.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel4.add(jlDate);

        jftDate.setText("dd/mm/yyyy");
        jftDate.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel4.add(jftDate);

        jbDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/erp/img/cal_cal.gif"))); // NOI18N
        jbDate.setToolTipText("Seleccionar fecha inicial");
        jbDate.setPreferredSize(new java.awt.Dimension(23, 23));
        jPanel4.add(jbDate);

        jPanel3.add(jPanel4);

        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 2, 0));

        jlCurrency.setText("Moneda:");
        jlCurrency.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel6.add(jlCurrency);

        jcbCurrency.setPreferredSize(new java.awt.Dimension(150, 23));
        jPanel6.add(jcbCurrency);

        jbCurrency.setText("...");
        jbCurrency.setToolTipText("Seleccionar moneda");
        jbCurrency.setPreferredSize(new java.awt.Dimension(23, 23));
        jPanel6.add(jbCurrency);

        jPanel3.add(jPanel6);

        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 2, 0));

        jlExchangeRate.setText("Tipo de cambio:");
        jlExchangeRate.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel7.add(jlExchangeRate);

        jtfExchangeRate.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jtfExchangeRate.setText("0.00000000");
        jtfExchangeRate.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel7.add(jtfExchangeRate);

        jbExchangeRate.setText("...");
        jbExchangeRate.setToolTipText("Seleccionar tipo de cambio");
        jbExchangeRate.setPreferredSize(new java.awt.Dimension(23, 23));
        jPanel7.add(jbExchangeRate);

        jPanel3.add(jPanel7);

        jPanel2.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jpStep1.add(jPanel2, java.awt.BorderLayout.CENTER);

        jtpSteps.addTab("Paso 1.", jpStep1);

        jpStep2.setBorder(javax.swing.BorderFactory.createTitledBorder("Paso 2. Registros sujetos de ajuste:"));
        jpStep2.setLayout(new java.awt.BorderLayout());
        jtpSteps.addTab("Paso 2.", jpStep2);

        jpStep3.setBorder(javax.swing.BorderFactory.createTitledBorder("Paso 3. Póliza contable:"));
        jpStep3.setLayout(new java.awt.BorderLayout());

        jPanel5.setLayout(new java.awt.GridLayout(1, 1, 0, 1));

        jPanel34.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 2, 0));

        jtfRecordManualDateRo.setEditable(false);
        jtfRecordManualDateRo.setText("01/01/2000");
        jtfRecordManualDateRo.setToolTipText("Fecha de la póliza contable");
        jtfRecordManualDateRo.setFocusable(false);
        jtfRecordManualDateRo.setPreferredSize(new java.awt.Dimension(65, 23));
        jPanel34.add(jtfRecordManualDateRo);

        jtfRecordManualBranchRo.setEditable(false);
        jtfRecordManualBranchRo.setText("SUC");
        jtfRecordManualBranchRo.setToolTipText("Sucursal de la empresa");
        jtfRecordManualBranchRo.setFocusable(false);
        jtfRecordManualBranchRo.setPreferredSize(new java.awt.Dimension(35, 23));
        jPanel34.add(jtfRecordManualBranchRo);

        jtfRecordManualNumberRo.setEditable(false);
        jtfRecordManualNumberRo.setText("TP-000001");
        jtfRecordManualNumberRo.setToolTipText("Número de póliza contable");
        jtfRecordManualNumberRo.setFocusable(false);
        jtfRecordManualNumberRo.setPreferredSize(new java.awt.Dimension(65, 23));
        jPanel34.add(jtfRecordManualNumberRo);

        jbRecordManualSelect.setText("...");
        jbRecordManualSelect.setToolTipText("Seleccionar póliza contable");
        jbRecordManualSelect.setPreferredSize(new java.awt.Dimension(23, 23));
        jPanel34.add(jbRecordManualSelect);

        jbRecordManualView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/erp/img/icon_std_look.gif"))); // NOI18N
        jbRecordManualView.setToolTipText("Ver póliza contable");
        jbRecordManualView.setPreferredSize(new java.awt.Dimension(23, 23));
        jPanel34.add(jbRecordManualView);

        jPanel5.add(jPanel34);

        jpStep3.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jtpSteps.addTab("Paso 3.", jpStep3);

        jpWizard.add(jtpSteps, java.awt.BorderLayout.CENTER);

        getContentPane().add(jpWizard, java.awt.BorderLayout.CENTER);

        jpControls.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jbStepPrev.setText("< Anterior");
        jbStepPrev.setToolTipText("[Ctrl + RePág]");
        jbStepPrev.setPreferredSize(new java.awt.Dimension(100, 23));
        jpControls.add(jbStepPrev);

        jbStepNext.setText("Siguiente >");
        jbStepNext.setToolTipText("[Ctrl + AvPág]");
        jbStepNext.setPreferredSize(new java.awt.Dimension(100, 23));
        jpControls.add(jbStepNext);

        jbFinish.setText("Finalizar"); // NOI18N
        jbFinish.setToolTipText("[Ctrl + Enter]");
        jbFinish.setPreferredSize(new java.awt.Dimension(75, 23));
        jpControls.add(jbFinish);

        jbCancel.setText("Cancelar"); // NOI18N
        jbCancel.setToolTipText("[Escape]");
        jpControls.add(jbCancel);

        getContentPane().add(jpControls, java.awt.BorderLayout.PAGE_END);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-800)/2, (screenSize.height-600)/2, 800, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        windowActivated();
    }//GEN-LAST:event_formWindowActivated

    private void initComponentsExtra() {
        int i = 0;

        moFieldDate = new SFormField(miClient, SLibConstants.DATA_TYPE_DATE, true, jftDate, jlDate);
        moFieldDate.setPickerButton(jbDate);
        moFieldCurrency = new SFormField(miClient, SLibConstants.DATA_TYPE_KEY, true, jcbCurrency, jlCurrency);
        moFieldCurrency.setPickerButton(jbCurrency);
        moFieldExchangeRate = new SFormField(miClient, SLibConstants.DATA_TYPE_DOUBLE, true, jtfExchangeRate, jlExchangeRate);
        moFieldExchangeRate.setPickerButton(jbExchangeRate);
        moFieldExchangeRate.setDecimalFormat(miClient.getSessionXXX().getFormatters().getDecimalsExchangeRateFormat());

        mvFieldsStep1 = new Vector<SFormField>();
        mvFieldsStep2 = new Vector<SFormField>();
        mvFieldsStep3 = new Vector<SFormField>();

        mvFieldsStep1.add(moFieldDate);
        mvFieldsStep1.add(moFieldCurrency);
        mvFieldsStep1.add(moFieldExchangeRate);

        jbDate.addActionListener(this);
        jbCurrency.addActionListener(this);
        jbExchangeRate.addActionListener(this);
        jbStepPrev.addActionListener(this);
        jbStepNext.addActionListener(this);
        jbFinish.addActionListener(this);
        jbCancel.addActionListener(this);

        SFormUtilities.createActionMap(rootPane, this, "publicActionPrev", "prev", KeyEvent.VK_PAGE_DOWN, KeyEvent.CTRL_DOWN_MASK);
        SFormUtilities.createActionMap(rootPane, this, "publicActionNext", "next", KeyEvent.VK_PAGE_UP, KeyEvent.CTRL_DOWN_MASK);
        SFormUtilities.createActionMap(rootPane, this, "publicActionFinish", "finish", KeyEvent.VK_ENTER, KeyEvent.CTRL_DOWN_MASK);
        SFormUtilities.createActionMap(rootPane, this, "publicActionCancel", "cancel", KeyEvent.VK_ESCAPE, KeyEvent.CTRL_DOWN_MASK);
    }

    private void windowActivated() {
        if (mbFirstTime) {
            mbFirstTime = false;
            if (jftDate.isEnabled()) jftDate.requestFocus(); else jbCancel.requestFocus();
        }
    }

    private boolean canGoToStep(int step) {
        SFormValidation validation = new SFormValidation();

        switch (step) {
            case STEP_MIN + 1:
                for (int i = 0; i < mvFieldsStep1.size(); i++) {
                    if (!mvFieldsStep1.get(i).validateField()) {
                        validation.setIsError(true);
                        validation.setComponent(mvFieldsStep1.get(i).getComponent());
                        break;
                    }
                }
                break;

            case STEP_MAX:
                for (int i = 0; i < mvFieldsStep2.size(); i++) {
                    if (!mvFieldsStep2.get(i).validateField()) {
                        validation.setIsError(true);
                        validation.setComponent(mvFieldsStep2.get(i).getComponent());
                        break;
                    }
                }
                break;

            default:
        }

        if (validation.getIsError()) {
            if (validation.getComponent() != null) {
                validation.getComponent().requestFocus();
            }
            if (validation.getMessage().length() > 0) {
                miClient.showMsgBoxWarning(validation.getMessage());
            }
        }

        return !validation.getIsError();
    }

    private boolean canFinish() {
        SFormValidation validation = new SFormValidation();

        for (int i = 0; i < mvFieldsStep3.size(); i++) {
            if (!mvFieldsStep3.get(i).validateField()) {
                validation.setIsError(true);
                validation.setComponent(mvFieldsStep3.get(i).getComponent());
                break;
            }
        }

        if (validation.getIsError()) {
            if (validation.getComponent() != null) {
                validation.getComponent().requestFocus();
            }
            if (validation.getMessage().length() > 0) {
                miClient.showMsgBoxWarning(validation.getMessage());
            }
        }

        return !validation.getIsError();
    }

    private void goToStep(int step) {
        int i = 0;

        if (step >= STEP_MIN && step <= STEP_MAX) {
            mnStep = step;

            for (i = STEP_MIN; i < STEP_MAX; i++) {
                jtpSteps.setEnabledAt(i - 1, i == mnStep);
            }

            jtpSteps.setSelectedIndex(mnStep - 1);
            jbStepPrev.setEnabled(mnStep != STEP_MIN);
            jbStepNext.setEnabled(mnStep != STEP_MAX);

            switch (mnStep) {
                case STEP_MIN:
                    jftDate.requestFocus();
                    break;
                case STEP_MIN + 1:
                    break;
                case STEP_MAX:
                    break;
            }
        }
    }

    private void nextStep() {
        if (mnStep < STEP_MAX) {
            if (canGoToStep(mnStep + 1)) {
                goToStep(++mnStep);
            }
        }
    }

    private void prevStep() {
        if (mnStep > STEP_MIN) {
            if (canGoToStep(mnStep - 1)) {
                goToStep(--mnStep);
            }
        }
    }

    private void createGrid() {
        int i = 0;
        STableColumnForm[] aoTableColumns = null;

        moPaneGridEntries = new STablePaneGrid(miClient);
        jpStep2.removeAll();
        jpStep2.add(moPaneGridEntries, BorderLayout.CENTER);

        aoTableColumns = new STableColumnForm[24];
        aoTableColumns[i++] = new STableColumnForm(SLibConstants.DATA_TYPE_INTEGER, "#", STableConstants.WIDTH_NUM_TINYINT);
        aoTableColumns[i++] = new STableColumnForm(SLibConstants.DATA_TYPE_STRING, "No. cuenta contable", STableConstants.WIDTH_ACCOUNT_ID);
        aoTableColumns[i++] = new STableColumnForm(SLibConstants.DATA_TYPE_STRING, "Cuenta contable", STableConstants.WIDTH_ACCOUNT);
        aoTableColumns[i++] = new STableColumnForm(SLibConstants.DATA_TYPE_STRING, "Concepto", 175);
        aoTableColumns[i++] = new STableColumnForm(SLibConstants.DATA_TYPE_DOUBLE, "Debe $", STableConstants.WIDTH_VALUE);
        aoTableColumns[i++] = new STableColumnForm(SLibConstants.DATA_TYPE_DOUBLE, "Haber $", STableConstants.WIDTH_VALUE);
        aoTableColumns[i] = new STableColumnForm(SLibConstants.DATA_TYPE_DOUBLE, "T. cambio", STableConstants.WIDTH_EXCHANGE_RATE);
        aoTableColumns[i++].setCellRenderer(miClient.getSessionXXX().getFormatters().getTableCellRendererExchangeRate());
        aoTableColumns[i++] = new STableColumnForm(SLibConstants.DATA_TYPE_DOUBLE, "Debe mon $", STableConstants.WIDTH_VALUE);
        aoTableColumns[i++] = new STableColumnForm(SLibConstants.DATA_TYPE_DOUBLE, "Haber mon $", STableConstants.WIDTH_VALUE);
        aoTableColumns[i++] = new STableColumnForm(SLibConstants.DATA_TYPE_STRING, "Moneda", STableConstants.WIDTH_CURRENCY_KEY);
        aoTableColumns[i++] = new STableColumnForm(SLibConstants.DATA_TYPE_BOOLEAN, "Sistema", STableConstants.WIDTH_BOOLEAN);
        aoTableColumns[i++] = new STableColumnForm(SLibConstants.DATA_TYPE_BOOLEAN, "Diferencia cambiaria", STableConstants.WIDTH_BOOLEAN);
        aoTableColumns[i++] = new STableColumnForm(SLibConstants.DATA_TYPE_STRING, "Subclase movimiento", 200);
        aoTableColumns[i++] = new STableColumnForm(SLibConstants.DATA_TYPE_STRING, "No. centro costo", STableConstants.WIDTH_ACCOUNT_ID);
        aoTableColumns[i++] = new STableColumnForm(SLibConstants.DATA_TYPE_STRING, "Centro costo", STableConstants.WIDTH_ACCOUNT);
        aoTableColumns[i++] = new STableColumnForm(SLibConstants.DATA_TYPE_STRING, "No. cheque", STableConstants.WIDTH_NUM_SMALLINT);
        aoTableColumns[i++] = new STableColumnForm(SLibConstants.DATA_TYPE_BOOLEAN, "Eliminado", STableConstants.WIDTH_BOOLEAN);
        aoTableColumns[i++] = new STableColumnForm(SLibConstants.DATA_TYPE_STRING, "Usr. creación", STableConstants.WIDTH_USER);
        aoTableColumns[i++] = new STableColumnForm(SLibConstants.DATA_TYPE_DATE_TIME, "Creación", STableConstants.WIDTH_DATE_TIME);
        aoTableColumns[i++] = new STableColumnForm(SLibConstants.DATA_TYPE_STRING, "Usr. modificación", STableConstants.WIDTH_USER);
        aoTableColumns[i++] = new STableColumnForm(SLibConstants.DATA_TYPE_DATE_TIME, "Modificación", STableConstants.WIDTH_DATE_TIME);
        aoTableColumns[i++] = new STableColumnForm(SLibConstants.DATA_TYPE_STRING, "Usr. eliminación", STableConstants.WIDTH_USER);
        aoTableColumns[i++] = new STableColumnForm(SLibConstants.DATA_TYPE_DATE_TIME, "Eliminación", STableConstants.WIDTH_DATE_TIME);
        aoTableColumns[i++] = new STableColumnForm(SLibConstants.DATA_TYPE_INTEGER, "Id interno", STableConstants.WIDTH_NUM_TINYINT);

        for (i = 0; i < aoTableColumns.length; i++) {
            moPaneGridEntries.addTableColumn(aoTableColumns[i]);
        }
    }

    private void actionEdit(boolean edit) {

    }

    private void actionOk() {
        if (jbFinish.isEnabled()) {
            SFormValidation validation = formValidate();

            if (validation.getIsError()) {
                if (validation.getComponent() != null) {
                    validation.getComponent().requestFocus();
                }
                if (validation.getMessage().length() > 0) {
                    miClient.showMsgBoxWarning(validation.getMessage());
                }
            }
            else {
                mnFormResult = SLibConstants.FORM_RESULT_OK;
                setVisible(false);
            }
        }
    }

    private void actionCancel() {
        /*
        if (jbCancel.isEnabled()) {
            if (jckIsSystem.isSelected() || mbParamIsReadOnly || miClient.showMsgBoxConfirm(SLibConstants.MSG_CNF_FORM_CLOSE) == JOptionPane.YES_OPTION) {
                mnFormResult = SLibConstants.FORM_RESULT_CANCEL;
                setVisible(false);
            }
        }
         */
    }

    public void publicActionEntryNew() {
        //actionEntryNew();
    }

    public void publicActionEntryNewInsert() {
        //actionEntryNewInsert();
    }

    public void publicActionEntryNewCopy() {
        //actionEntryNewCopy();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JButton jbCancel;
    private javax.swing.JButton jbCurrency;
    private javax.swing.JButton jbDate;
    private javax.swing.JButton jbExchangeRate;
    private javax.swing.JButton jbFinish;
    private javax.swing.JButton jbRecordManualSelect;
    private javax.swing.JButton jbRecordManualView;
    private javax.swing.JButton jbStepNext;
    private javax.swing.JButton jbStepPrev;
    private javax.swing.ButtonGroup jbgGroup;
    private javax.swing.JComboBox jcbCurrency;
    private javax.swing.JFormattedTextField jftDate;
    private javax.swing.JLabel jlCurrency;
    private javax.swing.JLabel jlDate;
    private javax.swing.JLabel jlExchangeRate;
    private javax.swing.JPanel jpControls;
    private javax.swing.JPanel jpStep1;
    private javax.swing.JPanel jpStep2;
    private javax.swing.JPanel jpStep3;
    private javax.swing.JPanel jpWizard;
    private javax.swing.JRadioButton jrbCashBankBal;
    private javax.swing.JRadioButton jrbCashCashBal;
    private javax.swing.JRadioButton jrbDpsPayedPur;
    private javax.swing.JRadioButton jrbDpsPayedSal;
    private javax.swing.JRadioButton jrbDpsPendingPur;
    private javax.swing.JRadioButton jrbDpsPendingSal;
    private javax.swing.JTextField jtfExchangeRate;
    private javax.swing.JTextField jtfRecordManualBranchRo;
    private javax.swing.JTextField jtfRecordManualDateRo;
    private javax.swing.JTextField jtfRecordManualNumberRo;
    private javax.swing.JTabbedPane jtpSteps;
    // End of variables declaration//GEN-END:variables

    @Override
    public void formClearRegistry() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void formReset() {
        /*
        mnFormResult = SLibConstants.UNDEFINED;
        mnFormStatus = SLibConstants.UNDEFINED;
        mbFirstTime = true;

        moRecord = null;
        moAccountCash = null;
        mbOriginalIsDeleted = false;
        msAuxLastEntryConcept = "";

        moPaneGridEntries.createTable(this);
        moPaneGridEntries.clearTableRows();
        moPaneGridEntries.setGridViewStatus(STableConstants.VIEW_STATUS_ALIVE);
        moPaneGridEntries.getTable().setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jbEntryMoveUp.setEnabled(true);
        jbEntryMoveDown.setEnabled(true);
        jtbEntryFilter.setSelected(true);

        for (int i = 0; i < mvFields.size(); i++) {
            mvFields.get(i).resetField();
        }

        jckIsRecordConceptCopyEnabled.setSelected(miClient.getSessionXXX().getParamsErp().getIsRecordConceptCopyEnabled());
        jtfCurrencyKeyDebit.setText(miClient.getSessionXXX().getParamsErp().getDbmsDataCurrency().getKey());
        jtfCurrencyKeyCredit.setText(miClient.getSessionXXX().getParamsErp().getDbmsDataCurrency().getKey());
        jtfCurrencyKeyBalance.setText(miClient.getSessionXXX().getParamsErp().getDbmsDataCurrency().getKey());

        jftDate.setEnabled(true);
        jbDate.setEnabled(true);
        jtfConcept.setEnabled(true);
        jbEntryNew.setEnabled(true);
        jbEntryNewInsert.setEnabled(true);
        jbEntryNewCopy.setEnabled(true);
        jbEntryEdit.setEnabled(true);
        jbEntryDelete.setEnabled(true);
        jbEntryMoveDown.setEnabled(true);
        jbEntryMoveUp.setEnabled(true);
        jbMoneyIn.setEnabled(false);
        jbPaymentCus.setEnabled(false);
        jbPaymentCompleteCus.setEnabled(false);
        jbMoneyOut.setEnabled(false);
        jbPaymentSup.setEnabled(false);
        jbPaymentCompleteSup.setEnabled(false);
        jbCheck.setEnabled(false);
        jcbGuiConceptPolicy.setEnabled(true);
        jbFinish.setEnabled(true);

        jckIsDeleted.setEnabled(false);

        calculateBalance();
        renderPeriod();
        renderCompanyBranch();
        renderAccountCashSettings();
         */
    }

    @Override
    public void formRefreshCatalogues() {
        /*
        SFormUtilities.populateComboBox(miClient, jcbFkAccountCashId_n, SDataConstants.FIN_ACC_CASH, new int[] { miClient.getSessionXXX().getCurrentCompanyBranchId() });
        moFormEntry.formRefreshCatalogues();
        moFormCheck.formRefreshCatalogues();
         */
    }

    @Override
    public erp.lib.form.SFormValidation formValidate() {
        SFormValidation validation = new SFormValidation();
        /*
        for (int i = 0; i < mvFields.size(); i++) {
            if (!((erp.lib.form.SFormField) mvFields.get(i)).validateField()) {
                validation.setIsError(true);
                validation.setComponent(mvFields.get(i).getComponent());
                break;
            }
        }

        if (!validation.getIsError()) {
            // Validate accounting record period:

            if (!SLibTimeUtilities.isBelongingToPeriod(moFieldDate.getDate(), moRecord.getPkYearId(), moRecord.getPkPeriodId())) {
                validation.setMessage(SLibConstants.MSG_ERR_GUI_PER_DATE_REC);
                validation.setComponent(jftDate);
            }

            if (!validation.getIsError()) {
                if (moFieldIsDeleted.getBoolean()) {
                    SDataRecordEntry entry = null;

                    for (STableRow row : moPaneGridEntries.getGridRows()) {
                        entry = (SDataRecordEntry) row.getData();
                        if (entry.getIsSystem() && entry.getUserId() == 0) {
                            validation.setMessage("No se puede eliminar esta póliza contable puesto que al menos una de sus partidas es de sistema.");
                            break;
                        }
                    }
                }

                if (!validation.getIsError()) {
                    if (jcbFkAccountCashId_n.getSelectedIndex() > 0) {
                        String currency = "";
                        SDataRecordEntry entry = null;

                        // Validate account cash currency:

                        updateRecord();
                        currency = SDataReadDescriptions.getCatalogueDescription(miClient,
                                SDataConstants.CFGU_CUR, new int[] { moRecord.getDbmsDataAccountCash().getFkCurrencyId() });

                        for (STableRow row : moPaneGridEntries.getGridRows()) {
                            entry = (SDataRecordEntry) row.getData();
                            if (!entry.getIsDeleted() && !entry.getIsExchangeDifference()) {
                                if (entry.getFkCurrencyId() != moRecord.getDbmsDataAccountCash().getFkCurrencyId()) {
                                    if (miClient.showMsgBoxConfirm("Al menos una de las monedas de las partidas no coincide con " +
                                            "la moneda de la cuenta de efectivo de la póliza contable (" + currency + ").\n¿Desea continuar?") != JOptionPane.YES_OPTION) {
                                        validation.setMessage("Se debe especificar la moneda de las partidas como '" + currency + "'.");
                                    }
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
*/
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
        /*
        moRecord = (SDataRecord) registry;
        moAccountCash = moRecord.getDbmsDataAccountCash();

        moFieldDate.setFieldValue(moRecord.getDate());
        moFieldConcept.setFieldValue(moRecord.getConcept());
        moFieldFkAccountCashId_n.setFieldValue(new int[] { moRecord.getFkCompanyBranchId_n(), moRecord.getFkAccountCashId_n() });
        jtfPkNumberId.setText(moRecord.getPkRecordTypeId() + "-" + moRecord.getPkNumberId());
        jckIsAudited.setSelected(moRecord.getIsAudited());
        jckIsAuthorized.setSelected(moRecord.getIsAuthorized());
        jckIsSystem.setSelected(moRecord.getIsSystem());
        moFieldIsDeleted.setFieldValue(moRecord.getIsDeleted());

        mbOriginalIsDeleted = moRecord.getIsDeleted();

        for (SDataRecordEntry entry : moRecord.getDbmsRecordEntries()) {
            moPaneGridEntries.addTableRow(new SDataRecordEntryRow(entry));
        }
        moPaneGridEntries.renderTableRows();
        moPaneGridEntries.setTableRowSelection(0);

        if (mbParamIsReadOnly || moRecord.getIsSystem() || moRecord.getIsAudited() || moRecord.getIsAuthorized()) {
            jftDate.setEnabled(false);
            jbDate.setEnabled(false);
            jtfConcept.setEnabled(false);
            jbEntryNew.setEnabled(false);
            jbEntryNewInsert.setEnabled(false);
            jbEntryNewCopy.setEnabled(false);
            jbEntryEdit.setEnabled(false);
            jbEntryDelete.setEnabled(false);
            jbEntryMoveDown.setEnabled(false);
            jbEntryMoveUp.setEnabled(false);
            jcbGuiConceptPolicy.setEnabled(false);
            jbFinish.setEnabled(false);
        }
        else {
            jckIsDeleted.setEnabled(true);

            if (moAccountCash != null) {
                //jbMoneyIn.setEnabled(true);   XXX
                jbPaymentCus.setEnabled(true);
                jbPaymentCompleteCus.setEnabled(true);
                //jbMoneyOut.setEnabled(true);  XXX
                jbPaymentSup.setEnabled(true);
                jbPaymentCompleteSup.setEnabled(true);
                jbCheck.setEnabled(moAccountCash.getIsCheckWalletApplying());
            }
        }

        calculateBalance();
        renderPeriod();
        renderCompanyBranch();
        renderAccountCashSettings();
         */
    }

    @Override
    public erp.lib.data.SDataRegistry getRegistry() {
        if (moRecord == null) {
            miClient.showMsgBoxWarning(SLibConstants.MSG_ERR_GUI_FORM_EDIT_ONLY);
        }
        else {
            /*
            moRecord.setDate(moFieldDate.getDate());
            moRecord.setConcept(moFieldConcept.getString());
            moRecord.setIsDeleted(moFieldIsDeleted.getBoolean());
            moRecord.setFkCompanyBranchId_n(moFieldFkAccountCashId_n.getKeyAsIntArray()[0]);
            moRecord.setFkAccountCashId_n(moFieldFkAccountCashId_n.getKeyAsIntArray()[1]);
            moRecord.setFkUserEditId(miClient.getSession().getUser().getPkUserId());
*/
            moRecord.getDbmsRecordEntries().clear();

            for (STableRow row : moPaneGridEntries.getGridRows()) {
                moRecord.getDbmsRecordEntries().add((SDataRecordEntry) row.getData());
            }
        }

        return moRecord;
    }

    @Override
    public void setValue(int type, java.lang.Object value) {
        switch (type) {
            case SLibConstants.VALUE_STATUS:
                //mbParamIsReadOnly = (Boolean) value;
                break;
            default:
        }
    }

    @Override
    public java.lang.Object getValue(int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public javax.swing.JLabel getTimeoutLabel() {
        return null;
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        /*
        if (e.getSource() instanceof javax.swing.JButton) {
            JButton button = (JButton) e.getSource();
            if (button == jbFinish) {
                actionOk();
            }
            else if (button == jbCancel) {
                actionCancel();
            }
            else if (button == jbDate) {
                actionDate();
            }
            else if (button == jbEntryNew) {
                actionEntryNew();
            }
            else if (button == jbEntryNewCopy) {
                actionEntryNewCopy();
            }
            else if (button == jbEntryNewInsert) {
                actionEntryNewInsert();
            }
            else if (button == jbEntryEdit) {
                actionEntryEdit();
            }
            else if (button == jbEntryDelete) {
                actionEntryDelete();
            }
            else if (button == jbEntryMoveDown) {
                actionEntryMoveDown();
            }
            else if (button == jbEntryMoveUp) {
                actionEntryMoveUp();
            }
            else if (button == jbEntryViewSum) {
                actionEntryViewSum();
            }
            else if (button == jbMoneyIn) {
                actionMoneyIn();
            }
            else if (button == jbPaymentSup) {
                actionPaymentSup();
            }
            else if (button == jbPaymentCompleteSup) {
                actionPaymentCompleteSup();
            }
            else if (button == jbMoneyOut) {
                actionMoneyOut();
            }
            else if (button == jbPaymentCus) {
                actionPaymentCus();
            }
            else if (button == jbPaymentCompleteCus) {
                actionPaymentCompleteCus();
            }
            else if (button == jbCheck) {
                actionCheck();
            }
        }
        else if (e.getSource() instanceof javax.swing.JToggleButton) {
            JToggleButton toggleButton = (JToggleButton) e.getSource();

            if (toggleButton == jtbEntryFilter) {
                actionEntryFilter();
            }
        }
         */
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() instanceof JComboBox) {
            JComboBox comboBox = (JComboBox) e.getSource();

            /*
            if (comboBox == jcbFkAccountCashId_n) {
                itemStateFkAccountCashId_n();
            }
             */
        }
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) {
            SDataRecordEntryRow row = (SDataRecordEntryRow) moPaneGridEntries.getSelectedTableRow();

            if (row != null) {
                SDataRecordEntry entry = (SDataRecordEntry) row.getData();

                /*
                jbEntryNewCopy.setEnabled(!jckIsSystem.isSelected() && !entry.getIsSystem() && !mbParamIsReadOnly);
                jbEntryEdit.setEnabled(!jckIsSystem.isSelected() && !entry.getIsSystem() && !mbParamIsReadOnly);
                jbEntryDelete.setEnabled(!jckIsSystem.isSelected() && (!entry.getIsSystem() || entry.getUserId() != 0) && !mbParamIsReadOnly);
                 */
            }
        }
    }
}
