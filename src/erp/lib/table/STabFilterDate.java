/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package erp.lib.table;

import erp.lib.SLibConstants;
import erp.lib.SLibTimeUtilities;

/**
 *
 * @author Sergio Flores
 */
public class STabFilterDate extends javax.swing.JPanel {

    private erp.client.SClientInterface miClient;
    private erp.lib.table.STableTabInterface miTableTab;

    private java.util.Date mtDate;
    private erp.lib.table.STableSetting moSetting;

    /** Creates new form DTabFilterDate */
    public STabFilterDate(erp.client.SClientInterface client, erp.lib.table.STableTabInterface tableTab) {
        this(client, tableTab, null);
    }

    /** Creates new form DTabFilterDate */
    public STabFilterDate(erp.client.SClientInterface client, erp.lib.table.STableTabInterface tableTab, java.util.Date date) {
        miClient = client;
        miTableTab = tableTab;
        mtDate = date;
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

        jtfDate = new javax.swing.JTextField();
        jbDate = new javax.swing.JButton();
        jbSystemDate = new javax.swing.JButton();
        jbSystemMonth = new javax.swing.JButton();
        jbSystemYear = new javax.swing.JButton();

        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 3, 0));

        jtfDate.setEditable(false);
        jtfDate.setText("01/01/2000");
        jtfDate.setToolTipText("Fecha de corte");
        jtfDate.setFocusable(false);
        jtfDate.setPreferredSize(new java.awt.Dimension(65, 20));
        add(jtfDate);

        jbDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/erp/img/cal_cal.gif"))); // NOI18N
        jbDate.setToolTipText("Seleccionar fecha de corte");
        jbDate.setPreferredSize(new java.awt.Dimension(23, 23));
        jbDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDateActionPerformed(evt);
            }
        });
        add(jbDate);

        jbSystemDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/erp/img/cal_date_day.gif"))); // NOI18N
        jbSystemDate.setToolTipText("Hoy");
        jbSystemDate.setPreferredSize(new java.awt.Dimension(23, 23));
        jbSystemDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSystemDateActionPerformed(evt);
            }
        });
        add(jbSystemDate);

        jbSystemMonth.setIcon(new javax.swing.ImageIcon(getClass().getResource("/erp/img/cal_date_month.gif"))); // NOI18N
        jbSystemMonth.setToolTipText("Mes actual");
        jbSystemMonth.setPreferredSize(new java.awt.Dimension(23, 23));
        jbSystemMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSystemMonthActionPerformed(evt);
            }
        });
        add(jbSystemMonth);

        jbSystemYear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/erp/img/cal_date_year.gif"))); // NOI18N
        jbSystemYear.setToolTipText("Año actual");
        jbSystemYear.setPreferredSize(new java.awt.Dimension(23, 23));
        jbSystemYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSystemYearActionPerformed(evt);
            }
        });
        add(jbSystemYear);
    }// </editor-fold>//GEN-END:initComponents

    private void jbDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDateActionPerformed
        actionDate();
    }//GEN-LAST:event_jbDateActionPerformed

    private void jbSystemDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSystemDateActionPerformed
        mtDate = miClient.getSessionXXX().getWorkingDate();
        moSetting.setSetting(mtDate);
        miTableTab.updateSetting(moSetting);
        renderDate();
}//GEN-LAST:event_jbSystemDateActionPerformed

    private void jbSystemMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSystemMonthActionPerformed
        mtDate = SLibTimeUtilities.getEndOfMonth(miClient.getSessionXXX().getWorkingDate());
        moSetting.setSetting(mtDate);
        miTableTab.updateSetting(moSetting);
        renderDate();
}//GEN-LAST:event_jbSystemMonthActionPerformed

    private void jbSystemYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSystemYearActionPerformed
        mtDate = SLibTimeUtilities.getEndOfYear(miClient.getSessionXXX().getWorkingDate());
        moSetting.setSetting(mtDate);
        miTableTab.updateSetting(moSetting);
        renderDate();
    }//GEN-LAST:event_jbSystemYearActionPerformed

    private void initComponentsExtra() {
        if (mtDate == null) {
            mtDate = miClient.getSessionXXX().getWorkingDate();
        }

        moSetting = new STableSetting(STableConstants.SETTING_FILTER_PERIOD, mtDate);
        miTableTab.addSetting(moSetting);
        renderDate();
    }

    private void renderDate() {
        jtfDate.setText(miClient.getSessionXXX().getFormatters().getDateFormat().format(mtDate));
    }

    private void actionDate() {
        miClient.getGuiDatePickerXXX().formReset();
        miClient.getGuiDatePickerXXX().setDate(mtDate);
        miClient.getGuiDatePickerXXX().setVisible(true);

        if (miClient.getGuiDatePickerXXX().getFormResult() == SLibConstants.FORM_RESULT_OK) {
            mtDate = miClient.getGuiDatePickerXXX().getGuiDate();
            moSetting.setSetting(mtDate);
            miTableTab.updateSetting(moSetting);
            renderDate();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbDate;
    private javax.swing.JButton jbSystemDate;
    private javax.swing.JButton jbSystemMonth;
    private javax.swing.JButton jbSystemYear;
    private javax.swing.JTextField jtfDate;
    // End of variables declaration//GEN-END:variables

    public java.util.Date getDate() {
        return mtDate;
    }
}