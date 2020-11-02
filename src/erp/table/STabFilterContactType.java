/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * STabFilterContactType.java
 *
 * Created on 5/01/2010, 11:14:02 AM
 */

package erp.table;

import erp.data.SDataConstants;
import erp.data.SDataReadDescriptions;
import erp.lib.table.*;

import erp.lib.SLibConstants;
import erp.mbps.form.SDialogFilterContactType;

/**
 *
 * @author Alfonso Flores, Sergio Flores
 */
public class STabFilterContactType extends javax.swing.JPanel {

    private erp.client.SClientInterface miClient;
    private erp.lib.table.STableTab moTab;
    private erp.lib.table.STableSetting moSetting;
    private erp.mbps.form.SDialogFilterContactType moDialogFilterContactType;

    private int mnContactType;

    /** Creates new form STabFilterContactType */
    public STabFilterContactType(erp.client.SClientInterface client, erp.lib.table.STableTab tableTab) {
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
        jtfContactType.setToolTipText("Tipo de contacto");
        jtfContactType.setFocusable(false);
        jtfContactType.setPreferredSize(new java.awt.Dimension(125, 23));
        add(jtfContactType);

        jbContactType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/erp/img/icon_std_filter_bp.gif"))); // NOI18N
        jbContactType.setToolTipText("Seleccionar tipo de contacto");
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
        mnContactType = SLibConstants.UNDEFINED;
        moSetting = new STableSetting(SFilterConstants.SETTING_FILTER_BP_CON_TP, mnContactType);
        moDialogFilterContactType = new SDialogFilterContactType(miClient);

        renderText();
    }

    private void actionFkContactType() {
        moDialogFilterContactType.formRefreshCatalogues();
        moDialogFilterContactType.formReset();
        moDialogFilterContactType.setContactType(mnContactType);
        moDialogFilterContactType.setVisible(true);

        if (moDialogFilterContactType.getFormResult() == erp.lib.SLibConstants.FORM_RESULT_OK) {
            mnContactType = moDialogFilterContactType.getContactType();
            moSetting.setSetting(mnContactType);
            moTab.updateSetting(moSetting);
            renderText();
        }
    }

    private void renderText() {
        jtfContactType.setText(mnContactType == SLibConstants.UNDEFINED ? SLibConstants.TXT_ALL : SDataReadDescriptions.getCatalogueDescription(miClient, SDataConstants.BPSS_TP_CON, new int[] { mnContactType }, SLibConstants.DESCRIPTION_NAME));
        jtfContactType.setCaretPosition(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbContactType;
    private javax.swing.JTextField jtfContactType;
    // End of variables declaration//GEN-END:variables

}
