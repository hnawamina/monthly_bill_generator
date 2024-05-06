package classes;

/**
 *
 * @author Administrator
 */
public class SettingPagesTable {
    
    private double teaPacketPrice;
    private String lastUpdateDate;
    private String lastUpdateTime;
    private double monthlyTeaRate;
    private double monthlyBLRate;
    
    /**
     *
     * @param teaPacketPrice
     * @param lastUpdateDate
     * @param lastUpdateTime
     * @param monthlyTeaRate
     * @param monthlyBLRate
     */
    public SettingPagesTable(double teaPacketPrice, String lastUpdateDate, String lastUpdateTime, double monthlyTeaRate, double monthlyBLRate) {
        this.teaPacketPrice = teaPacketPrice;
        this.lastUpdateDate = lastUpdateDate;
        this.lastUpdateTime = lastUpdateTime;
        this.monthlyTeaRate = monthlyTeaRate;
        this.monthlyBLRate = monthlyBLRate;
    }

    /**
     *
     * @return
     */
    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     *
     * @param lastUpdateTime
     */
    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     *
     * @return
     */
    public double getTeaPacketPrice() {
        return teaPacketPrice;
    }

    /**
     *
     * @param teaPacketPrice
     */
    public void setTeaPacketPrice(double teaPacketPrice) {
        this.teaPacketPrice = teaPacketPrice;
    }

    /**
     *
     * @return
     */
    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     *
     * @param lastUpdateDate
     */
    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }
    
    /**
     *
     * @return
     */
    public double getmonthlyTeaRate() {
        return monthlyTeaRate;
    }

    /**
     *
     * @param monthlyTeaRate
     */
    public void setmonthlyTeaRate(double monthlyTeaRate) {
        this.monthlyTeaRate = monthlyTeaRate;
    }
    
    /**
     *
     * @return
     */
    public double getmonthlyBLRate() {
        return monthlyBLRate;
    }

    /**
     *
     * @param monthlyBLRate
     */
    public void setmonthlyBLRate(double monthlyBLRate) {
        this.monthlyBLRate = monthlyBLRate;
    }
}
