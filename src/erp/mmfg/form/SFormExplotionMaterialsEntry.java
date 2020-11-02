/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 *
 * Created on 10/11/2009
 */

package erp.mmfg.form;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Vector;
import javax.swing.AbstractAction;

import erp.data.SDataConstants;
import erp.lib.form.SFormComponentItem;
import erp.lib.form.SFormField;
import erp.lib.form.SFormUtilities;
import erp.lib.form.SFormValidation;
import erp.lib.table.STableColumn;
import erp.lib.SLibConstants;
import erp.mmfg.data.SDataExplotionMaterialsEntry;

/**
 *
 * @author Néstor Ávalos
 */
public class SFormExplotionMaterialsEntry extends javax.swing.JDialog implements erp.lib.form.SFormInterface, java.awt.event.ActionListener {

    private int mnFormType;
    private int mnFormResult;
    private int mnFormStatus;
    private boolean mbFirstTime;
    private boolean mbResetingForm;
    private java.util.Vector<erp.lib.form.SFormField> mvFields;
    private erp.client.SClientInterface miClient;

    private erp.mmfg.data.SDataExplotionMaterialsEntry moExplotionMaterialsEntry;
    private erp.lib.form.SFormField moFieldDbmsItem;
    private erp.lib.form.SFormField moFieldFkBizPartnerId_n;
    private erp.lib.form.SFormField moFieldGrossRequirement;
    private erp.lib.form.SFormField moFieldSafetyStock;
    private erp.lib.form.SFormField moFieldAvailable;
    private erp.lib.form.SFormField moFieldBackorder;
    private erp.lib.form.SFormField moFieldNet;
    private erp.lib.form.SFormField moFieldDateLeadtime;
    private erp.lib.form.SFormField moFieldDateDelivery;

