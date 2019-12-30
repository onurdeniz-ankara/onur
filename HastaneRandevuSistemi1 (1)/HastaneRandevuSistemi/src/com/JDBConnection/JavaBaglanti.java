/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.JDBConnection;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author onurd
 */
public class JavaBaglanti {
    Connection con;
    public static Connection ConnectDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con=DriverManager.getConnection("jdbc:sqlite:Hastane.db");
            return con;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }  
    }
}
