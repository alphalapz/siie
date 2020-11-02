/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package erp.mitm.data;

import erp.data.SDataConstants;
import erp.lib.SLibConstants;
import erp.lib.SLibUtilities;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author Alfonso Flores
 */
public class SDataBizPartnerItemDescription extends erp.lib.data.SDataRegistry implements java.io.Serializable {

    protected int mnPkBizPartnerId;

    protected java.util.Vector<erp.mitm.data.SDataItemBizPartnerDescription> mvDbmsItemBizPartnerDescriptions;

    public SDataBizPartnerItemDescription() {
        super(SDataConstants.BPSX_BP_ITEM_DESC);
        mvDbmsItemBizPartnerDescriptions = new Vector<SDataItemBizPartnerDescription>();
        reset();
    }

    public void setPkBizPartnerId(int n) { mnPkBizPartnerId = n; }
    public int getPkBizPartnerId() { return mnPkBizPartnerId; }

    public java.util.Vector<SDataItemBizPartnerDescription> getDbmsItemBizPartnerDescriptions() { return mvDbmsItemBizPartnerDescriptions; }

    @Override
    public void setPrimaryKey(java.lang.Object pk) {
        mnPkBizPartnerId = ((int[]) pk)[0];
    }

    @Override
    public java.lang.Object getPrimaryKey() {
        return new int[] { mnPkBizPartnerId };
    }

    @Override
    public void reset() {
        super.resetRegistry();

        mnPkBizPartnerId = 0;

        mvDbmsItemBizPartnerDescriptions.clear();
    }

    @Override
    public int read(java.lang.Object pk, java.sql.Statement statement) {
        int[] key = (int[]) pk;
        String sql;
        ResultSet resultSet = null;
        Statement statementAux = null;

        mnLastDbActionResult = SLibConstants.UNDEFINED;
        reset();
        try {
            statementAux = statement.getConnection().createStatement();

            mnPkBizPartnerId = key[0];

            sql = "SELECT id_item, id_bp, id_cfg FROM erp.itmu_cfg_item_bp WHERE id_bp = " + key[0] + " ORDER BY id_bp, id_item ";
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                erp.mitm.data.SDataItemBizPartnerDescription desc = new SDataItemBizPartnerDescription();
                if (desc.read(new int[] { resultSet.getInt("id_item"), resultSet.getInt("id_bp"), resultSet.getInt("id_cfg") }, statementAux) != SLibConstants.DB_ACTION_READ_OK) {
                        throw new Exception(SLibConstants.MSG_ERR_DB_REG_READ_DEP);
                    }
                    else {
                        mvDbmsItemBizPartnerDescriptions.add(desc);
                    }
            }

            mbIsRegistryNew = false;
            mnLastDbActionResult = SLibConstants.DB_ACTION_READ_OK;
        }
        catch (java.sql.SQLException e) {
            mnLastDbActionResult = SLibConstants.DB_ACTION_READ_ERROR;
            SLibUtilities.printOutException(this, e);
        }
        catch (java.lang.Exception e) {
            mnLastDbActionResult = SLibConstants.DB_ACTION_READ_ERROR;
            SLibUtilities.printOutException(this, e);
        }

        return mnLastDbActionResult;
    }

    @Override
    public int save(java.sql.Connection connection) {
        int i;

        mnLastDbActionResult = SLibConstants.UNDEFINED;

        try {

            for (i = 0; i < mvDbmsItemBizPartnerDescriptions.size(); i++) {
                mvDbmsItemBizPartnerDescriptions.get(i).setPkBizPartnerId(mnPkBizPartnerId);
                if (mvDbmsItemBizPartnerDescriptions.get(i).save(connection) != SLibConstants.DB_ACTION_SAVE_OK) {
                    throw new Exception(SLibConstants.MSG_ERR_DB_REG_SAVE_DEP);
                }
            }

            mbIsRegistryNew = false;
            mnLastDbActionResult = SLibConstants.DB_ACTION_SAVE_OK;
        }
        catch (java.sql.SQLException e) {
            mnLastDbActionResult = SLibConstants.DB_ACTION_SAVE_ERROR;
            SLibUtilities.printOutException(this, e);
        }
        catch (java.lang.Exception e) {
            mnLastDbActionResult = SLibConstants.DB_ACTION_SAVE_ERROR;
            SLibUtilities.printOutException(this, e);
        }

        return mnLastDbActionResult;
    }

    @Override
    public java.util.Date getLastDbUpdate() {
        return null;
    }
}
