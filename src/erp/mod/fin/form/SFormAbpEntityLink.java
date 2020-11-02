/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.mod.fin.form;

import erp.gui.session.SSessionCustom;
import erp.mod.SModConsts;
import erp.mod.fin.db.SDbAbpEntityLink;
import sa.lib.SLibConsts;
import sa.lib.SLibUtils;
import sa.lib.db.SDbRegistry;
import sa.lib.gui.SGuiClient;
import sa.lib.gui.SGuiConsts;
import sa.lib.gui.SGuiFieldKeyGroup;
import sa.lib.gui.SGuiUtils;
import sa.lib.gui.SGuiValidation;

/**
 *
 * @author Juan Barajas
 */
public class SFormAbpEntityLink extends sa.lib.gui.bean.SBeanForm {

    private SGuiFieldKeyGroup moFieldKeyGroup;
    private SDbAbpEntityLink moRegistry;

    /**
     * Creates new form SFormAbpEntityLink
     */
    public SFormAbpEntityLink(SGuiClient client, int subtype, String title) {
        setFormSettings(client, SGuiConsts.BEAN_FORM_EDIT, SModConsts.FIN_ABP_ENT_LINK, subtype, title);
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
        jPanel21 = new javax.swing.JPanel();
        jlAbp = new javax.swing.JLabel();
        moKeyAbp = new sa.lib.gui.bean.SBeanFieldKey();
        jPanel22 = new javax.swing.JPanel();
        jlBranch = new javax.swing.JLabel();
        moKeyBranch = new sa.lib.gui.bean.SBeanFieldKey();
        jPanel24 = new javax.swing.JPanel();
        jlEntity = new javax.swing.JLabel();
        moKeyEntity = new sa.lib.gui.bean.SBeanFieldKey();

        jPanel1.setLayout(new java.awt.BorderLayout(0, 5));

        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del registro:"));
        jPanel23.setLayout(new java.awt.GridLayout(3, 1, 0, 5));

        jPanel21.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlAbp.setForeground(new java.awt.Color(0, 0, 255));
        jlAbp.setText("Paquete contable: *");
        jlAbp.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel21.add(jlAbp);

        moKeyAbp.setPreferredSize(new java.awt.Dimension(300, 23));
        jPanel21.add(moKeyAbp);

        jPanel23.add(jPanel21);

        jPanel22.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlBranch.setForeground(new java.awt.Color(0, 0, 255));
        jlBranch.setText("Sucursal: *");
        jlBranch.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel22.add(jlBranch);

        moKeyBranch.setPreferredSize(new java.awt.Dimension(300, 23));
        jPanel22.add(moKeyBranch);

        jPanel23.add(jPanel22);

        jPanel24.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlEntity.setForeground(new java.awt.Color(0, 0, 255));
        jlEntity.setText("Entidad: *");
        jlEntity.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel24.add(jlEntity);

        moKeyEntity.setPreferredSize(new java.awt.Dimension(300, 23));
        jPanel24.add(moKeyEntity);

        jPanel23.add(jPanel24);

        jPanel1.add(jPanel23, java.awt.BorderLayout.NORTH);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jlAbp;
    private javax.swing.JLabel jlBranch;
    private javax.swing.JLabel jlEntity;
    private sa.lib.gui.bean.SBeanFieldKey moKeyAbp;
    private sa.lib.gui.bean.SBeanFieldKey moKeyBranch;
    private sa.lib.gui.bean.SBeanFieldKey moKeyEntity;
    // End of variables declaration//GEN-END:variables

    private void initComponentsCustom() {
        SGuiUtils.setWindowBounds(this, 480, 300);

        moFieldKeyGroup = new SGuiFieldKeyGroup(miClient);

        moKeyAbp.setKeySettings(miClient, SGuiUtils.getLabelName(jlAbp.getText()), true);
        moKeyBranch.setKeySettings(miClient, SGuiUtils.getLabelName(jlBranch.getText()), true);
        moKeyEntity.setKeySettings(miClient, SGuiUtils.getLabelName(jlEntity.getText()), true);

        moFields.addField(moKeyAbp);
        moFields.addField(moKeyBranch);
        moFields.addField(moKeyEntity);

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
        moFieldKeyGroup.initGroup();
        moFieldKeyGroup.addFieldKey(moKeyBranch, SModConsts.BPSU_BPB, ((SSessionCustom) miClient.getSession().getSessionCustom()).getCurrentBranchKey()[0], null);
        moFieldKeyGroup.addFieldKey(moKeyEntity, SModConsts.CFGU_COB_ENT, mnFormSubtype, null);
        moFieldKeyGroup.populateCatalogues();

        miClient.getSession().populateCatalogue(moKeyAbp, SModConsts.FIN_ABP_ENT, mnFormSubtype, null);
    }

    @Override
    public void setRegistry(SDbRegistry registry) throws Exception {
        int[] key = null;
        moRegistry = (SDbAbpEntityLink) registry;

        mnFormResult = SLibConsts.UNDEFINED;
        mbFirstActivation = true;

        removeAllListeners();
        reloadCatalogues();

        key = moRegistry.getPrimaryKey();

        if (moRegistry.isRegistryNew()) {
            moRegistry.initPrimaryKey();
            jtfRegistryKey.setText("");
        }
        else {
            jtfRegistryKey.setText(SLibUtils.textKey(moRegistry.getPrimaryKey()));
        }

        moKeyAbp.setValue(new int[] { key[0] });
        moKeyBranch.setValue(new int[] { key[1] });
        moKeyEntity.setValue(new int[] { key[1], key[2] });

        setFormEditable(true);

        if (moRegistry.isRegistryNew()) {
            if (key[0] == SLibConsts.UNDEFINED) {
                moFieldKeyGroup.resetGroup();
            }
        }
        else {
            moKeyAbp.setEnabled(false);
            moKeyBranch.setEnabled(false);
            moKeyEntity.setEnabled(false);
        }

        addAllListeners();
    }

    @Override
    public SDbRegistry getRegistry() throws Exception {
        SDbAbpEntityLink registry = moRegistry.clone();

        if (registry.isRegistryNew()) {}

        registry.setPkAbpEntityId(moKeyAbp.getValue()[0]);
        registry.setPkCompanyBranchId(moKeyBranch.getValue()[0]);
        registry.setPkEntityId(moKeyEntity.getValue()[1]);

        return registry;
    }

    @Override
    public SGuiValidation validateForm() {
        SGuiValidation validation = moFields.validateFields();

        return validation;
    }
}
