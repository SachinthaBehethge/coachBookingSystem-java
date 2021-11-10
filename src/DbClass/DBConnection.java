/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DbClass;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Prog imesh BSC
 */
public class DBConnection {

    //static Connection dbcon; //db connection object
    //db creation method for global use
    

    public static Connection CreateDBConnection() {
        Connection dbcon = null;

        try {
                        Class.forName("com.mysql.jdbc.Driver");
            dbcon = DriverManager.getConnection("jdbc:mysql://localhost:3306/coachbookingsystem","root","");
            /*Class.forName("com.mysql.jdbc.Diver");

            dbcon = DriverManager.getConnection
            ("jdbc:mysql://localhost:3306/coachbookingsystem", "root", "");

            return dbcon; //output created db connection*/
        } catch (Exception ex) {
            ex.printStackTrace();
            //return null;
        }
        return dbcon;
    }

    public static Connection CreateDBCon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    


}
