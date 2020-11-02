/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * STabFilterDocumentNature.java
 */

package erp.table;

import erp.data.SDataReadDescriptions;
import erp.lib.SLibConstants;
import erp.lib.table.STableSetting;
import erp.mtrn.form.SDialogFilterDocumentNature;

/**
 *
 * @author Juan Barajas
 */
public class STabFilterDocumentNature extends javax.swing.JPanel {

    private erp.client.SClientInterface miClient;
    private erp.lib.table.STableTab moTab;
    private erp.lib.table.STableSetting moSetting;
    private erp.mtrn.form.SDialogFilterDocumentNature moDialogFilterDocumentNature;

    private int mnDataType;
    private int[] manDataFilter;
    private int mnDocumentNatureId;

    /** Creates new form STabFilterDocumentNature */
    public STabFilterDocumentNature(erp.client.SClientInterface client, erp.lib.table.STableTab tableTab, int dataType) {
        this(client, tableTab, dataType, null);
    }

    /** Creates new form STabFilterDocumentNature */
    public STabFilterDocumentNature(erp.client.SClientInterface client, erp.lib.table.STableTab tableTab, int dataType, int[] dataFilter) {
        miClient = client;
        moTab = tableTab;
        mnDataType = dataType;
        manDataFilter = dataFilter;

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

        jtfDocumentNature = new javax.swing.JTextField();
        jbDocumentNature = new javax.swing.JButton();

        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 3, 0));

        jtfDocumentNature.setEditable(false);
        jtfDocumentNature.setText("CODE");
        jtfDocumentNature.setToolTipText("Naturaleza de documento");
        jtfDocumentNature.setPreferredSize(new java.awt.Dimension(65, 23));
        add(jtfDocumentNature);

        jbDocumentNature.setIcon(new javax.swing.ImageIcon(getClass().getResource("/erp/img/icon_std_filter_doc.gif"))); // NOI18N
        jbDocumentNature.setToolTipText("Seleccionar naturaleza de documento");
        jbDocumentNature.setPreferredSize(new java.awt.Dimension(23, 23));
        jbDocumentNature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDocumentNatureActionPerformed(evt);
            }
        });
        add(jbDocumentNature);
    }// </editor-fold>//GEN-END:initComponents

    private void jbDocumentNatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDocumentNatureActionPerformed
        actionTypeDocument();
    }//GEN-LAST:event_jbDocumentNatureActionPerformed

    private void initComponentsExtra() {
        mnDocumentNatureId = SLibConstants.UNDEFINED;
        moSetting = new STableSetting(SFilterConstants.SETTING_FILTER_DOC_NAT, mnDocumentNatureId);
        moDialogFilterDocumentNature = new SDialogFilterDocumentNature(miClient, mnDataType, manDataFilter);

        renderText();
    }

    private void actionTypeDocument() {
        moDialogFilterDocumentNature.formRefreshCatalogues();
        moDialogFilterDocumentNature.formReset();
        moDialogFilterDocumentNature.setDocumentNatureId(mnDocumentNatureId);
        moDialogFilterDocumentNature.setFormVisible(true);

        if (moDialogFilterDocumentNature.getFormResult() == erp.lib.SLibConstants.FORM_RESULT_OK) {
            mnDocumentNatureId = moDialogFilterDocumentNature.getDocumentNatureId();
            renderText();

            moSetting.setSetting(mnDocumentNatureId);
            moTab.updateSetting(moSetting);
        }
    }

    private void renderText() {
        jtfDocumentNature.setText(mnDocumentNatureId == SLibConstants.UNDEFINED ? SLibConstants.TXT_ALL : SDataReadDescriptions.getCatalogueDescription(miClient, mnDataType, new int[] { mnDocumentNatureId }, SLibConstants.DESCRIPTION_CODE));
        jtfDocumentNature.setCaretPosition(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbDocumentNature;
    private javax.swing.JTextField jtfDocumentNature;
    // End of variables declaration//GEN-END:variables

    public void setDataFilter(final int[] filter) {
        manDataFilter = filter;
        moDialogFilterDocumentNature.setDataFilterKey(manDataFilter);
    }

    public void setFixedDocumentType(final int type) {
        mnDocumentNatureId = type;
        renderText();

        moSetting.setSetting(mnDocumentNatureId);
        moTab.addSetting(moSetting);

        jbDocumentNature.setEnabled(false);   // a fixed type was set
    }
}
