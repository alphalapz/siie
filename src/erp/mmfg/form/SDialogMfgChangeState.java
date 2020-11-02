/*
 * DFormCompany.java
 *
 * Created on 19 de agosto de 2008, 11:10 AM
 */

package erp.mmfg.form;

import erp.data.SDataConstants;
import erp.data.SDataConstantsSys;
import erp.data.SDataUtilities;
import erp.data.SProcConstants;
import erp.lib.SLibConstants;
import erp.lib.SLibUtilities;
import erp.lib.form.SFormComponentItem;
import erp.lib.form.SFormField;
import erp.lib.form.SFormUtilities;
import erp.lib.form.SFormValidation;
import erp.mmfg.data.SDataProductionOrder;
import erp.mtrn.data.SDataRawMaterialsConsume;
import erp.mtrn.data.STrnStockSegregationUtils;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Vector;
import javax.swing.AbstractAction;

/**
 *
 * @author  Néstor Ávalos, Edwin Carmona
 */
public class SDialogMfgChangeState extends javax.swing.JDialog implements erp.lib.form.SFormInterface, java.awt.event.ActionListener {

    private int mnFormType;
    private int mnFormResult;
    private int mnFormStatus;
    private boolean mbFirstTime;
    private boolean mbResetingForm;
    private java.util.Vector<erp.lib.form.SFormField> mvFields;
    private erp.client.SClientInterface miClient;

    private erp.lib.form.SFormField moFieldDate;
    private erp.lib.form.SFormField moFieldFkTurnLotId;

    private boolean mbNextState;
    private int[] manKeyProductionOrder;
    private int mnFkStatusId;

    private java.util.Vector<erp.mmfg.data.SDataProductionOrder> mvProductionOrders;

    private erp.mmfg.data.SDataProductionOrder moProductionOrder;

