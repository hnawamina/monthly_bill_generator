package classes;

/**
 *
 * @author Administrator
 */
public class PasswordTable {
    private int pwID;
    private String pw;

    /**
     *
     * @param pwID
     * @param pw
     */
    public PasswordTable(int pwID, String pw) {
        this.pwID = pwID;
        this.pw = pw;
    }

    /**
     *
     * @return
     */
    public String getPw() {
        return pw;
    }

    /**
     *
     * @param pw
     */
    public void setPw(String pw) {
        this.pw = pw;
    }

    /**
     *
     * @return
     */
    public int getPwID() {
        return pwID;
    }

    /**
     *
     * @param pwID
     */
    public void setPwID(int pwID) {
        this.pwID = pwID;
    }
    
}
