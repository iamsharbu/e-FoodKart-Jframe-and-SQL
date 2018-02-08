
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MohamedSharbudeen
 */
public class sqlconnect {

    public static Connection connectDB() {
        try{
            String myDriver = ("org.apache.derby.jdbc.ClientDriver");
            String myUrl = "jdbc:derby://localhost:1527/mydb";
            Class.forName(myDriver);
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/mydb","sharbu","123");
            return con;
        }
        catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}
