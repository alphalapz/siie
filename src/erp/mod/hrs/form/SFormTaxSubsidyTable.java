/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.mod.hrs.form;

import erp.mod.SModConsts;
import erp.mod.hrs.db.SDbTaxSubsidyTable;
import erp.mod.hrs.db.SDbTaxSubsidyTableRow;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import sa.lib.SLibConsts;
import sa.lib.SLibUtils;
import sa.lib.db.SDbRegistry;
import sa.lib.grid.SGridColumnForm;
import sa.lib.grid.SGridConsts;
import sa.lib.grid.SGridPaneForm;
import sa.lib.grid.SGridRow;
import sa.lib.gui.SGuiClient;
import sa.lib.gui.SGuiConsts;
import sa.lib.gui.SGuiUtils;
import sa.lib.gui.SGuiValidation;
import sa.lib.gui.bean.SBeanForm;

/**
 *
 * @author Sergio Flores
 */
public class SFormTaxSubsidyTable extends SBeanForm implements ActionListener {

    private SDbTaxSubsidyTable moRegistry;
    private SGridPaneForm moGridTableRows;

    /**
     * Creates new form SFormTaxSubsidyTable
     */
    public SFormTaxSubsidyTable(SGuiClient client, String title) {
        setFormSettings(client, SGuiConsts.BEAN_FORM_EDIT, SModConsts.HRS_TAX_SUB, SLibConsts.UNDEFINED, title);
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
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jlDateStart = new javax.swing.JLabel();
        moDateDateStart = new sa.lib.gui.bean.SBeanFieldDate();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jlLowerLimit = new javax.swing.JLabel();
        jlTaxSubsidy = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        moCurLowerLimit = new sa.lib.gui.bean.SBeanCompoundFieldCurrency();
        moCurTaxSubsidy = new sa.lib.gui.bean.SBeanCompoundFieldCurrency();
        jbRowAdd = new javax.swing.JButton();
        jpGrid = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jbRowUp = new javax.swing.JButton();
        jbRowDown = new javax.swing.JButton();
        jbRowRemove = new javax.swing.JButton();

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de la tabla:"));
        jPanel2.setLayout(new java.awt.GridLayout(1, 1, 0, 5));

        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlDateStart.setText("Inicio vigencia:*");
        jlDateStart.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel4.add(jlDateStart);
        jPanel4.add(moDateDateStart);

        jPanel2.add(jPanel4);

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Renglones de la tabla:"));
        jPanel6.setLayout(new java.awt.BorderLayout(0, 5));

        jPanel7.setLayout(new java.awt.GridLayout(2, 1, 0, 5));

        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 5, 0));

        jlLowerLimit.setText("Límite inferior:*");
        jlLowerLimit.setPreferredSize(new java.awt.Dimension(140, 23));
        jPanel8.add(jlLowerLimit);

        jlTaxSubsidy.setText("Subsidio para el empleo:");
        jlTaxSubsidy.setPreferredSize(new java.awt.Dimension(140, 23));
        jPanel8.add(jlTaxSubsidy);

        jPanel7.add(jPanel8);

        jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 5, 0));
        jPanel9.add(moCurLowerLimit);
        jPanel9.add(moCurTaxSubsidy);

        jbRowAdd.setText("Agregar");
        jbRowAdd.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel9.add(jbRowAdd);

        jPanel7.add(jPanel9);

        jPanel6.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        jpGrid.setLayout(new java.awt.BorderLayout());
        jPanel6.add(jpGrid, java.awt.BorderLayout.CENTER);

        jPanel10.setLayout(new java.awt.BorderLayout());

        jPanel11.setLayout(new java.awt.GridLayout(3, 1, 0, 5));

        jbRowUp.setText("Subir");
        jbRowUp.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel11.add(jbRowUp);

        jbRowDown.setText("Bajar");
        jbRowDown.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel11.add(jbRowDown);

        jbRowRemove.setText("Eliminar");
        jbRowRemove.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel11.add(jbRowRemove);

        jPanel10.add(jPanel11, java.awt.BorderLayout.NORTH);

        jPanel6.add(jPanel10, java.awt.BorderLayout.LINE_END);

        jPanel1.add(jPanel6, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton jbRowAdd;
    private javax.swing.JButton jbRowDown;
    private javax.swing.JButton jbRowRemove;
    private javax.swing.JButton jbRowUp;
    private javax.swing.JLabel jlDateStart;
    private javax.swing.JLabel jlLowerLimit;
    private javax.swing.JLabel jlTaxSubsidy;
    private javax.swing.JPanel jpGrid;
    private sa.lib.gui.bean.SBeanCompoundFieldCurrency moCurLowerLimit;
    private sa.lib.gui.bean.SBeanCompoundFieldCurrency moCurTaxSubsidy;
    private sa.lib.gui.bean.SBeanFieldDate moDateDateStart;
    // End of variables declaration//GEN-END:variables

    private void initComponentsCustom() {
        SGuiUtils.setWindowBounds(this, 640, 400);

        moDateDateStart.setDateSettings(miClient, SGuiUtils.getLabelName(jlDateStart.getText()), true);
        moCurLowerLimit.setCompoundFieldSettings(miClient);
        moCurLowerLimit.getField().setDecimalSettings(SGuiUtils.getLabelName(jlLowerLimit), SGuiConsts.GUI_TYPE_DEC_AMT, false);
        moCurTaxSubsidy.setCompoundFieldSettings(miClient);
        moCurTaxSubsidy.getField().setDecimalSettings(SGuiUtils.getLabelName(jlTaxSubsidy), SGuiConsts.GUI_TYPE_DEC_AMT, false);

        moFields.addField(moDateDateStart);
        moFields.addField(moCurLowerLimit.getField());
        moFields.addField(moCurTaxSubsidy.getField());

        moFields.setFormButton(jbRowAdd);

        moGridTableRows = new SGridPaneForm(miClient, SModConsts.HRS_TAX_SUB_ROW, SLibConsts.UNDEFINED, "Renglones tabla") {

            @Override
            public void initGrid() {
                setRowButtonsEnabled(false);
            }

            @Override
            public ArrayList<SGridColumnForm> createGridColumns() {
                ArrayList<SGridColumnForm> columns = new ArrayList<SGridColumnForm>();

                columns.add(new SGridColumnForm(SGridConsts.COL_TYPE_INT_1B, "#"));
                columns.add(new SGridColumnForm(SGridConsts.COL_TYPE_DEC_AMT, "Límite inferior"));
                columns.add(new SGridColumnForm(SGridConsts.COL_TYPE_DEC_AMT, "Subsidio empleo"));

                return columns;
            }
        };

        jpGrid.add(moGridTableRows, BorderLayout.CENTER);
        mvFormGrids.add(moGridTableRows);
    }

    private void cleanRowFields() {
        moCurLowerLimit.getField().setValue(0d);
        moCurTaxSubsidy.getField().setValue(0d);
    }

    private void actionRowAdd() {
        if (moCurLowerLimit.getField().getValue() <= 0) {
            miClient.showMsgBoxWarning(SGuiConsts.ERR_MSG_FIELD_REQ + "'" + SGuiUtils.getLabelName(jlLowerLimit) + "'.");
            moCurLowerLimit.getField().getComponent().requestFocus();
        }
        else {
            SDbTaxSubsidyTableRow row = new SDbTaxSubsidyTableRow();
            row.setPkRowId(moGridTableRows.getTable().getRowCount() + 1);
            row.setLowerLimit(moCurLowerLimit.getField().getValue());
            row.setTaxSubsidy(moCurTaxSubsidy.getField().getValue());
            moGridTableRows.addGridRow(row);
            moGridTableRows.renderGridRows();
            moGridTableRows.setSelectedGridRow(moGridTableRows.getTable().getRowCount() - 1);

            cleanRowFields();
            moCurLowerLimit.getField().getComponent().requestFocus();
        }
    }

    private void actionRowUp() {
        int index = moGridTableRows.getTable().getSelectedRow();
        SDbTaxSubsidyTableRow rowA = null;
        SDbTaxSubsidyTableRow rowB = null;

        if (index == -1) {
            miClient.showMsgBoxWarning(SGridConsts.MSG_SELECT_ROW);
        }
        else if (index > 0) {
            rowA = (SDbTaxSubsidyTableRow) moGridTableRows.getGridRow(index - 1);
            rowB = (SDbTaxSubsidyTableRow) moGridTableRows.getGridRow(index);
            rowA.setPkRowId(rowA.getPkRowId() + 1);
            rowB.setPkRowId(rowA.getPkRowId() - 1);
            moGridTableRows.setGridRow(rowB, index - 1);
            moGridTableRows.setGridRow(rowA, index);
            moGridTableRows.renderGridRows();
            moGridTableRows.setSelectedGridRow(index - 1);
        }
    }

    private void actionRowDown() {
        int index = moGridTableRows.getTable().getSelectedRow();
        SDbTaxSubsidyTableRow rowA = null;
        SDbTaxSubsidyTableRow rowB = null;

        if (index == -1) {
            miClient.showMsgBoxWarning(SGridConsts.MSG_SELECT_ROW);
        }
        else if (index < moGridTableRows.getTable().getRowCount() - 1) {
            rowA = (SDbTaxSubsidyTableRow) moGridTableRows.getGridRow(index);
            rowB = (SDbTaxSubsidyTableRow) moGridTableRows.getGridRow(index + 1);
            rowA.setPkRowId(rowA.getPkRowId() + 1);
            rowB.setPkRowId(rowA.getPkRowId() - 1);
            moGridTableRows.setGridRow(rowB, index);
            moGridTableRows.setGridRow(rowA, index + 1);
            moGridTableRows.renderGridRows();
            moGridTableRows.setSelectedGridRow(index + 1);
        }
    }

    private void actionRowRemove() {
        int index = moGridTableRows.getTable().getSelectedRow();
        int count = 0;

        if (index == -1) {
            miClient.showMsgBoxWarning(SGridConsts.MSG_SELECT_ROW);
        }
        else if (miClient.showMsgBoxConfirm(SGridConsts.MSG_CONFIRM_REG_DEL) == JOptionPane.YES_OPTION) {
            count = moGridTableRows.getTable().getRowCount();
            moGridTableRows.removeGridRow(index);

            for (int i = 0; i < count - 1; i++) {
                ((SDbTaxSubsidyTableRow) moGridTableRows.getGridRow(i)).setPkRowId(i + 1);
            }

            moGridTableRows.renderGridRows();

            if (moGridTableRows.getTable().getRowCount() > 0) {
                moGridTableRows.setSelectedGridRow(index < moGridTableRows.getTable().getRowCount() ? index : index - 1);
            }
        }
    }

    @Override
    public void addAllListeners() {
        jbRowAdd.addActionListener(this);
        jbRowUp.addActionListener(this);
        jbRowDown.addActionListener(this);
        jbRowRemove.addActionListener(this);
    }

    @Override
    public void removeAllListeners() {
        jbRowAdd.removeActionListener(this);
        jbRowUp.removeActionListener(this);
        jbRowDown.removeActionListener(this);
        jbRowRemove.removeActionListener(this);
    }

    @Override
    public void reloadCatalogues() {

    }

    @Override
    public void setRegistry(SDbRegistry registry) throws Exception {
        Vector<SGridRow> rows = new Vector<SGridRow>();

        moRegistry = (SDbTaxSubsidyTable) registry;

        mnFormResult = SLibConsts.UNDEFINED;
        mbFirstActivation = true;

        removeAllListeners();
        reloadCatalogues();

        if (moRegistry.isRegistryNew()) {
            moRegistry.initPrimaryKey();
            moRegistry.setDateStart(miClient.getSession().getCurrentDate());
            jtfRegistryKey.setText("");
        }
        else {
            jtfRegistryKey.setText(SLibUtils.textKey(moRegistry.getPrimaryKey()));
        }

        moDateDateStart.setValue(moRegistry.getDateStart());

        cleanRowFields();

        for (SDbTaxSubsidyTableRow row : moRegistry.getChildRows()) {
            rows.add(row);
        }

        moGridTableRows.populateGrid(rows);
        moGridTableRows.resetSortKeys();
        moGridTableRows.setSelectedGridRow(0);
        moGridTableRows.getTable().getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        setFormEditable(true);

        addAllListeners();
    }

    @Override
    public SDbRegistry getRegistry() throws Exception {
        SDbTaxSubsidyTable registry = moRegistry.clone();

        if (registry.isRegistryNew()) { }

        registry.setDateStart(moDateDateStart.getValue());

        registry.getChildRows().clear();

        for (int i = 0; i < moGridTableRows.getTable().getRowCount(); i++) {
            registry.getChildRows().add((SDbTaxSubsidyTableRow) moGridTableRows.getGridRow(i));
        }

        return registry;
    }

    @Override
    public SGuiValidation validateForm() {
        SGuiValidation validation = moFields.validateFields();

        if (validation.isValid()) {
            if (moGridTableRows.getTable().getRowCount() == 0) {
                validation.setMessage("La tabla no tiene renglones.");
                validation.setComponent(moCurLowerLimit.getField().getComponent());
            }
        }

        return validation;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton button = (JButton) e.getSource();

            if (button == jbRowAdd) {
                actionRowAdd();
            }
            else if (button == jbRowUp) {
                actionRowUp();
            }
            else if (button == jbRowDown) {
                actionRowDown();
            }
            else if (button == jbRowRemove) {
                actionRowRemove();
            }
        }
    }
}
