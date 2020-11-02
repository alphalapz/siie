/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.mod.log.form;

import erp.lib.SLibConstants;
import erp.mod.SModConsts;
import erp.mod.SModSysConsts;
import erp.mod.itm.db.SDbUnitType;
import erp.mod.log.db.SDbVehicleType;
import sa.lib.SLibConsts;
import sa.lib.SLibUtils;
import sa.lib.db.SDbRegistry;
import sa.lib.gui.SGuiClient;
import sa.lib.gui.SGuiConsts;
import sa.lib.gui.SGuiUtils;
import sa.lib.gui.SGuiValidation;

/**
 *
 * @author Juan Barajas
 */
public class SFormVehicleType extends sa.lib.gui.bean.SBeanForm {

    private SDbVehicleType moRegistry;

    /**
     * Creates new form SFormVehicleType
     */
    public SFormVehicleType(SGuiClient client, String title) {
        setFormSettings(client, SGuiConsts.BEAN_FORM_EDIT, SModConsts.LOGU_TP_VEH, SLibConstants.UNDEFINED, title);
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
        jPanel22 = new javax.swing.JPanel();
        jlCode = new javax.swing.JLabel();
        moTextCode = new sa.lib.gui.bean.SBeanFieldText();
        jPanel24 = new javax.swing.JPanel();
        jlName = new javax.swing.JLabel();
        moTextName = new sa.lib.gui.bean.SBeanFieldText();
        jPanel21 = new javax.swing.JPanel();
        jlCapacityMass = new javax.swing.JLabel();
        moComCapacityMass = new sa.lib.gui.bean.SBeanCompoundField();
        jPanel25 = new javax.swing.JPanel();
        jlCapacityVolume = new javax.swing.JLabel();
        moComCapacityVolume = new sa.lib.gui.bean.SBeanCompoundField();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del registro:"));
        jPanel1.setLayout(new java.awt.BorderLayout(0, 5));

        jPanel23.setLayout(new java.awt.GridLayout(4, 1, 0, 5));

        jPanel22.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlCode.setText("Código:*");
        jlCode.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel22.add(jlCode);
        jPanel22.add(moTextCode);

        jPanel23.add(jPanel22);

        jPanel24.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlName.setText("Nombre:*");
        jlName.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel24.add(jlName);

        moTextName.setPreferredSize(new java.awt.Dimension(200, 23));
        jPanel24.add(moTextName);

        jPanel23.add(jPanel24);

        jPanel21.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlCapacityMass.setText("Cap. masa:*");
        jlCapacityMass.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel21.add(jlCapacityMass);
        jPanel21.add(moComCapacityMass);

        jPanel23.add(jPanel21);

        jPanel25.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlCapacityVolume.setText("Cap. volumen:");
        jlCapacityVolume.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel25.add(jlCapacityVolume);
        jPanel25.add(moComCapacityVolume);

        jPanel23.add(jPanel25);

        jPanel1.add(jPanel23, java.awt.BorderLayout.NORTH);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jlCapacityMass;
    private javax.swing.JLabel jlCapacityVolume;
    private javax.swing.JLabel jlCode;
    private javax.swing.JLabel jlName;
    private sa.lib.gui.bean.SBeanCompoundField moComCapacityMass;
    private sa.lib.gui.bean.SBeanCompoundField moComCapacityVolume;
    private sa.lib.gui.bean.SBeanFieldText moTextCode;
    private sa.lib.gui.bean.SBeanFieldText moTextName;
    // End of variables declaration//GEN-END:variables

    private void initComponentsCustom() {
        SGuiUtils.setWindowBounds(this, 480, 300);

        moTextCode.setTextSettings(SGuiUtils.getLabelName(jlCode.getText()), 10);
        moTextName.setTextSettings(SGuiUtils.getLabelName(jlName.getText()), 50);
        moComCapacityMass.setCompoundFieldSettings(miClient);
        moComCapacityMass.getField().setDecimalSettings(jlCapacityMass.getText(), SGuiConsts.GUI_TYPE_DEC_QTY, true);
        moComCapacityMass.setCompoundText((String) miClient.getSession().readField(SModConsts.ITMU_TP_UNIT, new int[] { SModSysConsts.ITMU_TP_UNIT_MASS }, SDbUnitType.FIELD_CODE));
        moComCapacityVolume.setCompoundFieldSettings(miClient);
        moComCapacityVolume.getField().setDecimalSettings(jlCapacityVolume.getText(), SGuiConsts.GUI_TYPE_DEC_QTY, false);
        moComCapacityVolume.setCompoundText((String) miClient.getSession().readField(SModConsts.ITMU_TP_UNIT, new int[] { SModSysConsts.ITMU_TP_UNIT_VOL }, SDbUnitType.FIELD_CODE));

        moFields.addField(moTextCode);
        moFields.addField(moTextName);
        moFields.addField(moComCapacityMass.getField());
        moFields.addField(moComCapacityVolume.getField());

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
    }

    @Override
    public void setRegistry(SDbRegistry registry) throws Exception {
        moRegistry = (SDbVehicleType) registry;

        mnFormResult = SLibConsts.UNDEFINED;
        mbFirstActivation = true;

        removeAllListeners();
        reloadCatalogues();

        if (moRegistry.isRegistryNew()) {
            moRegistry.initPrimaryKey();
            jtfRegistryKey.setText("");
        }
        else {
            jtfRegistryKey.setText(SLibUtils.textKey(moRegistry.getPrimaryKey()));
        }

        moTextCode.setValue(moRegistry.getCode());
        moTextName.setValue(moRegistry.getName());
        moComCapacityMass.getField().setValue(moRegistry.getCapacityMass());
        moComCapacityVolume.getField().setValue(moRegistry.getCapacityVolume());

        setFormEditable(true);

        if (moRegistry.isRegistryNew()) { }

        addAllListeners();
    }

    @Override
    public SDbRegistry getRegistry() throws Exception {
        SDbVehicleType registry = moRegistry.clone();

        if (registry.isRegistryNew()) {}

        moRegistry.setCode(moTextCode.getValue());
        moRegistry.setName(moTextName.getValue());
        moRegistry.setCapacityMass(moComCapacityMass.getField().getValue());
        moRegistry.setCapacityVolume(moComCapacityVolume.getField().getValue());

        return registry;
    }

    @Override
    public SGuiValidation validateForm() {
        SGuiValidation validation = moFields.validateFields();

        return validation;
    }
}
