package classes;

/**
 *
 * @author Administrator
 */
public class CustomerTable {

    private int customerID;
    private String customerName;
    private String customerAddr;
    private int customerPhoneNo;

    /**
     *
     * @param customerID
     * @param customerName
     * @param customerAddr
     * @param customerPhoneNo
     */
    public CustomerTable(int customerID, String customerName, String customerAddr, int customerPhoneNo) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerAddr = customerAddr;
        this.customerPhoneNo = customerPhoneNo;
    }

    /**
     *
     * @return
     */
    public int getCustomerPhoneNo() {
        return customerPhoneNo;
    }

    /**
     *
     * @param customerPhoneNo
     */
    public void setCustomerPhoneNo(int customerPhoneNo) {
        this.customerPhoneNo = customerPhoneNo;
    }

    /**
     *
     * @return
     */
    public int getCustomerID() {
        return customerID;
    }

    /**
     *
     * @param customerID
     */
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    /**
     *
     * @return
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     *
     * @param customerName
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     *
     * @return
     */
    public String getCustomerAddr() {
        return customerAddr;
    }

    /**
     *
     * @param customerAddr
     */
    public void setCustomerAddr(String customerAddr) {
        this.customerAddr = customerAddr;
    }

}
