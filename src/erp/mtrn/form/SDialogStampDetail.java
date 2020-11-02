/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.mtrn.form;

import erp.data.SDataConstants;
import erp.data.SDataConstantsSys;
import erp.data.SDataUtilities;
import erp.lib.SLibConstants;
import erp.lib.SLibUtilities;
import erp.lib.form.SFormUtilities;
import erp.lib.table.STableColumnForm;
import erp.lib.table.STableConstants;
import erp.lib.table.STablePane;
import erp.lib.table.STableUtilities;
import erp.mtrn.data.SDataPac;
import erp.mtrn.data.SDialogStampDetailRow;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Juan Barajas, Sergio Flores
 */
public class SDialogStampDetail extends javax.swing.JDialog implements java.awt.event.ActionListener {

    private erp.client.SClientInterface miClient;

    private int mnParamYear;
    private int mnParamPac;
    private java.util.Date mtParamDateEnd;
    private erp.lib.table.STablePane moPaneDetails;

    public SDialogStampDetail(erp.client.SClientInterface client) {
        super(client.getFrame(), true);
        miClient = client;
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

        jPanel2 = new javax.swing.JPanel();
        jbClose = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jlDateEnd = new javax.swing.JLabel();
        jtfDateEnd = new javax.swing.JTextField();
        jlDummy = new javax.swing.JLabel();
        jlPac = new javax.swing.JLabel();
        jtfPac = new javax.swing.JTextField();
        jpDetail = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jtfSeek = new javax.swing.JTextField();
        jbSeek = new javax.swing.JButton();
        jbExportCsv = new javax.swing.JButton();
        jbRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Movimientos de timbrado");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setLayout(new java.awt.FlowLayout(2));

        jbClose.setText("Cerrar");
        jbClose.setPreferredSize(new java.awt.Dimension(75, 23));
        jbClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCloseActionPerformed(evt);
            }
        });
        jPanel2.add(jbClose);

        getContentPane().add(jPanel2, java.awt.BorderLayout.SOUTH);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Información:"));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel4.setLayout(new java.awt.FlowLayout(0));

        jlDateEnd.setText("Fecha de corte:");
        jlDateEnd.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel4.add(jlDateEnd);

        jtfDateEnd.setEditable(false);
        jtfDateEnd.setText("01/01/2000");
        jtfDateEnd.setPreferredSize(new java.awt.Dimension(70, 23));
        jPanel4.add(jtfDateEnd);

        jlDummy.setPreferredSize(new java.awt.Dimension(50, 23));
        jPanel4.add(jlDummy);

        jlPac.setText("PAC:");
        jlPac.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel4.add(jlPac);

        jtfPac.setEditable(false);
        jtfPac.setText("PAC");
        jtfPac.setPreferredSize(new java.awt.Dimension(150, 23));
        jPanel4.add(jtfPac);

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jpDetail.setBorder(javax.swing.BorderFactory.createTitledBorder("Movimientos de timbres:"));
        jpDetail.setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(new java.awt.FlowLayout(2, 3, 0));

        jtfSeek.setText("Seek");
        jtfSeek.setToolTipText("Texto a buscar [Ctrl+B]");
        jtfSeek.setEnabled(false);
        jtfSeek.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel3.add(jtfSeek);

        jbSeek.setIcon(new javax.swing.ImageIcon(getClass().getResource("/erp/img/icon_seek.gif"))); // NOI18N
        jbSeek.setToolTipText("Buscar");
        jbSeek.setEnabled(false);
        jbSeek.setPreferredSize(new java.awt.Dimension(23, 23));
        jPanel3.add(jbSeek);

        jbExportCsv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/erp/img/icon_file_csv.gif"))); // NOI18N
        jbExportCsv.setToolTipText("Exportar CSV [Ctrl+E]");
        jbExportCsv.setEnabled(false);
        jbExportCsv.setPreferredSize(new java.awt.Dimension(23, 23));
        jbExportCsv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExportCsvActionPerformed(evt);
            }
        });
        jPanel3.add(jbExportCsv);

        jbRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/erp/img/icon_reload.gif"))); // NOI18N
        jbRefresh.setToolTipText("Refrescar [Ctrl+R]");
        jbRefresh.setPreferredSize(new java.awt.Dimension(23, 23));
        jbRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRefreshActionPerformed(evt);
            }
        });
        jPanel3.add(jbRefresh);

        jpDetail.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(jpDetail, java.awt.BorderLayout.CENTER);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1000)/2, (screenSize.height-675)/2, 1000, 675);
    }// </editor-fold>//GEN-END:initComponents

    private void jbCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCloseActionPerformed
        actionClose();
    }//GEN-LAST:event_jbCloseActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        jbClose.requestFocus();
    }//GEN-LAST:event_formWindowActivated

    private void jbExportCsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExportCsvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbExportCsvActionPerformed

    private void jbRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRefreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbRefreshActionPerformed

    private void initComponentsExtra() {
        int i = 0;
        STableColumnForm[] aoTableColumns = null;

        moPaneDetails = new STablePane(miClient);

        jpDetail.add(moPaneDetails, BorderLayout.CENTER);

        aoTableColumns = new STableColumnForm[10];

        aoTableColumns[i++] = new STableColumnForm(SLibConstants.DATA_TYPE_DATE, "Fecha", STableConstants.WIDTH_DATE);
        aoTableColumns[i++] = new STableColumnForm(SLibConstants.DATA_TYPE_STRING, "Tipo movimiento.", 150);
        aoTableColumns[i++] = new STableColumnForm(SLibConstants.DATA_TYPE_INTEGER, "Entrada", STableConstants.WIDTH_NUM_INTEGER);
        aoTableColumns[i++] = new STableColumnForm(SLibConstants.DATA_TYPE_INTEGER, "Salida", STableConstants.WIDTH_NUM_INTEGER);
        aoTableColumns[i++] = new STableColumnForm(SLibConstants.DATA_TYPE_INTEGER, "Existencia", STableConstants.WIDTH_NUM_INTEGER);
        aoTableColumns[i++] = new STableColumnForm(SLibConstants.DATA_TYPE_STRING, "Tipo CFD", 75);
        aoTableColumns[i++] = new STableColumnForm(SLibConstants.DATA_TYPE_STRING, "Tipo doc.", STableConstants.WIDTH_CODE_DOC);
        aoTableColumns[i++] = new STableColumnForm(SLibConstants.DATA_TYPE_STRING, "Folio doc.", STableConstants.WIDTH_DOC_NUM);
        aoTableColumns[i++] = new STableColumnForm(SLibConstants.DATA_TYPE_STRING, "Sucursal empresa", STableConstants.WIDTH_CODE_COB);
        aoTableColumns[i++] = new STableColumnForm(SLibConstants.DATA_TYPE_STRING, "UUID", 230);

        for (i = 0; i < aoTableColumns.length; i++) {
            moPaneDetails.addTableColumn(aoTableColumns[i]);
        }

        jbClose.addActionListener(this);
        jbSeek.addActionListener(this);
        jbRefresh.addActionListener(this);
        jbExportCsv.addActionListener(this);
        jtfSeek.addActionListener(this);

        SFormUtilities.createActionMap(this.getRootPane(), this, "focusSeek", "seek", KeyEvent.VK_B, KeyEvent.CTRL_DOWN_MASK);
        SFormUtilities.createActionMap(this.getRootPane(), this, "actionExportCsv", "exportCsv", KeyEvent.VK_E, KeyEvent.CTRL_DOWN_MASK);
        SFormUtilities.createActionMap(this.getRootPane(), this, "actionRefresh", "refresh", KeyEvent.VK_R, KeyEvent.CTRL_DOWN_MASK);

        AbstractAction actionCancel = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) { actionClose(); }
        };

        SFormUtilities.putActionMap(getRootPane(), actionCancel, "close", KeyEvent.VK_ESCAPE, 0);
    }

    private void actionClose() {
        setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jbClose;
    private javax.swing.JButton jbExportCsv;
    private javax.swing.JButton jbRefresh;
    private javax.swing.JButton jbSeek;
    private javax.swing.JLabel jlDateEnd;
    private javax.swing.JLabel jlDummy;
    private javax.swing.JLabel jlPac;
    private javax.swing.JPanel jpDetail;
    private javax.swing.JTextField jtfDateEnd;
    private javax.swing.JTextField jtfPac;
    private javax.swing.JTextField jtfSeek;
    // End of variables declaration//GEN-END:variables

    public void focusSeek() {
        if (jtfSeek.isEnabled()) {
            jtfSeek.requestFocus();
        }
    }

    public void actionSeek() {
        if (jbSeek.isEnabled()) {
            STableUtilities.actionSeek(miClient, moPaneDetails, jtfSeek.getText().trim());
        }
    }

    public void actionExportCsv() {
        if (jbExportCsv.isEnabled()) {
            STableUtilities.actionExportCsv(miClient, moPaneDetails, getTitle());
        }
    }

    public void actionRefresh() {
        showStampDetail(mnParamYear, mnParamPac, mtParamDateEnd);
    }

    public void refreshStampDetail() {
        mnParamYear = 0;
        mnParamPac = 0;
        mtParamDateEnd = null;

        jtfPac.setText("");
        jtfSeek.setText("");
        jtfSeek.setEnabled(false);
        jbSeek.setEnabled(false);
        jbExportCsv.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    public void showStampDetail(int nYear, int nPac, java.util.Date tDateEnd) {
        int nStock = 0;
        String sql = "";
        ResultSet resulSet = null;
        SDialogStampDetailRow oRow = null;
        SDataPac pac = null;

        mnParamYear = nYear;
        mnParamPac = nPac;
        mtParamDateEnd = tDateEnd;

        moPaneDetails.createTable();
        moPaneDetails.clearTableRows();

        try {
            sql = "SELECT s.dt, s.id_mov, ts.tp_xml, s.mov_in, s.mov_out, pac.pac, tcfd.tp_cfd, " +
                    "IF(cfd.fid_tp_cfd = " + SDataConstantsSys.TRNS_TP_CFD_INV + ", tdps.code, '') AS f_tp_doc, " +
                    "CASE " +
                    "WHEN cfd.fid_tp_cfd = " + SDataConstantsSys.TRNS_TP_CFD_INV + " THEN CONCAT(dps.num_ser, IF(dps.num_ser = '', '', '-'), dps.num) " +
                    "WHEN cfd.fid_tp_cfd = " + SDataConstantsSys.TRNS_TP_CFD_PAY_REC + " THEN CONCAT(cfd.ser, IF(cfd.ser = '', '', '-'), cfd.num)" +
                    "WHEN cfd.fid_tp_cfd = " + SDataConstantsSys.TRNS_TP_CFD_PAYROLL + " THEN CONCAT(hr.num_ser, IF(hr.num_ser = '', '', '-'), hr.num) END AS f_num, " +
                    "CASE " +
                    "WHEN cfd.fid_tp_cfd = " + SDataConstantsSys.TRNS_TP_CFD_INV + " THEN dpscob.code " +
                    "WHEN cfd.fid_tp_cfd = " + SDataConstantsSys.TRNS_TP_CFD_PAY_REC + " THEN cfdcob.code " +
                    "WHEN cfd.fid_tp_cfd = " + SDataConstantsSys.TRNS_TP_CFD_PAYROLL + " THEN '' END AS f_cob, " +
                    "cfd.uuid " +
                    "FROM trn_sign AS s " +
                    "INNER JOIN erp.trns_tp_sign AS ts ON s.fid_ct_sign = ts.id_ct_sign AND s.fid_tp_sign = ts.id_tp_sign " +
                    "INNER JOIN trn_pac AS pac ON s.id_pac = pac.id_pac " +
                    "LEFT OUTER JOIN trn_cfd AS cfd ON s.fid_cfd_n = cfd.id_cfd " +
                    "LEFT OUTER JOIN erp.trns_tp_cfd AS tcfd ON cfd.fid_tp_cfd = tcfd.id_tp_cfd " +
                    "LEFT OUTER JOIN trn_dps AS dps ON cfd.fid_dps_year_n = dps.id_year AND cfd.fid_dps_doc_n = dps.id_doc " +
                    "LEFT OUTER JOIN erp.trnu_tp_dps AS tdps ON dps.fid_ct_dps = tdps.id_ct_dps AND dps.fid_cl_dps = tdps.id_cl_dps AND dps.fid_tp_dps = tdps.id_tp_dps " +
                    "LEFT OUTER JOIN erp.bpsu_bpb AS bpb ON dps.fid_bpb = bpb.id_bpb " +
                    "LEFT OUTER JOIN erp.bpsu_bpb AS dpscob ON dps.fid_cob = dpscob.id_bpb " +
                    "LEFT OUTER JOIN erp.bpsu_bpb AS cfdcob ON cfd.fid_cob_n = cfdcob.id_bpb " +
                    "LEFT OUTER JOIN hrs_sie_pay_emp AS hr ON cfd.fid_pay_pay_n = hr.id_pay AND cfd.fid_pay_emp_n = hr.id_emp AND cfd.fid_pay_bpr_n = hr.fid_bpr_n AND NOT hr.b_del " +
                    "WHERE s.id_year = " + mnParamYear + " AND s.id_pac = " + mnParamPac + " AND s.dt <= '" + miClient.getSessionXXX().getFormatters().getDbmsDateFormat().format(mtParamDateEnd) + "' AND s.b_del = 0 " +
                    "ORDER BY s.dt, s.id_mov, ts.tp_xml, s.mov_in, s.mov_out, f_tp_doc, f_num, f_cob, cfd.uuid;";

            resulSet = miClient.getSession().getStatement().executeQuery(sql);
            while (resulSet.next()) {
                oRow = new SDialogStampDetailRow(miClient);
                oRow.setDate(resulSet.getDate("s.dt"));
                oRow.setTypeMove(resulSet.getString("ts.tp_xml"));
                oRow.setMovIn(resulSet.getInt("s.mov_in"));
                oRow.setMovOut(resulSet.getInt("s.mov_out"));
                oRow.setStock(nStock += (oRow.getMovIn() - oRow.getMovOut()));
                oRow.setTypeCfd(resulSet.getString("tcfd.tp_cfd"));
                oRow.setTypeDoc(resulSet.getString("f_tp_doc"));
                oRow.setNumberSer(resulSet.getString("f_num"));
                oRow.setBranch(resulSet.getString("f_cob"));
                oRow.setUuid(resulSet.getString("cfd.uuid"));
                oRow.prepareTableRow();
                moPaneDetails.addTableRow(oRow);
            }

            if (moPaneDetails.getTableGuiRowCount() > 0) {
                moPaneDetails.renderTableRows();
                moPaneDetails.setTableRowSelection(0);
                pac = (SDataPac) SDataUtilities.readRegistry(miClient, SDataConstants.TRN_PAC, new int[] { mnParamPac }, SLibConstants.EXEC_MODE_SILENT);

                jtfDateEnd.setText(miClient.getSessionXXX().getFormatters().getDateFormat().format(mtParamDateEnd));
                jtfPac.setText(pac.getPac());
                jtfSeek.setEnabled(true);
                jbSeek.setEnabled(true);
                jbExportCsv.setEnabled(true);
            }

            if (!isVisible()) {
                setVisible(true);
            }
        }
        catch (Exception e) {
            SLibUtilities.renderException(this, e);
        }
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        if (e.getSource() instanceof javax.swing.JButton) {
            JButton button = (JButton) e.getSource();

            if (button == jbClose) {
                actionClose();
            }
            else if (button == jbSeek) {
                actionSeek();
            }
            else if (button == jbExportCsv) {
                actionExportCsv();
            }
            else if (button == jbRefresh) {
                actionRefresh();
            }
        }
        else if (e.getSource() instanceof javax.swing.JTextField) {
            JTextField textField = (JTextField) e.getSource();

            if (textField == jtfSeek) {
                actionSeek();
            }
        }
    }
}