/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.mod.hrs.form;

import erp.mod.SModConsts;
import java.awt.BorderLayout;
import sa.gui.util.SUtilConsts;
import sa.lib.SLibConsts;
import sa.lib.db.SDbRegistry;
import sa.lib.gui.SGuiClient;
import sa.lib.gui.SGuiConsts;
import sa.lib.gui.SGuiUtils;
import sa.lib.gui.SGuiValidation;
import sa.lib.gui.bean.SBeanFormDialog;

/**
 *
 * @author Juan Barajas, Claudio Peña, Sergio Flores
 */
public class SDialogPrintOrderPayroll extends SBeanFormDialog {

    private int mnOrderByType;
    private int[] payrollKeyNum;
    private SPanelHrsDepartmentsWithReceipts moPanelHrsDepartmentsWithReceipts;
    
    /**
     * Creates new form SDialogPrintOrderPayroll
     * @param client
     * @param payrollKey
     * @param title
     */

    public SDialogPrintOrderPayroll(SGuiClient client, final int[] payrollKey, String title) throws Exception {
        setFormSettings(client, SGuiConsts.BEAN_FORM_EDIT, SModConsts.HRS_EMP_LOG_HIRE, SLibConsts.UNDEFINED, title);
        payrollKeyNum = payrollKey;
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

        moRadGroupOrder = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jlNumCopies = new javax.swing.JLabel();
        moIntNumCopies = new sa.lib.gui.bean.SBeanFieldInteger();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        moRadOrderByNumber = new sa.lib.gui.bean.SBeanFieldRadio();
        jPanel12 = new javax.swing.JPanel();
        moRadOrderByEmployee = new sa.lib.gui.bean.SBeanFieldRadio();
        jPanel13 = new javax.swing.JPanel();
        moRadOrderByDepartament = new sa.lib.gui.bean.SBeanFieldRadio();
        jpDepartments = new javax.swing.JPanel();

        setTitle("Ordenamiento para impresión de nóminas");

        jPanel1.setLayout(new java.awt.BorderLayout(0, 5));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Parámetros de impresión:"));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel4.setLayout(new java.awt.GridLayout(1, 1));

        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlNumCopies.setText("Número copias:*");
        jlNumCopies.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel5.add(jlNumCopies);

        moIntNumCopies.setPreferredSize(new java.awt.Dimension(50, 23));
        jPanel5.add(moIntNumCopies);

        jPanel4.add(jPanel5);

        jPanel3.add(jPanel4, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel3, java.awt.BorderLayout.NORTH);

        jPanel6.setLayout(new java.awt.BorderLayout(0, 5));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Ordenamiento:"));
        jPanel2.setLayout(new java.awt.GridLayout(3, 1, 0, 5));

        jPanel11.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        moRadGroupOrder.add(moRadOrderByNumber);
        moRadOrderByNumber.setText("Por folio del recibo de nómina");
        moRadOrderByNumber.setPreferredSize(new java.awt.Dimension(200, 23));
        jPanel11.add(moRadOrderByNumber);

        jPanel2.add(jPanel11);

        jPanel12.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        moRadGroupOrder.add(moRadOrderByEmployee);
        moRadOrderByEmployee.setText("Por nombre del empleado");
        moRadOrderByEmployee.setPreferredSize(new java.awt.Dimension(200, 23));
        jPanel12.add(moRadOrderByEmployee);

        jPanel2.add(jPanel12);

        jPanel13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        moRadGroupOrder.add(moRadOrderByDepartament);
        moRadOrderByDepartament.setText("Por código del departamento");
        moRadOrderByDepartament.setPreferredSize(new java.awt.Dimension(200, 23));
        jPanel13.add(moRadOrderByDepartament);

        jPanel2.add(jPanel13);

        jPanel6.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jpDepartments.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccionar departamentos:"));
        jpDepartments.setLayout(new java.awt.GridLayout(0, 1));
        jPanel6.add(jpDepartments, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel6, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel jlNumCopies;
    private javax.swing.JPanel jpDepartments;
    private sa.lib.gui.bean.SBeanFieldInteger moIntNumCopies;
    private javax.swing.ButtonGroup moRadGroupOrder;
    private sa.lib.gui.bean.SBeanFieldRadio moRadOrderByDepartament;
    private sa.lib.gui.bean.SBeanFieldRadio moRadOrderByEmployee;
    private sa.lib.gui.bean.SBeanFieldRadio moRadOrderByNumber;
    // End of variables declaration//GEN-END:variables

    private void initComponentsCustom() throws Exception {
        SGuiUtils.setWindowBounds(this, 640, 400);
        
        moPanelHrsDepartmentsWithReceipts = new SPanelHrsDepartmentsWithReceipts(miClient, payrollKeyNum);

        jbSave.setText("Aceptar");
        
        moIntNumCopies.setIntegerSettings(SGuiUtils.getLabelName(jlNumCopies), SGuiConsts.GUI_TYPE_INT, true);
        moRadOrderByNumber.setBooleanSettings(SGuiUtils.getLabelName(moRadOrderByNumber.getText()), true);
        moRadOrderByEmployee.setBooleanSettings(SGuiUtils.getLabelName(moRadOrderByEmployee.getText()), false);
        moRadOrderByDepartament.setBooleanSettings(SGuiUtils.getLabelName(moRadOrderByDepartament.getText()), false);
        
        jpDepartments.add(moPanelHrsDepartmentsWithReceipts, BorderLayout.CENTER);

        moFields.addField(moIntNumCopies);
        moFields.addField(moRadOrderByNumber);
        moFields.addField(moRadOrderByEmployee);
        moFields.addField(moRadOrderByDepartament);

        moFields.setFormButton(jbSave);
        
        mnOrderByType = SLibConsts.UNDEFINED;
        moRadOrderByNumber.setSelected(true);

        reloadCatalogues();
        addAllListeners();
    }

    @Override
    public void reloadCatalogues() {
        
    }

    @Override
    public SGuiValidation validateForm() {
      SGuiValidation validation = moFields.validateFields();
      
        if (validation.isValid()) {
            if (validation.isValid()) {
                validation = moPanelHrsDepartmentsWithReceipts.validatePanel();
            }
        }

        return validation;
    }

    @Override
    public void addAllListeners() {
    }

    @Override
    public void removeAllListeners() {
    }

    @Override
    public void setRegistry(SDbRegistry registry) throws Exception {
        
    }

    @Override
    public SDbRegistry getRegistry() throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setValue(final int type, final Object value) {
    }

    @Override
    public Object getValue(final int type) {
        if (moRadOrderByNumber.isSelected()) {
            mnOrderByType = SUtilConsts.PER_DOC;
        }
        else if (moRadOrderByEmployee.isSelected()) {
            mnOrderByType = SUtilConsts.PER_BPR;
        }
        else if (moRadOrderByDepartament.isSelected()) {
            mnOrderByType = SUtilConsts.PER_REF;
        }

        return type == SGuiConsts.PARAM_KEY ? mnOrderByType : moIntNumCopies.getValue();
    }
    
    public Object getString(String typeDep) {       
        if (moPanelHrsDepartmentsWithReceipts.mbIsSelectedAll) {
            return typeDep = "";
        }
        else {
            return moPanelHrsDepartmentsWithReceipts.msDepartamentsSelectedsId;            
        }
    }
}
