package classes;

/**
 *
 * @author Administrator
 */
public class TeaLeafCollectRealTable {

    private int collectionID;
    private int customerID;
    private String date;
    private double totalWeight;
    private double waterWeight;
    private double Bleaf;
    private double advance;
    private double transport;
    private int teaPackets;
    private double fertilizer;
    private double other;
    private double netWeight;
    private double after4;
    private double chargeforTeaPackets;

    /**
     *
     * @param collectionID
     * @param customerID
     * @param date
     * @param totalWeight
     * @param waterWeight
     * @param Bleaf
     * @param advance
     * @param transport
     * @param teaPackets
     * @param fertilizer
     * @param other
     * @param netWeight
     * @param after4
     * @param chargeforTeaPackets
     */
    public TeaLeafCollectRealTable(int collectionID, int customerID, String date, double totalWeight, double waterWeight, double Bleaf, double advance, double transport, int teaPackets, double fertilizer, double other, double netWeight , double after4, double chargeforTeaPackets) {
        this.collectionID = collectionID;
        this.customerID = customerID;
        this.date = date;
        this.totalWeight = totalWeight;
        this.waterWeight = waterWeight;
        this.Bleaf = Bleaf;
        this.advance = advance;
        this.transport = transport;
        this.teaPackets = teaPackets;
        this.fertilizer = fertilizer;
        this.other = other;
        this.netWeight = netWeight;
        this.after4 = after4;
        this.chargeforTeaPackets = chargeforTeaPackets;
    }

    /**
     *
     * @return
     */
    public int getcollectionID() {
        return collectionID;
    }

    /**
     *
     * @param collectionID
     */
    public void setcollectionID(int collectionID) {
        this.collectionID = collectionID;
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
    public String getDate() {
        return date;
    }

    /**
     *
     * @param date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     *
     * @return
     */
    public double getTotalWeight() {
        return totalWeight;
    }

    /**
     *
     * @param totalWeight
     */
    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

    /**
     *
     * @return
     */
    public double getWaterWeight() {
        return waterWeight;
    }

    /**
     *
     * @param waterWeight
     */
    public void setWaterWeight(double waterWeight) {
        this.waterWeight = waterWeight;
    }

    /**
     *
     * @return
     */
    public double getBleaf() {
        return Bleaf;
    }

    /**
     *
     * @param Bleaf
     */
    public void setBleaf(double Bleaf) {
        this.Bleaf = Bleaf;
    }

    /**
     *
     * @return
     */
    public double getAdvance() {
        return advance;
    }

    /**
     *
     * @param advance
     */
    public void setAdvance(double advance) {
        this.advance = advance;
    }

    /**
     *
     * @return
     */
    public double getTransport() {
        return transport;
    }

    /**
     *
     * @param transport
     */
    public void setTransport(double transport) {
        this.transport = transport;
    }

    /**
     *
     * @return
     */
    public int getTeaPackets() {
        return teaPackets;
    }

    /**
     *
     * @param teaPackets
     */
    public void setTeaPackets(int teaPackets) {
        this.teaPackets = teaPackets;
    }

    /**
     *
     * @return
     */
    public double getFertilizer() {
        return fertilizer;
    }

    /**
     *
     * @param fertilizer
     */
    public void setFertilizer(double fertilizer) {
        this.fertilizer = fertilizer;
    }

    /**
     *
     * @return
     */
    public double getOther() {
        return other;
    }

    /**
     *
     * @param other
     */
    public void setOther(double other) {
        this.other = other;
    }

    /**
     *
     * @return
     */
    public double getnetWeight() {
        return netWeight;
    }

    /**
     *
     * @param netWeight
     */
    public void setnetWeight(double netWeight) {
        this.netWeight = netWeight;
    }
    
    /**
     *
     * @return
     */
    public double getafter4() {
        return after4;
    }

    /**
     *
     * @param after4
     */
    public void setafter4(double after4) {
        this.after4 = after4;
    }
    
    /**
     *
     * @return
     */
    public double getchargeforTeaPackets() {
        return chargeforTeaPackets;
    }

    /**
     *
     * @param chargeforTeaPackets
     */
    public void setchargeforTeaPackets(double chargeforTeaPackets) {
        this.chargeforTeaPackets = chargeforTeaPackets;
    }
}
