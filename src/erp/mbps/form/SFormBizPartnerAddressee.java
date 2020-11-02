/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SFormBizPartnerAddressee.java
 *
 * Created on 22/09/2009, 10:48:45 AM
 */

package erp.mbps.form;

import erp.data.SDataConstants;
import erp.lib.SLibConstants;
import erp.lib.form.SFormField;
import erp.lib.form.SFormUtilities;
import erp.lib.form.SFormValidation;
import erp.mbps.data.SDataBizPartnerAddressee;
import erp.mbps.data.SDataBizPartnerBranchAddress;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Vector;
import javax.swing.AbstractAction;

/**
 *
 * @author Sergio Flores
 */
public class SFormBizPartnerAddressee extends javax.swing.JDialog implements erp.lib.form.SFormInterface, java.awt.event.ActionListener {

    private int mnFormType;
    private int mnFormResult;
    private int mnFormStatus;
    private boolean mbFirstTime;
    private java.util.Vector<erp.lib.form.SFormField> mvFields;
    private erp.client.SClientInterface miClient;
    
    private int mnBizPartnerType;
    private erp.mbps.data.SDataBizPartnerAddressee moBizPartnerAddressee;
    private erp.lib.form.SFormField moFieldBizPartner;
    private erp.lib.form.SFormField moFieldName;
    private erp.lib.form.SFormField moFieldFiscalId;
    private erp.lib.form.SFormField moFieldIsDeleted;

    private erp.mbps.form.SPanelBizPartnerBranchAddress moPanelBizPartnerBranchAddress;
    
    /** Creates new form SFormBizPartnerAddressee
     * @param client GUI client.
     * @param bizPartnerType Business Partner type (constants defined in SDataConstants.BPSX_BP_...).
     */
    public SFormBizPartnerAddressee(erp.client.SClientInterface client, int bizPartnerType) {
        super(client.getFrame(), true);
        miClient =  client;
        mnFormType = SDataConstants.BPSU_BP_ADDEE;
        mnBizPartnerType = bizPartnerType;

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

        jPanel1 = new javax.swing.JPanel();
        jbOk = new javax.swing.JButton();
        jbCancel = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jpBranchAddress = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jlBizPartner = new javax.swing.JLabel();
        jcbBizPartner = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        jlName = new javax.swing.JLabel();
        jtfName = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jlFiscalId = new javax.swing.JLabel();
        jtfFiscalId = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jckIsDeleted = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Destinatario");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(592, 33));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jbOk.setText("Aceptar");
        jbOk.setToolTipText("[Ctrl + Enter]");
        jbOk.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel1.add(jbOk);

        jbCancel.setText("Cancelar");
        jbCancel.setToolTipText("[Escape]");
        jPanel1.add(jbCancel);

        getContentPane().add(jPanel1, java.awt.BorderLayout.SOUTH);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Información del registro:"));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jpBranchAddress.setLayout(new java.awt.BorderLayout(0, 4));

        jPanel3.setLayout(new java.awt.GridLayout(3, 1, 0, 4));

        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlBizPartner.setText("Asociado negocios: *");
        jlBizPartner.setPreferredSize(new java.awt.Dimension(125, 23));
        jPanel4.add(jlBizPartner);

        jcbBizPartner.setPreferredSize(new java.awt.Dimension(400, 23));
        jPanel4.add(jcbBizPartner);

        jPanel3.add(jPanel4);

        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlName.setText("Nombre destinatario: *");
        jlName.setPreferredSize(new java.awt.Dimension(125, 23));
        jPanel5.add(jlName);

        jtfName.setPreferredSize(new java.awt.Dimension(400, 23));
        jPanel5.add(jtfName);

        jPanel3.add(jPanel5);

        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlFiscalId.setText("ID fiscal destinatario: *");
        jlFiscalId.setPreferredSize(new java.awt.Dimension(125, 23));
        jPanel6.add(jlFiscalId);

        jtfFiscalId.setPreferredSize(new java.awt.Dimension(200, 23));
        jPanel6.add(jtfFiscalId);

        jPanel3.add(jPanel6);

        jpBranchAddress.add(jPanel3, java.awt.BorderLayout.NORTH);

        jPanel2.add(jpBranchAddress, java.awt.BorderLayout.NORTH);

        jPanel13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jckIsDeleted.setText("Registro eliminado");
        jckIsDeleted.setPreferredSize(new java.awt.Dimension(125, 23));
        jPanel13.add(jckIsDeleted);

        jPanel2.add(jPanel13, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(656, 439));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        windowActivated();
    }//GEN-LAST:event_formWindowActivated

