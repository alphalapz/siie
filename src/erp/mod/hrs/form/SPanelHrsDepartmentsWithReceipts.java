/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp.mod.hrs.form;

import erp.mod.SModConsts;
import erp.mod.hrs.db.SHrsCfdUtils;
import erp.mod.hrs.db.SRowDepartmentPanelArea;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import sa.lib.SLibConsts;
import sa.lib.SLibUtils;
import sa.lib.db.SDbRegistry;
import sa.lib.grid.SGridColumnForm;
import sa.lib.grid.SGridConsts;
import sa.lib.grid.SGridPaneForm;
import sa.lib.grid.SGridRow;
import sa.lib.gui.SGuiClient;
import sa.lib.gui.SGuiConsts;
import sa.lib.gui.SGuiValidation;
import sa.lib.gui.bean.SBeanPanel;

/**
 *
 * @author Juan Barajas, Claudio Peña
 */
public class SPanelHrsDepartmentsWithReceipts extends SBeanPanel implements ItemListener, ActionListener {

    protected SGridPaneForm moGridDepartamentsRow;
    protected JButton mjbSelectAll;
    protected JButton mjbDeselectAll;
    protected JToggleButton mjtbFilterDeleted;
    protected int mnNumberDepartamentsSelects;
    protected boolean mbIsSelectedAll;
    protected String msDepartamentsSelectedsId;
    protected String msDepartamentsSelectedsName;
    private int[] payrollKeyNum;
    
