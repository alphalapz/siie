/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ImportPayrolls.java
 *
 * Created on 8/06/2010, 08:54:47 AM
 */

package erp.util.imp;

import erp.lib.SLibConstants;
import erp.lib.SLibTimeUtilities;
import erp.lib.SLibUtilities;
import erp.lib.data.SDataDatabase;
import java.awt.Cursor;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Barajas
 */
public class ImportPayrolls extends javax.swing.JFrame {

    private erp.lib.data.SDataDatabase moDbMySql;
    private erp.lib.data.SDataDatabase moDbSqlServer;

    /** Creates new form ImportPayrolls */
    public ImportPayrolls() {
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

        jlDateImport = new javax.swing.JLabel();
        jftDateImport = new javax.swing.JFormattedTextField();
        jlDateImportExample = new javax.swing.JLabel();
        jbImport = new javax.swing.JButton();
        jpbProgress = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Importar nóminas SIIE 1.0");

        jlDateImport.setText("Fecha de corte:");
        jlDateImport.setPreferredSize(new java.awt.Dimension(100, 20));

        jftDateImport.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        jftDateImport.setText("31/07/2010");
        jftDateImport.setPreferredSize(new java.awt.Dimension(75, 20));

        jlDateImportExample.setText("(dd/mm/yyyy)");
        jlDateImportExample.setPreferredSize(new java.awt.Dimension(100, 20));

        jbImport.setText("Importar");
        jbImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbImportActionPerformed(evt);
            }
        });

        jpbProgress.setStringPainted(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jpbProgress, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbImport))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlDateImport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jftDateImport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlDateImportExample, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDateImport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jftDateImport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlDateImportExample, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 235, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbImport)
                    .addComponent(jpbProgress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbImportActionPerformed
        importPayrolls();
    }//GEN-LAST:event_jbImportActionPerformed

    private void initComponentsExtra() {
        TimeZone.setDefault(SLibTimeUtilities.SysTimeZone);

        moDbMySql = new SDataDatabase(SLibConstants.DBMS_MY_SQL);

        //   2015-10-23
        //moDbMySql.connect("192.168.1.19", "3306", "erp_otsa", "root", "msroot");
        // Edwin
        moDbMySql.connect("localhost", "3306", "erp_apsa", "root", "msroot");
        moDbSqlServer = new SDataDatabase(SLibConstants.DBMS_SQL_SERVER_2005);
        //moDbSqlServer.connect("localhost\\SQLEXPRESS", "", "GS", "sa", "1120");
        // Brianda
        //moDbSqlServer.connect("SERVERLUI\\SQLEXPRESS", "", "APSA", "sa", "1120");
        moDbSqlServer.connect("BRIANDA-PC\\SQLEXPRESS", "", "APSA", "sa", "1120");
        jftDateImport.setText("31/12/2015");
    }
    
    private int getBizPartnerId(java.sql.Statement stMySql, int empleado) throws java.lang.Exception {
        int bizPartnerId = 0;
        String sql = "";
        ResultSet rsMySql = null;

        /*
        sql = "SELECT id_emp FROM erp.hrsu_emp " +
                "WHERE num='" + empleado + "'; ";
        */
        sql = "SELECT id_emp FROM erp.temp_map_num_bp " +
                "WHERE id_empleado=" + empleado + "; ";
        rsMySql = stMySql.executeQuery(sql);
        if (rsMySql.next()) {
            bizPartnerId = rsMySql.getInt("id_emp");
        }

        return bizPartnerId;
    }
    
    private int getEmployeePositionId(java.sql.Statement stMySql, int empleado) throws java.lang.Exception {
        int positionId = 0;
        String sql = "";
        ResultSet rsMySql = null;

        /*
        sql = "SELECT fk_pos FROM erp.hrsu_emp " +
                "WHERE num='" + empleado + "'; ";
        */
        sql = "SELECT id_pos FROM erp.temp_map_num_bp " +
                "WHERE id_empleado=" + empleado + "; ";
        rsMySql = stMySql.executeQuery(sql);
        if (rsMySql.next()) {
            positionId = rsMySql.getInt("id_pos");
        }

        return positionId;
    }
    
    private int getEmployeeShiftId(java.sql.Statement stMySql, int empleado) throws java.lang.Exception {
        int shiftId = 0;
        String sql = "";
        ResultSet rsMySql = null;

        /*
        sql = "SELECT fk_sht FROM erp.hrsu_emp " +
                "WHERE num='" + empleado + "'; ";
        */
        sql = "SELECT id_sht FROM erp.temp_map_num_bp " +
                "WHERE id_empleado=" + empleado + "; ";
        rsMySql = stMySql.executeQuery(sql);
        if (rsMySql.next()) {
            shiftId = rsMySql.getInt("id_sht");
        }

        return shiftId;
    }
    
    private int getEarningType(java.sql.Statement stMySql, int earning) throws java.lang.Exception {
        int earningType = 0;
        String sql = "";
        ResultSet rsMySql = null;

        sql = "SELECT fk_tp_ear FROM hrs_ear " +
                "WHERE id_ear = " + earning + "; ";
        rsMySql = stMySql.executeQuery(sql);
        if (rsMySql.next()) {
            earningType = rsMySql.getInt("fk_tp_ear");
        }

        return earningType;
    }
    
    private int getEarningBenefitType(java.sql.Statement stMySql, int earning) throws java.lang.Exception {
        int benefitType = 0;
        String sql = "";
        ResultSet rsMySql = null;

        sql = "SELECT fk_tp_ben FROM hrs_ear " +
                "WHERE id_ear = " + earning + "; ";
        rsMySql = stMySql.executeQuery(sql);
        if (rsMySql.next()) {
            benefitType = rsMySql.getInt("fk_tp_ben");
        }

        return benefitType;
    }
    
    private int getDeductionType(java.sql.Statement stMySql, int deduction) throws java.lang.Exception {
        int deductionType = 0;
        String sql = "";
        ResultSet rsMySql = null;

        sql = "SELECT fk_tp_ded FROM hrs_ded " +
                "WHERE id_ded = " + deduction + "; ";
        rsMySql = stMySql.executeQuery(sql);
        if (rsMySql.next()) {
            deductionType = rsMySql.getInt("fk_tp_ded");
        }

        return deductionType;
    }
    
    private int getDeductionBenefitType(java.sql.Statement stMySql, int deduction) throws java.lang.Exception {
        int benefitType = 0;
        String sql = "";
        ResultSet rsMySql = null;

        sql = "SELECT fk_tp_ben FROM hrs_ded " +
                "WHERE id_ded = " + deduction + "; ";
        rsMySql = stMySql.executeQuery(sql);
        if (rsMySql.next()) {
            benefitType = rsMySql.getInt("fk_tp_ben");
        }

        return benefitType;
    }
    
    private int getLoanType(java.sql.Statement stMySql, int deduction) throws java.lang.Exception {
        int loanType = 0;
        String sql = "";
        ResultSet rsMySql = null;

        sql = "SELECT fk_tp_loan FROM hrs_ded " +
                "WHERE id_ded = " + deduction + "; ";
        rsMySql = stMySql.executeQuery(sql);
        if (rsMySql.next()) {
            loanType = rsMySql.getInt("fk_tp_loan");
        }

        return loanType;
    }
    
    private int getLoanIdMap(java.sql.Statement stMySql, int empleado, int credito, int prestamo) throws java.lang.Exception {
        int loanId = 0;
        String sql = "";
        ResultSet rsMySql = null;

        sql = "SELECT id_loan FROM temp_map_loan " +
                "WHERE empleado = " + empleado + (credito != SLibConstants.UNDEFINED ? " AND credito = " + credito : " AND prestamo = " + prestamo) + "; ";
        rsMySql = stMySql.executeQuery(sql);
        if (rsMySql.next()) {
            loanId = rsMySql.getInt("id_loan");
        }

        return loanId;
    }

    private void importPayrolls() {
        int nIdNomina = 0;
        int nYear = 0;
        int nPeriod = 0;
        int nIdEmpleado = 0;
        int nBizPartner = 0;
        int nPayroll = 0;
        int nPayrollCount = 0;
        int nAreaSalario = 0;
        int nAreaSalarioReferencia = 0;
        int nDiasNomina = 0;
        int nPeriodoPagoNomina = 0;
        int nPeriodoPagoRecibo = 0;
        int nDiasLaborables = 0;
        int nWorkHrsDay = 0;
        double dPaymentDaily = 0;
        double dPaymentHour = 0;
        int nDiasLaborados = 0;
        int nDiasNoLaboradosConPermisoConGoce = 0;
        int nDiasFaltadosVacaciones = 0;
        int nDiasNoLaboradosSinPermiso = 0;
        int nDiasNoLaboradosConPermisoSinGoce = 0;
        int nDiasNoLaboradosAdmtivaReloj = 0;
        int nDiasNoLaboradosAdmtivaSusp = 0;
        int nDiasNoLaboradosAdmtivaOtros = 0;
        int nDiasAusenciaVacIncap = 0;
        int nDiasFaltadosIncap = 0;
        int nDiasFaltadosIncapSs = 0;
        int nDiasNoLaboradosPagados = 0;
        int nDiasNoLaboradosNoPagados = 0;
        double dImpuestoTeorico = 0;
        double dCreditoSalTeorico = 0;
        int nEmployeeDepartament = 0;
        int nEmployeePosition = 0;
        int nEmployeeShift = 0;
        int nTipoSalario = 0;
        String sFechaBaja = "";
        String sCuentaBancoNum = "";
        double dUnidades = 0;
        double dAmount = 0;
        double dAmountTaxable = 0;
        int nEarningType = 0;
        int nEarning = 0;
        int nEarningBenefitType = 0;
        int nDeductionType = 0;
        int nDeduction = 0;
        int nDeductionBenefitType = 0;
        int nCredito = 0;
        int nPrestamo = 0;
        int nLoanType = 0;
        int nWorkedDays = 0;
        String sNum_Ser = "";
        int nNum = 0;
        int nPaymentSysType = 0;
        java.util.Date tDateIss = null;
        java.util.Date tDatePay = null;
        String sSql = "";
        boolean bError = false;
        Cursor oCursor = null;
        Statement stMySql = null;
        Statement stMySqlAux = null;
        Statement stSqlServerPayroll = null;
        Statement stSqlServerReceipt = null;
        Statement stSqlServerReceiptEarnings = null;
        Statement stSqlServerReceiptDeductions = null;
        ResultSet rsMySql = null;
        ResultSet rsMySqlAux = null;
        ResultSet rsSqlServerPayroll = null;
        ResultSet rsSqlServerReceipt = null;
        ResultSet rsSqlServerReceiptEarnings = null;
        ResultSet rsSqlServerReceiptDeductions = null;
        SimpleDateFormat sdf = null;
        SimpleDateFormat sdfMySql = null;
        SimpleDateFormat sdfMagic = null;
        java.util.Date tDateStart = null;
        java.util.Date tDateEnd = null;
        java.util.Date tDateBenefit = null;
        java.util.Date tDateHire = null;
        java.util.Date tDateDis = null;
        java.util.Date tDateImport = null;
        ImportProgressThread oProgressThread = null;

        try {
            oCursor = getCursor();
            setCursor(new Cursor(Cursor.WAIT_CURSOR));

            jpbProgress.setValue(0);
            oProgressThread = new ImportProgressThread(this);
            oProgressThread.startThread();

            sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdfMySql = new SimpleDateFormat("yyyy-MM-dd");
            sdfMagic = new SimpleDateFormat("yyyyMMdd");
            tDateImport = sdf.parse(jftDateImport.getText());
            nYear = SLibTimeUtilities.digestYear(tDateImport)[0];
            nPeriod = SLibTimeUtilities.digestYearMonth(tDateImport)[1];

            stMySql = moDbMySql.getConnection().createStatement();
            stMySqlAux = moDbMySql.getConnection().createStatement();
            stSqlServerPayroll = moDbSqlServer.getConnection().createStatement();
            stSqlServerReceipt = moDbSqlServer.getConnection().createStatement();
            stSqlServerReceiptEarnings = moDbSqlServer.getConnection().createStatement();
            stSqlServerReceiptDeductions = moDbSqlServer.getConnection().createStatement();

            // Delete previously imported payroll:

            sSql = "DELETE hrs_pay_rcp_ded FROM hrs_pay_rcp_ded, hrs_pay_rcp, hrs_pay " +
                    "WHERE hrs_pay_rcp.id_pay = hrs_pay.id_pay AND " +
                    "hrs_pay_rcp_ded.id_pay = hrs_pay_rcp.id_pay AND hrs_pay_rcp_ded.id_emp = hrs_pay_rcp.id_emp AND " +
                    "hrs_pay.per_year = " + nYear + " AND hrs_pay.per <= " + nPeriod + "; ";
            stMySql.execute(sSql);

            sSql = "DELETE hrs_pay_rcp_ear FROM hrs_pay_rcp_ear, hrs_pay_rcp, hrs_pay " +
                    "WHERE hrs_pay_rcp.id_pay = hrs_pay.id_pay AND " +
                    "hrs_pay_rcp_ear.id_pay = hrs_pay_rcp.id_pay AND hrs_pay_rcp_ear.id_emp = hrs_pay_rcp.id_emp AND " +
                    "hrs_pay.per_year = " + nYear + " AND hrs_pay.per <= " + nPeriod + "; ";
            stMySql.execute(sSql);

            sSql = "DELETE hrs_pay_rcp_iss FROM hrs_pay_rcp_iss, hrs_pay_rcp, hrs_pay " +
                    "WHERE hrs_pay_rcp.id_pay = hrs_pay.id_pay AND " +
                    "hrs_pay_rcp_iss.id_pay = hrs_pay_rcp.id_pay AND hrs_pay_rcp_iss.id_emp = hrs_pay_rcp.id_emp AND " +
                    "hrs_pay.per_year = " + nYear + " AND hrs_pay.per <= " + nPeriod + "; ";
            stMySql.execute(sSql);

            sSql = "DELETE hrs_pay_rcp FROM hrs_pay_rcp, hrs_pay " +
                    "WHERE hrs_pay_rcp.id_pay = hrs_pay.id_pay AND " +
                    "hrs_pay.per_year = " + nYear + " AND hrs_pay.per <= " + nPeriod + "; ";
            stMySql.execute(sSql);
            
            sSql = "DELETE FROM hrs_pay WHERE per_year = " + nYear + " AND hrs_pay.per <= " + nPeriod + "; ";
            stMySql.execute(sSql);

            // Import payroll:

            sSql = "SELECT COUNT(*) FROM dbo.nom_nominas WHERE periodo<=" + nPeriod + " AND ejercicio=" + nYear + "; ";
            rsSqlServerPayroll = stSqlServerPayroll.executeQuery(sSql);
            if (!rsSqlServerPayroll.next()) {
                throw new Exception("No hay nóminas para importar.");
            }
            else {
                nPayrollCount = rsSqlServerPayroll.getInt(1);
            }

            sSql = "SELECT * " +
                    "FROM dbo.nom_nominas " +
                    "WHERE periodo<=" + nPeriod + " AND ejercicio=" + nYear + "; ";
            rsSqlServerPayroll = stSqlServerPayroll.executeQuery(sSql);
            while (rsSqlServerPayroll.next()) {
                nIdNomina = rsSqlServerPayroll.getInt("id_nomina");
                tDateStart = sdfMagic.parse(rsSqlServerPayroll.getString("fecha_ini"));
                tDateEnd = sdfMagic.parse(rsSqlServerPayroll.getString("fecha_fin"));
                nPeriodoPagoNomina = rsSqlServerPayroll.getInt("fid_periodo_pago_tp");
                                
                nDiasNomina = rsSqlServerPayroll.getInt("dias_nomina");
                nDiasLaborables = rsSqlServerPayroll.getInt("dias_laborables");
                nAreaSalario = rsSqlServerPayroll.getInt("fid_area_salario");
                nAreaSalarioReferencia = rsSqlServerPayroll.getInt("fid_area_salario_ref");
                nWorkedDays = (int) SLibTimeUtilities.getDaysDiff(tDateEnd, tDateStart) + 1;

                sSql = "INSERT INTO hrs_pay VALUES (" +
                        nIdNomina + ", " + nYear + ", " + nYear + ", " + rsSqlServerPayroll.getInt("periodo") + ", " + rsSqlServerPayroll.getInt("nomina_num") + ", " + 
                        "'" + sdfMySql.format(tDateStart) + "', '" + sdfMySql.format(tDateEnd) + "', " /*DATEDIFF('" + sdfMySql.format(tDateEnd) + "', '" + sdfMySql.format(tDateStart) + "') + 1"*/ + (nWorkedDays < 0 ? 0 : nWorkedDays) + ", " + nDiasNomina + ", " + (nDiasLaborables < 0 ? 0 : nDiasLaborables) + ", " +
                        rsSqlServerPayroll.getDouble("sma") + ", " + rsSqlServerPayroll.getDouble("smar") + ", '" + rsSqlServerPayroll.getString("comentarios") + "', " + rsSqlServerPayroll.getBoolean("es_normal") + ", " + rsSqlServerPayroll.getBoolean("es_con_calc_ss") + ", 0, 0, " + rsSqlServerPayroll.getBoolean("es_cerrada") + ", 0, " + (nPeriodoPagoNomina == 3 ? 2 : nPeriodoPagoNomina) + ", " +
                        (nAreaSalario != 0 ? nAreaSalario : nAreaSalarioReferencia) + ", " + nAreaSalarioReferencia + ", " + rsSqlServerPayroll.getInt("fid_calc_impuesto_tp") + ", " + rsSqlServerPayroll.getInt("fid_tabla_impuesto") + ", " + rsSqlServerPayroll.getInt("fid_tabla_credito_sal") + ", " + rsSqlServerPayroll.getInt("fid_tabla_ss") + ", " +
                        "1, 1, 1, NOW(), NOW(), NOW()); ";
                stMySql.execute(sSql);

                // Import payroll receipt:

                sSql = "SELECT * " +
                        "FROM dbo.nom_nominas_emp " +
                        "WHERE id_nomina=" + nIdNomina + "; ";
                rsSqlServerReceipt = stSqlServerReceipt.executeQuery(sSql);
                
                while (rsSqlServerReceipt.next()) {
                    nIdEmpleado = rsSqlServerReceipt.getInt("id_empleado");
                    nBizPartner = getBizPartnerId(stMySql, nIdEmpleado);
                    tDateBenefit = sdfMagic.parse(rsSqlServerReceipt.getString("fecha_prestaciones"));
                    tDateHire = sdfMagic.parse(rsSqlServerReceipt.getString("fecha_alta"));
                    sFechaBaja = rsSqlServerReceipt.getString("fecha_baja");
                    tDateDis = null;
                    if (Integer.parseInt(sFechaBaja) != 0) {
                        tDateDis = sdfMagic.parse(sFechaBaja);
                    }
                    sCuentaBancoNum = rsSqlServerReceipt.getString("cta_banco_num");
                    nWorkHrsDay = rsSqlServerReceipt.getInt("horas_jornada");
                    dPaymentDaily = rsSqlServerReceipt.getDouble("salario_b");
                    dPaymentHour = dPaymentDaily / nWorkHrsDay;
                    nDiasLaborados = rsSqlServerReceipt.getInt("dias_laborados");
                    nDiasNoLaboradosSinPermiso = rsSqlServerReceipt.getInt("dias_no_lab_s_permiso");
                    nDiasNoLaboradosConPermisoSinGoce = rsSqlServerReceipt.getInt("dias_no_lab_c_permiso_s_goce");
                    nDiasNoLaboradosConPermisoConGoce = rsSqlServerReceipt.getInt("dias_no_lab_c_permiso_c_goce");
                    nDiasNoLaboradosAdmtivaReloj = rsSqlServerReceipt.getInt("dias_no_lab_admtiva_reloj");
                    nDiasNoLaboradosAdmtivaSusp = rsSqlServerReceipt.getInt("dias_no_lab_admtiva_susp");
                    nDiasNoLaboradosAdmtivaOtros = rsSqlServerReceipt.getInt("dias_no_lab_admtiva_otros");
                    nDiasAusenciaVacIncap = rsSqlServerReceipt.getInt("dias_ausencia_vac_incap");
                    nDiasFaltadosVacaciones = rsSqlServerReceipt.getInt("dias_faltados_vac");
                    nDiasFaltadosIncap = rsSqlServerReceipt.getInt("dias_faltados_incap");
                    nDiasFaltadosIncapSs = rsSqlServerReceipt.getInt("dias_faltados_incap_ss");
                    nDiasNoLaboradosPagados = nDiasNoLaboradosConPermisoConGoce + nDiasFaltadosVacaciones;
                    nDiasNoLaboradosNoPagados = nDiasNoLaboradosSinPermiso + nDiasNoLaboradosConPermisoSinGoce + nDiasNoLaboradosAdmtivaReloj + nDiasNoLaboradosAdmtivaSusp + nDiasNoLaboradosAdmtivaOtros +
                        nDiasAusenciaVacIncap + nDiasFaltadosIncap + nDiasFaltadosIncapSs;
                    dImpuestoTeorico = rsSqlServerReceipt.getDouble("impuesto_teorico");
                    dCreditoSalTeorico = rsSqlServerReceipt.getDouble("credito_sal_teorico");
                    nPeriodoPagoRecibo = rsSqlServerReceipt.getInt("fid_periodo_pago_tp");
                    nTipoSalario = rsSqlServerReceipt.getInt("fid_salario_tp");
                    nEmployeeDepartament = rsSqlServerReceipt.getInt("fid_departamento");
                    nEmployeePosition = getEmployeePositionId(stMySql, nIdEmpleado);
                    nEmployeeShift = getEmployeeShiftId(stMySql, nIdEmpleado);
                    
                    if (nPeriodoPagoNomina != nPeriodoPagoRecibo) {
                        throw new Exception("El periodo de pago de la nómina es distinto del periodo de pagop del recibo.");
                    }
                    
                    /* OTRAS EMPRESAS
                    sSql = "INSERT INTO hrs_pay_rcp VALUES (" +
                            nIdNomina + ", " + nBizPartner + ", '" + sdfMySql.format(tDateBenefit) + "', '" + sdfMySql.format(tDateHire) + "', " + (tDateDis == null ? "NULL" : "'" + sdfMySql.format(tDateDis) + "'") + ", " + 
                            dPaymentDaily + ", " + rsSqlServerReceipt.getDouble("sueldo") + ", " + rsSqlServerReceipt.getDouble("salario_bc") + ", " + nWorkHrsDay + ", " + dPaymentDaily + ", " + dPaymentHour + ", 1, " +
                            (nPeriodoPago == 1 ? "1.1667" : "1") + ", " + nDiasNomina + ", " + nDiasLaborables + ", " + nDiasLaborados + ", 0, 0, 0, 0, " + nDiasNoLaboradosPagados + ", " + nDiasNoLaboradosNoPagados + ", " + (nDiasNoLaboradosPagados + nDiasNoLaboradosNoPagados) + ", " +
                            nDiasLaborados + ", " + rsSqlServerReceipt.getDouble("dias_pagados") + ", 0, 0, 0, 0, 0, 0, 0, " + dImpuestoTeorico + ", " + dImpuestoTeorico + ", " + dCreditoSalTeorico + ", " + dCreditoSalTeorico + ", 0, 0, " + rsSqlServerReceipt.getDouble("impuesto_acumulado") + ", 0, " +
                            rsSqlServerReceipt.getDouble("credito_sal_acumulado") + ", 0, " + rsSqlServerReceipt.getBoolean("es_reg_activo") + ", " + rsSqlServerReceipt.getBoolean("es_con_septimo") + ", 0, 0, " + rsSqlServerReceipt.getInt("fid_periodo_pago_tp") + ", " + (nTipoSalario == 0 ? "1" : nTipoSalario) + ", " +
                            (rsSqlServerReceipt.getInt("fid_empleado_tp") + 1) + ", " + rsSqlServerReceipt.getInt("fid_empleado_cat") + ", " + rsSqlServerReceipt.getInt("fid_area_salario") + ", " + (nEmployeeDepartament + 1) + ", " + nEmployeePosition + ", " + nEmployeeShift + ", 2, 5, " + 
                            "1, 1, NOW(), NOW()); ";
                    */
                    
                    // UNIVERSAL IMPRESORA:
                    
                   sSql = "INSERT INTO hrs_pay_rcp VALUES (" +
                            nIdNomina + ", " + nBizPartner + ", '" + sdfMySql.format(tDateBenefit) + "', '" + sdfMySql.format(tDateHire) + "', " + (tDateDis == null ? "NULL" : "'" + sdfMySql.format(tDateDis) + "'") + ", " + 
                            dPaymentDaily + ", " + rsSqlServerReceipt.getDouble("sueldo") + ", " + rsSqlServerReceipt.getDouble("salario_bc") + ", " + nWorkHrsDay + ", " + dPaymentDaily + ", " + dPaymentHour + ", 1, " +
                            (nPeriodoPagoRecibo == 1 ? "1.1667" : "1") + ", " + nDiasNomina + ", " + nDiasLaborables + ", " + nDiasLaborados + ", 0, 0, 0, 0, " + nDiasNoLaboradosPagados + ", " + nDiasNoLaboradosNoPagados + ", " + (nDiasNoLaboradosPagados + nDiasNoLaboradosNoPagados) + ", " +
                            nDiasLaborados + ", " + rsSqlServerReceipt.getDouble("dias_pagados") + ", 0, 0, 0, 0, 0, 0, 0, " + dImpuestoTeorico + ", " + dImpuestoTeorico + ", " + dCreditoSalTeorico + ", " + dCreditoSalTeorico + ", 0, 0, " + rsSqlServerReceipt.getDouble("impuesto_acumulado") + ", 0, " +
                            rsSqlServerReceipt.getDouble("credito_sal_acumulado") + ", 0, " + rsSqlServerReceipt.getBoolean("es_reg_activo") + ", " + rsSqlServerReceipt.getBoolean("es_con_septimo") + ", 0, 0, " + (nPeriodoPagoRecibo == 3 ? 2 : nPeriodoPagoRecibo) + ", " + (nTipoSalario == 0 ? "1" : nTipoSalario) + ", " +
                            (rsSqlServerReceipt.getInt("fid_empleado_tp") + 1) + ", " + rsSqlServerReceipt.getInt("fid_empleado_cat") + ", " + rsSqlServerReceipt.getInt("fid_area_salario") + ", " + (nEmployeeDepartament >= 10 ? nEmployeeDepartament - 7 : nEmployeeDepartament + 1) + ", " + nEmployeePosition + ", " + nEmployeeShift + ", 2, 5, " + 
                            "1, 1, NOW(), NOW()); ";
                    
                    stMySql.execute(sSql);
                    
                    // Import payroll receipt earnings:

                    sSql = "SELECT * " +
                            "FROM dbo.nom_nominas_emp_movs_p " +
                            "WHERE id_nomina=" + nIdNomina + " AND id_empleado=" + nIdEmpleado + "; ";
                    rsSqlServerReceiptEarnings = stSqlServerReceiptEarnings.executeQuery(sSql);

                    while (rsSqlServerReceiptEarnings.next()) {
                        dUnidades = rsSqlServerReceiptEarnings.getDouble("unidades");
                        dAmount = rsSqlServerReceiptEarnings.getDouble("monto");
                        dAmountTaxable = rsSqlServerReceiptEarnings.getDouble("monto_gravado");
                        nEarning = rsSqlServerReceiptEarnings.getInt("fid_percepcion");
                        nEarningType = getEarningType(stMySql, nEarning);
                        nEarningBenefitType = getEarningBenefitType(stMySql, nEarning);
                        
                        sSql = "INSERT INTO hrs_pay_rcp_ear VALUES (" +
                            nIdNomina + ", " + nBizPartner + ", " + rsSqlServerReceiptEarnings.getInt("id_mov") + ", " + (dUnidades == 0 ? 1 : dUnidades) + ", " + (dUnidades == 0 ? 1 : dUnidades) + ", 1, " + 
                            (dAmount / (dUnidades == 0 ? 1 : dUnidades)) + ", " + dAmount + ", " + dAmount + ", " + (dAmount - dAmountTaxable) + ", " + dAmountTaxable + ", " +
                            "0, 0, 0, 1, 1, 0, 1, " + nEarningType + ", " + nEarning + ", " + nEarningBenefitType + ", NULL, NULL, NULL, " +
                            "1, 1, NOW(), NOW()); ";
                    
                        stMySql.execute(sSql);
                    }
                    
                    // Import payroll receipt deductions:

                    sSql = "SELECT * " +
                            "FROM dbo.nom_nominas_emp_movs_d " +
                            "WHERE id_nomina=" + nIdNomina + " AND id_empleado=" + nIdEmpleado + "; ";
                    rsSqlServerReceiptDeductions = stSqlServerReceiptDeductions.executeQuery(sSql);

                    while (rsSqlServerReceiptDeductions.next()) {
                        dAmount = rsSqlServerReceiptDeductions.getDouble("monto");
                        nDeduction = rsSqlServerReceiptDeductions.getInt("fid_deduccion");
                        nDeductionType = getDeductionType(stMySql, nDeduction);
                        nDeductionBenefitType = getDeductionBenefitType(stMySql, nDeduction);
                        nCredito = rsSqlServerReceiptDeductions.getInt("fid_credito");
                        nPrestamo = rsSqlServerReceiptDeductions.getInt("fid_prestamo");
                        nLoanType = getLoanType(stMySql, nDeduction);
                        
                        sSql = "INSERT INTO hrs_pay_rcp_ded VALUES (" +
                            nIdNomina + ", " + nBizPartner + ", " + rsSqlServerReceiptDeductions.getInt("id_mov") + ", 1, 1, 1, " + 
                            dAmount + ", " + dAmount + ", " + dAmount + ", " +
                            "0, 0, 1, 1, 0, 1, " + nDeductionType + ", " + nDeduction + ", " + nDeductionBenefitType + ", " + (nCredito != 0 || nPrestamo != 0 ? nBizPartner : "NULL") + ", " + 
                            (nCredito != 0 || nPrestamo != 0 ? (nCredito != 0 ? getLoanIdMap(stMySql, nIdEmpleado, nCredito, nPrestamo) : getLoanIdMap(stMySql, nIdEmpleado, nCredito, nPrestamo)) : "NULL") + ", " + (nCredito != 0 || nPrestamo != 0 ? nLoanType : "NULL") + ", " +
                            "1, 1, NOW(), NOW()); ";
                    
                        stMySql.execute(sSql);
                    }
                    
                    // Create payroll receipt issues:
                    
                    tDatePay = tDateIss = tDateEnd;
                    
                    sSql = "SELECT p.id_pay, pe.id_emp, p.dt_pay, pe.num_ser, pe.num, pe.fid_tp_pay_sys " +
                            "FROM hrs_sie_pay AS p " +
                            "INNER JOIN hrs_sie_pay_emp AS pe ON pe.id_pay = p.id_pay " +
                            "WHERE pe.id_pay = " + nIdNomina + " AND pe.id_emp = " + nIdEmpleado + " ";
                    
                    rsMySqlAux = stMySqlAux.executeQuery(sSql);
                    if (rsMySqlAux.next()) {
                        tDatePay = rsMySqlAux.getDate("p.dt_pay");
                        tDateIss = tDatePay;
                        sNum_Ser = rsMySqlAux.getString("pe.num_ser");
                        nNum = rsMySqlAux.getInt("pe.num");
                        nPaymentSysType = rsMySqlAux.getInt("pe.fid_tp_pay_sys");
                    }
                    
                    String bankAcco = sCuentaBancoNum.trim().length()>20 ? sCuentaBancoNum.trim().substring(0, 19) : sCuentaBancoNum.trim();
                    
                    sSql = "INSERT INTO hrs_pay_rcp_iss VALUES (" +
                            nIdNomina + ", " + nBizPartner + ", 1, '" + sNum_Ser + "', " + nNum + ", '" + sdfMySql.format(tDateIss) + "', '" + sdfMySql.format(tDatePay) + "', '" +
                        bankAcco + "', 0, 0, 0, 0, 2, 30, " + (nPaymentSysType == 0 ? "1" : nPaymentSysType) + ", 1, 1, NOW(), NOW()); ";
                    
                    stMySql.execute(sSql);
                    
                    // Update payroll receipt value:
                    
                    sSql = "UPDATE hrs_pay_rcp SET  " +
                            "ear_exem_r = (SELECT COALESCE(SUM(amt_exem), 0) FROM hrs_pay_rcp_ear WHERE id_pay = " + nIdNomina + " AND id_emp = " + nBizPartner + "),  " +
                            "ear_taxa_r = (SELECT COALESCE(SUM(amt_taxa), 0) FROM hrs_pay_rcp_ear WHERE id_pay = " + nIdNomina + " AND id_emp = " + nBizPartner + "), " +
                            "ear_r = (SELECT COALESCE(SUM(amt_r), 0) FROM hrs_pay_rcp_ear WHERE id_pay = " + nIdNomina + " AND id_emp = " + nBizPartner + "), " +
                            "ded_r = (SELECT COALESCE(SUM(amt_r), 0) FROM hrs_pay_rcp_ded WHERE id_pay = " + nIdNomina + " AND id_emp = " + nBizPartner + "), " +
                            "pay_r = ((SELECT COALESCE(SUM(amt_r), 0) FROM hrs_pay_rcp_ear WHERE id_pay = " + nIdNomina + " AND id_emp = " + nBizPartner + ") - " +
                            "(SELECT COALESCE(SUM(amt_r), 0) FROM hrs_pay_rcp_ded WHERE id_pay = " + nIdNomina + " AND id_emp = " + nBizPartner + ")) " +
                            "WHERE  id_pay = " + nIdNomina + " AND id_emp = " + nBizPartner + ";";
                            
                    stMySql.execute(sSql);
                    
                    // Update payroll receipt issue value:
                    
                    sSql = "UPDATE hrs_pay_rcp_iss SET " +
                            "ear_r = (SELECT ear_r  FROM hrs_pay_rcp WHERE id_pay = " + nIdNomina + " AND id_emp = " + nBizPartner + "), " +
                            "ded_r = (SELECT ded_r FROM hrs_pay_rcp WHERE id_pay = " + nIdNomina + " AND id_emp = " + nBizPartner + "), " +
                            "pay_r = (SELECT pay_r FROM hrs_pay_rcp WHERE id_pay = " + nIdNomina + " AND id_emp = " + nBizPartner + ") " +
                            "WHERE id_pay = " + nIdNomina + " AND id_emp = " + nBizPartner + ";  ";
                    
                    stMySql.execute(sSql);
                }

                jpbProgress.setValue((int) ((++nPayroll / (double) nPayrollCount) * 100d));
                System.out.println("Payroll " + nPayroll + " out of " + nPayrollCount + "; id_nomina=" + nIdNomina + ", ejercicio=" + nYear + ".");
            }

            // Update payroll receipt values:

            //lookUpdatePayrollReceiptValue(stSqlServer, stMySql, nYear, nYear, nYear)
        }
        catch (Exception e) {
            bError = true;
            SLibUtilities.printOutException(this, e);
            System.err.println("Payroll id_nomina=" + nIdNomina + ", ejercicio=" + nYear + ", id_empleado=" + nIdEmpleado + ".");
            System.err.println("SQL: [" + sSql + "]");
        }
        finally {
            oProgressThread.stopThread();
            setCursor(oCursor);
            if (!bError) {
                System.err.println("El proceso ha finalizado exitosamente.");
                JOptionPane.showMessageDialog(this, "El proceso ha finalizado exitosamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                System.err.println("El proceso ha finalizado con errores.");
                JOptionPane.showMessageDialog(this, "El proceso ha finalizado con errores.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ImportPayrolls().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbImport;
    private javax.swing.JFormattedTextField jftDateImport;
    private javax.swing.JLabel jlDateImport;
    private javax.swing.JLabel jlDateImportExample;
    private javax.swing.JProgressBar jpbProgress;
    // End of variables declaration//GEN-END:variables

}
