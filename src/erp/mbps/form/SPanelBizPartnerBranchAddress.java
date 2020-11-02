/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SPanelBizPartnerBranchAddress.java
 *
 * Created on 7/10/2009, 04:45:28 PM
 */

package erp.mbps.form;

import erp.data.SDataConstants;
import erp.data.SDataConstantsSys;
import erp.lib.SLibConstants;
import erp.lib.form.SFormComponentItem;
import erp.lib.form.SFormUtilities;
import erp.lib.form.SFormValidation;
import erp.mbps.data.SDataBizPartnerAddressee;
import erp.mbps.data.SDataBizPartnerBranchAddress;
import erp.mod.SModSysConsts;
import java.awt.event.ItemEvent;
import java.util.Vector;
import javax.swing.JComboBox;
import sa.lib.gui.SGuiConsts;

/**
 *
 * @author Alfonso Flores, Juan Barajas, Daniel López, Sergio Flores
 */
public class SPanelBizPartnerBranchAddress extends javax.swing.JPanel implements erp.lib.form.SFormInterface, java.awt.event.ActionListener, java.awt.event.ItemListener {

    private int mnFormResult;
    private int mnFormStatus;
    private java.util.Vector<erp.lib.form.SFormField> mvFields;
    private erp.client.SClientInterface miClient;

    private erp.mbps.data.SDataBizPartnerBranchAddress moBizPartnerBranchAddress;
    private erp.lib.form.SFormField moFieldAddress;
    private erp.lib.form.SFormField moFieldStreet;
    private erp.lib.form.SFormField moFieldStreetNumberExt;
    private erp.lib.form.SFormField moFieldStreetNumberInt;
    private erp.lib.form.SFormField moFieldNeighborhood;
    private erp.lib.form.SFormField moFieldReference;
    private erp.lib.form.SFormField moFieldLocality;
    private erp.lib.form.SFormField moFieldCounty;
    private erp.lib.form.SFormField moFieldState;
    private erp.lib.form.SFormField moFieldZipCode;
    private erp.lib.form.SFormField moFieldIsDefault;
    private erp.lib.form.SFormField moFieldFkStateId;
    private erp.lib.form.SFormField moFieldFkCountryId;

    private boolean mbParamIsInMainWindow;
    private boolean mbParamIsCompany;

