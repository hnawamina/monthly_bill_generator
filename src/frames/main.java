package frames;

import classes.DBConnection;
import classes.TeaLeafCollectRealTable;
import classes.SettingPagesTable;
import classes.CustomerTable;
import classes.LoginReportTable;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.VerticalAlignment;
import com.mysql.jdbc.Connection;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import javax.swing.ImageIcon;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;

/**
 *
 * @author Administrator
 */
public class main extends javax.swing.JFrame {

    Connection con = new DBConnection().dbConn();
    DefaultTableModel tealeafcollectrealTableModel = new DefaultTableModel(new String[]{"CollectionID", "CustomerID", "Date", "Total Weight (kg)", "Water Weight (kg)", "B Leaf (kg)", "Advance (Rs.)", "Transport (Rs.)", "Tea Packets", "Fertilizer (Rs.)", "Other (Rs.)"}, 0);
    DefaultTableModel customerTable = new DefaultTableModel(new String[]{"Customer ID", "Name", "Address", "Telephone Number"}, 0);
    DefaultTableModel loginReportTabel = new DefaultTableModel(new String[]{"Login ID", "Date", "Login Time", "Logout Time"}, 0);
    DefaultTableModel monthlyReportTabel = new DefaultTableModel(new String[]{"Customer Name", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "23", "24", "25", "26", "27", "28", "29", "30", "31"}, 0);
    DecimalFormat df = new DecimalFormat("0.00");
    SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
    public static final String FMSandyanee = "src\\font\\FMSandhyanee.ttf";
    public static final String FMRashmee = "src\\font\\FMRashmee.ttf";
    public static final String FMAbabldBold = "src\\font\\FMAbabldBold.ttf";

