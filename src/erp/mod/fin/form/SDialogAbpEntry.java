/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.mod.fin.form;

import erp.gui.account.SAccount;
import erp.gui.account.SAccountConsts;
import erp.mod.fin.db.SAbpRegistry;
import sa.lib.SLibConsts;
import sa.lib.db.SDbRegistry;
import sa.lib.gui.SGuiClient;
import sa.lib.gui.SGuiConsts;
import sa.lib.gui.SGuiUtils;
import sa.lib.gui.SGuiValidation;
import sa.lib.gui.bean.SBeanFormDialog;

/**
 *
 * @author Juan Barajas, Sergio Flores
 */
public class SDialogAbpEntry extends SBeanFormDialog {

    private SAbpRegistry moRegistry;

    /**
     * Creates new form SDialogAbpEntry
     */
    public SDialogAbpEntry(SGuiClient client, String title) {
        setFormSettings(client, SGuiConsts.BEAN_FORM_EDIT, SLibConsts.UNDEFINED, SLibConsts.UNDEFINED, title);
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
        jPanel23 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jlAccountType = new javax.swing.JLabel();
        jtfAccountType = new javax.swing.JTextField();
        jpSettings = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        moAccountPanel = new erp.gui.account.SBeanPanelAccount();
        moCostCenterPanel = new erp.gui.account.SBeanPanelAccount();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del registro:"));
        jPanel1.setLayout(new java.awt.BorderLayout(0, 5));

        jPanel23.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.GridLayout(2, 1, 0, 5));

        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlAccountType.setText("Tipo de cuenta:");
        jlAccountType.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel5.add(jlAccountType);

        jtfAccountType.setEditable(false);
        jtfAccountType.setText("ACCOUNT TYPE");
        jtfAccountType.setFocusable(false);
        jtfAccountType.setPreferredSize(new java.awt.Dimension(400, 23));
        jPanel5.add(jtfAccountType);

        jPanel2.add(jPanel5);

        jPanel23.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel23, java.awt.BorderLayout.NORTH);

        jpSettings.setLayout(new java.awt.BorderLayout());

        jPanel6.setLayout(new java.awt.GridLayout(2, 1, 0, 5));
        jPanel6.add(moAccountPanel);
        jPanel6.add(moCostCenterPanel);

        jpSettings.add(jPanel6, java.awt.BorderLayout.NORTH);

        jPanel1.add(jpSettings, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        getAccessibleContext().setAccessibleParent(moAccountPanel);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel jlAccountType;
    private javax.swing.JPanel jpSettings;
    private javax.swing.JTextField jtfAccountType;
    private erp.gui.account.SBeanPanelAccount moAccountPanel;
    private erp.gui.account.SBeanPanelAccount moCostCenterPanel;
    // End of variables declaration//GEN-END:variables

    private void initComponentsCustom() {
        SGuiUtils.setWindowBounds(this, 560, 350);

        moAccountPanel.setPanelSettings(miClient, SAccountConsts.TYPE_ACCOUNT, true, true, true);
        moCostCenterPanel.setPanelSettings(miClient, SAccountConsts.TYPE_COST_CENTER, true, true, true);

        moFields.addField(moAccountPanel.getTextNumberFirst());
        moFields.addField(moCostCenterPanel.getTextNumberFirst());

        moFields.setFormButton(jbSave);

        moAccountPanel.setComponentNext(moCostCenterPanel.getTextNumberFirst());
        moCostCenterPanel.setComponentPrevious(moAccountPanel.getTextNumberFirst());
        moCostCenterPanel.setComponentNext(jbSave);

        moAccountPanel.resetPanel();
        moCostCenterPanel.resetPanel();
    }

    @Override
    public void addAllListeners() {

    }

    @Override
    public void removeAllListeners() {

    }

    @Override
    public void reloadCatalogues() {
    }

    @Override
    public void setRegistry(SDbRegistry registry) throws Exception {
        moRegistry = (SAbpRegistry) registry;
        SAccount account = null;
        SAccount costCenter = null;

        mnFormResult = SLibConsts.UNDEFINED;
        mbFirstActivation = true;

        removeAllListeners();
        reloadCatalogues();

        moAccountPanel.resetPanel();
        moCostCenterPanel.resetPanel();

        if (moRegistry.isRegistryNew()) { }

        account = new SAccount(moRegistry.getAccountId(), moRegistry.getAccountCode(), moRegistry.getAccount(), false, SLibConsts.UNDEFINED, SLibConsts.UNDEFINED);
        moAccountPanel.setSelectedAccount(account);

        if (moRegistry.getCostCenterId() != SLibConsts.UNDEFINED) {
            costCenter = new SAccount(moRegistry.getCostCenterId(), moRegistry.getCostCenterCode(), moRegistry.getCostCenter(), false, SLibConsts.UNDEFINED, SLibConsts.UNDEFINED);

            moCostCenterPanel.setSelectedAccount(costCenter);
        }

        jtfAccountType.setText(moRegistry.getAccountType());

        //setFormEditable(true);

        moCostCenterPanel.setPanelEditable(moRegistry.isCostCenterRequired());

        addAllListeners();
    }

    @Override
    public SAbpRegistry getRegistry() throws Exception {
        SAbpRegistry registry = moRegistry.clone();

        if (registry.isRegistryNew()) {}

        registry.setAccountId(moAccountPanel.getSelectedAccount().getAccountId());
        registry.setCostCenterId(!moCostCenterPanel.getTextNumberFirst().isEditable() ? SLibConsts.UNDEFINED : moCostCenterPanel.getSelectedAccount().getAccountId());
        registry.setAccountCode(moAccountPanel.getSelectedAccount().getCodeStd());
        registry.setAccount(moAccountPanel.getSelectedAccount().getName());
        registry.setCostCenterCode(!moCostCenterPanel.getTextNumberFirst().isEditable() ? "" : moCostCenterPanel.getSelectedAccount().getCodeStd());
        registry.setCostCenter(!moCostCenterPanel.getTextNumberFirst().isEditable() ? "" : moCostCenterPanel.getSelectedAccount().getName());

        return registry;
    }

    @Override
    public SGuiValidation validateForm() {
        SGuiValidation validation = moFields.validateFields();

        if (validation.isValid()) {
            validation = moAccountPanel.validatePanel();

            if (validation.isValid()) {
                validation = moCostCenterPanel.validatePanel();
            }
        }

        return validation;
    }
}