    /** Creates new form DFormCompany */
    public SDialogMfgChangeState(erp.client.SClientInterface client) {
        super(client.getFrame(), true);
        miClient = client;
        mnFormType = SDataConstants.MFG_ORD;

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

        bgCurrency = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jpData = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jlDateStart = new javax.swing.JLabel();
        jtfDateStart = new javax.swing.JFormattedTextField();
        jlDummy = new javax.swing.JLabel();
        jbDate = new javax.swing.JButton();
        jPanel32 = new javax.swing.JPanel();
        jlFkTurnId = new javax.swing.JLabel();
        jcbFkTurnId = new javax.swing.JComboBox<SFormComponentItem>();
        jPanel33 = new javax.swing.JPanel();
        jckExplotion = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jbOk = new javax.swing.JButton();
        jbCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cambio de estado"); // NOI18N
        setModal(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jpData.setLayout(new java.awt.BorderLayout());

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Período:"));
        jPanel8.setLayout(new java.awt.GridLayout(5, 1, 0, 1));

        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        jlDateStart.setText("Fecha: *");
        jlDateStart.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel4.add(jlDateStart);

        jtfDateStart.setText("dd/mm/yyyy");
        jtfDateStart.setPreferredSize(new java.awt.Dimension(120, 23));
        jPanel4.add(jtfDateStart);

        jlDummy.setPreferredSize(new java.awt.Dimension(1, 23));
        jPanel4.add(jlDummy);

        jbDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/erp/img/cal_cal.gif"))); // NOI18N
        jbDate.setToolTipText("Seleccionar fecha");
        jbDate.setFocusable(false);
        jbDate.setPreferredSize(new java.awt.Dimension(23, 23));
        jPanel4.add(jbDate);

        jPanel8.add(jPanel4);

        jPanel32.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        jlFkTurnId.setText("Turno: *");
        jlFkTurnId.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel32.add(jlFkTurnId);

        jcbFkTurnId.setPreferredSize(new java.awt.Dimension(120, 23));
        jPanel32.add(jcbFkTurnId);

        jPanel8.add(jPanel32);

        jPanel33.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        jckExplotion.setText("Pasar las órdenes de producción de la explosión de materiales al estado anterior/siguiente");
        jPanel33.add(jckExplotion);

        jPanel8.add(jPanel33);

        jpData.add(jPanel8, java.awt.BorderLayout.CENTER);

        getContentPane().add(jpData, java.awt.BorderLayout.CENTER);

        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jbOk.setText("Aceptar");
        jbOk.setToolTipText("[Ctrl + Enter]");
        jbOk.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel2.add(jbOk);

        jbCancel.setText("Cerrar"); // NOI18N
        jbCancel.setToolTipText("[Escape]");
        jbCancel.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel2.add(jbCancel);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-477)/2, (screenSize.height-232)/2, 477, 232);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        windowActivated();
    }//GEN-LAST:event_formWindowActivated

    private void initComponentsExtra() {
        mvFields = new Vector<SFormField>();

        moFieldDate = new erp.lib.form.SFormField(miClient, SLibConstants.DATA_TYPE_DATE, true, jtfDateStart, jlDateStart);
        moFieldDate.setPickerButton(jbDate);
        moFieldFkTurnLotId = new erp.lib.form.SFormField(miClient, SLibConstants.DATA_TYPE_KEY, true, jcbFkTurnId, jlFkTurnId);

        mvFields.add(moFieldDate);
        mvFields.add(moFieldFkTurnLotId);

        jbCancel.addActionListener(this);
        jbOk.addActionListener(this);
        jbDate.addActionListener(this);

        mvProductionOrders = new Vector<SDataProductionOrder>();

        AbstractAction actionOk = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) { actionOk(); }
        };

        SFormUtilities.putActionMap(getRootPane(), actionOk, "ok", KeyEvent.VK_ENTER, KeyEvent.CTRL_DOWN_MASK);

        AbstractAction actionCancel = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) { actionCancel(); }
        };

        SFormUtilities.putActionMap(getRootPane(), actionCancel, "cancel", KeyEvent.VK_ESCAPE, 0);
    }

    private void windowActivated() {
        if (mbFirstTime) {
            mbFirstTime = false;
            jtfDateStart.requestFocus();
        }
    }

    private void actionDate() {
        miClient.getGuiDatePickerXXX().pickDate(moFieldDate.getDate(), moFieldDate);
    }

    private erp.mmfg.data.SDataProductionOrder changeStatus(erp.mmfg.data.SDataProductionOrder oProductionOrder) {
        Vector<Object> vParams = new Vector<Object>();

        if (oProductionOrder != null) {
            if (!SDataUtilities.isPeriodOpen(miClient, miClient.getSessionXXX().getSystemDate())) {
                miClient.showMsgBoxInformation(SLibConstants.MSG_ERR_GUI_PER_CLOSE + "\nFecha: " + miClient.getSessionXXX().getFormatters().getDateFormat().format(miClient.getSessionXXX().getSystemDate()) + ".");
            }
            else {
                switch (mnFkStatusId) {
                    case SDataConstantsSys.MFGS_ST_ORD_NEW:
                        if (mbNextState) {
                            oProductionOrder.setDateLot_n(moFieldDate.getDate());
                            if (oProductionOrder.getFkOrdTypeId() != SDataConstantsSys.MFGU_TP_ORD_CONTINUE) {

                                // Validate if production order has explotion:

                                if (!oProductionOrder.getDbmsIsExploded()) {
                                    miClient.showMsgBoxWarning("La orden de producción '" + oProductionOrder.getDbmsNumber() + " - " + oProductionOrder.getReference() + "', aún no es explosionada.");
                                    oProductionOrder = null;
                                }
                            }
                        }

                        break;

                    case SDataConstantsSys.MFGS_ST_ORD_LOT:
                        if (mbNextState) {

                            // Validate if production order has capture lots:

                            /*
                            try {
                                sMsg = SDataUtilities.validateProductionOrderLots(miClient, oProductionOrder.getPkYearId(), oProductionOrder.getPkOrdId());

                                if (sMsg.length() > 0) {
                                    miClient.showMsgBoxWarning("En la orden de producción '" + oProductionOrder.getDbmsNumber() + " - " + oProductionOrder.getReference() + "', \n faltan de capturar lote(s) en " + sMsg + ".");
                                    oProductionOrder = null;
                                }
                                else {
                                    oProductionOrder.setDateLotAssigned_n(moFieldDate.getDate());
                                    oProductionOrder.setFkTurnLotAssignedId(moFieldFkTurnLotId.getKeyAsIntArray()[0]);
                                    oProductionOrder.setTsLotAssigned_n(miClient.getSessionXXX().getSystemDate());
                                    oProductionOrder.setFkUserLotAssignedId(miClient.getSession().getUser().getPkUserId());
                                    oProductionOrder.setFkOrdStatusId(SDataConstantsSys.MFGS_ST_ORD_LOT_ASIG);
                                }
                            }
                            catch(Exception e) {
                                SLibUtilities.printOutException(this, e);
                            }
                             */
                        }

                        break;
                }

                if (oProductionOrder != null) {
                    vParams.removeAllElements();
                    vParams.add(oProductionOrder.getPkYearId());
                    vParams.add(oProductionOrder.getPkOrdId());
                    vParams.add(mnFkStatusId);
                    vParams.add(oProductionOrder.getFkOrdTypeId());
                    vParams.add(mnFkStatusId != SDataConstantsSys.MFGS_ST_ORD_NEW ? moFieldFkTurnLotId.getKeyAsIntArray()[0] : SDataConstantsSys.MFGU_TURN_NA);
                    vParams.add(mbNextState);
                    vParams.add(moFieldDate.getDate());
                    vParams.add(miClient.getSessionXXX().getSystemDate());
                    vParams.add(miClient.getSession().getUser().getPkUserId());
                    vParams = SDataUtilities.callProcedure(miClient, SProcConstants.MFG_ORD_UPD, vParams, SLibConstants.EXEC_MODE_SILENT);

                    // Consume raw material if production order state is close:

                    oProductionOrder = (SDataProductionOrder) SDataUtilities.readRegistry(miClient, SDataConstants.MFG_ORD, new int[] { oProductionOrder.getPkYearId(), oProductionOrder.getPkOrdId() }, SLibConstants.EXEC_MODE_VERBOSE);
                    if (oProductionOrder.getFkOrdStatusId() == SDataConstantsSys.MFGS_ST_ORD_CLS || oProductionOrder.getFkOrdStatusId() == SDataConstantsSys.MFGS_ST_ORD_FIN) {
                        rmConsume(new int[] { oProductionOrder.getPkYearId(), oProductionOrder.getPkOrdId() });
                        
                        if (oProductionOrder.getFkOrdStatusId() == SDataConstantsSys.MFGS_ST_ORD_CLS) {
                            STrnStockSegregationUtils.releaseSegregation(miClient, new int [] { oProductionOrder.getPkYearId(), oProductionOrder.getPkOrdId() }, SDataConstantsSys.TRNS_TP_STK_SEG_MFG_ORD);
                        }
                    }
                }
            }
        }

        return oProductionOrder;
    }

    private java.lang.String obtainProductionOrders() {
        int i=0;
        String sMsg = "";
        SDataProductionOrder oProductionOrder = null;
        SDataProductionOrder oProductionOrderAux = null;

        oProductionOrder = (SDataProductionOrder) SDataUtilities.readRegistry(miClient, SDataConstants.MFG_ORD, manKeyProductionOrder, SLibConstants.EXEC_MODE_VERBOSE);
        if (jckExplotion.isSelected()) {
            for (i=0; i<oProductionOrder.getDbmsExplotionMaterials().getDbmsProductionsOrders().size(); i++) {
                oProductionOrderAux = (SDataProductionOrder) SDataUtilities.readRegistry(miClient, SDataConstants.MFG_ORD,
                        oProductionOrder.getDbmsExplotionMaterials().getDbmsProductionsOrders().get(i).getPrimaryKey(), SLibConstants.EXEC_MODE_VERBOSE);

                // Check if status is the same in all production orders:

                if (oProductionOrder.getFkOrdStatusId() != oProductionOrderAux.getFkOrdStatusId()) {
                    sMsg = "No se pueden pasar las órdenes de producción al estado anterior/siguiente, por que no están en el mismo estado.";
                    mvProductionOrders.removeAllElements();
                    break;
                }
                else {
                    mvProductionOrders.add(oProductionOrderAux);
                }
            }

            // Change status:

            for (i=0; i<mvProductionOrders.size(); i++) {
                mvProductionOrders.set(i, changeStatus(mvProductionOrders.get(i)));
            }
        }
        else {
            oProductionOrder = changeStatus(oProductionOrder);
            mvProductionOrders.add(oProductionOrder);
        }

        return sMsg;
    }

    private void rmConsume(int[] key) {
            SDataRawMaterialsConsume rawMaterialsConsume = null;

            try {
                rawMaterialsConsume = new SDataRawMaterialsConsume();
                rawMaterialsConsume.setPkYearId(key[0]);
                rawMaterialsConsume.setPkOrderId(key[1]);
                rawMaterialsConsume.setDate(miClient.getSessionXXX().getWorkingDate());
                rawMaterialsConsume.setFkUserNewId(miClient.getSession().getUser().getPkUserId());
                SDataUtilities.saveRegistry(miClient, rawMaterialsConsume);

                miClient.getGuiModule(SDataConstants.MOD_INV).refreshCatalogues(SDataConstants.TRN_DIOG);
            }
            catch (Exception e) {
                SLibUtilities.renderException(this, e);
            }
    }

    private void actionEdit(boolean edit) {

    }

    private void actionOk() {
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

    private void actionCancel() {
        mnFormResult = SLibConstants.FORM_RESULT_CANCEL;
        setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgCurrency;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JButton jbCancel;
    private javax.swing.JButton jbDate;
    private javax.swing.JButton jbOk;
    private javax.swing.JComboBox<SFormComponentItem> jcbFkTurnId;
    private javax.swing.JCheckBox jckExplotion;
    private javax.swing.JLabel jlDateStart;
    private javax.swing.JLabel jlDummy;
    private javax.swing.JLabel jlFkTurnId;
    private javax.swing.JPanel jpData;
    private javax.swing.JFormattedTextField jtfDateStart;
    // End of variables declaration//GEN-END:variables

    public java.util.Vector<erp.mmfg.data.SDataProductionOrder> getProductionOrders() { return mvProductionOrders; }

    @Override
    public void formClearRegistry() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void formReset() {
        mnFormResult = SLibConstants.UNDEFINED;
        mnFormStatus = SLibConstants.UNDEFINED;
        mbFirstTime = true;

        for (int i = 0; i < mvFields.size(); i++) {
            ((erp.lib.form.SFormField) mvFields.get(i)).resetField();
        }

        manKeyProductionOrder = null;
        mnFkStatusId = 0;
        mbNextState = true;

        jcbFkTurnId.setEnabled(true);
        jckExplotion.setEnabled(true);
        jckExplotion.setSelected(false);
        moFieldDate.setDate(miClient.getSessionXXX().getWorkingDate());
    }

    @Override
    public void formRefreshCatalogues() {
        SFormUtilities.populateComboBox(miClient, jcbFkTurnId, SDataConstants.MFGU_TURN);
    }

    @Override
    public erp.lib.form.SFormValidation formValidate() {
        String sMsg = "";
        SFormValidation validation = new SFormValidation();

        for (int i = 0; i < mvFields.size(); i++) {
            if (!((erp.lib.form.SFormField) mvFields.get(i)).validateField()) {
                validation.setIsError(true);
                validation.setComponent(((erp.lib.form.SFormField) mvFields.get(i)).getComponent());
                break;
            }
        }

        if (!validation.getIsError()) {
            sMsg = obtainProductionOrders();

            if (sMsg.length() > 0) {
                validation.setMessage(sMsg);
                validation.setComponent(moFieldDate.getComponent());
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
        switch (type) {
            case 1:
                manKeyProductionOrder = (int[]) value;
                moProductionOrder = (SDataProductionOrder) SDataUtilities.readRegistry(miClient, SDataConstants.MFG_ORD, manKeyProductionOrder, SLibConstants.EXEC_MODE_VERBOSE);

                // Check if production order has more than one production order in the explotion materials:

                if (moProductionOrder.getDbmsExplotionMaterials() != null && moProductionOrder.getDbmsExplotionMaterials().getDbmsProductionsOrders().size()>1) {
                    jckExplotion.setEnabled(true);
                }
                else {
                    jckExplotion.setEnabled(false);
                }
                break;

            case 2:
                mnFkStatusId = (Integer) value;
                if (mnFkStatusId == SDataConstantsSys.MFGS_ST_ORD_NEW) {
                    jcbFkTurnId.setEnabled(false);
                }
                break;

            case 3:
                mbNextState = (Boolean) value;
                break;
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
        if (e.getSource() instanceof javax.swing.JButton) {
            javax.swing.JButton button = (javax.swing.JButton) e.getSource();

            if (button == jbOk) {
                actionOk();
            }
            else if (button == jbCancel) {
                actionCancel();
            }
            else if (button == jbDate) {
                actionDate();
            }
        }
    }

}