    /**
     * Creates new form SPanelHrsDepartmentsWithReceipts
     * @param client
     * @param payrollKey
     */
    public SPanelHrsDepartmentsWithReceipts(final SGuiClient client, final int[] payrollKey) {
        setPanelSettings(client);
        payrollKeyNum = payrollKey;
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

        jpDepartaments = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jpDepartaments.setLayout(new java.awt.BorderLayout());
        add(jpDepartaments, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void initComponentsCustom() {
        
        mjbSelectAll = new JButton("Seleccionar todos");
        mjbDeselectAll = new JButton("Deseleccionar todos");
        
        mjtbFilterDeleted = new JToggleButton();
        mjtbFilterDeleted.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sa/lib/img/swi_filter_on.gif")));
        mjtbFilterDeleted.setToolTipText("Filtrar eliminados");
        mjtbFilterDeleted.setPreferredSize(new java.awt.Dimension(23, 23));
        
        mjbSelectAll.addActionListener(this);
        mjbDeselectAll.addActionListener(this);
        mjtbFilterDeleted.addItemListener(this);
        
        mjtbFilterDeleted.setSelected(false);
        
        mnNumberDepartamentsSelects = 0;
        mbIsSelectedAll = false;
        msDepartamentsSelectedsId = "";
        msDepartamentsSelectedsName = "";
        
        moGridDepartamentsRow = new SGridPaneForm(miClient, SModConsts.HRSX_PAY_REC_EAR, SLibConsts.UNDEFINED, "Departamentos") {
            @Override
            public void initGrid() {
                setRowButtonsEnabled(false, false, false);
            }

            @Override
            public ArrayList<SGridColumnForm> createGridColumns() {
                SGridColumnForm columnForm = null;
                ArrayList<SGridColumnForm> gridColumnsForm = new ArrayList<>();

                gridColumnsForm.add(new SGridColumnForm(SGridConsts.COL_TYPE_TEXT_CODE_CAT, "Código departamento", 50));
                gridColumnsForm.add(new SGridColumnForm(SGridConsts.COL_TYPE_TEXT_NAME_CAT_L, "Departamento", 350));
                gridColumnsForm.add(new SGridColumnForm(SGridConsts.COL_TYPE_TEXT_CODE_CAT, "Recibos nómina", 150));
                columnForm = new SGridColumnForm(SGridConsts.COL_TYPE_BOOL_S, "Seleccionado", moGridDepartamentsRow.getTable().getDefaultEditor(Boolean.class));

                columnForm.setEditable(true);
                gridColumnsForm.add(columnForm);
                
                return gridColumnsForm;
            }
        };
        moGridDepartamentsRow.getPanelCommandsSys(SGuiConsts.PANEL_RIGHT).add(mjtbFilterDeleted, 0);
        moGridDepartamentsRow.getPanelCommandsSys(SGuiConsts.PANEL_RIGHT).add(mjbSelectAll, 1);
        moGridDepartamentsRow.getPanelCommandsSys(SGuiConsts.PANEL_RIGHT).add(mjbDeselectAll, 2);
        
        moGridDepartamentsRow.setForm(null);
        moGridDepartamentsRow.setPaneFormOwner(null);
        jpDepartaments.add(moGridDepartamentsRow, BorderLayout.CENTER);
        
        populateDepartaments();
        itemStateChangedSelectAll(true);
    }
    
    private void actionDepStatusStateChange() {
        if (mjtbFilterDeleted.isSelected()) {
            mjtbFilterDeleted.setSelectedIcon(new ImageIcon(getClass().getResource("/sa/lib/img/swi_filter_off.gif")));
        }
        else {
            mjtbFilterDeleted.setSelectedIcon(new ImageIcon(getClass().getResource("/sa/lib/img/swi_filter_on.gif")));
        }
        populateDepartaments();
    }
        
    private void getDepartaments() {
        SRowDepartmentPanelArea payRow = null;
        mnNumberDepartamentsSelects = 0;
        mbIsSelectedAll = false;
        
        for (SGridRow row : moGridDepartamentsRow.getModel().getGridRows()) {
            payRow = (SRowDepartmentPanelArea) row;
            
            if (payRow.isSelected()) {
                msDepartamentsSelectedsId += (msDepartamentsSelectedsId.length() == 0 ? "" : ", ") + payRow.getDepartamentId();
                msDepartamentsSelectedsName += (msDepartamentsSelectedsName.length() == 0 ? "" : ", ") + payRow.getDepartamentName();
                mnNumberDepartamentsSelects++;
            }
        }

        mbIsSelectedAll = mnNumberDepartamentsSelects == moGridDepartamentsRow.getModel().getRowCount();
    }
    
    private void itemStateChangedSelectAll(boolean selected) {
        SRowDepartmentPanelArea payRow = null;
        
        for (SGridRow row : moGridDepartamentsRow.getModel().getGridRows()) {
            payRow = (SRowDepartmentPanelArea) row;
            payRow.setIsSelected(selected);
        }
        moGridDepartamentsRow.renderGridRows();
        moGridDepartamentsRow.setSelectedGridRow(0);
    }
    
    private void populateDepartaments() {
        String sql = "";
        ResultSet resultSet = null;
        Vector<SGridRow> rows = new Vector<>();
        SRowDepartmentPanelArea department = null;
        
        moGridDepartamentsRow.getModel().clearGridRows();
        moGridDepartamentsRow.getModel().clearGrid();
        
        try {
            sql = "SELECT id_dep, code, name "
                    + "FROM " + SModConsts.TablesMap.get(SModConsts.HRSU_DEP) + " "
                    + (!mjtbFilterDeleted.isSelected() ? "WHERE b_del = 0 " : "")
                    + "ORDER BY code, name, id_dep ";

            resultSet = miClient.getSession().getStatement().getConnection().createStatement().executeQuery(sql);
            while (resultSet.next()) {
                department = new SRowDepartmentPanelArea(resultSet.getInt("id_dep"));

                department.setDepartamentCode(resultSet.getString("code"));
                department.setDepartamentName(resultSet.getString("name"));                
                department.setNumNom(SHrsCfdUtils.getCfdCountByDepartment(miClient.getSession(), payrollKeyNum[0], resultSet.getInt("id_dep")));

                rows.add(department);
            }
        }
        catch (Exception e) {
            SLibUtils.printException(this, e);
        }
        
        moGridDepartamentsRow.populateGrid(rows);
        moGridDepartamentsRow.clearSortKeys();
        moGridDepartamentsRow.setSelectedGridRow(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jpDepartaments;
    // End of variables declaration//GEN-END:variables

    @Override
    public void addAllListeners() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeAllListeners() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reloadCatalogues() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setRegistry(SDbRegistry registry) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SDbRegistry getRegistry() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SGuiValidation validatePanel() {
        SGuiValidation validation = moFields.validateFields();

        if (validation.isValid()) {
            getDepartaments();

            if (mnNumberDepartamentsSelects == 0) {
                validation.setMessage("Aún no se ha especificado ningún departamento.");
                validation.setComponent(mjbSelectAll);
            }
        }

        return validation;
    }

    @Override
    public Object getValue(int type) {
        Object value = null;

        switch(type) {
            case SGuiConsts.PARAM_KEY:
                value = msDepartamentsSelectedsId;
                break;
            case SGuiConsts.PARAM_ITEM:
                value = msDepartamentsSelectedsName;
                break;
            case SGuiConsts.PARAM_ROWS:
                value = mbIsSelectedAll;
                break;
            default:
                break;
        }
        
        return value;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton button = (JButton) e.getSource();

            if (button == mjbSelectAll) {
                itemStateChangedSelectAll(true);
            }
            else if (button == mjbDeselectAll) {
                itemStateChangedSelectAll(false);
            }
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() instanceof JToggleButton) {
            JToggleButton toggleButton = (JToggleButton) e.getSource();

            if (toggleButton == mjtbFilterDeleted) {
                actionDepStatusStateChange();
            }
        }
    }
}
