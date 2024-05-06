package classes;

/**
 *
 * @author Administrator
 */
public class LoginReportTable {

    private int loginID;
    private String date;
    private String logInTime;
    private String logOutTime;

    /**
     *
     * @param loginID
     * @param date
     * @param logInTime
     * @param logOutTime
     */
    public LoginReportTable(int loginID, String date, String logInTime, String logOutTime) {
        this.loginID = loginID;
        this.date = date;
        this.logInTime = logInTime;
        this.logOutTime = logOutTime;
    }

    /**
     *
     * @return
     */
    public int getLoginID() {
        return loginID;
    }

    /**
     *
     * @param loginID
     */
    public void setLoginID(int loginID) {
        this.loginID = loginID;
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
    public String getLogInTime() {
        return logInTime;
    }

    /**
     *
     * @param logInTime
     */
    public void setLogInTime(String logInTime) {
        this.logInTime = logInTime;
    }

    /**
     *
     * @return
     */
    public String getLogOutTime() {
        return logOutTime;
    }

    /**
     *
     * @param logOutTime
     */
    public void setLogOutTime(String logOutTime) {
        this.logOutTime = logOutTime;
    }

}
