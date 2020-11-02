/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * STabFilterProductionOrderType.java
 *
 * Created on 5/01/2010, 11:14:02 AM
 */

package erp.table;

import erp.data.SDataConstants;
import erp.data.SDataReadDescriptions;
import erp.lib.SLibConstants;
import erp.lib.table.STableSetting;
import erp.mmfg.form.SDialogFilterProductionOrderType;

/**
 *
 * @author Sergio Flores
 */
public class STabFilterProductionOrderType extends javax.swing.JPanel {

    private erp.client.SClientInterface miClient;
    private erp.lib.table.STableTab moTab;
    private erp.lib.table.STableSetting moSetting;
    private erp.mmfg.form.SDialogFilterProductionOrderType moDialogFilterProductionOrderType;

    private int mnProductionOrderType;

    /** Creates new form STabFilterProductionOrderType */
    public STabFilterProductionOrderType(erp.client.SClientInterface client, erp.lib.table.STableTab tableTab) {
        miClient = client;
        moTab = tableTab;

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

        jtfContactType = new javax.swing.JTextField();
        jbContactType = new javax.swing.JButton();

        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 3, 0));

        jtfContactType.setEditable(false);
        jtfContactType.setText("TEXT");
        jtfContactType.setToolTipText("Tipo de orden de producción");
        jtfContactType.setFocusable(false);
        jtfContactType.setPreferredSize(new java.awt.Dimension(125, 23));
        add(jtfContactType);

        jbContactType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/erp/img/icon_std_filter_doc.gif"))); // NOI18N
        jbContactType.setToolTipText("Seleccionar tipo de orden de producción");
        jbContactType.setPreferredSize(new java.awt.Dimension(23, 23));
        jbContactType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbContactTypeActionPerformed(evt);
            }
        });
        add(jbContactType);
    }// </editor-fold>//GEN-END:initComponents

    private void jbContactTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbContactTypeActionPerformed
        actionFkContactType();
    }//GEN-LAST:event_jbContactTypeActionPerformed

    private void initComponentsExtra() {
        mnProductionOrderType = SLibConstants.UNDEFINED;
        moSetting = new STableSetting(SFilterConstants.SETTING_FILTER_MFG_ORD_TP, mnProductionOrderType);
        moDialogFilterProductionOrderType = new SDialogFilterProductionOrderType(miClient);

        renderText();
    }

    private void actionFkContactType() {
        moDialogFilterProductionOrderType.formRefreshCatalogues();
        moDialogFilterProductionOrderType.formReset();
        moDialogFilterProductionOrderType.setProductionOrderType(mnProductionOrderType);
        moDialogFilterProductionOrderType.setVisible(true);

        if (moDialogFilterProductionOrderType.getFormResult() == erp.lib.SLibConstants.FORM_RESULT_OK) {
            mnProductionOrderType = moDialogFilterProductionOrderType.getProductionOrderType();
            moSetting.setSetting(mnProductionOrderType);
            moTab.updateSetting(moSetting);
            renderText();
        }
    }

    private void renderText() {
        jtfContactType.setText(mnProductionOrderType == SLibConstants.UNDEFINED ? SLibConstants.TXT_ALL : SDataReadDescriptions.getCatalogueDescription(miClient, SDataConstants.MFGU_TP_ORD, new int[] { mnProductionOrderType }, SLibConstants.DESCRIPTION_NAME));
        jtfContactType.setCaretPosition(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbContactType;
    private javax.swing.JTextField jtfContactType;
    // End of variables declaration//GEN-END:variables

}
