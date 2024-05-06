package classes;

import com.mysql.jdbc.Connection;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class DBConnection {

    /**
     *
     * @return
     */
    public Connection dbConn() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hushanproject?autoReconnect=false&useSSL=false", "root", "");
//            JOptionPane.showMessageDialog(null, "Database Connected");
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Database Not Connected, Check your Internet Connection");
        }
        return con;
    }
    
}