    /** Creates new form SFormElement */
    public SFormExplotionMaterialsEntry(erp.client.SClientInterface client) {
        super(client.getFrame(), true);
        miClient =  client;
        mnFormType = SDataConstants.MFG_EXP_ETY;

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

        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jlDbmsItem = new javax.swing.JLabel();
        jtfDbmsItem = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jlFkBizPartnerId_n = new javax.swing.JLabel();
        jcbFkBizPartnerId_n = new javax.swing.JComboBox<SFormComponentItem>();
        jLabel1 = new javax.swing.JLabel();
        jbFkBizPartnerId_n = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jlGrossRequirement = new javax.swing.JLabel();
        jtfGrossRequirement = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jlUnitGrossRequirement = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jlSafetyStock = new javax.swing.JLabel();
        jtfSafetyStock = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jlUnitStockSafety = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jlAvailable = new javax.swing.JLabel();
        jtfAvailable = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jlUnitAvailable = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jlBackorder = new javax.swing.JLabel();
        jtfBackorder = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jlUnitBackorder = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jlNetRequirement = new javax.swing.JLabel();
        jtfNetRequirement = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jlUnitNetRequirement = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jlDateLeadtime = new javax.swing.JLabel();
        jtfDateLeadtime = new javax.swing.JFormattedTextField();
        jPanel11 = new javax.swing.JPanel();
        jlDateDelivery = new javax.swing.JLabel();
        jtfDateDelivery = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jbOK = new javax.swing.JButton();
        jbCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Explosión de materiales");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del registro:"));
        jPanel2.setLayout(new java.awt.GridLayout(9, 1));

        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        jlDbmsItem.setText("Insumo:");
        jlDbmsItem.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel6.add(jlDbmsItem);

        jtfDbmsItem.setEditable(false);
        jtfDbmsItem.setText("ÍTEM");
        jtfDbmsItem.setPreferredSize(new java.awt.Dimension(400, 23));
        jPanel6.add(jtfDbmsItem);

        jPanel2.add(jPanel6);

        jPanel7.setPreferredSize(new java.awt.Dimension(525, 23));
        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        jlFkBizPartnerId_n.setText("Proveedor:");
        jlFkBizPartnerId_n.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel7.add(jlFkBizPartnerId_n);

        jcbFkBizPartnerId_n.setPreferredSize(new java.awt.Dimension(400, 23));
        jPanel7.add(jcbFkBizPartnerId_n);

        jLabel1.setPreferredSize(new java.awt.Dimension(2, 23));
        jPanel7.add(jLabel1);

        jbFkBizPartnerId_n.setText("jButton1");
        jbFkBizPartnerId_n.setToolTipText("Seleccionar proveedor");
        jbFkBizPartnerId_n.setFocusable(false);
        jbFkBizPartnerId_n.setPreferredSize(new java.awt.Dimension(23, 23));
        jPanel7.add(jbFkBizPartnerId_n);

        jPanel2.add(jPanel7);

        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        jlGrossRequirement.setText("Necesidades brutas:");
        jlGrossRequirement.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel3.add(jlGrossRequirement);

        jtfGrossRequirement.setEditable(false);
        jtfGrossRequirement.setText("GROSS REQUIREMENT");
        jtfGrossRequirement.setFocusable(false);
        jtfGrossRequirement.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel3.add(jtfGrossRequirement);

        jLabel3.setPreferredSize(new java.awt.Dimension(2, 23));
        jPanel3.add(jLabel3);

        jlUnitGrossRequirement.setFocusable(false);
        jlUnitGrossRequirement.setPreferredSize(new java.awt.Dimension(30, 23));
        jPanel3.add(jlUnitGrossRequirement);

        jPanel2.add(jPanel3);

        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        jlSafetyStock.setText("Stock de seguridad:");
        jlSafetyStock.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel4.add(jlSafetyStock);

        jtfSafetyStock.setEditable(false);
        jtfSafetyStock.setText("STROCK SAFETY");
        jtfSafetyStock.setFocusable(false);
        jtfSafetyStock.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel4.add(jtfSafetyStock);

        jLabel6.setPreferredSize(new java.awt.Dimension(2, 23));
        jPanel4.add(jLabel6);

        jlUnitStockSafety.setFocusable(false);
        jlUnitStockSafety.setPreferredSize(new java.awt.Dimension(30, 23));
        jPanel4.add(jlUnitStockSafety);

        jPanel2.add(jPanel4);

        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        jlAvailable.setText("Disponible:");
        jlAvailable.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel5.add(jlAvailable);

        jtfAvailable.setEditable(false);
        jtfAvailable.setText("AVAILABLE");
        jtfAvailable.setFocusable(false);
        jtfAvailable.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel5.add(jtfAvailable);

        jLabel9.setPreferredSize(new java.awt.Dimension(2, 23));
        jPanel5.add(jLabel9);

        jlUnitAvailable.setFocusable(false);
        jlUnitAvailable.setPreferredSize(new java.awt.Dimension(30, 23));
        jPanel5.add(jlUnitAvailable);

        jPanel2.add(jPanel5);

        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        jlBackorder.setText("Backorder:");
        jlBackorder.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel8.add(jlBackorder);

        jtfBackorder.setEditable(false);
        jtfBackorder.setText("BACKORDER");
        jtfBackorder.setFocusable(false);
        jtfBackorder.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel8.add(jtfBackorder);

        jLabel12.setPreferredSize(new java.awt.Dimension(2, 23));
        jPanel8.add(jLabel12);

        jlUnitBackorder.setFocusable(false);
        jlUnitBackorder.setPreferredSize(new java.awt.Dimension(30, 23));
        jPanel8.add(jlUnitBackorder);

        jPanel2.add(jPanel8);

        jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        jlNetRequirement.setText("Necesidades netas:");
        jlNetRequirement.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel9.add(jlNetRequirement);

        jtfNetRequirement.setText("NET REQUIREMENT");
        jtfNetRequirement.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel9.add(jtfNetRequirement);

        jLabel15.setPreferredSize(new java.awt.Dimension(2, 23));
        jPanel9.add(jLabel15);

        jlUnitNetRequirement.setFocusable(false);
        jlUnitNetRequirement.setPreferredSize(new java.awt.Dimension(30, 23));
        jPanel9.add(jlUnitNetRequirement);

        jPanel2.add(jPanel9);

        jPanel10.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        jlDateLeadtime.setText("Fecha leadtime:");
        jlDateLeadtime.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel10.add(jlDateLeadtime);

        jtfDateLeadtime.setEditable(false);
        jtfDateLeadtime.setText("DATE LEADTIME");
        jtfDateLeadtime.setFocusable(false);
        jtfDateLeadtime.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel10.add(jtfDateLeadtime);

        jPanel2.add(jPanel10);

        jPanel11.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        jlDateDelivery.setText("Fecha entrega:");
        jlDateDelivery.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel11.add(jlDateDelivery);

        jtfDateDelivery.setEditable(false);
        jtfDateDelivery.setText("DATE DELIVERY");
        jtfDateDelivery.setFocusable(false);
        jtfDateDelivery.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel11.add(jtfDateDelivery);

        jPanel2.add(jPanel11);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 33));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jbOK.setText("Aceptar");
        jbOK.setToolTipText("[Ctrl + Enter]");
        jbOK.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel1.add(jbOK);

        jbCancel.setText("Cancelar");
        jbCancel.setToolTipText("[Escape]");
        jPanel1.add(jbCancel);

        getContentPane().add(jPanel1, java.awt.BorderLayout.SOUTH);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-556)/2, (screenSize.height-303)/2, 556, 303);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        windowActivated();
    }//GEN-LAST:event_formWindowActivated

    private void initComponentsExtra() {
        int i;
        STableColumn tableColumns[];

        mvFields = new Vector<SFormField>();
        moFieldDbmsItem = new SFormField(miClient, SLibConstants.DATA_TYPE_STRING, true, jtfDbmsItem, jlDbmsItem);
        moFieldFkBizPartnerId_n = new SFormField(miClient, SLibConstants.DATA_TYPE_KEY, false, jcbFkBizPartnerId_n, jlFkBizPartnerId_n);
        moFieldGrossRequirement = new SFormField(miClient, SLibConstants.DATA_TYPE_DOUBLE, false, jtfGrossRequirement, jlGrossRequirement);
        moFieldGrossRequirement.setDecimalFormat(miClient.getSessionXXX().getFormatters().getDecimalsValueUnitaryFormat());
        moFieldSafetyStock = new SFormField(miClient, SLibConstants.DATA_TYPE_DOUBLE, false, jtfSafetyStock, jlSafetyStock);
        moFieldSafetyStock.setDecimalFormat(miClient.getSessionXXX().getFormatters().getDecimalsQuantityFormat());
        moFieldAvailable = new SFormField(miClient, SLibConstants.DATA_TYPE_DOUBLE, false, jtfAvailable, jlAvailable);
        moFieldAvailable.setDecimalFormat(miClient.getSessionXXX().getFormatters().getDecimalsQuantityFormat());
        moFieldBackorder = new SFormField(miClient, SLibConstants.DATA_TYPE_DOUBLE, false, jtfBackorder, jlBackorder);
        moFieldBackorder.setDecimalFormat(miClient.getSessionXXX().getFormatters().getDecimalsQuantityFormat());
        moFieldNet = new SFormField(miClient, SLibConstants.DATA_TYPE_DOUBLE, false, jtfNetRequirement, jlNetRequirement);
        moFieldNet.setDecimalFormat(miClient.getSessionXXX().getFormatters().getDecimalsQuantityFormat());
        moFieldDateLeadtime = new SFormField(miClient, SLibConstants.DATA_TYPE_DATE, false, jtfDateLeadtime, jlDateLeadtime);
        moFieldDateDelivery = new SFormField(miClient, SLibConstants.DATA_TYPE_DATE, false, jtfDateDelivery, jlDateDelivery);

        mvFields.add(moFieldDbmsItem);
        mvFields.add(moFieldFkBizPartnerId_n);
        mvFields.add(moFieldGrossRequirement);
        mvFields.add(moFieldSafetyStock);
        mvFields.add(moFieldAvailable);
        mvFields.add(moFieldBackorder);
        mvFields.add(moFieldNet);
        mvFields.add(moFieldDateLeadtime);
        mvFields.add(moFieldDateDelivery);

        jbOK.addActionListener(this);
        jbCancel.addActionListener(this);
        jbFkBizPartnerId_n.addActionListener(this);

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
            jcbFkBizPartnerId_n.requestFocus();
        }
    }

    private void actionFkBizPartnerId_n() {
        miClient.pickOption(SDataConstants.BPSX_BP_SUP, moFieldFkBizPartnerId_n, moFieldFkBizPartnerId_n.getKey());
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton jbCancel;
    private javax.swing.JButton jbFkBizPartnerId_n;
    private javax.swing.JButton jbOK;
    private javax.swing.JComboBox<SFormComponentItem> jcbFkBizPartnerId_n;
    private javax.swing.JLabel jlAvailable;
    private javax.swing.JLabel jlBackorder;
    private javax.swing.JLabel jlDateDelivery;
    private javax.swing.JLabel jlDateLeadtime;
    private javax.swing.JLabel jlDbmsItem;
    private javax.swing.JLabel jlFkBizPartnerId_n;
    private javax.swing.JLabel jlGrossRequirement;
    private javax.swing.JLabel jlNetRequirement;
    private javax.swing.JLabel jlSafetyStock;
    private javax.swing.JLabel jlUnitAvailable;
    private javax.swing.JLabel jlUnitBackorder;
    private javax.swing.JLabel jlUnitGrossRequirement;
    private javax.swing.JLabel jlUnitNetRequirement;
    private javax.swing.JLabel jlUnitStockSafety;
    private javax.swing.JTextField jtfAvailable;
    private javax.swing.JTextField jtfBackorder;
    private javax.swing.JFormattedTextField jtfDateDelivery;
    private javax.swing.JFormattedTextField jtfDateLeadtime;
    private javax.swing.JTextField jtfDbmsItem;
    private javax.swing.JTextField jtfGrossRequirement;
    private javax.swing.JTextField jtfNetRequirement;
    private javax.swing.JTextField jtfSafetyStock;
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
        moExplotionMaterialsEntry = null;

        for (int i = 0; i < mvFields.size(); i++) {
            ((erp.lib.form.SFormField) mvFields.get(i)).resetField();
        }
    }

    @Override
    public void formRefreshCatalogues() {
        SFormUtilities.populateComboBox(miClient, jcbFkBizPartnerId_n, SDataConstants.BPSX_BP_SUP);
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
        moExplotionMaterialsEntry = (SDataExplotionMaterialsEntry) registry;

        moFieldDbmsItem.setString(moExplotionMaterialsEntry.getDbmsItem());
        moFieldFkBizPartnerId_n.setKey(new int[] { moExplotionMaterialsEntry.getFkBizPartnerId_n() });
        moFieldGrossRequirement.setDouble(moExplotionMaterialsEntry.getGrossReq());
        moFieldSafetyStock.setDouble(moExplotionMaterialsEntry.getSafetyStock());
        moFieldAvailable.setDouble(moExplotionMaterialsEntry.getAvailable());
        moFieldBackorder.setDouble(moExplotionMaterialsEntry.getBackorder());
        moFieldNet.setDouble(moExplotionMaterialsEntry.getNet());
        moFieldDateLeadtime.setDate(moExplotionMaterialsEntry.getLtimeTs());
        moFieldDateDelivery.setDate(moExplotionMaterialsEntry.getDeliveryTs());

        jlUnitGrossRequirement.setText(moExplotionMaterialsEntry.getDbmsItemUnitSymbol());
        jlUnitStockSafety.setText(moExplotionMaterialsEntry.getDbmsItemUnitSymbol());
        jlUnitAvailable.setText(moExplotionMaterialsEntry.getDbmsItemUnitSymbol());
        jlUnitBackorder.setText(moExplotionMaterialsEntry.getDbmsItemUnitSymbol());
        jlUnitNetRequirement.setText(moExplotionMaterialsEntry.getDbmsItemUnitSymbol());
    }

    @Override
    public erp.lib.data.SDataRegistry getRegistry() {
        if (moExplotionMaterialsEntry == null) {
            moExplotionMaterialsEntry = new SDataExplotionMaterialsEntry();
        }

        moExplotionMaterialsEntry.setFkBizPartnerId_n(moFieldFkBizPartnerId_n.getKeyAsIntArray()[0]);
        moExplotionMaterialsEntry.setGrossReq(moFieldGrossRequirement.getDouble());
        moExplotionMaterialsEntry.setSafetyStock(moFieldSafetyStock.getDouble());
        moExplotionMaterialsEntry.setAvailable(moFieldAvailable.getDouble());
        moExplotionMaterialsEntry.setBackorder(moFieldBackorder.getDouble());
        moExplotionMaterialsEntry.setNet(moFieldNet.getDouble());
        moExplotionMaterialsEntry.setDeliveryTs(moFieldDateDelivery.getDate());
        moExplotionMaterialsEntry.setLtimeTs_n(moFieldDateLeadtime.getDate());

        moExplotionMaterialsEntry.setDbmsBizPartner(moFieldFkBizPartnerId_n.getKeyAsIntArray()[0] > 0 ? jcbFkBizPartnerId_n.getSelectedItem().toString() : "");

        return moExplotionMaterialsEntry;
    }

    @Override
    public void setValue(int type, Object value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object getValue(int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public javax.swing.JLabel getTimeoutLabel() {
        return null;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof javax.swing.JButton) {
            javax.swing.JButton button = (javax.swing.JButton) e.getSource();

            if (button == jbOK) {
                actionOk();
            }
            else if (button == jbCancel) {
                actionCancel();
            }
            else if (button == jbFkBizPartnerId_n) {
                actionFkBizPartnerId_n();
            }
        }
    }
}
