/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.mod.hrs.db;

import sa.lib.SLibUtils;
import sa.lib.grid.SGridRow;

/**
 *
 * @author Néstor Ávalos, Sergio Flores
 */
public class SRowPayrollEmployee implements SGridRow {
    
    public static final int CASE_EMPLOYEE = 1;
    public static final int CASE_RECEIPT = 2;

    protected int mnRowCase;
    protected int mnPkEmployeeId;
    protected int mnFkPaymentTypeId;
    protected String msNumber;
    protected String msName;
    protected boolean mbActive;
    protected int mnRecruitmentSchemeTypeId;
    protected String msRecruitmentSchemeType;
    protected double mdTotalEarnings;
    protected double mdTotalDeductions;
    protected int mnBankId;
    protected String msBank; // name of bank from banks catalog of SAT
    protected String msBankAccount; // number of bank account
    protected SHrsReceipt moHrsReceipt;

    /**
     * Creates new row payroll employee.
     * @param rowCase Row case: CASE_EMPLOYEE, CASE_RECEIPT.
     */
    public SRowPayrollEmployee(final int rowCase) {
        mnRowCase = rowCase;
        mnPkEmployeeId = 0;
        mnFkPaymentTypeId = 0;
        msNumber = "";
        msName = "";
        mbActive = false;
        mnRecruitmentSchemeTypeId = 0;
        msRecruitmentSchemeType = "";
        mdTotalEarnings = 0;
        mdTotalDeductions = 0;
        mnBankId = 0;
        msBank = "";
        msBankAccount = "";
        moHrsReceipt = null;
    }
    
    /**
     * Creates new row payroll employee.
     * @param row Row to copy.
     */
    public SRowPayrollEmployee(SRowPayrollEmployee row) {
        mnRowCase = row.getRowCase();
        mnPkEmployeeId = row.getPkEmployeeId();
        mnFkPaymentTypeId = row.getFkPaymentTypeId();
        msNumber = row.getNumber();
        msName = row.getName();
        mbActive = row.isActive();
        mnRecruitmentSchemeTypeId = row.getRecruitmentSchemeTypeId();
        msRecruitmentSchemeType = row.getRecruitmentSchemeType();
        mdTotalEarnings = row.getTotalEarnings();
        mdTotalDeductions = row.getTotalDeductions();
        mnBankId = row.getBankId();
        msBank = row.getBank();
        msBankAccount = row.getBankAccount();
        moHrsReceipt = row.getHrsReceipt();
    }

    public void setRowCase(int n) { mnRowCase = n; }
    public void setPkEmployeeId(int n) { mnPkEmployeeId = n; }
    public void setFkPaymentTypeId(int n) { mnFkPaymentTypeId = n; }
    public void setNumber(String s) { msNumber = s; }
    public void setName(String s) { msName = s; }
    public void setActive(boolean b) { mbActive = b; }
    public void setRecruitmentSchemeTypeId(int n) { mnRecruitmentSchemeTypeId = n; }
    public void setRecruitmentSchemeType(String s) { msRecruitmentSchemeType = s; }
    public void setTotalEarnings(double d) { mdTotalEarnings = d; }
    public void setTotalDeductions(double d) { mdTotalDeductions = d; }
    public void setBankId(int n) { mnBankId = n; }
    public void setBank(String s) { msBank = s; }
    public void setBankAccount(String s) { msBankAccount = s; }
    public void setHrsReceipt(SHrsReceipt o) { moHrsReceipt = o; }

    public int getRowCase() { return mnRowCase; }
    public int getPkEmployeeId() { return mnPkEmployeeId; }
    public int getFkPaymentTypeId() { return mnFkPaymentTypeId; }
    public String getNumber() { return msNumber; }
    public String getName() { return msName; }
    public boolean isActive() { return mbActive; }
    public int getRecruitmentSchemeTypeId() { return mnRecruitmentSchemeTypeId; }
    public String getRecruitmentSchemeType() { return msRecruitmentSchemeType; }
    public double getTotalEarnings() { return mdTotalEarnings; }
    public double getTotalDeductions() { return mdTotalDeductions; }
    public int getBankId() { return mnBankId; }
    public String getBank() { return msBank; }
    public String getBankAccount() { return msBankAccount; }
    public SHrsReceipt getHrsReceipt() { return moHrsReceipt; }

    public double getTotalNet() {
        return SLibUtils.roundAmount(mdTotalEarnings - mdTotalDeductions);
    }
    
    public void clearReceipt() {
        mdTotalEarnings = 0;
        mdTotalDeductions = 0;
        moHrsReceipt = null;
    }
    
    @Override
    public int[] getRowPrimaryKey() {
        return new int[] { mnPkEmployeeId };
    }

    @Override
    public String getRowCode() {
        return getNumber();
    }

    @Override
    public String getRowName() {
        return getName();
    }

    @Override
    public boolean isRowSystem() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isRowDeletable() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isRowEdited() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setRowEdited(final boolean edited) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object getRowValueAt(int row) {
        Object value = null;
        
        switch (mnRowCase) {
            case CASE_EMPLOYEE:
                switch(row) {
                    case 0:
                        value = msName;
                        break;
                    case 1:
                        value = msNumber;
                        break;
                    case 2:
                        value = mbActive;
                        break;
                    case 3:
                        value = msRecruitmentSchemeType;
                        break;
                    default:
                }
                break;
                
            case CASE_RECEIPT:
                switch(row) {
                    case 0:
                        value = msName;
                        break;
                    case 1:
                        value = msNumber;
                        break;
                    case 2:
                        value = mdTotalEarnings;
                        break;
                    case 3:
                        value = mdTotalDeductions;
                        break;
                    case 4:
                        value = getTotalNet();
                        break;
                    case 5:
                        value = msBank;
                        break;
                    case 6:
                        value = msBankAccount;
                        break;
                    default:
                }
                break;
                
            default:
        }

        return value;
    }

    @Override
    public void setRowValueAt(Object value, int row) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
