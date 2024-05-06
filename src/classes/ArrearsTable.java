package classes;

/**
 *
 * @author Administrator
 */
public class ArrearsTable {
    private int customerID;
    private double arrears;

    /**
     *
     * @param customerID
     * @param arrears
     */
    public ArrearsTable(int customerID, double arrears) {
        this.customerID = customerID;
        this.arrears = arrears;
    }

    /**
     *
     * @return
     */
    public double getArrears() {
        return arrears;
    }

    /**
     *
     * @param arrears
     */
    public void setArrears(double arrears) {
        this.arrears = arrears;
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
    
}
