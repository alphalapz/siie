/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package erp.lib.table;

import erp.lib.SLibConstants;
import erp.lib.SLibTimeUtilities;
import erp.lib.gui.SGuiDate;
import java.text.SimpleDateFormat;
import java.util.Date;
import sa.lib.SLibTimeUtils;

/**
 *
 * @author Sergio Flores
 */
public class STabFilterDatePeriod extends javax.swing.JPanel {
    
    private erp.client.SClientInterface miClient;
    private erp.lib.table.STableTabInterface miTableTab;
    private erp.lib.gui.SGuiDate moGuiDate;
    private erp.lib.table.STableSetting moSetting;

    /**
     * Creates new form STabFilterDatePeriod
     * @param client Client interface.
     * @param tableTab Table tab.
     * @param guiDateType GUI date type. Constants defined in erp.lib.SLibConstants.
     */
    public STabFilterDatePeriod(erp.client.SClientInterface client, erp.lib.table.STableTabInterface tableTab, int guiDateType) {
        miClient = client;
        miTableTab = tableTab;
        moGuiDate = new SGuiDate(miClient.getSessionXXX().getWorkingDate().getTime(), guiDateType);
        
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
        jpAdjustment = new javax.swing.JPanel();
        jbIncrementDate = new javax.swing.JButton();
        jbDecrementDate = new javax.swing.JButton();
        jbSetDate = new javax.swing.JButton();
        jbSetSystemDate = new javax.swing.JButton();
        jbSetSystemYearMonth = new javax.swing.JButton();
        jbSetSystemYear = new javax.swing.JButton();

        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 3, 0));

        jtfDate.setEditable(false);
        jtfDate.setText("01/01/2000");
        jtfDate.setToolTipText("Período");
        jtfDate.setFocusable(false);
        jtfDate.setPreferredSize(new java.awt.Dimension(65, 20));
        add(jtfDate);

        jpAdjustment.setLayout(new java.awt.GridLayout(2, 1, 0, 1));

        jbIncrementDate.setText("+");
        jbIncrementDate.setFocusable(false);
        jbIncrementDate.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jbIncrementDate.setPreferredSize(new java.awt.Dimension(20, 11));
        jbIncrementDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIncrementDateActionPerformed(evt);
            }
        });
        jpAdjustment.add(jbIncrementDate);

        jbDecrementDate.setText("‒");
        jbDecrementDate.setFocusable(false);
        jbDecrementDate.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jbDecrementDate.setOpaque(true);
        jbDecrementDate.setPreferredSize(new java.awt.Dimension(20, 11));
        jbDecrementDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDecrementDateActionPerformed(evt);
            }
        });
        jpAdjustment.add(jbDecrementDate);

        add(jpAdjustment);

        jbSetDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/erp/img/cal_cal.gif"))); // NOI18N
        jbSetDate.setToolTipText("Seleccionar fecha");
        jbSetDate.setPreferredSize(new java.awt.Dimension(23, 23));
        jbSetDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSetDateActionPerformed(evt);
            }
        });
        add(jbSetDate);

        jbSetSystemDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/erp/img/cal_date_day.gif"))); // NOI18N
        jbSetSystemDate.setToolTipText("Hoy");
        jbSetSystemDate.setPreferredSize(new java.awt.Dimension(23, 23));
        jbSetSystemDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSetSystemDateActionPerformed(evt);
            }
        });
        add(jbSetSystemDate);

        jbSetSystemYearMonth.setIcon(new javax.swing.ImageIcon(getClass().getResource("/erp/img/cal_date_month.gif"))); // NOI18N
        jbSetSystemYearMonth.setToolTipText("Mes actual");
        jbSetSystemYearMonth.setPreferredSize(new java.awt.Dimension(23, 23));
        jbSetSystemYearMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSetSystemYearMonthActionPerformed(evt);
            }
        });
        add(jbSetSystemYearMonth);

        jbSetSystemYear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/erp/img/cal_date_year.gif"))); // NOI18N
        jbSetSystemYear.setToolTipText("Año actual");
        jbSetSystemYear.setPreferredSize(new java.awt.Dimension(23, 23));
        jbSetSystemYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSetSystemYearActionPerformed(evt);
            }
        });
        add(jbSetSystemYear);
    }// </editor-fold>//GEN-END:initComponents

    private void jbSetDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSetDateActionPerformed
        actionSetDate();
    }//GEN-LAST:event_jbSetDateActionPerformed

    private void jbSetSystemDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSetSystemDateActionPerformed
        actionSetSystemDate();
}//GEN-LAST:event_jbSetSystemDateActionPerformed

    private void jbSetSystemYearMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSetSystemYearMonthActionPerformed
        actionSetSystemYearMonth();
}//GEN-LAST:event_jbSetSystemYearMonthActionPerformed

    private void jbSetSystemYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSetSystemYearActionPerformed
        actionSetSystemYear();
}//GEN-LAST:event_jbSetSystemYearActionPerformed

    private void jbIncrementDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIncrementDateActionPerformed
        actionIncrementDate();
    }//GEN-LAST:event_jbIncrementDateActionPerformed

    private void jbDecrementDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDecrementDateActionPerformed
        actionDecrementDate();
    }//GEN-LAST:event_jbDecrementDateActionPerformed

    private void initComponentsExtra() {
        moSetting = new STableSetting(STableConstants.SETTING_FILTER_PERIOD, null);
        miTableTab.addSetting(moSetting);
        
        setDate(moGuiDate, false);
    }
    
    private void setDate(final SGuiDate guiDate, final boolean broadcastEvent) {
        moGuiDate = guiDate;
        
        int[] date = null;
        SimpleDateFormat format = null;
        
        switch (moGuiDate.getDataType()) {
            case SLibConstants.GUI_DATE_AS_DATE:
                date = SLibTimeUtilities.digestDate(moGuiDate);
                format = miClient.getSessionXXX().getFormatters().getDateFormat();
                break;
            case SLibConstants.GUI_DATE_AS_YEAR_MONTH:
                date = SLibTimeUtilities.digestYearMonth(moGuiDate);
                format = miClient.getSessionXXX().getFormatters().getDateYearMonthFormat();
                break;
            case SLibConstants.GUI_DATE_AS_YEAR:
                date = SLibTimeUtilities.digestYear(moGuiDate);
                format = miClient.getSessionXXX().getFormatters().getDateYearFormat();
                break;
            default:
        }
        
        moSetting.setSetting(date);
        
        if (broadcastEvent) {
            miTableTab.updateSetting(moSetting);
        }
        
        jtfDate.setText(format.format(moGuiDate));
    }

    private void adjustDate(final Adjustment adjustment) {
        Date date = null;
        int leap = adjustment == Adjustment.Increment ? 1 : -1;
        
        switch (moGuiDate.getDataType()) {
            case SLibConstants.GUI_DATE_AS_DATE:
                date = SLibTimeUtilities.addDate(moGuiDate, 0, 0, leap);
                break;
            case SLibConstants.GUI_DATE_AS_YEAR_MONTH:
                date = SLibTimeUtilities.addDate(moGuiDate, 0, leap, 0);
                break;
            case SLibConstants.GUI_DATE_AS_YEAR:
                date = SLibTimeUtilities.addDate(moGuiDate, leap, 0, 0);
                break;
            default:
        }
        
        setDate(new SGuiDate(date.getTime(), moGuiDate.getDataType()), true);
    }
    
    private void actionSetDate() {
        SGuiDate guiDate = miClient.getGuiDatePeriodPickerXXX().pickDate(moGuiDate);

        if (guiDate != null) {
            setDate(guiDate, true);
        }
    }
    
    private void actionSetSystemDate() {
        setDate(new SGuiDate(miClient.getSessionXXX().getWorkingDate().getTime(), SLibConstants.GUI_DATE_AS_DATE), true);
    }
    
    private void actionSetSystemYearMonth() {
        setDate(new SGuiDate(SLibTimeUtils.getEndOfMonth(miClient.getSessionXXX().getWorkingDate()).getTime(), SLibConstants.GUI_DATE_AS_YEAR_MONTH), true);
    }
    
    private void actionSetSystemYear() {
        setDate(new SGuiDate(SLibTimeUtils.getEndOfYear(miClient.getSessionXXX().getWorkingDate()).getTime(), SLibConstants.GUI_DATE_AS_YEAR), true);
    }
    
    private void actionIncrementDate() {
        adjustDate(Adjustment.Increment);
    }
    
    private void actionDecrementDate() {
        adjustDate(Adjustment.Decrement);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbDecrementDate;
    private javax.swing.JButton jbIncrementDate;
    private javax.swing.JButton jbSetDate;
    private javax.swing.JButton jbSetSystemDate;
    private javax.swing.JButton jbSetSystemYear;
    private javax.swing.JButton jbSetSystemYearMonth;
    private javax.swing.JPanel jpAdjustment;
    private javax.swing.JTextField jtfDate;
    // End of variables declaration//GEN-END:variables

    /*
     * Public methods
     */
    
    public Date getDate() {
        return moGuiDate;
    }
    
    private enum Adjustment {
        Increment,
        Decrement
    }
}
