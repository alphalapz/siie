/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package erp.lib.table;

/**
 *
 * @author Sergio Flores
 */
public class STabFilterSwitch extends javax.swing.JPanel {
    
    private erp.lib.table.STableTabInterface miTableTab;
    
    private erp.lib.table.STableSetting moSetting;

    /** Creates new form STabFilterSwitch */
    public STabFilterSwitch(erp.lib.table.STableTabInterface tableTab) {
        miTableTab = tableTab;
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

        jtbFilter = new javax.swing.JToggleButton();

        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        jtbFilter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/erp/img/switch_std_off.gif"))); // NOI18N
        jtbFilter.setToolTipText("Mostrar todo/filtrar");
        jtbFilter.setPreferredSize(new java.awt.Dimension(23, 23));
        jtbFilter.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/erp/img/switch_std_on.gif"))); // NOI18N
        jtbFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbFilterActionPerformed(evt);
            }
        });
        add(jtbFilter);
    }// </editor-fold>//GEN-END:initComponents

    private void jtbFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbFilterActionPerformed
        if (jtbFilter.isSelected()) {
            moSetting.setStatus(STableConstants.STATUS_ON);
        }
        else {
            moSetting.setStatus(STableConstants.STATUS_OFF);
        }
        miTableTab.updateSetting(moSetting);
}//GEN-LAST:event_jtbFilterActionPerformed
    
    private void initComponentsExtra() {
        moSetting = new STableSetting(STableConstants.SETTING_OPTION_SWITCH, STableConstants.STATUS_ON);
        miTableTab.addSetting(moSetting);

        jtbFilter.setSelected(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton jtbFilter;
    // End of variables declaration//GEN-END:variables
    
}