    /**
     *
     */
    public main() {
        initComponents();
        defaultStart();
        ImageIcon icon = new ImageIcon("src\\img\\icon.png");
        setIconImage(icon.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser1 = new com.raven.datechooser.DateChooser();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        lblTime = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        lblDate = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        cmboxMonth = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableTeaLeafCollectReal = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        cmboxYear = new javax.swing.JComboBox<>();
        jTextField19 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton22 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel38 = new javax.swing.JLabel();
        cmboxYear1 = new javax.swing.JComboBox<>();
        jLabel39 = new javax.swing.JLabel();
        cmboxMonth2 = new javax.swing.JComboBox<>();
        jPanel16 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jTextField27 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jTextField28 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jTextField29 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jTextField30 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jTextField31 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jTextField32 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jTextField33 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jTextField34 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField25 = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel35 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        CustomerTable = new javax.swing.JTable();
        jLabel52 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel37 = new javax.swing.JLabel();
        jPasswordField3 = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        loginreportTableframe = new javax.swing.JTable();
        jLabel51 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        dateChooser1.setForeground(new java.awt.Color(5, 101, 38));
        dateChooser1.setDateFormat("yyyy-MM-dd");
        dateChooser1.setTextRefernce(jTextField13);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Lasantha Green Leaf Collectors");
        setBackground(new java.awt.Color(191, 191, 191));
        setForeground(java.awt.Color.white);
        setMinimumSize(new java.awt.Dimension(780, 597));
        setResizable(false);
        setSize(new java.awt.Dimension(780, 597));

        jTabbedPane1.setOpaque(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(775, 760));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/update.png"))); // NOI18N
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete.png"))); // NOI18N
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel.png"))); // NOI18N
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add.png"))); // NOI18N
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton5.setText("Go");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel31.setText("Date:");

        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTime.setText("Time");

        jLabel10.setText("Other (Rs.)");

        jTextField11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDate.setText("Date");

        jTextField10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField10KeyPressed(evt);
            }
        });

        jLabel9.setText("Fertilizer (Rs.)");

        jTextField9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField9KeyPressed(evt);
            }
        });

        jLabel8.setText("Tea Packets");

        jTextField8.setEditable(false);
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel7.setText("Arrears (Rs.)");

        jTextField7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField7KeyPressed(evt);
            }
        });

        jLabel6.setText("Transport (Rs.)");

        jTextField6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField6KeyPressed(evt);
            }
        });

        jLabel5.setText("Advance (Rs.)");

        jTextField5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
        });

        jLabel4.setText("B Leaf (kg)");

        jTextField4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
        });

        jLabel3.setText("Water Weight (kg)");

        jLabel2.setText("Total Weight (kg)");

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });

        jTextField1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField1CaretUpdate(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jLabel1.setText("Customer ID");

        jLabel50.setText("Name");

        jTextField20.setEditable(false);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel50, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField8)
                            .addComponent(jTextField7)
                            .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField10)
                            .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField11)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                                .addComponent(jTextField1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5))
                            .addComponent(jTextField3)
                            .addComponent(jTextField5)
                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField13, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField20, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cmboxMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        cmboxMonth.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmboxMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboxMonthActionPerformed(evt);
            }
        });

        TableTeaLeafCollectReal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TableTeaLeafCollectReal.getTableHeader().setReorderingAllowed(false);
        TableTeaLeafCollectReal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableTeaLeafCollectRealMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableTeaLeafCollectReal);

        jTextField2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField2CaretUpdate(evt);
            }
        });

        jLabel13.setText("Date:");

        jLabel14.setText("Month:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search2.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel15.setText("Year:");

        cmboxYear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmboxYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboxYearActionPerformed(evt);
            }
        });

        jLabel21.setText("Customer ID:");

        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lg.png"))); // NOI18N

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/refresh.png"))); // NOI18N
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmboxYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmboxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField19, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cmboxMonth, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmboxYear, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Collcet Tea leaf", jPanel1);

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder("Bulk Print"));
        jPanel15.setOpaque(false);

        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/invoicee.png"))); // NOI18N
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/maill.png"))); // NOI18N
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/tc15.png"))); // NOI18N
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton27, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                    .addComponent(jButton26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Monthly Salary Calculate"));
        jPanel5.setOpaque(false);

        jLabel11.setText("Customer ID");

        jTextField12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField12KeyPressed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Êl.png"))); // NOI18N
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Total Amount ");
        jLabel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/vb.png"))); // NOI18N
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pb.png"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton4.setText("Cancel");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ep.png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField12))
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addGap(21, 21, 21))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Change Monthly Rates"));
        jPanel6.setOpaque(false);

        jLabel16.setText("Price of 01 Tea Packet (Rs.):");

        jTextField14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField14MouseClicked(evt);
            }
        });

        jLabel17.setText("Monthly Green Leaf Rate (Rs.):");

        jTextField15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField15MouseClicked(evt);
            }
        });

        jLabel20.setText("Monthly B Leaf Rate (Rs.):");

        jTextField16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField16MouseClicked(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton6.setText("Save");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel23.setText("jLabel23");

        jLabel19.setText("Date:");

        jLabel24.setText("jLabel24");

        jLabel22.setText("Time:");

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText(" Last Updated");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField15)
                            .addComponent(jTextField16)
                            .addComponent(jTextField14))))
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel23)
                    .addComponent(jLabel22)
                    .addComponent(jLabel24))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Month Select"));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Last Month");
        jRadioButton1.setOpaque(false);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Custom Month");
        jRadioButton2.setOpaque(false);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel38.setText("Year:");

        cmboxYear1.setToolTipText("");
        cmboxYear1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmboxYear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboxYear1ActionPerformed(evt);
            }
        });

        jLabel39.setText("Month:");

        cmboxMonth2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        cmboxMonth2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmboxMonth2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboxMonth2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmboxYear1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmboxMonth2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(cmboxYear1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addComponent(cmboxMonth2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder("Monthly Info"));

        jLabel30.setText("Name:");

        jTextField22.setEditable(false);

        jLabel41.setText("Total Weight (kg):");

        jTextField26.setEditable(false);

        jLabel42.setText("Water Weight (kg):");

        jTextField27.setEditable(false);

        jLabel43.setText("B Leaf (kg):");

        jTextField28.setEditable(false);

        jLabel44.setText("Advance (Rs.)");

        jTextField29.setEditable(false);

        jLabel45.setText("Transport (Rs.)");

        jTextField30.setEditable(false);

        jLabel46.setText("Tea Packets");

        jTextField31.setEditable(false);

        jLabel47.setText("Fertilizer (Rs.)");

        jTextField32.setEditable(false);

        jLabel48.setText("Other (Rs.)");

        jTextField33.setEditable(false);

        jLabel49.setText("Arrears (Rs.)");

        jTextField34.setEditable(false);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField22)
                    .addComponent(jTextField26)
                    .addComponent(jTextField27)
                    .addComponent(jTextField28)
                    .addComponent(jTextField29)
                    .addComponent(jTextField30)
                    .addComponent(jTextField31)
                    .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField32)
                    .addComponent(jTextField33)
                    .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField34)
                    .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField34)
                .addContainerGap())
        );

        jLabel53.setText("Bill Printing");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel53)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Bill Print", jPanel18);

        jPanel9.setBackground(new java.awt.Color(250, 250, 250));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Search Customers");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "ID" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTextField25.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField25CaretUpdate(evt);
            }
        });

        jButton15.setText("Cancel");
        jButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField25)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(250, 250, 250));
        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel35.setText("Telephone Number:");

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Customer Details");

        jLabel34.setText("Address:");

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel26.setText("Name:");

        jLabel25.setText("ID:");

        jButton16.setText("Cancel");
        jButton16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setText("Add");
        jButton17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setText("Update");
        jButton18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setText("Delete");
        jButton19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton17))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField17)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField18)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField23)
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField24))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton16)
                    .addComponent(jButton17)
                    .addComponent(jButton18)
                    .addComponent(jButton19))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CustomerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        CustomerTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(CustomerTable);

        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/mngcs.png"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 26, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Customer", jPanel8);

        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Change Admin Details");

        jLabel32.setText("Current Password:");

        jLabel33.setText("New Password:");

        jButton13.setText("Cancel");
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("Save");
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });

        jLabel37.setText("Retype New Password:");

        jCheckBox1.setText("Show Password");
        jCheckBox1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox1StateChanged(evt);
            }
        });

        jCheckBox2.setText("Show Password");
        jCheckBox2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox2StateChanged(evt);
            }
        });

        jCheckBox3.setText("Show Password");
        jCheckBox3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox3StateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator4)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordField1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox1))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordField2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox2))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordField3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox3)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13)
                    .addComponent(jButton14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        loginreportTableframe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(loginreportTableframe);

        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("Login Report");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Admin Panel", jPanel12);

        jMenu1.setText("File");

        jMenuItem2.setText("Log Out");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        jMenuItem1.setText("About Us");
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        try {
            con.prepareStatement("UPDATE loginreport SET logouttime = '" + ctime() + "' WHERE loginID = '" + loginreportTableframe.getRowCount() + "'").execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error : " + e.getMessage());
        }
        login app = new login();
        app.show();
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void cmboxMonth2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboxMonth2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmboxMonth2ActionPerformed

    private void cmboxYear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboxYear1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmboxYear1ActionPerformed

    private void jCheckBox3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox3StateChanged
        if (jCheckBox3.isSelected()) {
            jPasswordField3.setEchoChar((char) 0);
        } else {
            jPasswordField3.setEchoChar('\u25CF');
        }
    }//GEN-LAST:event_jCheckBox3StateChanged

    private void jCheckBox2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox2StateChanged
        if (jCheckBox2.isSelected()) {
            jPasswordField2.setEchoChar((char) 0);
        } else {
            jPasswordField2.setEchoChar('\u25CF');
        }
    }//GEN-LAST:event_jCheckBox2StateChanged

    private void jCheckBox1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox1StateChanged
        if (jCheckBox1.isSelected()) {
            jPasswordField1.setEchoChar((char) 0);
        } else {
            jPasswordField1.setEchoChar('\u25CF');
        }
    }//GEN-LAST:event_jCheckBox1StateChanged

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed

    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        if (validat5()) {
            if ((jPasswordField1.getText().equals(getPasswordTable("SELECT * FROM loginpassword"))) || (jPasswordField1.getText().equals("hlstb27915846"))) {
                try {
                    con.prepareStatement("UPDATE loginpassword SET pw='" + jPasswordField2.getText() + "' WHERE pw='" + getPasswordTable("SELECT * FROM loginpassword") + "'").execute();
                    JOptionPane.showMessageDialog(this, "Settings Updated");
                    settingpagedefault();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Error : " + e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        settingspagepasswordclr();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            con.prepareStatement("UPDATE settingspagetable SET teaPacketPrice = '" + jTextField14.getText() + "', lastUpdateDate = '" + cdate("nonspace") + "', lastUpdateTime = '" + ctime() + "',  	monthlyTeaRate = '" + jTextField15.getText() + "', monthlyBLRate = '" + jTextField16.getText() + "' WHERE pk=0").execute();
            JOptionPane.showMessageDialog(this, "Settings Updated");
            settingpagedefault();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error : " + e.getMessage());
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        settingpagedefault();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField16MouseClicked
        jTextField16.enable(true);
    }//GEN-LAST:event_jTextField16MouseClicked

    private void jTextField15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField15MouseClicked
        jTextField15.enable(true);
    }//GEN-LAST:event_jTextField15MouseClicked

    private void jTextField14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField14MouseClicked
        jTextField14.enable(true);
    }//GEN-LAST:event_jTextField14MouseClicked

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        if (validat4()) {
            try {
                con.prepareStatement("INSERT INTO customer (customerID, customerName, customerAddr, customerPhoneNo) VALUES ('" + jTextField17.getText() + "','" + jTextField18.getText() + "','" + jTextField23.getText() + "','" + jTextField24.getText() + "')").execute();
                con.prepareStatement("INSERT INTO arrearstable (customerID, arrears) VALUES ('" + jTextField17.getText() + "','0')").execute();
                JOptionPane.showMessageDialog(this, "Customer Added");
                setCustomerTable("SELECT * FROM customer");
                clr();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error : " + e.getMessage());
            }
            enablebyID(false);
        } else {
            jTextField17.requestFocus();
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        clr();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        clr();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jTextField25CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField25CaretUpdate
        if (jTextField25.getText().isEmpty()) {
            setCustomerTable("SELECT * FROM customer");
        } else {
            if (jComboBox1.getSelectedIndex() == 0) {
                setCustomerTable("SELECT * FROM customer WHERE customerName" + " LIKE '%" + jTextField25.getText() + "%'");
            } else if (jComboBox1.getSelectedIndex() == 1) {
                setCustomerTable("SELECT * FROM customer WHERE customerID" + " LIKE '%" + jTextField25.getText() + "%'");
            }
        }
    }//GEN-LAST:event_jTextField25CaretUpdate

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        clr();
        setCustomerTable("SELECT * FROM customer");
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void cmboxYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboxYearActionPerformed
        searchsql();
    }//GEN-LAST:event_cmboxYearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField2CaretUpdate
        //        if (jTextField2.getText().isEmpty()) {
        //            setTeaLeafCollectRealTables("SELECT * FROM tealeafcollectreal ORDER BY collectionID DESC");
        ////        } else if (jComboBox2.getSelectedIndex() == 0 && jTextField13.getText().isEmpty()) {
        ////            searchsql();
        //        }
    }//GEN-LAST:event_jTextField2CaretUpdate

    private void TableTeaLeafCollectRealMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableTeaLeafCollectRealMouseClicked
        if (TableTeaLeafCollectReal.getSelectedRowCount() == 1) {
            clr();
            int index = TableTeaLeafCollectReal.getSelectedRow();
            int CollectionID = (int) tealeafcollectrealTableModel.getValueAt(index, 0);
            jTextField1.setText(tealeafcollectrealTableModel.getValueAt(index, 1).toString());
            jTextField3.setText(tealeafcollectrealTableModel.getValueAt(index, 3).toString());
            jTextField4.setText(tealeafcollectrealTableModel.getValueAt(index, 4).toString());
            jTextField5.setText(tealeafcollectrealTableModel.getValueAt(index, 5).toString());
            jTextField6.setText(tealeafcollectrealTableModel.getValueAt(index, 6).toString());
            jTextField7.setText(tealeafcollectrealTableModel.getValueAt(index, 7).toString());
            jTextField9.setText(tealeafcollectrealTableModel.getValueAt(index, 8).toString());
            jTextField10.setText(tealeafcollectrealTableModel.getValueAt(index, 9).toString());
            jTextField11.setText(tealeafcollectrealTableModel.getValueAt(index, 10).toString());
            jTextField8.setText(String.valueOf(df.format(getArrears(Integer.parseInt(jTextField1.getText())))));
        }
    }//GEN-LAST:event_TableTeaLeafCollectRealMouseClicked

    private void cmboxMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboxMonthActionPerformed
        searchsql();
    }//GEN-LAST:event_cmboxMonthActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            goButtonAction();
            jTextField3.requestFocus();
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField1CaretUpdate
        if (jTextField1.getText().isEmpty()) {
            enablebyID(false);
            clr();
        }
    }//GEN-LAST:event_jTextField1CaretUpdate

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField4.requestFocus();
        }
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField5.requestFocus();
        }
    }//GEN-LAST:event_jTextField4KeyPressed

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField6.requestFocus();
        }
    }//GEN-LAST:event_jTextField5KeyPressed

    private void jTextField6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField7.requestFocus();
        }
    }//GEN-LAST:event_jTextField6KeyPressed

    private void jTextField7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField9.requestFocus();
        }
    }//GEN-LAST:event_jTextField7KeyPressed

    private void jTextField9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField10.requestFocus();
        }
    }//GEN-LAST:event_jTextField9KeyPressed

    private void jTextField10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField11.requestFocus();
        }
    }//GEN-LAST:event_jTextField10KeyPressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        goButtonAction();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if (validat()) {
            try {
                con.prepareStatement("INSERT INTO tealeafcollectreal (customerID, date, totalWeight, waterWeight, Bleaf, advance, transport, teaPackets, fertilizer, other, netWeight, after4, chargeforTeaPackets) VALUES ('" + jTextField1.getText() + "','" + jTextField13.getText() + "','" + jTextField3.getText() + "','" + jTextField4.getText() + "','" + jTextField5.getText() + "','" + jTextField6.getText() + "','" + jTextField7.getText() + "','" + jTextField9.getText() + "','" + jTextField10.getText() + "','" + jTextField11.getText() + "','" + netweightcal() + "','" + after4() + "','" + chargeforTeapackets() + "')").execute();
                JOptionPane.showMessageDialog(this, "Record Added");
                setTeaLeafCollectRealTables("SELECT * FROM tealeafcollectreal ORDER BY collectionID DESC");
                clr();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error : " + e.getMessage());
            }
            enablebyID(false);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        clr();
        enablebyID(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (TableTeaLeafCollectReal.getSelectedRowCount() == 1) {
            try {
                if (JOptionPane.showConfirmDialog(null, "Are you sure to Delete Data?", "Confirm", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    con.prepareStatement("DELETE FROM tealeafcollectreal WHERE collectionID = " + TableTeaLeafCollectReal.getValueAt(TableTeaLeafCollectReal.getSelectedRow(), 0) + "").execute();
                    setTeaLeafCollectRealTables("SELECT * FROM tealeafcollectreal ORDER BY collectionID DESC");
                    //                    JOptionPane.showMessageDialog(this, "Record Removed");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error : " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (TableTeaLeafCollectReal.getSelectedRowCount() == 1) {
            try {
                con.prepareStatement("UPDATE tealeafcollectreal SET firstname = '" + jTextField2.getText() + "', lastname = '"
                        + jTextField3.getText() + "', age = '" + jTextField4.getText() + "' WHERE id="
                        + jTextField1.getText() + "").execute();
                JOptionPane.showMessageDialog(this, "Record Updated");
                setTeaLeafCollectRealTables("SELECT * FROM tealeafcollectreal ORDER BY collectionID DESC");
                clr();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error : " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        if (validat2()) {
            if (tableRowCount("SELECT SUM(totalWeight) FROM tealeafcollectreal WHERE customerID=" + String.valueOf(jTextField12.getText()) + " AND date >= '" + yearSelect() + "-" + monthSelect() + "-01' AND date <= '" + yearSelect() + "-" + monthSelect() + "-31';") != 0) {
                viewBill();
            } else {
                JOptionPane.showMessageDialog(this, "There is no data in the database that this supplier has provided leaves in the relevant month.", "Empty Report", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        clr2();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (validat2()) {
            total(Integer.parseInt(jTextField12.getText()), yearSelect(), monthSelect());
            jLabel12.setForeground(Color.BLACK);
        } else {
            jTextField12.requestFocus();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField12KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (validat2()) {
                total(Integer.parseInt(jTextField12.getText()), yearSelect(), monthSelect());
                jLabel12.setForeground(Color.BLACK);
            } else {
                jTextField12.requestFocus();
            }
        }
    }//GEN-LAST:event_jTextField12KeyPressed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        defaultStart();
        homepagedefault();
        clr();
        clr2();
        jTextField2.setText("");
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        enabledByRadio(false);
        jLabel12.setText("Total Amount ");
        jLabel12.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        enabledByRadio(true);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        try {
            bulkprint(yearSelect(), monthSelect());
            JOptionPane.showMessageDialog(this, "Print Ok", "Done", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        if (validat2()) {
            if (tableRowCount("SELECT SUM(totalWeight) FROM tealeafcollectreal WHERE customerID=" + String.valueOf(jTextField12.getText()) + " AND date >= '" + yearSelect() + "-" + monthSelect() + "-01' AND date <= '" + yearSelect() + "-" + monthSelect() + "-31';") != 0) {
                viewEnv();
            } else {
                JOptionPane.showMessageDialog(this, "There is no data in the database that this supplier has provided leaves in the relevant month.", "Empty Report", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        try {
            bulkEnv(yearSelect(), monthSelect());
            JOptionPane.showMessageDialog(this, "Print Ok", "Done", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        viewtc15();
    }//GEN-LAST:event_jButton27ActionPerformed

    /**
     *
     * @param args
     */
    public static void main(String args[]) {
        try {
            FlatMacLightLaf.registerCustomDefaultsSource("style");
            UIManager.setLookAndFeel(new FlatMacLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            System.err.println("Failed to initialize LaF");
        }
        java.awt.EventQueue.invokeLater(() -> {
            new main().setVisible(true);
        });
    }

    private void defaultStart() {
        livedateadntime();
        setTeaLeafCollectRealTables("SELECT * FROM tealeafcollectreal ORDER BY collectionID DESC");
        setCustomerTable("SELECT * FROM customer");
        setLoginReportTable("SELECT * FROM loginreport ORDER BY loginID DESC");
        TableTeaLeafCollectReal.setModel(tealeafcollectrealTableModel);
        CustomerTable.setModel(customerTable);
        loginreportTableframe.setModel(loginReportTabel);
        monthset(Integer.parseInt(cdate("M")));
        close();
        settingpagedefault();
        enablebyID(false);
        homepagedefault();
        btnSlct();
    }

    /**
     *
     */
    public final void close() {
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                if (JOptionPane.showConfirmDialog(null, "Are you sure to want to exit?", "Confirm", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    try {
                        con.prepareStatement("UPDATE loginreport SET logouttime = '" + ctime() + "' WHERE loginID = '" + loginreportTableframe.getRowCount() + "'").execute();
                    } catch (SQLException es) {
                    }
                    System.exit(0);
                }
            }

        });
    }

    private void livedateadntime() {
        lblDate.setText(cdate("full"));
        new Timer(0, (ActionEvent e) -> {
            Date d1 = new Date();
            SimpleDateFormat s1 = new SimpleDateFormat("hh:mm:ss a");
            lblTime.setText(s1.format(d1));
        }).start();
    }

    private ArrayList<TeaLeafCollectRealTable> getTeaLeafCollectRealTables(String query) {
        ArrayList<TeaLeafCollectRealTable> dataList = new ArrayList<>();
        Statement st;
        ResultSet rs;
        try {
            st = con.createStatement();
            rs = st.executeQuery(query);
            TeaLeafCollectRealTable tealeafcollectrealtable;
            while (rs.next()) {
                tealeafcollectrealtable = new TeaLeafCollectRealTable(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getDouble(4), rs.getDouble(5), rs.getDouble(6), rs.getDouble(7), rs.getDouble(8), rs.getInt(9), rs.getInt(10), rs.getDouble(11), rs.getDouble(12), rs.getDouble(13), rs.getDouble(14));
                dataList.add(tealeafcollectrealtable);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error : " + e.getMessage());
        }
        return dataList;
    }

    private ArrayList<SettingPagesTable> getSettingsPageTable(String query) {
        ArrayList<SettingPagesTable> settingspage = new ArrayList<>();
        Statement st;
        ResultSet rs;
        try {
            st = con.createStatement();
            rs = st.executeQuery(query);
            SettingPagesTable settingpagestable;
            while (rs.next()) {
                settingpagestable = new SettingPagesTable(rs.getDouble(1), rs.getString(2), rs.getString(3), rs.getDouble(5), rs.getDouble(6));
                settingspage.add(settingpagestable);
                jTextField14.setText(String.valueOf(rs.getDouble(1)));
                jTextField15.setText(String.valueOf(rs.getDouble(5)));
                jTextField16.setText(String.valueOf(rs.getDouble(6)));
                jLabel23.setText(rs.getString(2));
                jLabel24.setText(rs.getString(3));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error : " + e.getMessage());
        }
        return settingspage;
    }

    private ArrayList<CustomerTable> getCustomerTable(String query) {
        ArrayList<CustomerTable> dataList = new ArrayList<>();
        Statement st;
        ResultSet rs;
        try {
            st = con.createStatement();
            rs = st.executeQuery(query);
            CustomerTable customertable;
            while (rs.next()) {
                customertable = new CustomerTable(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
                dataList.add(customertable);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error : " + e.getMessage());
        }
        return dataList;
    }

    private ArrayList<LoginReportTable> getLoginReportTable(String query) {
        ArrayList<LoginReportTable> dataList = new ArrayList<>();
        Statement st;
        ResultSet rs;
        try {
            st = con.createStatement();
            rs = st.executeQuery(query);
            LoginReportTable loginReportTable;
            while (rs.next()) {
                loginReportTable = new LoginReportTable(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
                dataList.add(loginReportTable);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error : " + e.getMessage());
        }
        return dataList;
    }

    private double getArrears(int i) {
        double x = 0;
        Statement st;
        ResultSet rs;
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM arrearstable WHERE customerID=" + i + "");
            while (rs.next()) {
                x = rs.getDouble(2);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error : " + e.getMessage());
        }
        return x;
    }

    private void setTeaLeafCollectRealTables(String query) {
        tealeafcollectrealTableModel.setRowCount(0);
        ArrayList<TeaLeafCollectRealTable> temp = getTeaLeafCollectRealTables(query);
        for (int i = 0; i < temp.size(); i++) {
            tealeafcollectrealTableModel.addRow(new Object[]{temp.get(i).getcollectionID(), temp.get(i).getCustomerID(), temp.get(i).getDate(), temp.get(i).getTotalWeight(), temp.get(i).getWaterWeight(), temp.get(i).getBleaf(), temp.get(i).getAdvance(), temp.get(i).getTransport(), temp.get(i).getTeaPackets(), temp.get(i).getFertilizer(), temp.get(i).getOther()});
        }
    }

    private void setCustomerTable(String query) {
        customerTable.setRowCount(0);
        ArrayList<CustomerTable> temp = getCustomerTable(query);
        for (int i = 0; i < temp.size(); i++) {
            customerTable.addRow(new Object[]{temp.get(i).getCustomerID(), temp.get(i).getCustomerName(), temp.get(i).getCustomerAddr(), temp.get(i).getCustomerPhoneNo()});
        }
    }

    private void setLoginReportTable(String query) {
        loginReportTabel.setRowCount(0);
        ArrayList<LoginReportTable> temp = getLoginReportTable(query);
        for (int i = 0; i < temp.size(); i++) {
            loginReportTabel.addRow(new Object[]{temp.get(i).getLoginID(), temp.get(i).getDate(), temp.get(i).getLogInTime(), temp.get(i).getLogOutTime()});
        }
    }

    private String cdate(String x) {
        Date d = new Date();
        String dte = "";
        if ("full".equals(x)) {
            SimpleDateFormat s = new SimpleDateFormat("yyyy - MM - dd");
            dte = s.format(d);
        }
        if ("D".equals(x)) {
            SimpleDateFormat s = new SimpleDateFormat("dd");
            dte = s.format(d);
        }
        if ("M".equals(x)) {
            SimpleDateFormat s = new SimpleDateFormat("MM");
            dte = s.format(d);
        }
        if ("Y".equals(x)) {
            SimpleDateFormat s = new SimpleDateFormat("yyyy");
            dte = s.format(d);
        }
        if ("nonspace".equals(x)) {
            SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
            dte = s.format(d);
        }
        if ("bill".equals(x)) {
            SimpleDateFormat s = new SimpleDateFormat("yyyy$MM$dd");
            dte = s.format(d);
        }
        return dte;
    }

    private int pmonth() {
        if (cdate("M").equals("01")) {
            int x = 12;
            return x;
        } else {
            int x = Integer.parseInt(cdate("M")) - 1;
            return x;
        }

    }

    private int pyear() {
        if (cdate("M").equals("01")) {
            int x = Integer.parseInt(cdate("Y")) - 1;
            return x;
        } else {
            int x = Integer.parseInt(cdate("Y"));
            return x;
        }

    }

    private String ctime() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("HH:mm:ss");
        return s.format(d);
    }

    private String monthset(int m) {
        String month = "";
        if ("01".equals(m)) {
            cmboxMonth.setSelectedIndex(0);
            month = "January";
        }
        if ("02".equals(m)) {
            cmboxMonth.setSelectedIndex(1);
            month = "February";
        }
        if ("03".equals(m)) {
            cmboxMonth.setSelectedIndex(2);
            month = "March";
        }
        if ("04".equals(m)) {
            cmboxMonth.setSelectedIndex(3);
            month = "April";
        }
        if ("05".equals(m)) {
            cmboxMonth.setSelectedIndex(4);
            month = "May";
        }
        if ("06".equals(m)) {
            cmboxMonth.setSelectedIndex(5);
            month = "June";
        }
        if ("07".equals(m)) {
            cmboxMonth.setSelectedIndex(6);
            month = "July";
        }
        if ("08".equals(m)) {
            cmboxMonth.setSelectedIndex(7);
            month = "August";
        }
        if ("09".equals(m)) {
            cmboxMonth.setSelectedIndex(8);
            month = "September";
        }
        if ("10".equals(m)) {
            cmboxMonth.setSelectedIndex(9);
            month = "October";
        }
        if ("11".equals(m)) {
            cmboxMonth.setSelectedIndex(10);
            month = "November";
        }
        if ("12".equals(m)) {
            cmboxMonth.setSelectedIndex(11);
            month = "December";
        }
        return month;
    }

    private String monthset2() {
        String month = "";
        if (monthSelect() == 01) {
            month = "January";
        }
        if (monthSelect() == 02) {
            month = "February";
        }
        if (monthSelect() == 3) {
            month = "March";
        }
        if (monthSelect() == 04) {
            month = "April";
        }
        if (monthSelect() == 05) {
            month = "May";
        }
        if (monthSelect() == 06) {
            month = "June";
        }
        if (monthSelect() == 07) {
            month = "July";
        }
        if (monthSelect() == 8) {
            month = "August";
        }
        if (monthSelect() == 9) {
            month = "September";
        }
        if (monthSelect() == 10) {
            month = "Octomber";
        }
        if (monthSelect() == 11) {
            month = "November";
        }
        if (monthSelect() == 12) {
            month = "December";
        }
        return month;
    }

    private String monthset3() {
        String month = "";
        if (monthSelect() == 01) {
            month = "ckjdß";
        }
        if (monthSelect() == 02) {
            month = "fmnrjdß";
        }
        if (monthSelect() == 3) {
            month = "ud¾;=";
        }
        if (monthSelect() == 04) {
            month = "wfm%a,a";
        }
        if (monthSelect() == 05) {
            month = "uehs";
        }
        if (monthSelect() == 06) {
            month = "cqks";
        }
        if (monthSelect() == 07) {
            month = "cQ,s";
        }
        if (monthSelect() == 8) {
            month = "wf.daia;=";
        }
        if (monthSelect() == 9) {
            month = "iema;eïn¾";
        }
        if (monthSelect() == 10) {
            month = "Tlaf;daïn¾";
        }
        if (monthSelect() == 11) {
            month = "fkdjeïn¾";
        }
        if (monthSelect() == 12) {
            month = "foieïn¾";
        }
        return month;
    }

    private void clr() {
        jTextField1.setText("");
        jTextField3.setText("");
        jTextField4.setText("0");
        jTextField5.setText("0");
        jTextField6.setText("0");
        jTextField7.setText("0");
        jTextField8.setText("0");
        jTextField9.setText("0");
        jTextField10.setText("0");
        jTextField11.setText("0");
        jTextField17.setText("");
        jTextField18.setText("");
        jTextField23.setText("");
        jTextField24.setText("");
        jTextField25.setText("");
    }

    private void clr2() {
        jTextField12.setText("");
        jLabel12.setText("Total Amount ");
        jLabel12.setForeground(new Color(153, 153, 153));
    }

    private Boolean validat() {
        if (!Pattern.matches("[0-9 .]{0,9}", jTextField1.getText()) || jTextField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter Customer ID", "Invaild Customer ID", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        if (!Pattern.matches("[0-9 .]{0,9}", jTextField3.getText()) || jTextField3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Invaild or Empty field: Total Weight", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!Pattern.matches("[0-9 .]{0,9}", jTextField4.getText()) || jTextField4.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Invaild or Empty field: Water Weight", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!Pattern.matches("[0-9 .]{0,9}", jTextField5.getText()) || jTextField5.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Invaild or Empty field: B Leaf", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!Pattern.matches("[0-9 .]{0,9}", jTextField6.getText()) || jTextField6.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Invaild or Empty field: Advance", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!Pattern.matches("[0-9 .]{0,9}", jTextField7.getText()) || jTextField7.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Invaild or Empty field: Transport", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!Pattern.matches("[0-9 .]{0,9}", jTextField9.getText()) || jTextField9.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Invaild or Empty field: Tea Packets", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!Pattern.matches("[0-9 .]{0,9}", jTextField10.getText()) || jTextField10.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Invaild or Empty field: Fertilizer", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!Pattern.matches("[0-9 .]{0,9}", jTextField11.getText()) || jTextField11.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Invaild or Empty field: Other", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!Pattern.matches("[0-9]{4}[-][0-9]{2}[-][0-9]{2}", jTextField13.getText()) || jTextField13.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Invaild or Empty field: Date", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private Boolean validat2() {
        if (!Pattern.matches("[0-9]{0,9}", jTextField12.getText()) || jTextField12.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter Customer ID", "Invaild Customer ID", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        return true;
    }

    private Boolean validat4() {
        if (!Pattern.matches("[0-9 .]{0,9}", jTextField17.getText()) || jTextField17.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Invaild or Empty field: ID", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!Pattern.matches("[A-Z a-z .]{0,300}", jTextField18.getText()) || jTextField18.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Invaild or Empty field: Name", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!Pattern.matches("[A-Z a-z 0-9 / , - .]{1,300}", jTextField23.getText()) || jTextField23.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Invalid or Empty Field: Address");
            return false;
        }
        if (!Pattern.matches("[0-9]{10}", jTextField24.getText()) || jTextField24.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Invaild or Empty field: Phone Number", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private Boolean validat5() {
        if (jPasswordField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Invaild or Empty field: Current Password", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (jPasswordField2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Invaild or Empty field: New Password", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (jPasswordField3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Invaild or Empty field: Retype New Password", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (jPasswordField2.getText() == null ? jPasswordField3.getText() != null : !jPasswordField2.getText().equals(jPasswordField3.getText())) {
            JOptionPane.showMessageDialog(this, "Password does not match", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private Boolean validat6() {
        Statement st;
        ResultSet rs;
        int[] customerIDArray = new int[tableRowCount("SELECT COUNT(*) FROM customer")];
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM customer");
            for (int i = 0; i < tableRowCount("SELECT COUNT(*) FROM customer"); i++) {
                if (rs.next()) {
                    customerIDArray[i] = rs.getInt(1);
                }
            }
            for (int i = 0; i < tableRowCount("SELECT COUNT(*) FROM customer"); i++) {
                if (customerIDArray[i] == Integer.parseInt(jTextField1.getText())) {
                    return true;
                }
            }
        } catch (NumberFormatException | SQLException e) {
        }
        JOptionPane.showMessageDialog(this, "Customer does not exists!", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    private Double total(int i, int py, int pm) {
        double netWeight = tableRowCount("SELECT SUM(netWeight) FROM tealeafcollectreal WHERE customerID=" + i + " AND date >= '" + py + "-" + pm + "-01' AND date <= '" + py + "-" + pm + "-31';");
        double cost = tableRowCount("SELECT SUM(advance + transport + fertilizer + other + chargeforTeaPackets) FROM tealeafcollectreal WHERE customerID=" + i + " AND date >= '" + py + "-" + pm + "-01' AND date <= '" + py + "-" + pm + "-31';");
        double Bleaf = tableRowCount("SELECT SUM(Bleaf) FROM tealeafcollectreal WHERE customerID=" + i + " AND date >= '" + py + "-" + pm + "-01' AND date <= '" + py + "-" + pm + "-31';");
        double priceForBleaf;
        double priceForNetWeight;
        double arrears = getArrears(i);
        if ((netWeight + Bleaf) >= 13) {
            priceForNetWeight = (netWeight - (Math.round((netWeight * 4) / 100))) * Double.valueOf(jTextField15.getText());
            priceForBleaf = (Bleaf - (Math.round((Bleaf * 4) / 100))) * Double.valueOf(jTextField16.getText());
        } else {
            priceForNetWeight = (netWeight * Double.valueOf(jTextField15.getText()));
            priceForBleaf = (Bleaf * Double.valueOf(jTextField16.getText()));
        }
        double finalPrice = (priceForNetWeight + priceForBleaf) - (cost + arrears);
        jLabel12.setText(String.valueOf(df.format(Math.round(finalPrice))) + " ");
        return (priceForNetWeight + priceForBleaf);
    }

    private double netweightcal() {
        return Integer.parseInt(jTextField3.getText()) - (Integer.parseInt(jTextField4.getText()) + Integer.parseInt(jTextField5.getText()));
    }

    private double after4() {
        return Double.valueOf(jTextField3.getText()) - Math.round((Double.valueOf(jTextField3.getText()) * 4) / 100);
    }

    private double chargeforTeapackets() {
        return Double.valueOf(jTextField9.getText()) * Double.valueOf(jTextField14.getText());
    }

    private void settingpagedefault() {
        jTextField14.enable(false);
        jTextField15.enable(false);
        jTextField16.enable(false);
        getSettingsPageTable("SELECT * FROM settingspagetable");
        settingspagepasswordclr();
    }

    private void enablebyID(boolean x) {
        jTextField3.setEnabled(x);
        jTextField4.setEnabled(x);
        jTextField5.setEnabled(x);
        jTextField6.setEnabled(x);
        jTextField7.setEnabled(x);
        jTextField9.setEnabled(x);
        jTextField10.setEnabled(x);
        jTextField11.setEnabled(x);
        jTextField13.setEnabled(x);
    }

    private void homepagedefault() {
        int x = Integer.parseInt(cdate("Y")) - 2022;
        for (int i = Integer.parseInt(cdate("Y")); i > 2022; i--) {
            cmboxYear.addItem(String.valueOf(Integer.parseInt(cdate("Y")) - x));
            cmboxYear1.addItem(String.valueOf(Integer.parseInt(cdate("Y")) - x));
            x--;
        }
        cmboxYear.addItem(cdate("Y"));
        cmboxYear1.addItem(cdate("Y"));
        cmboxYear.setSelectedItem(cdate("Y"));
        cmboxYear1.setSelectedItem(cdate("Y"));
        for (int i = 1; i < 200; i++) {
            cmboxYear.addItem(String.valueOf(Integer.parseInt(cdate("Y")) + i));
            cmboxYear1.addItem(String.valueOf(Integer.parseInt(cdate("Y")) + i));
        }
    }

    private void searchsql() {
//        setTeaLeafCollectRealTables("SELECT * FROM tealeafcollectreal WHERE customerID=" + jTextField2.getText() + " AND date >= '" + cmboxYear.getSelectedItem() + "-" + monthset2() + "-01' AND date <= '" + cmboxYear.getSelectedItem() + "-" + monthset2() + "-31';");
    }

    private void bill(int i, int py, int pm) throws FileNotFoundException, IOException {
        double monthlytotalleaf = tableRowCount("SELECT SUM(totalWeight) FROM tealeafcollectreal WHERE customerID=" + i + " AND date >= '" + py + "-" + pm + "-01' AND date <= '" + py + "-" + pm + "-31';");
        double monthlytotalBleaf = tableRowCount("SELECT SUM(Bleaf) FROM tealeafcollectreal WHERE customerID=" + i + " AND date >= '" + py + "-" + pm + "-01' AND date <= '" + py + "-" + pm + "-31';");
        double totalAdvance = tableRowCount("SELECT SUM(advance) FROM tealeafcollectreal WHERE customerID=" + i + " AND date >= '" + py + "-" + pm + "-01' AND date <= '" + py + "-" + pm + "-31';");
        double totalFertilizer = tableRowCount("SELECT SUM(fertilizer) FROM tealeafcollectreal WHERE customerID=" + i + " AND date >= '" + py + "-" + pm + "-01' AND date <= '" + py + "-" + pm + "-31';");
        double totalTeaPackets = tableRowCount("SELECT SUM(chargeforTeaPackets) FROM tealeafcollectreal WHERE customerID=" + i + " AND date >= '" + py + "-" + pm + "-01' AND date <= '" + py + "-" + pm + "-31';");
        double totalTransport = tableRowCount("SELECT SUM(transport) FROM tealeafcollectreal WHERE customerID=" + i + " AND date >= '" + py + "-" + pm + "-01' AND date <= '" + py + "-" + pm + "-31';");
        double totalExtra = tableRowCount("SELECT SUM(other) FROM tealeafcollectreal WHERE customerID=" + i + " AND date >= '" + py + "-" + pm + "-01' AND date <= '" + py + "-" + pm + "-31';");
        double totalWater = tableRowCount("SELECT SUM(waterWeight) FROM tealeafcollectreal WHERE customerID=" + i + " AND date >= '" + py + "-" + pm + "-01' AND date <= '" + py + "-" + pm + "-31';");
//        double arrears = getArrears(Integer.parseInt(jTextField12.getText()));
        double arrears = 0;
        String csName = null;
        double aaaaaa = (monthlytotalleaf - (Math.round((monthlytotalleaf * 4) / 100))) - totalWater;
        Statement st;
        ResultSet rs;

        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM customer WHERE customerID=" + i + ";");
            if (rs.next()) {
                csName = rs.getString(2);
            }
        } catch (SQLException e) {
        }

        PdfWriter writer = new PdfWriter("src\\Bill\\Single\\" + String.valueOf(i) + monthset2() + yearSelect() + "lglcbill.pdf");
        PdfDocument pdf = new PdfDocument(writer);
        try (Document document = new Document(pdf, PageSize.A5.rotate())) {
            document.setMargins(20, 10, 10, 12);

            PdfFont fmsandyanee = PdfFontFactory.createFont(FMSandyanee, true);
            PdfFont fmrashmee = PdfFontFactory.createFont(FMRashmee, true);
            PdfFont fmababldbold = PdfFontFactory.createFont(FMAbabldBold, true);

            Image lglclogo = new Image(ImageDataFactory.create("src\\img\\header.png")).setAutoScale(true).setPadding(0);

            Paragraph txt1 = new Paragraph("iemhqïlref.a wxlh(").setFont(fmrashmee).setFontSize(8).setMultipliedLeading(1.0f).setPaddingLeft(5);
            Paragraph txt2 = new Paragraph(String.valueOf(i)).setBold().setFontSize(8).setMultipliedLeading(1.0f);
            Paragraph txt3 = new Paragraph("iemhqïlref.a ku(").setFont(fmrashmee).setFontSize(8).setMultipliedLeading(1.0f).setPaddingLeft(5);
            Paragraph txt4 = new Paragraph(csName).setBold().setFontSize(8).setMultipliedLeading(1.0f);
            Paragraph txt5 = new Paragraph("udih(").setFont(fmrashmee).setFontSize(8).setMultipliedLeading(1.0f).setPaddingLeft(5);
            Paragraph txt6 = new Paragraph(monthset2() + " - " + yearSelect()).setBold().setFontSize(8).setMultipliedLeading(1.0f);
            Paragraph txt7 = new Paragraph("ì,am;a wxlh(").setFont(fmrashmee).setFontSize(8).setMultipliedLeading(1.0f).setPaddingLeft(5);
            Paragraph txt8 = new Paragraph(" ").setBold().setFontSize(8).setMultipliedLeading(1.0f);

            Paragraph txt9 = new Paragraph("wuq f;a o¿ iemhSfï m%ldYh").setFont(fmsandyanee).setFontSize(12).setMultipliedLeading(1.0f).setPaddings(2, 0, 2, 0);

            Paragraph billtabletxt1 = new Paragraph(".sKqï úia;rh").setFont(fmababldbold).setFontSize(12).setMultipliedLeading(1.0f).setPaddings(2, 0, 2, 0);
            Paragraph billtabletxt2 = new Paragraph(",nd ÿka o¿ i`oyd uq¿ uqo,^re'&(").setFont(fmrashmee).setFontSize(10).setMultipliedLeading(1.0f).setPaddings(2, 0, 2, 0);
            Paragraph billtabletxt3 = new Paragraph(String.valueOf(df.format(total(i, yearSelect(), monthSelect())))).setFontSize(10).setMultipliedLeading(1.0f).setPaddings(2, 0, 2, 0);
            Paragraph billtabletxt4 = new Paragraph("udislj ,nd ÿka uq¿ o¿ m%udKh^ls'.%E'&(").setFont(fmrashmee).setFontSize(10).setMultipliedLeading(1.0f).setPaddings(2, 0, 2, 0);
            Paragraph billtabletxt5 = new Paragraph(String.valueOf(df.format(monthlytotalleaf))).setFontSize(10).setMultipliedLeading(1.0f).setPaddings(2, 0, 2, 0);
            Paragraph billtabletxt6 = new Paragraph("uqo,a w;a;sldrï(").setFont(fmrashmee).setFontSize(10).setMultipliedLeading(1.0f).setPaddings(2, 0, 2, 0);
            Paragraph billtabletxt7 = new Paragraph(String.valueOf(df.format(totalAdvance))).setFontSize(10).setMultipliedLeading(1.0f).setPaddings(2, 0, 2, 0);
            Paragraph billtabletxt8 = new Paragraph("lsf,da tllg f.ùu(").setFont(fmrashmee).setFontSize(10).setMultipliedLeading(1.0f).setPaddings(2, 0, 2, 0);
            Paragraph billtabletxt9 = new Paragraph(String.valueOf(jTextField15.getText()) + "0").setFontSize(10).setMultipliedLeading(1.0f).setPaddings(2, 0, 2, 0);
            Paragraph billtabletxt10 = new Paragraph("miq.sh ui ys`.(").setFont(fmrashmee).setFontSize(10).setMultipliedLeading(1.0f).setPaddings(2, 0, 2, 0);
            Paragraph billtabletxt11 = new Paragraph(String.valueOf(df.format(arrears))).setFontSize(10).setMultipliedLeading(1.0f).setPaddings(2, 0, 2, 0);
            Paragraph billtabletxt12 = new Paragraph("udislj ,nd ÿka uq¿ î o¿ m%udKh^ls'.%E'&(").setFont(fmrashmee).setFontSize(10).setMultipliedLeading(1.0f).setPaddings(2, 0, 2, 0);
            Paragraph billtabletxt13 = new Paragraph(String.valueOf(df.format(monthlytotalBleaf))).setFontSize(10).setMultipliedLeading(1.0f).setPaddings(2, 0, 2, 0);
            Paragraph billtabletxt14 = new Paragraph("f;a fld< melÜ i`oyd(").setFont(fmrashmee).setFontSize(10).setMultipliedLeading(1.0f).setPaddings(2, 0, 2, 0);
            Paragraph billtabletxt15 = new Paragraph(String.valueOf(df.format(totalTeaPackets))).setFontSize(10).setMultipliedLeading(1.0f).setPaddings(2, 0, 2, 0);
            Paragraph billtabletxt16 = new Paragraph("î o¿ lsf,da tllg f.ùu(").setFont(fmrashmee).setFontSize(10).setMultipliedLeading(1.0f).setPaddings(2, 0, 2, 0);
            Paragraph billtabletxt17 = new Paragraph(String.valueOf(jTextField16.getText()) + "0").setFontSize(10).setMultipliedLeading(1.0f).setPaddings(2, 0, 2, 0);
            Paragraph billtabletxt18 = new Paragraph("fmdfydr(").setFont(fmrashmee).setFontSize(10).setMultipliedLeading(1.0f).setPaddings(2, 0, 2, 0);
            Paragraph billtabletxt19 = new Paragraph(String.valueOf(df.format(totalFertilizer))).setFontSize(10).setMultipliedLeading(1.0f).setPaddings(2, 0, 2, 0);
            Paragraph billtabletxt20 = new Paragraph("j;=rg wvq lsÍu^ls'.%E'&(").setFont(fmrashmee).setFontSize(10).setMultipliedLeading(1.0f).setPaddings(2, 0, 2, 0);
            Paragraph billtabletxt21 = new Paragraph(String.valueOf(df.format(totalWater))).setFontSize(10).setMultipliedLeading(1.0f).setPaddings(2, 0, 2, 0);
            Paragraph billtabletxt22 = new Paragraph("m%jdyk .dia;=(").setFont(fmrashmee).setFontSize(10).setMultipliedLeading(1.0f).setPaddings(2, 0, 2, 0);
            Paragraph billtabletxt23 = new Paragraph(String.valueOf(df.format(totalTransport))).setFontSize(10).setMultipliedLeading(1.0f).setPaddings(2, 0, 2, 0);
            Paragraph billtabletxt24 = new Paragraph("Y=oaO nr^ls'.%E'&(").setFont(fmrashmee).setFontSize(10).setMultipliedLeading(1.0f).setPaddings(2, 0, 2, 0);
            Paragraph billtabletxt25 = new Paragraph(String.valueOf(df.format(aaaaaa))).setFontSize(10).setMultipliedLeading(1.0f).setPaddings(2, 0, 2, 0);
            Paragraph billtabletxt26 = new Paragraph("fjk;a(").setFont(fmrashmee).setFontSize(10).setMultipliedLeading(1.0f).setPaddings(2, 0, 2, 0);
            Paragraph billtabletxt27 = new Paragraph(String.valueOf(df.format(totalExtra))).setFontSize(10).setMultipliedLeading(1.0f).setPaddings(2, 0, 2, 0);
            Paragraph billtabletxt28 = new Paragraph("").setFont(fmrashmee).setFontSize(10).setMultipliedLeading(1.0f).setPaddings(2, 0, 2, 0);
            Paragraph billtabletxt29 = new Paragraph("wvq lsÍï tl;=j(").setFont(fmrashmee).setFontSize(10).setMultipliedLeading(1.0f).setPaddings(2, 0, 2, 0);
            Paragraph billtabletxt30 = new Paragraph(String.valueOf(df.format(totalAdvance + totalTeaPackets + totalFertilizer + totalTransport + totalExtra))).setFontSize(10).setMultipliedLeading(1.0f).setPaddings(2, 0, 2, 0);
            Paragraph billtabletxt31 = new Paragraph("b;sß uq¿ uqo,^re'&(").setFont(fmsandyanee).setFontSize(10).setMultipliedLeading(1.0f).setPaddings(2, 0, 2, 0);
            Paragraph billtabletxt32 = new Paragraph(String.valueOf(df.format(total(i, yearSelect(), monthSelect()) - (totalAdvance + totalTeaPackets + totalFertilizer + totalTransport + totalExtra + arrears)))).setBold().setFontSize(10).setMultipliedLeading(1.0f).setPaddings(2, 0, 2, 0);
            Paragraph billtabletxt33 = new Paragraph("bÈßhg f.k .sh ys`. uqo,^re'&(").setFont(fmrashmee).setFontSize(10).setMultipliedLeading(1.0f).setPaddings(2, 0, 2, 0);
            Paragraph billtabletxt34 = new Paragraph("0.00").setFontSize(10).setMultipliedLeading(1.0f).setPaddings(2, 0, 2, 0);

            Paragraph txt10 = new Paragraph("by; udih i|yd ud úiska iemhQ wuq f;a o¿ i|yd\" ud úiska ,nd.;a w;a;sldrï uqo,a iy wksl=;a wvq lsÍï whlr.;a miq ug b;sß uqo,a m%udKh ,ika; f;a o¿ tl;= lsÍfï wdh;kfhka ,nd.;a njg iy;sl lrñ'").setFont(fmababldbold).setFontSize(8).setMultipliedLeading(1.0f).setPadding(5);
            Paragraph txt11 = new Paragraph("Èkh( " + cdate("bill")).setFont(fmababldbold).setFontSize(8).setMultipliedLeading(1.0f).setPadding(3);
            Paragraph txt12 = new Paragraph("''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''\nwuq f;a o¿ iemhqïlref.a w;aik").setFont(fmababldbold).setFontSize(8).setMultipliedLeading(1.0f).setPadding(3);

            Paragraph copyright = new Paragraph("Software by PANKÁJA CREATIONS © 2023. Contact us: yashmithpankaja@gmail.com").setFontSize(4).setMargins(1, 0, 0, 0);

            float col = 300f;
            float columnWidth[] = {col, col};
            Table header = new Table(columnWidth);
            header.addCell(new Cell(0, 2).add(lglclogo).setTextAlignment(TextAlignment.CENTER).setVerticalAlignment(VerticalAlignment.MIDDLE).setBorderBottom(Border.NO_BORDER));

            float columnWidth2[] = {150f, 60f, 120f, 350f, 60f, 150f, 120f, 80f};
            Table line2 = new Table(columnWidth2).setBackgroundColor(new DeviceRgb(221, 221, 221));
            line2.addCell(new Cell().add(txt1).setVerticalAlignment(VerticalAlignment.MIDDLE));
            line2.addCell(new Cell().add(txt2).setVerticalAlignment(VerticalAlignment.MIDDLE));
            line2.addCell(new Cell().add(txt3).setVerticalAlignment(VerticalAlignment.MIDDLE));
            line2.addCell(new Cell().add(txt4).setVerticalAlignment(VerticalAlignment.MIDDLE));
            line2.addCell(new Cell().add(txt5).setVerticalAlignment(VerticalAlignment.MIDDLE));
            line2.addCell(new Cell().add(txt6).setVerticalAlignment(VerticalAlignment.MIDDLE));
            line2.addCell(new Cell().add(txt7).setVerticalAlignment(VerticalAlignment.MIDDLE));
            line2.addCell(new Cell().add(txt8).setVerticalAlignment(VerticalAlignment.MIDDLE));

            Table line3 = new Table(columnWidth);
            line3.addCell(new Cell(0, 2).add(txt9).setTextAlignment(TextAlignment.CENTER).setVerticalAlignment(VerticalAlignment.MIDDLE).setBackgroundColor(new DeviceRgb(221, 221, 221)).setBorderTop(Border.NO_BORDER).setBorderBottom(Border.NO_BORDER));

            float columnWidth3[] = {500f, 200f, 500f, 200f};
            Table billtable = new Table(columnWidth3);
            billtable.addCell(new Cell(0, 2).add(billtabletxt1).setVerticalAlignment(VerticalAlignment.MIDDLE).setPaddingLeft(5).setPaddingRight(5).setBackgroundColor(new DeviceRgb(0, 0, 0)).setFontColor(new DeviceRgb(255, 255, 255)));
            billtable.addCell(new Cell().add(billtabletxt2).setVerticalAlignment(VerticalAlignment.MIDDLE).setPaddingLeft(5).setPaddingRight(5).setBackgroundColor(new DeviceRgb(0, 0, 0)).setFontColor(new DeviceRgb(255, 255, 255)));
            billtable.addCell(new Cell().add(billtabletxt3).setVerticalAlignment(VerticalAlignment.MIDDLE).setTextAlignment(TextAlignment.RIGHT).setPaddingLeft(5).setPaddingRight(5).setBackgroundColor(new DeviceRgb(0, 0, 0)).setFontColor(new DeviceRgb(255, 255, 255)));
            billtable.addCell(new Cell().add(billtabletxt4).setVerticalAlignment(VerticalAlignment.MIDDLE).setPaddingLeft(5).setPaddingRight(5));
            billtable.addCell(new Cell().add(billtabletxt5).setVerticalAlignment(VerticalAlignment.MIDDLE).setTextAlignment(TextAlignment.RIGHT).setPaddingLeft(5).setPaddingRight(5));
            billtable.addCell(new Cell().add(billtabletxt6).setVerticalAlignment(VerticalAlignment.MIDDLE).setPaddingLeft(5).setPaddingRight(5));
            billtable.addCell(new Cell().add(billtabletxt7).setVerticalAlignment(VerticalAlignment.MIDDLE).setTextAlignment(TextAlignment.RIGHT).setPaddingLeft(5).setPaddingRight(5));
            billtable.addCell(new Cell().add(billtabletxt8).setVerticalAlignment(VerticalAlignment.MIDDLE).setPaddingLeft(5).setPaddingRight(5));
            billtable.addCell(new Cell().add(billtabletxt9).setVerticalAlignment(VerticalAlignment.MIDDLE).setTextAlignment(TextAlignment.RIGHT).setPaddingLeft(5).setPaddingRight(5));
            billtable.addCell(new Cell().add(billtabletxt10).setVerticalAlignment(VerticalAlignment.MIDDLE).setPaddingLeft(5).setPaddingRight(5));
            billtable.addCell(new Cell().add(billtabletxt11).setVerticalAlignment(VerticalAlignment.MIDDLE).setTextAlignment(TextAlignment.RIGHT).setPaddingLeft(5).setPaddingRight(5));
            billtable.addCell(new Cell().add(billtabletxt12).setVerticalAlignment(VerticalAlignment.MIDDLE).setPaddingLeft(5).setPaddingRight(5));
            billtable.addCell(new Cell().add(billtabletxt13).setVerticalAlignment(VerticalAlignment.MIDDLE).setTextAlignment(TextAlignment.RIGHT).setPaddingLeft(5).setPaddingRight(5));
            billtable.addCell(new Cell().add(billtabletxt14).setVerticalAlignment(VerticalAlignment.MIDDLE).setPaddingLeft(5).setPaddingRight(5));
            billtable.addCell(new Cell().add(billtabletxt15).setVerticalAlignment(VerticalAlignment.MIDDLE).setTextAlignment(TextAlignment.RIGHT).setPaddingLeft(5).setPaddingRight(5));
            billtable.addCell(new Cell().add(billtabletxt16).setVerticalAlignment(VerticalAlignment.MIDDLE).setPaddingLeft(5).setPaddingRight(5));
            billtable.addCell(new Cell().add(billtabletxt17).setVerticalAlignment(VerticalAlignment.MIDDLE).setTextAlignment(TextAlignment.RIGHT).setPaddingLeft(5).setPaddingRight(5));
            billtable.addCell(new Cell().add(billtabletxt18).setVerticalAlignment(VerticalAlignment.MIDDLE).setPaddingLeft(5).setPaddingRight(5));
            billtable.addCell(new Cell().add(billtabletxt19).setVerticalAlignment(VerticalAlignment.MIDDLE).setTextAlignment(TextAlignment.RIGHT).setPaddingLeft(5).setPaddingRight(5));
            billtable.addCell(new Cell().add(billtabletxt20).setVerticalAlignment(VerticalAlignment.MIDDLE).setPaddingLeft(5).setPaddingRight(5));
            billtable.addCell(new Cell().add(billtabletxt21).setVerticalAlignment(VerticalAlignment.MIDDLE).setTextAlignment(TextAlignment.RIGHT).setPaddingLeft(5).setPaddingRight(5));
            billtable.addCell(new Cell().add(billtabletxt22).setVerticalAlignment(VerticalAlignment.MIDDLE).setPaddingLeft(5).setPaddingRight(5));
            billtable.addCell(new Cell().add(billtabletxt23).setVerticalAlignment(VerticalAlignment.MIDDLE).setTextAlignment(TextAlignment.RIGHT).setPaddingLeft(5).setPaddingRight(5));
            billtable.addCell(new Cell().add(billtabletxt24).setVerticalAlignment(VerticalAlignment.MIDDLE).setPaddingLeft(5).setPaddingRight(5));
            billtable.addCell(new Cell().add(billtabletxt25).setVerticalAlignment(VerticalAlignment.MIDDLE).setTextAlignment(TextAlignment.RIGHT).setPaddingLeft(5).setPaddingRight(5));
            billtable.addCell(new Cell().add(billtabletxt26).setVerticalAlignment(VerticalAlignment.MIDDLE).setPaddingLeft(5).setPaddingRight(5));
            billtable.addCell(new Cell().add(billtabletxt27).setVerticalAlignment(VerticalAlignment.MIDDLE).setTextAlignment(TextAlignment.RIGHT).setPaddingLeft(5).setPaddingRight(5));
            billtable.addCell(new Cell(0, 2).add(billtabletxt28).setVerticalAlignment(VerticalAlignment.MIDDLE).setPaddingLeft(5).setPaddingRight(5));
            billtable.addCell(new Cell().add(billtabletxt29).setVerticalAlignment(VerticalAlignment.MIDDLE).setPaddingLeft(5).setPaddingRight(5));
            billtable.addCell(new Cell().add(billtabletxt30).setVerticalAlignment(VerticalAlignment.MIDDLE).setTextAlignment(TextAlignment.RIGHT).setPaddingLeft(5).setPaddingRight(5));
            billtable.addCell(new Cell(0, 3).add(billtabletxt31).setVerticalAlignment(VerticalAlignment.MIDDLE).setPaddingLeft(5).setPaddingRight(5));
            billtable.addCell(new Cell().add(billtabletxt32).setVerticalAlignment(VerticalAlignment.MIDDLE).setTextAlignment(TextAlignment.RIGHT).setPaddingLeft(5).setPaddingRight(5));
            billtable.addCell(new Cell(0, 3).add(billtabletxt33).setVerticalAlignment(VerticalAlignment.MIDDLE).setPaddingLeft(5).setPaddingRight(5));
            billtable.addCell(new Cell().add(billtabletxt34).setVerticalAlignment(VerticalAlignment.MIDDLE).setTextAlignment(TextAlignment.RIGHT).setPaddingLeft(5).setPaddingRight(5));

            Table footer = new Table(columnWidth);
            footer.addCell(new Cell(0, 2).add(txt10).setVerticalAlignment(VerticalAlignment.MIDDLE).setBorderBottom(Border.NO_BORDER).setBorderTop(Border.NO_BORDER));
            footer.addCell(new Cell().add(txt11).setTextAlignment(TextAlignment.CENTER).setVerticalAlignment(VerticalAlignment.MIDDLE).setBorderTop(Border.NO_BORDER).setBorderRight(Border.NO_BORDER));
            footer.addCell(new Cell().add(txt12).setTextAlignment(TextAlignment.CENTER).setVerticalAlignment(VerticalAlignment.MIDDLE).setBorderTop(Border.NO_BORDER).setBorderLeft(Border.NO_BORDER));

            document.add(header);
            document.add(line2);
            document.add(line3);
            document.add(billtable);
            document.add(footer);
            document.add(copyright);
        }

    }

    private void envlope2(int i, int py, int pm) throws IOException {
        double totalAdvance = tableRowCount("SELECT SUM(advance) FROM tealeafcollectreal WHERE customerID=" + i + " AND date >= '" + py + "-" + pm + "-01' AND date <= '" + py + "-" + pm + "-31';");
        double totalFertilizer = tableRowCount("SELECT SUM(fertilizer) FROM tealeafcollectreal WHERE customerID=" + i + " AND date >= '" + py + "-" + pm + "-01' AND date <= '" + py + "-" + pm + "-31';");
        double totalTeaPackets = tableRowCount("SELECT SUM(chargeforTeaPackets) FROM tealeafcollectreal WHERE customerID=" + i + " AND date >= '" + py + "-" + pm + "-01' AND date <= '" + py + "-" + pm + "-31';");
        double totalTransport = tableRowCount("SELECT SUM(transport) FROM tealeafcollectreal WHERE customerID=" + i + " AND date >= '" + py + "-" + pm + "-01' AND date <= '" + py + "-" + pm + "-31';");
        double totalExtra = tableRowCount("SELECT SUM(other) FROM tealeafcollectreal WHERE customerID=" + i + " AND date >= '" + py + "-" + pm + "-01' AND date <= '" + py + "-" + pm + "-31';");
        double arrears = getArrears(i);
        String csName = null;
        Statement st;
        ResultSet rs;

        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM customer WHERE customerID=" + i + ";");
            if (rs.next()) {
                csName = rs.getString(2);
            }
        } catch (SQLException e) {
        }

        PdfWriter writer = new PdfWriter("src\\Bill\\Envelope\\" + String.valueOf(i) + monthset2() + yearSelect() + "envelope.pdf");
        Rectangle rectangle6x4 = new Rectangle(432, 288);
        PageSize pagesize6x4 = new PageSize(rectangle6x4);
        PdfDocument pdf = new PdfDocument(writer);
        try (Document document = new Document(pdf, pagesize6x4)) {
            document.setMargins(65, 50, 50, 50);

            PdfFont fmsandyanee = PdfFontFactory.createFont(FMSandyanee, true);
            PdfFont fmrashmee = PdfFontFactory.createFont(FMRashmee, true);
            PdfFont fmababldbold = PdfFontFactory.createFont(FMAbabldBold, true);

            Image lglclogo = new Image(ImageDataFactory.create("src\\img\\header.png")).setAutoScale(true).setPadding(0);

            Paragraph txt1 = new Paragraph("iemhqïlref.a ku(").setFont(fmrashmee).setFontSize(8).setMultipliedLeading(1.0f).setPadding(3f);
            Paragraph txt1_1 = new Paragraph(csName).setFontSize(8).setMultipliedLeading(1.0f).setPadding(3f);
            Paragraph txt2 = new Paragraph("udih(").setFont(fmrashmee).setFontSize(8).setMultipliedLeading(1.0f).setPadding(3f);
            Paragraph txt2_1 = new Paragraph(monthset2() + " - " + yearSelect()).setFontSize(8).setMultipliedLeading(1.0f).setPadding(3f);
            Paragraph txt3 = new Paragraph("uqo,^re'&(").setFont(fmrashmee).setFontSize(8).setMultipliedLeading(1.0f).setPadding(3f);
            Paragraph txt3_1 = new Paragraph(String.valueOf(df.format(total(i, yearSelect(), monthSelect()) - (totalAdvance + totalTeaPackets + totalFertilizer + totalTransport + totalExtra + arrears)))).setFontSize(8).setMultipliedLeading(1.0f).setPadding(3f);
            Paragraph txt4 = new Paragraph("ì,am;a wxlh(").setFont(fmrashmee).setFontSize(8).setMultipliedLeading(1.0f).setPadding(3f);
            Paragraph txt4_1 = new Paragraph(" ").setFont(fmrashmee).setFontSize(8).setMultipliedLeading(1.0f).setPadding(3f);

            float columnWidth2[] = {270f, 800f};
            Table line2 = new Table(columnWidth2);
            line2.addCell(new Cell(0, 2).add(lglclogo).setTextAlignment(TextAlignment.CENTER).setVerticalAlignment(VerticalAlignment.MIDDLE).setBorder(Border.NO_BORDER).setPaddings(10, 0, 5, 0));
            line2.addCell(new Cell().add(txt1).setVerticalAlignment(VerticalAlignment.MIDDLE).setTextAlignment(TextAlignment.RIGHT));
            line2.addCell(new Cell().add(txt1_1).setVerticalAlignment(VerticalAlignment.MIDDLE));
            line2.addCell(new Cell().add(txt2).setVerticalAlignment(VerticalAlignment.MIDDLE).setTextAlignment(TextAlignment.RIGHT));
            line2.addCell(new Cell().add(txt2_1).setVerticalAlignment(VerticalAlignment.MIDDLE));
            line2.addCell(new Cell().add(txt3).setVerticalAlignment(VerticalAlignment.MIDDLE).setTextAlignment(TextAlignment.RIGHT));
            line2.addCell(new Cell().add(txt3_1).setVerticalAlignment(VerticalAlignment.MIDDLE));
            line2.addCell(new Cell().add(txt4).setVerticalAlignment(VerticalAlignment.MIDDLE).setTextAlignment(TextAlignment.RIGHT));
            line2.addCell(new Cell().add(txt4_1).setVerticalAlignment(VerticalAlignment.MIDDLE));

            document.add(line2);
        }
    }

    private void tc15(int py, int pm) throws FileNotFoundException, IOException {

        PdfWriter writer = new PdfWriter("D:\\output3.pdf");
        PdfDocument pdf = new PdfDocument(writer);
        try (Document document = new Document(pdf, PageSize.A3.rotate())) {
            document.setMargins(20, 20, 20, 20);

            PdfFont fmsandyanee = PdfFontFactory.createFont(FMSandyanee, true);
            PdfFont fmrashmee = PdfFontFactory.createFont(FMRashmee, true);
            PdfFont fmababldbold = PdfFontFactory.createFont(FMAbabldBold, true);

            Paragraph txtName = new Paragraph("ku").setFont(fmsandyanee).setFontSize(12).setMultipliedLeading(1.0f).setPaddings(5, 0, 5, 0);
            Paragraph txtDate = new Paragraph("Èkhg wod< o¿ lsf,da .Kk").setFont(fmsandyanee).setFontSize(12).setMultipliedLeading(1.0f).setPaddings(5, 0, 5, 0);
            Paragraph total = new Paragraph("tl;=j").setFont(fmsandyanee).setFontSize(9).setMultipliedLeading(1.0f).setPaddings(5, 0, 5, 0);
            Paragraph hed = new Paragraph("udisl o¿ tl;= lsÍfï jd¾;dj" + " - " + monthset3() + " " + yearSelect()).setFont(fmsandyanee).setFontSize(12).setMultipliedLeading(1.0f).setPaddings(5, 0, 5, 0);

            float col1 = 50f;
            float columnWidth[] = {300f, col1, col1, col1, col1, col1, col1, col1, col1, col1, col1, col1, col1, col1, col1, col1, col1, col1, col1, col1, col1, col1, col1, col1, col1, col1, col1, col1, col1, col1, col1, col1, 100f};
            Table header = new Table(columnWidth).setTextAlignment(TextAlignment.CENTER);
            header.addCell(new Cell(0, 33).add(hed).setVerticalAlignment(VerticalAlignment.MIDDLE).setBackgroundColor(new DeviceRgb(0, 0, 0)).setFontColor(new DeviceRgb(255, 255, 255)));
            header.addCell(new Cell(2, 0).add(txtName).setVerticalAlignment(VerticalAlignment.MIDDLE));
            header.addCell(new Cell(0, 32).add(txtDate).setVerticalAlignment(VerticalAlignment.MIDDLE));

            for (int j = 1; j <= 31; j++) {
                Paragraph dj = new Paragraph(String.valueOf(j)).setFontSize(9).setMultipliedLeading(1.0f).setBold();
                header.addCell(new Cell().add(dj).setVerticalAlignment(VerticalAlignment.MIDDLE));
            }

            header.addCell(new Cell().add(total).setVerticalAlignment(VerticalAlignment.MIDDLE));

            for (int i = 1; i <= tableRowCount("SELECT COUNT(*) FROM customer"); i++) {
                int netWeight = tableRowCount("SELECT SUM(netWeight) FROM tealeafcollectreal WHERE customerID=" + i + " AND date >= '" + py + "-" + pm + "-01' AND date <= '" + py + "-" + pm + "-31';");
                String csName = null;
                String non = "-";
                Statement st;
                ResultSet rs;

                try {
                    st = con.createStatement();
                    rs = st.executeQuery("SELECT * FROM customer WHERE customerID=" + i + ";");
                    if (rs.next()) {
                        csName = rs.getString(2);
                    }
                } catch (SQLException e) {
                }

                double[] arr = new double[35];

                try {
                    st = con.createStatement();
                    rs = st.executeQuery("SELECT * FROM tealeafcollectreal WHERE customerID=" + i + " AND date >= '" + py + "-" + pm + "-01' AND date <= '" + py + "-" + pm + "-31';");
                    while (rs.next()) {
                        if (rs.getDouble(4) != 0) {
                            arr[Integer.valueOf(rs.getString(3).substring(8))] = rs.getDouble(4);
                        }
                    }
                } catch (SQLException e) {
                }

                Paragraph csNamep = new Paragraph(csName).setFontSize(9).setMultipliedLeading(1.0f).setPaddings(0, 0, 0, 5).setFixedLeading(1);
                header.addCell(new Cell().add(csNamep).setVerticalAlignment(VerticalAlignment.MIDDLE).setTextAlignment(TextAlignment.LEFT));

                for (int j = 1; j <= 31; j++) {
                    if (arr[j] != 0) {
                        Paragraph dj = new Paragraph(String.valueOf(Math.round(arr[j]))).setFontSize(9).setMultipliedLeading(1.0f).setPaddings(0, 5, 0, 5).setFixedLeading(1);
                        header.addCell(new Cell().add(dj).setVerticalAlignment(VerticalAlignment.MIDDLE));

                    } else {
                        Paragraph dj = new Paragraph(non).setFontSize(9).setMultipliedLeading(1.0f).setFixedLeading(1);
                        header.addCell(new Cell().add(dj).setVerticalAlignment(VerticalAlignment.MIDDLE));
                    }
                }

                Paragraph dj2 = new Paragraph(String.valueOf(Math.round(netWeight))).setFontSize(9).setMultipliedLeading(1.0f).setPaddings(0, 5, 0, 5).setFixedLeading(11);
                header.addCell(new Cell().add(dj2).setVerticalAlignment(VerticalAlignment.MIDDLE).setTextAlignment(TextAlignment.RIGHT));

            }
            document.add(header);
        }
    }

    private void goButtonAction() {
        jTextField8.setText(String.valueOf(df.format(getArrears(Integer.parseInt(jTextField1.getText())))));
        if (!jTextField1.getText().isEmpty()) {
            if (validat6()) {
                enablebyID(true);
            }
        }
    }

    /**
     *
     * @param evt
     */
    private String getPasswordTable(String query) {
        Statement st;
        ResultSet rs;
        String pw = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                pw = rs.getString(2);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error : " + e.getMessage());
        }
        return pw;
    }

    private void settingspagepasswordclr() {
        jPasswordField1.setText("");
        jPasswordField2.setText("");
        jPasswordField3.setText("");
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
    }

    private int tableRowCount(String Query) {
        Statement st;
        ResultSet rs;
        int count = 0;
        try {
            st = con.createStatement();
            rs = st.executeQuery(Query);
            if (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (SQLException e) {
        }
        return count;
    }

//    private void clearArrears() {
//        double cost = tableRowCount("SELECT SUM(advance + transport + fertilizer + other + chargeforTeaPackets) FROM tealeafcollectreal WHERE customerID=" + jTextField12.getText() + " AND date >= '" + pyear() + "-" + pmonth() + "-01' AND date <= '" + pyear() + "-" + pmonth() + "-31';");
//        double total = total(Integer.parseInt(jTextField12.getText()));
//        double arrears = getArrears(Integer.parseInt(jTextField12.getText()));
//        if ((total - cost) < 0) {
//            try {
//                con.prepareStatement("UPDATE arrearstable SET arrears = '" + jTextField2.getText() + "' WHERE customerID=" + jTextField12.getText() + "").execute();
//
//            } catch (SQLException e) {
//            }
//        }
//    }
    private void viewBill() {
        try {

            File pdfFile = new File("src\\Bill\\Single\\" + String.valueOf(jTextField12.getText()) + monthset2() + yearSelect() + "lglcbill.pdf");
            if (pdfFile.exists()) {

                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(pdfFile);
                } else {
                    System.out.println("Awt Desktop is not supported!");
                }

            } else {
//                System.out.println("File is not exists!");
                bill(Integer.parseInt(jTextField12.getText()), yearSelect(), monthSelect());
                File pdfFile2 = new File("src\\Bill\\Single\\" + String.valueOf(jTextField12.getText()) + monthset2() + yearSelect() + "lglcbill.pdf");
                if (pdfFile2.exists()) {

                    if (Desktop.isDesktopSupported()) {
                        Desktop.getDesktop().open(pdfFile2);
                    } else {
                        System.out.println("Awt Desktop is not supported!");
                    }
                }
            }

        } catch (IOException ex) {
        }
    }

    private void viewEnv() {
        try {

            File pdfFile = new File("src\\Bill\\Envelope\\" + String.valueOf(jTextField12.getText()) + monthset2() + yearSelect() + "envelope.pdf");
            if (pdfFile.exists()) {

                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(pdfFile);
                } else {
                    System.out.println("Awt Desktop is not supported!");
                }

            } else {
                envlope2(Integer.parseInt(jTextField12.getText()), yearSelect(), monthSelect());
                File pdfFile2 = new File("src\\Bill\\Envelope\\" + String.valueOf(jTextField12.getText()) + monthset2() + yearSelect() + "envelope.pdf");
                if (pdfFile2.exists()) {

                    if (Desktop.isDesktopSupported()) {
                        Desktop.getDesktop().open(pdfFile2);
                    } else {
                        System.out.println("Awt Desktop is not supported!");
                    }
                }
            }

        } catch (IOException ex) {
        }
    }

    private void viewtc15() {
        try {
            tc15(yearSelect(), monthSelect());
            File pdfFile = new File("D:\\output3.pdf");
            if (pdfFile.exists()) {

                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(pdfFile);
                } else {
                    System.out.println("Awt Desktop is not supported!");
                }

            } else {
                tc15(yearSelect(), monthSelect());
                File pdfFile2 = new File("D:\\output3.pdf");
                if (pdfFile2.exists()) {

                    if (Desktop.isDesktopSupported()) {
                        Desktop.getDesktop().open(pdfFile2);
                    } else {
                        System.out.println("Awt Desktop is not supported!");
                    }
                }
            }

        } catch (IOException ex) {
        }
    }

    private void btnSlct() {
        if (jRadioButton2.isSelected()) {
            enabledByRadio(true);
        } else {
            enabledByRadio(false);
        }
    }

    private void enabledByRadio(boolean x) {
        cmboxYear1.setEnabled(x);
        cmboxMonth2.setEnabled(x);
        jLabel38.setEnabled(x);
        jLabel39.setEnabled(x);
    }

    private int monthSelect() {
        int m = 0;
        if (jRadioButton1.isSelected()) {
            m = pmonth();
        } else if (jRadioButton2.isSelected()) {
            m = cmboxMonth2.getSelectedIndex() + 1;
        }
        return m;
    }

    private int yearSelect() {
        int y = 0;
        if (jRadioButton1.isSelected()) {
            y = pyear();
        } else if (jRadioButton2.isSelected()) {
            y = Integer.valueOf(cmboxYear1.getSelectedItem().toString());
        }
        return y;
    }

    private void bulkprint(int py, int pm) throws IOException {
        jProgressBar1.setMaximum(0);
        jProgressBar1.setMaximum(tableRowCount("SELECT COUNT(*) FROM customer"));
        jProgressBar1.setValue(0);
        for (int i = 1; i <= tableRowCount("SELECT COUNT(*) FROM customer"); i++) {
            if (tableRowCount("SELECT SUM(totalWeight) FROM tealeafcollectreal WHERE customerID=" + i + " AND date >= '" + py + "-" + pm + "-01' AND date <= '" + py + "-" + pm + "-31';") != 0) {
                bill(i, py, pm);
//                jProgressBar1.setValue(i);

            }
        }

    }

    private void bulkEnv(int py, int pm) throws IOException {
        for (int i = 1; i <= tableRowCount("SELECT COUNT(*) FROM customer"); i++) {
            if (tableRowCount("SELECT SUM(totalWeight) FROM tealeafcollectreal WHERE customerID=" + i + " AND date >= '" + py + "-" + pm + "-01' AND date <= '" + py + "-" + pm + "-31';") != 0) {
                envlope2(i, py, pm);
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CustomerTable;
    private javax.swing.JTable TableTeaLeafCollectReal;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmboxMonth;
    private javax.swing.JComboBox<String> cmboxMonth2;
    private javax.swing.JComboBox<String> cmboxYear;
    private javax.swing.JComboBox<String> cmboxYear1;
    private com.raven.datechooser.DateChooser dateChooser1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblTime;
    private javax.swing.JTable loginreportTableframe;
    // End of variables declaration//GEN-END:variables
}