    private void initComponentsExtra() {
        moPanelBizPartnerBranchAddress = new SPanelBizPartnerBranchAddress(miClient);
        jpBranchAddress.add(moPanelBizPartnerBranchAddress, BorderLayout.CENTER);
        
        moFieldBizPartner = new SFormField(miClient, SLibConstants.DATA_TYPE_KEY, true, jcbBizPartner, jlBizPartner);
        moFieldName = new SFormField(miClient, SLibConstants.DATA_TYPE_STRING, true, jtfName, jlName);
        moFieldName.setLengthMax(250);
        moFieldFiscalId = new SFormField(miClient, SLibConstants.DATA_TYPE_STRING, true, jtfFiscalId, jlFiscalId);
        moFieldFiscalId.setLengthMax(40);
        moFieldIsDeleted = new SFormField(miClient, SLibConstants.DATA_TYPE_BOOLEAN, false, jckIsDeleted);

        mvFields = new Vector<>();
        mvFields.add(moFieldBizPartner);
        mvFields.add(moFieldName);
        mvFields.add(moFieldFiscalId);
        mvFields.add(moFieldIsDeleted);

        jbOk.addActionListener(this);
        jbCancel.addActionListener(this);

        AbstractAction actionOk = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) { actionOk(); }
        };

        SFormUtilities.putActionMap(getRootPane(), actionOk, "ok", KeyEvent.VK_ENTER, KeyEvent.CTRL_DOWN_MASK);

        AbstractAction action = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) { actionCancel(); }
        };

        SFormUtilities.putActionMap(getRootPane(), action, "cancel", KeyEvent.VK_ESCAPE, 0);
    }

    private void windowActivated() {
        if (mbFirstTime) {
            mbFirstTime = false;
            jcbBizPartner.requestFocusInWindow();
        }
    }

    private void actionOk() {
        SFormValidation validationBranch = formValidate();

        if (validationBranch.getIsError()) {
            if (validationBranch.getComponent() != null) {
                validationBranch.getComponent().requestFocusInWindow();
            }
            if (!validationBranch.getMessage().isEmpty()) {
                miClient.showMsgBoxWarning(validationBranch.getMessage());
            }
        }
        else {
            mnFormResult = SLibConstants.FORM_RESULT_OK;
            setVisible(false);
        }
    }

    private void actionCancel() {
        mnFormResult = SLibConstants.FORM_RESULT_CANCEL;
        setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton jbCancel;
    private javax.swing.JButton jbOk;
    private javax.swing.JComboBox jcbBizPartner;
    private javax.swing.JCheckBox jckIsDeleted;
    private javax.swing.JLabel jlBizPartner;
    private javax.swing.JLabel jlFiscalId;
    private javax.swing.JLabel jlName;
    private javax.swing.JPanel jpBranchAddress;
    private javax.swing.JTextField jtfFiscalId;
    private javax.swing.JTextField jtfName;
    // End of variables declaration//GEN-END:variables

    @Override
    public void formClearRegistry() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void formReset() {
        mnFormResult = SLibConstants.UNDEFINED;
        mnFormStatus = SLibConstants.UNDEFINED;
        mbFirstTime = true;

        moBizPartnerAddressee = null;
        
        for (int i = 0; i < mvFields.size(); i++) {
            ((erp.lib.form.SFormField) mvFields.get(i)).resetField();
        }
        
        moPanelBizPartnerBranchAddress.formReset();
        moPanelBizPartnerBranchAddress.setFieldsEnabled(true);
        
        jckIsDeleted.setEnabled(false);
    }

    @Override
    public void formRefreshCatalogues() {
        SFormUtilities.populateComboBox(miClient, jcbBizPartner, mnBizPartnerType);
        
        moPanelBizPartnerBranchAddress.formRefreshCatalogues();
    }

    @Override
    public erp.lib.form.SFormValidation formValidate() {
        SFormValidation validation = new SFormValidation();
        
        for (int i = 0; i < mvFields.size(); i++) {
            if (!((erp.lib.form.SFormField) mvFields.get(i)).validateField()) {
                validation.setIsError(true);
                validation.setComponent(((erp.lib.form.SFormField) mvFields.get(i)).getComponent());
                break;
            }
        }

        if (!validation.getIsError()) {
            validation = moPanelBizPartnerBranchAddress.formValidate();
        }
        
        if (!validation.getIsError()) {
            SDataBizPartnerAddressee old = moBizPartnerAddressee; // preserve old registry
            
            try {
                moBizPartnerAddressee = (SDataBizPartnerAddressee) getRegistry(); // asignation not really required, just for explicitness, moBizPartnerAddressee is actually instanciated and updated in method getRegistry()
                moBizPartnerAddressee.validate(miClient);
            }
            catch (Exception e) {
                validation.setMessage(e.getMessage());
                validation.setComponent(jcbBizPartner); // set focus at beginning, there is no way of knowing which value needs to be edited
            }
            finally {
                moBizPartnerAddressee = old; // restore old registry
            }
        }
        
        return validation;
    }

    @Override
    public void setFormStatus(int status) {
        mnFormStatus = status;
    }

    @Override
    public void setFormVisible(boolean visible) {
        setVisible(visible);
    }

    @Override
    public int getFormStatus() {
        return mnFormStatus;
    }

    @Override
    public int getFormResult() {
        return mnFormResult;
    }

    @Override
    public void setRegistry(erp.lib.data.SDataRegistry registry) {
        moBizPartnerAddressee = (SDataBizPartnerAddressee) registry;
        
        moFieldBizPartner.setFieldValue(new int[] { moBizPartnerAddressee.getFkBizPartnerId() });
        moFieldName.setFieldValue(moBizPartnerAddressee.getName());
        moFieldFiscalId.setFieldValue(moBizPartnerAddressee.getFiscalId());
        moFieldIsDeleted.setFieldValue(moBizPartnerAddressee.getIsDeleted());
        
        moPanelBizPartnerBranchAddress.setRegistry(registry);
        
        jckIsDeleted.setEnabled(true);
    }

    @Override
    public erp.lib.data.SDataRegistry getRegistry() {
        if (moBizPartnerAddressee == null) {
            moBizPartnerAddressee = new SDataBizPartnerAddressee();
            moBizPartnerAddressee.setFkUserNewId(miClient.getSession().getUser().getPkUserId());
        }
        else {
            moBizPartnerAddressee.setFkUserEditId(miClient.getSession().getUser().getPkUserId());
        }
        
        moBizPartnerAddressee.importAddress((SDataBizPartnerBranchAddress) moPanelBizPartnerBranchAddress.getRegistry());
        
        moBizPartnerAddressee.setName(moFieldName.getString());
        moBizPartnerAddressee.setFiscalId(moFieldFiscalId.getString());
        moBizPartnerAddressee.setIsDeleted(moFieldIsDeleted.getBoolean());
        moBizPartnerAddressee.setFkBizPartnerId(moFieldBizPartner.getKeyAsIntArray()[0]);
        
        return moBizPartnerAddressee;
    }

    @Override
    public void setValue(int type, java.lang.Object value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public java.lang.Object getValue(int type) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public javax.swing.JLabel getTimeoutLabel() {
        return null;
    }
    
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        if (e.getSource() instanceof javax.swing.JButton) {
            javax.swing.JButton button = (javax.swing.JButton) e.getSource();

            if (button == jbOk) {
                actionOk();
            }
            else if (button == jbCancel) {
                actionCancel();
            }
        }
    }
}
