/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import DbClass.DBConnection;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Prog imesh BSC
 */
public class BookCoach extends javax.swing.JFrame {

    
    /**
     * Creates new form BookCoach
     */
    public BookCoach() {
        initComponents();
        
        
    }
        PreparedStatement ps;
        ResultSet rs;
        
        /*static String Cname;
        static String ctp;*/
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        TxtSeat = new javax.swing.JTextField();
        BTNbook = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        BTNreset = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        TXTDATEadd = new javax.swing.JTextField();
        TxtTPnum = new javax.swing.JFormattedTextField();
        TxtTPnumadd = new javax.swing.JFormattedTextField();
        TXTfrom = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        TXTdest = new javax.swing.JTextField();
        TXTcname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableBook = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        Back2BTN = new javax.swing.JButton();
        DATESearch = new com.toedter.calendar.JDateChooser();
        BTNshow = new javax.swing.JButton();
        BTNclear = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        ComboFrom = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        ComboDestin = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(773, 440));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jPanel1.setMinimumSize(new java.awt.Dimension(770, 440));
        jPanel1.setPreferredSize(new java.awt.Dimension(770, 440));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Book Your Coach Seat");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 770, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtSeat.setEditable(false);
        TxtSeat.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TxtSeat.setToolTipText("");
        jPanel2.add(TxtSeat, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 60, -1));

        BTNbook.setBackground(new java.awt.Color(255, 153, 0));
        BTNbook.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        BTNbook.setForeground(new java.awt.Color(255, 255, 255));
        BTNbook.setText("Book");
        BTNbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNbookActionPerformed(evt);
            }
        });
        jPanel2.add(BTNbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 70, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("Seat Number*");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 80, 20));

        BTNreset.setBackground(new java.awt.Color(255, 153, 0));
        BTNreset.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        BTNreset.setForeground(new java.awt.Color(255, 255, 255));
        BTNreset.setText("Reset");
        BTNreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNresetActionPerformed(evt);
            }
        });
        jPanel2.add(BTNreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 70, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setText("Date*");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 50, 20));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel11.setText("Telephone");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 70, 20));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel13.setText("Name*");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 20));

        TXTDATEadd.setEditable(false);
        jPanel2.add(TXTDATEadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 110, -1));

        try {
            TxtTPnum.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("############")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TxtTPnum.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel2.add(TxtTPnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 140, -1));

        try {
            TxtTPnumadd.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TxtTPnumadd.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel2.add(TxtTPnumadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 110, -1));

        TXTfrom.setEditable(false);
        TXTfrom.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TXTfrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTfromActionPerformed(evt);
            }
        });
        jPanel2.add(TXTfrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 110, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel14.setText("From");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 60, 20));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel15.setText("Destination");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 70, 20));

        TXTdest.setEditable(false);
        TXTdest.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel2.add(TXTdest, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 110, -1));

        TXTcname.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TXTcname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTcnameKeyTyped(evt);
            }
        });
        jPanel2.add(TXTcname, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 110, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 200, 250));

        TableBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bus Number", "Seats", "Status", " Name", "Telephone", "Date", "From ", "Destination"
            }
        ));
        TableBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableBookMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableBook);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 560, 250));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel12.setText("Date");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 30, 20));

        Back2BTN.setBackground(new java.awt.Color(0, 0, 255));
        Back2BTN.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Back2BTN.setForeground(new java.awt.Color(255, 255, 255));
        Back2BTN.setText("Back");
        Back2BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back2BTNActionPerformed(evt);
            }
        });
        jPanel1.add(Back2BTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, 70, 30));

        DATESearch.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(DATESearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 140, 20));

        BTNshow.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BTNshow.setText("Show");
        BTNshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNshowActionPerformed(evt);
            }
        });
        jPanel1.add(BTNshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, -1, 40));

        BTNclear.setBackground(new java.awt.Color(255, 153, 0));
        BTNclear.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        BTNclear.setForeground(new java.awt.Color(255, 255, 255));
        BTNclear.setText("clear");
        BTNclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNclearActionPerformed(evt);
            }
        });
        jPanel1.add(BTNclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 380, 70, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("From");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 40, 20));

        ComboFrom.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        ComboFrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "France", "Spain", "Germany", " " }));
        jPanel1.add(ComboFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 90, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("Destination");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 70, 20));

        ComboDestin.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        ComboDestin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "France", "Spain", "Germany", " " }));
        ComboDestin.setToolTipText("");
        jPanel1.add(ComboDestin, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 90, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTNresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNresetActionPerformed
        // TODO add your handling code here:
        resetbook();
    }//GEN-LAST:event_BTNresetActionPerformed

    private void Back2BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back2BTNActionPerformed
        // TODO add your handling code here:
        CoachManmagementSystem log =new CoachManmagementSystem();
        log.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Back2BTNActionPerformed

    private void BTNshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNshowActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat dateformatter = new SimpleDateFormat("yyyy-MM-dd");
        String sdate =dateformatter.format(DATESearch.getDate());
        int From = ComboFrom.getSelectedIndex();
        int Dest = ComboDestin.getSelectedIndex();
        String from = ComboFrom.getSelectedItem().toString();
        String dest = ComboDestin.getSelectedItem().toString();
        
        
       saerchtbl(From, Dest,sdate,from,dest);
       //cobosearch(from,dest);
       
    }//GEN-LAST:event_BTNshowActionPerformed

    private void BTNclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNclearActionPerformed
        // TODO add your handling code here:
        reset1();
    }//GEN-LAST:event_BTNclearActionPerformed

    private void BTNbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNbookActionPerformed
        
        DefaultTableModel dtm = (DefaultTableModel)TableBook.getModel();
        int selected  = TableBook.getSelectedRow();
        
        String busno = dtm.getValueAt(selected, 0).toString();
        
        String addname =TXTcname.getText();
        String addtp = TxtTPnumadd.getText();
        String from =  TXTfrom.getText();
        String dest = TXTdest.getText();
        String seat = TxtSeat.getText();
        String date = TXTDATEadd.getText();
         
        
        
       booksave(busno,addname, addtp, from, dest, seat, date);
    }//GEN-LAST:event_BTNbookActionPerformed

    private void TableBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableBookMouseClicked
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel)TableBook.getModel();
        int selected  = TableBook.getSelectedRow();
        
        String status = dtm.getValueAt(selected, 2).toString();
        
        if(!status.equals("Booked")){
            
            String seat= dtm.getValueAt(selected, 1).toString();
            String bookdate= dtm.getValueAt(selected, 5).toString();
            String from = dtm.getValueAt(selected, 6).toString();
            String dest = dtm.getValueAt(selected, 7).toString();
           
            TxtSeat.setText(seat);
            TXTDATEadd.setText(bookdate);
            TXTfrom.setText(from);
            TXTdest.setText(dest);
            
        }else{
            
        }
        
    }//GEN-LAST:event_TableBookMouseClicked

    private void TXTfromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTfromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTfromActionPerformed

    private void TXTcnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTcnameKeyTyped
        // TODO add your handling code here:
        int Csnlen = TXTcname.getText().length();
       
        if (Csnlen >= 20) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_TXTcnameKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookCoach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookCoach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookCoach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookCoach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookCoach().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNbook;
    private javax.swing.JButton BTNclear;
    private javax.swing.JButton BTNreset;
    private javax.swing.JButton BTNshow;
    private javax.swing.JButton Back2BTN;
    private javax.swing.JComboBox<String> ComboDestin;
    private javax.swing.JComboBox<String> ComboFrom;
    private com.toedter.calendar.JDateChooser DATESearch;
    private javax.swing.JTextField TXTDATEadd;
    private javax.swing.JTextField TXTcname;
    private javax.swing.JTextField TXTdest;
    private javax.swing.JTextField TXTfrom;
    private javax.swing.JTable TableBook;
    private javax.swing.JTextField TxtSeat;
    private javax.swing.JFormattedTextField TxtTPnum;
    private javax.swing.JFormattedTextField TxtTPnumadd;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private void resetbook() {
        
        TXTcname.setText("");
        TxtTPnumadd.setText("");
        TXTfrom.setText("");
        TXTdest.setText("");
        TxtSeat.setText("");
        TXTDATEadd.setText("");
        
       
        
    }

    private void reset1() {
       
        DATESearch.setDate(null);
        
        DefaultTableModel d = (DefaultTableModel)TableBook.getModel();
                d.setRowCount(0);
        
        
    }

   

    
    
    
    public void saerchtbl(int From, int Dest, String sdate, String from, String dest) {
        Connection dbcon = DBConnection.CreateDBConnection();
        
        if (dbcon != null) {

            if (From == Dest) {
                JOptionPane.showMessageDialog(rootPane, "Selection Errorr", "Save Error",
                        JOptionPane.ERROR_MESSAGE);
                BookCoach b = new BookCoach();
                b.setVisible(true);
                this.setVisible(false);

            }else {
                
                
                try {
                    ps = dbcon.prepareStatement("select distinct busadd.BusNo, busadd.seat, busadd.Status, busadd.Date, busadd.Fromthe, busadd.Destination,  busbooking.cusname, busbooking.telephone from busadd left JOIN busbooking ON "
                            + "busadd.BusNo = busbooking.BusNo AND busadd.seat = busbooking.Seat AND busadd.Date = busbooking.Date AND"
                            + " busadd.Fromthe = busbooking.Fromthe AND busadd.Destination = busbooking.Destination where busadd.Date = ? AND busadd.Fromthe = ? AND busadd.Destination = ?");
                    
                   
                    
                    ps.setString(1, sdate);
                    ps.setString(2, from);
                    ps.setString(3, dest);
                    
                    
                    rs = ps.executeQuery();

                    ResultSetMetaData rsmd = rs.getMetaData();
                        
                    int c;

                    c = rsmd.getColumnCount();

                    DefaultTableModel d = (DefaultTableModel) TableBook.getModel();
                    d.setRowCount(0);
                    

                    while (rs.next()) {
                        from = rs.getString("Fromthe");
                        dest = rs.getString("Destination");
                        ComboFrom.addItem(from);
                        ComboDestin.addItem(dest);
                        Vector v2 = new Vector();

                        for (int i = 1; i <= c; i++) {

                            v2.add(rs.getString("BusNo"));
                            v2.add(rs.getString("seat"));
                            v2.add(rs.getString("Status"));
                            v2.add(rs.getString("cusname"));
                            v2.add(rs.getString("telephone"));
                            v2.add(rs.getString("Date"));
                            v2.add(rs.getString("Fromthe"));
                            v2.add(rs.getString("Destination"));
                            
                            
                        }
                        
                        d.addRow(v2);
                        
                    }
                    JOptionPane.showMessageDialog(rootPane, "Click on the Seat to book Yours! ", "Information",
                            JOptionPane.INFORMATION_MESSAGE);

                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(rootPane, "Search resulst loading failed ", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            
            }

        } else {
            
            JOptionPane.showMessageDialog(rootPane, "Search resulst loading failed ", "Error",
                            JOptionPane.ERROR_MESSAGE);
         }
        
    }    

    
    
    
    private void booksave(String busno, String addname, String addtp, String from, String dest, String seat, String date) {
        
                
        Connection dbcon = DBConnection.CreateDBConnection();
        PreparedStatement pt;
        int Csnlen = TXTcname.getText().length();
        int tplen = TxtTPnumadd.getText().length();
       
       if(dbcon!=null){
         if(Csnlen!=0 && tplen!=0){  
           try {
               ps = dbcon.prepareStatement("insert into busbooking(BusNo,Seat,cusname,telephone,Fromthe,Destination,Date)values(?,?,?,?,?,?,?) ");
                ps.setString(1, busno);
                ps.setString(2, seat);
                ps.setString(3, addname);
                ps.setString(4, addtp);
                ps.setString(5, from);
                ps.setString(6, dest);
                ps.setString(7, date);
                
                ps.executeUpdate();
                
                pt = dbcon.prepareStatement("update busadd set Status =? where seat = ?");
                pt.setString(1, "Booked");
                pt.setString(2, seat);
                pt.executeUpdate();
                
                JOptionPane.showMessageDialog(rootPane, "Seat Booked Successfully! ", "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                
                saerchtbl(ERROR, WIDTH, date, from, dest);
                
                    TXTDATEadd.setText("");
                    TxtTPnumadd.setText("");
                    TXTfrom.setText("");
                    TXTdest.setText("");
                    TxtSeat.setText("");
                    TXTDATEadd.setText("");
                
           } catch (SQLException ex) {
              ex.printStackTrace();
               
           }
  
         }else{
                JOptionPane.showMessageDialog(rootPane, "Please Enter Your Name and Telephone ", "Information",
                            JOptionPane.WARNING_MESSAGE);   
                   }   
                       
           
           
       }else{
           
           
       }
    }

    /*public void cobosearch(String from, String dest) {
        
        Connection dbcon = DBConnection.CreateDBConnection();
        
        
        if (dbcon!=null){
            
            try {
                 ps = dbcon.prepareStatement("SELECT Fromthe FROM busadd");
                 rs = ps.executeQuery();
                 
                 while (rs.next()) {
                    from = rs.getString("Fromthe");
                ComboFrom.addItem(from);
                 }
                
             } catch (SQLException ex) {
                 
             }
             
             try {
                 ps = dbcon.prepareStatement("SELECT Destination FROM busadd");
                 rs = ps.executeQuery();
                 
                 while (rs.next()) {
                     dest = rs.getString("Destination");
                
                ComboDestin.addItem(dest);
                 }
                
             } catch (SQLException ex) {
                 
             }
            
            
        }else{
            
        }
        
    }*/

   

    }

   /* private void selector(int From, int Dest) {
            
        if(From == Dest){
            JOptionPane.showMessageDialog(rootPane, "Selection Errorr","Save Error",
                    JOptionPane.ERROR_MESSAGE);
            BookCoach b = new BookCoach();
                    b.setVisible(true);
                    this.setVisible(false);
                    
        }else if(From == 0 && Dest==0){
            JOptionPane.showMessageDialog(rootPane, "Selection Errorr","Save Error",
                    JOptionPane.ERROR_MESSAGE);
            BookCoach b = new BookCoach();
                    b.setVisible(true);
                    this.setVisible(false);
                    
        }else{
            
        }

    }

    private void booksave(String busno, String addname, String addtp, String from, String dest, String seat, String date) {
        
        Connection dbcon = DBConnection.CreateDBConnection();
        PreparedStatement pt;
        
       
       if(dbcon!=null){
           try {
               ps = dbcon.prepareStatement("insert into busbooking(BusNo,Seat,cusname,telephone,Fromthe,Destination,Date)values(?,?,?,?,?,?,?) ");
                ps.setString(1, busno);
                ps.setString(2, seat);
                ps.setString(3, addname);
                ps.setString(4, addtp);
                ps.setString(5, from);
                ps.setString(6, dest);
                ps.setString(7, date);
                
                ps.executeUpdate();
                
                pt = dbcon.prepareStatement("update busadd set Status =? where seat = ?");
                pt.setString(1, "Booked");
                pt.setString(2, seat);
                pt.executeUpdate();
                
                JOptionPane.showMessageDialog(rootPane, "Seat Booked Successfully! ", "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                
                saerchtbl(ERROR, WIDTH, date);
                
                    TXTDATEadd.setText("");
                    TxtTPnumadd.setText("");
                    TXTfrom.setText("");
                    TXTdest.setText("");
                    TxtSeat.setText("");
                    TXTDATEadd.setText("");
                
           } catch (SQLException ex) {
              ex.printStackTrace();
               
           }
                       
           
           
       }else{
           JOptionPane.showMessageDialog(rootPane, "Please Enter Your Name and Telephone ", "Information",
                            JOptionPane.WARNING_MESSAGE);
           
       }
        
        
    }
    
}*/