    /** Creates new form SPanelBizPartnerBranchAddress
     * @param client GUI client.
     */
    public SPanelBizPartnerBranchAddress(erp.client.SClientInterface client) {
        miClient =  client;
        //mnFormType = SDataConstants.BPSU_BPB_ADD;

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
        jlAddress = new javax.swing.JLabel();
        jtfAddress = new javax.swing.JTextField();
        jckIsDefault = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        jlCountry = new javax.swing.JLabel();
        jcbFkCountryId_n = new javax.swing.JComboBox();
        jbPickCountry = new javax.swing.JButton();
        jbEditCountry = new javax.swing.JButton();
        jlZipCode = new javax.swing.JLabel();
        jtfZipCode = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jlState = new javax.swing.JLabel();
        jcbFkStateId_n = new javax.swing.JComboBox();
        jtfState = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jlCounty = new javax.swing.JLabel();
        jtfCounty = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jlLocality = new javax.swing.JLabel();
        jtfLocality = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jlNeighbordhood = new javax.swing.JLabel();
        jtfNeighborhood = new javax.swing.JTextField();
        jtfReference = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jlStreet = new javax.swing.JLabel();
        jtfStreet = new javax.swing.JTextField();
        jtfStreetNumberExt = new javax.swing.JTextField();
        jtfStreetNumberInt = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(515, 190));
        setLayout(new java.awt.GridLayout(7, 1, 5, 2));

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 2, 0));

        jlAddress.setText("Id. domicilio: *");
        jlAddress.setPreferredSize(new java.awt.Dimension(85, 23));
        jPanel1.add(jlAddress);

        jtfAddress.setToolTipText("Nombre");
        jtfAddress.setPreferredSize(new java.awt.Dimension(230, 23));
        jPanel1.add(jtfAddress);

        jckIsDefault.setText("Domicilio por default");
        jckIsDefault.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jckIsDefault.setPreferredSize(new java.awt.Dimension(133, 23));
        jPanel1.add(jckIsDefault);

        add(jPanel1);

        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 2, 0));

        jlCountry.setText("País: *");
        jlCountry.setPreferredSize(new java.awt.Dimension(85, 23));
        jPanel6.add(jlCountry);

        jcbFkCountryId_n.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbFkCountryId_n.setToolTipText("País");
        jcbFkCountryId_n.setPreferredSize(new java.awt.Dimension(230, 23));
        jPanel6.add(jcbFkCountryId_n);

        jbPickCountry.setText("...");
        jbPickCountry.setToolTipText("Seleccionar país");
        jbPickCountry.setFocusable(false);
        jbPickCountry.setMinimumSize(new java.awt.Dimension(23, 23));
        jbPickCountry.setPreferredSize(new java.awt.Dimension(23, 23));
        jPanel6.add(jbPickCountry);

        jbEditCountry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/erp/img/icon_std_edit.gif"))); // NOI18N
        jbEditCountry.setToolTipText("Modificar país");
        jbEditCountry.setMargin(new java.awt.Insets(2, 0, 2, 0));
        jbEditCountry.setPreferredSize(new java.awt.Dimension(23, 23));
        jPanel6.add(jbEditCountry);

        jlZipCode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlZipCode.setText("CP: *");
        jlZipCode.setPreferredSize(new java.awt.Dimension(78, 23));
        jPanel6.add(jlZipCode);

        jtfZipCode.setToolTipText("Código postal");
        jtfZipCode.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel6.add(jtfZipCode);

        add(jPanel6);

        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 2, 0));

        jlState.setText("Estado: *");
        jlState.setPreferredSize(new java.awt.Dimension(85, 23));
        jPanel5.add(jlState);

        jcbFkStateId_n.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbFkStateId_n.setToolTipText("Estado");
        jcbFkStateId_n.setPreferredSize(new java.awt.Dimension(230, 23));
        jPanel5.add(jcbFkStateId_n);

        jtfState.setToolTipText("Estado");
        jtfState.setPreferredSize(new java.awt.Dimension(230, 23));
        jPanel5.add(jtfState);

        add(jPanel5);

        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 2, 0));

        jlCounty.setText("Municipio:");
        jlCounty.setPreferredSize(new java.awt.Dimension(85, 23));
        jPanel7.add(jlCounty);

        jtfCounty.setToolTipText("Municipio");
        jtfCounty.setPreferredSize(new java.awt.Dimension(230, 23));
        jPanel7.add(jtfCounty);

        add(jPanel7);

        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 2, 0));

        jlLocality.setText("Localidad:");
        jlLocality.setPreferredSize(new java.awt.Dimension(85, 23));
        jPanel4.add(jlLocality);

        jtfLocality.setToolTipText("Localidad");
        jtfLocality.setPreferredSize(new java.awt.Dimension(230, 23));
        jPanel4.add(jtfLocality);

        add(jPanel4);

        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 2, 0));

        jlNeighbordhood.setText("Colonia:");
        jlNeighbordhood.setPreferredSize(new java.awt.Dimension(85, 23));
        jPanel3.add(jlNeighbordhood);

        jtfNeighborhood.setToolTipText("Colonia");
        jtfNeighborhood.setPreferredSize(new java.awt.Dimension(230, 23));
        jPanel3.add(jtfNeighborhood);

        jtfReference.setToolTipText("Referencia");
        jtfReference.setPreferredSize(new java.awt.Dimension(230, 23));
        jPanel3.add(jtfReference);

        add(jPanel3);

        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 2, 0));

        jlStreet.setText("Calle:");
        jlStreet.setPreferredSize(new java.awt.Dimension(85, 23));
        jPanel2.add(jlStreet);

        jtfStreet.setToolTipText("Calle");
        jtfStreet.setPreferredSize(new java.awt.Dimension(230, 23));
        jPanel2.add(jtfStreet);

        jtfStreetNumberExt.setToolTipText("Número exterior");
        jtfStreetNumberExt.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel2.add(jtfStreetNumberExt);

        jtfStreetNumberInt.setToolTipText("Número interior");
        jtfStreetNumberInt.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel2.add(jtfStreetNumberInt);

        add(jPanel2);
    }// </editor-fold>//GEN-END:initComponents

    private void initComponentsExtra() {
        moFieldAddress = new erp.lib.form.SFormField(miClient, SLibConstants.DATA_TYPE_STRING, true, jtfAddress, jlAddress);
        moFieldAddress.setLengthMax(50);
        moFieldIsDefault = new erp.lib.form.SFormField(miClient, SLibConstants.DATA_TYPE_BOOLEAN, true, jckIsDefault);
        moFieldFkCountryId = new erp.lib.form.SFormField(miClient, SLibConstants.DATA_TYPE_KEY, true, jcbFkCountryId_n, jlCountry);
        moFieldFkCountryId.setPickerButton(jbPickCountry);
        moFieldZipCode = new erp.lib.form.SFormField(miClient, SLibConstants.DATA_TYPE_STRING, true, jtfZipCode, jlZipCode);
        moFieldZipCode.setLengthMax(15);
        moFieldFkStateId = new erp.lib.form.SFormField(miClient, SLibConstants.DATA_TYPE_KEY, true, jcbFkStateId_n, jlState);
        moFieldState = new erp.lib.form.SFormField(miClient, SLibConstants.DATA_TYPE_STRING, true, jtfState, jlState);
        moFieldState.setLengthMax(50);
        moFieldCounty = new erp.lib.form.SFormField(miClient, SLibConstants.DATA_TYPE_STRING, false, jtfCounty, jlLocality);
        moFieldCounty.setLengthMax(50);
        moFieldLocality = new erp.lib.form.SFormField(miClient, SLibConstants.DATA_TYPE_STRING, false, jtfLocality, jlLocality);
        moFieldLocality.setLengthMax(50);
        moFieldNeighborhood = new erp.lib.form.SFormField(miClient, SLibConstants.DATA_TYPE_STRING, false, jtfNeighborhood, jlNeighbordhood);
        moFieldNeighborhood.setLengthMax(100);
        moFieldReference = new erp.lib.form.SFormField(miClient, SLibConstants.DATA_TYPE_STRING, false, jtfReference, jlNeighbordhood);
        moFieldReference.setLengthMax(50);
        moFieldStreet = new erp.lib.form.SFormField(miClient, SLibConstants.DATA_TYPE_STRING, false, jtfStreet, jlStreet);
        moFieldStreet.setLengthMax(100);
        moFieldStreetNumberExt = new erp.lib.form.SFormField(miClient, SLibConstants.DATA_TYPE_STRING, false, jtfStreetNumberExt, jlStreet);
        moFieldStreetNumberExt.setLengthMax(25);
        moFieldStreetNumberInt = new erp.lib.form.SFormField(miClient, SLibConstants.DATA_TYPE_STRING, false, jtfStreetNumberInt, jlStreet);
        moFieldStreetNumberInt.setLengthMax(25);

        mvFields = new Vector<>();
        mvFields.add(moFieldAddress);
        mvFields.add(moFieldIsDefault);
        mvFields.add(moFieldFkCountryId);
        mvFields.add(moFieldZipCode);
        mvFields.add(moFieldFkStateId);
        mvFields.add(moFieldState);
        mvFields.add(moFieldCounty);
        mvFields.add(moFieldLocality);
        mvFields.add(moFieldNeighborhood);
        mvFields.add(moFieldReference);
        mvFields.add(moFieldStreet);
        mvFields.add(moFieldStreetNumberExt);
        mvFields.add(moFieldStreetNumberInt);

        jbPickCountry.addActionListener(this);
        jbEditCountry.addActionListener(this);
        
        jcbFkCountryId_n.addItemListener(this);
        jcbFkStateId_n.addItemListener(this);
    }

    private void setCountryEnabled(boolean enable) {
        jbEditCountry.setEnabled(!enable);
        jcbFkCountryId_n.setEnabled(enable);
        jbPickCountry.setEnabled(enable);
    }
    
    private void renderAddress() {
        if (mbParamIsInMainWindow) {
            jtfAddress.setEnabled(false);

            if (moBizPartnerBranchAddress == null) {
                jtfAddress.setText(SModSysConsts.TXT_OFFICIAL);
                jckIsDefault.setSelected(true);
            }
        }
        else {
            jtfAddress.setEnabled(true);
        }
    }
    
    private void actionPerformedPickCountry() {
        miClient.pickOption(SDataConstants.LOCU_CTY, moFieldFkCountryId, null);
    }

    private void actionPerformedEditCountry() {
        setCountryEnabled(true);
        
        if (jcbFkCountryId_n.getSelectedIndex() <= 0) {
            // local country is implicitly selected:
            
            int countryId = miClient.getSessionXXX().getParamsErp().getFkCountryId();
            int[] stateKey = moFieldFkStateId.getKeyAsIntArray(); // to preserve selected state
            
            moFieldFkCountryId.setKey(new int[] { countryId });
            moFieldFkStateId.setKey(stateKey); // set selected state again
        }
        
        jcbFkCountryId_n.requestFocusInWindow();
    }

    @SuppressWarnings("unchecked")
    private void itemStateChangedCountry() {
        int countryId = 0;

        if (jcbFkCountryId_n.getSelectedIndex() > 0) {
            // honour selected country:
            countryId = moFieldFkCountryId.getKeyAsIntArray()[0];
        }
        else if (!jcbFkCountryId_n.isEnabled()) {
            // an empty option means local country:
            countryId = miClient.getSessionXXX().getParamsErp().getFkCountryId();
        }
        
        jcbFkStateId_n.removeAllItems();
        jcbFkStateId_n.setEnabled(false);
        jtfState.setEditable(false);
        jtfState.setFocusable(false);
        
        if (countryId != 0) {
            SFormUtilities.populateComboBox(miClient, jcbFkStateId_n, SDataConstants.LOCU_STA, new int[] { countryId });
            
            if (jcbFkStateId_n.getItemCount() > 1) {
                // states are available, allow state selection:
                jcbFkStateId_n.setEnabled(true);
            }
            else {
                // no states available, allow alternative input of state:
                jtfState.setEditable(true);
                jtfState.setFocusable(true);
            }
        }
    }
    
    private void itemStateChangedState() {
        if (jcbFkStateId_n.getSelectedIndex() <= 0) { // yes, <= 0, that is including the very first item that is actually just a label
            moFieldState.resetField();
        }
        else {
            moFieldState.setString(((SFormComponentItem) jcbFkStateId_n.getSelectedItem()).getComplement().toString());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JButton jbEditCountry;
    private javax.swing.JButton jbPickCountry;
    private javax.swing.JComboBox jcbFkCountryId_n;
    private javax.swing.JComboBox jcbFkStateId_n;
    private javax.swing.JCheckBox jckIsDefault;
    private javax.swing.JLabel jlAddress;
    private javax.swing.JLabel jlCountry;
    private javax.swing.JLabel jlCounty;
    private javax.swing.JLabel jlLocality;
    private javax.swing.JLabel jlNeighbordhood;
    private javax.swing.JLabel jlState;
    private javax.swing.JLabel jlStreet;
    private javax.swing.JLabel jlZipCode;
    private javax.swing.JTextField jtfAddress;
    private javax.swing.JTextField jtfCounty;
    private javax.swing.JTextField jtfLocality;
    private javax.swing.JTextField jtfNeighborhood;
    private javax.swing.JTextField jtfReference;
    private javax.swing.JTextField jtfState;
    private javax.swing.JTextField jtfStreet;
    private javax.swing.JTextField jtfStreetNumberExt;
    private javax.swing.JTextField jtfStreetNumberInt;
    private javax.swing.JTextField jtfZipCode;
    // End of variables declaration//GEN-END:variables

    public void setParamIsInMainWindow(boolean b) { mbParamIsInMainWindow = b; renderAddress(); }
    
    public void setParamIsCompany(boolean b) { mbParamIsCompany = b; }

    public void setFieldsEnabled(boolean enable) {
        jckIsDefault.setEnabled(false);
        jcbFkCountryId_n.setEnabled(jcbFkCountryId_n.isEnabled() ? enable : false);
        jbPickCountry.setEnabled(jbPickCountry.isEnabled() ? enable : false);
        jbEditCountry.setEnabled(enable);
        jtfZipCode.setEnabled(enable);
        jcbFkStateId_n.setEnabled(enable && jcbFkStateId_n.getItemCount() > 1);
        jtfState.setEnabled(enable);
        jtfCounty.setEnabled(enable);
        jtfLocality.setEnabled(enable);
        jtfNeighborhood.setEnabled(enable);
        jtfReference.setEnabled(enable);
        jtfStreet.setEnabled(enable);
        jtfStreetNumberExt.setEnabled(enable);
        jtfStreetNumberInt.setEnabled(enable);
    }

    public void requestFocusFirstTime() {
        if (jtfAddress.isEnabled()) {
            jtfAddress.requestFocus();
        }
        else {
            jtfStreet.requestFocus();
        }
    }
    
    @Override
    public void formClearRegistry() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void formReset() {
        mnFormResult = SLibConstants.UNDEFINED;
        mnFormStatus = SLibConstants.UNDEFINED;

        moBizPartnerBranchAddress = null;

        for (int i = 0; i < mvFields.size(); i++) {
            ((erp.lib.form.SFormField) mvFields.get(i)).resetField();
        }

        mbParamIsInMainWindow = false;
        mbParamIsCompany = false;
        setCountryEnabled(false);
        itemStateChangedCountry();
        renderAddress();
    }

    @Override
    public void formRefreshCatalogues() {
        SFormUtilities.populateComboBox(miClient, jcbFkCountryId_n, SDataConstants.LOCU_CTY);
        SFormUtilities.populateComboBox(miClient, jcbFkStateId_n, SDataConstants.LOCU_STA);
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
            if (mbParamIsCompany && moFieldCounty.getString().isEmpty()) {
                validation.setComponent(jtfCounty);
                validation.setMessage(SLibConstants.MSG_ERR_GUI_FIELD_EMPTY + "'" + jtfCounty.getToolTipText() + "'.");
            }
            else if (jcbFkCountryId_n.isEnabled() && jcbFkCountryId_n.getSelectedIndex() <= 0) {
                validation.setComponent(jcbFkCountryId_n);
                validation.setMessage(SLibConstants.MSG_ERR_GUI_FIELD_EMPTY + "'" + jcbFkCountryId_n.getToolTipText() + "'.");
            }
            else if (jcbFkStateId_n.isEnabled() && jcbFkStateId_n.getSelectedIndex() <= 0) {
                validation.setComponent(jcbFkStateId_n);
                validation.setMessage(SLibConstants.MSG_ERR_GUI_FIELD_EMPTY + "'" + jcbFkStateId_n.getToolTipText() + "'.");
            }
            else if ((!jcbFkCountryId_n.isEnabled() || miClient.getSession().getSessionCustom().isLocalCountry(moFieldFkCountryId.getKeyAsIntArray())) && moFieldZipCode.getString().length() != 5) {
                validation.setComponent(jtfZipCode);
                validation.setMessage(SGuiConsts.ERR_MSG_FIELD_VAL_ + "'" + jtfZipCode.getToolTipText() + "' debe tener una longitud de 5 dígitos.");
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
        if (registry instanceof SDataBizPartnerBranchAddress) {
            moBizPartnerBranchAddress = (SDataBizPartnerBranchAddress) registry;
        }
        else if (registry instanceof SDataBizPartnerAddressee) {
            moBizPartnerBranchAddress = ((SDataBizPartnerAddressee) registry).exportAddress();
        }

        moFieldAddress.setFieldValue(moBizPartnerBranchAddress.getAddress());
        moFieldIsDefault.setFieldValue(moBizPartnerBranchAddress.getIsDefault());
        moFieldFkCountryId.setFieldValue(new int[] { miClient.getSession().getSessionCustom().isLocalCountry(new int[] { moBizPartnerBranchAddress.getFkCountryId_n() }) ? SLibConstants.UNDEFINED : moBizPartnerBranchAddress.getFkCountryId_n() });
        setCountryEnabled(moBizPartnerBranchAddress.getFkCountryId_n() != SLibConstants.UNDEFINED && !miClient.getSession().getSessionCustom().isLocalCountry(new int[] { moBizPartnerBranchAddress.getFkCountryId_n() }));
        itemStateChangedCountry();
        moFieldZipCode.setFieldValue(moBizPartnerBranchAddress.getZipCode());
        moFieldFkStateId.setFieldValue(new int[] { moBizPartnerBranchAddress.getFkStateId_n() });
        itemStateChangedState();
        if (jtfState.isEditable()) {
            moFieldState.setFieldValue(moBizPartnerBranchAddress.getState());
        }
        moFieldLocality.setFieldValue(moBizPartnerBranchAddress.getLocality());
        moFieldCounty.setFieldValue(moBizPartnerBranchAddress.getCounty());
        moFieldNeighborhood.setFieldValue(moBizPartnerBranchAddress.getNeighborhood());
        moFieldReference.setFieldValue(moBizPartnerBranchAddress.getReference());
        moFieldStreet.setFieldValue(moBizPartnerBranchAddress.getStreet());
        moFieldStreetNumberExt.setFieldValue(moBizPartnerBranchAddress.getStreetNumberExt());
        moFieldStreetNumberInt.setFieldValue(moBizPartnerBranchAddress.getStreetNumberInt());

        renderAddress();
    }

    @Override
    public erp.lib.data.SDataRegistry getRegistry() {
        if (moBizPartnerBranchAddress == null) {
            moBizPartnerBranchAddress = new SDataBizPartnerBranchAddress();
            moBizPartnerBranchAddress.setFkUserNewId(miClient.getSession().getUser().getPkUserId());
        }
        else {
            moBizPartnerBranchAddress.setFkUserEditId(miClient.getSession().getUser().getPkUserId());
        }

        moBizPartnerBranchAddress.setAddress(mbParamIsInMainWindow ? SModSysConsts.TXT_OFFICIAL : moFieldAddress.getString());
        moBizPartnerBranchAddress.setStreet(moFieldStreet.getString());
        moBizPartnerBranchAddress.setStreetNumberExt(moFieldStreetNumberExt.getString());
        moBizPartnerBranchAddress.setStreetNumberInt(moFieldStreetNumberInt.getString());
        moBizPartnerBranchAddress.setNeighborhood(moFieldNeighborhood.getString());
        moBizPartnerBranchAddress.setReference(moFieldReference.getString());
        moBizPartnerBranchAddress.setLocality(moFieldLocality.getString());
        moBizPartnerBranchAddress.setCounty(moFieldCounty.getString());
        moBizPartnerBranchAddress.setState(moFieldState.getString());
        moBizPartnerBranchAddress.setZipCode(moFieldZipCode.getString());
        //moBizPartnerBranchAddress.setPoBox(...); // not used by now
        moBizPartnerBranchAddress.setIsDefault(moFieldIsDefault.getBoolean());
        //moBizPartnerBranchAddress.setIsDeleted(...); // not handled here, but by cointainer
        moBizPartnerBranchAddress.setFkAddressTypeId(mbParamIsInMainWindow ? SDataConstantsSys.BPSS_TP_ADD_OFF : SDataConstantsSys.BPSS_TP_ADD_OFF_NO);
        moBizPartnerBranchAddress.setFkCountryId_n(!jcbFkCountryId_n.isEnabled() ? 0 : moFieldFkCountryId.getKeyAsIntArray()[0]);
        moBizPartnerBranchAddress.setFkStateId_n(!jcbFkStateId_n.isEnabled() ? 0 : moFieldFkStateId.getKeyAsIntArray()[0]);

        return moBizPartnerBranchAddress;
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

            if (button == jbPickCountry) {
                actionPerformedPickCountry();
            }
            else if (button == jbEditCountry) {
                actionPerformedEditCountry();
            }
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() instanceof javax.swing.JComboBox) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                JComboBox comboBox = (JComboBox) e.getSource();

                if (comboBox == jcbFkCountryId_n) {
                    itemStateChangedCountry();
                }
                else if (comboBox == jcbFkStateId_n) {
                    itemStateChangedState();
                }
            }
        }
    }
}