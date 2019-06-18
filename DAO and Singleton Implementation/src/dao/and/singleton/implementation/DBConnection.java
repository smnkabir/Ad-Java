/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.and.singleton.implementation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nk
 */
public class DBConnection {
    private static DBConnection dbConnection = null;
    private static Connection connection = null;
    private static Statement statement = null;

    private DBConnection() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/registration", "root", null);
            statement = connection.createStatement();
            System.out.println("Connection created");
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static Connection getConnection(){
        if(dbConnection == null)
           dbConnection = new DBConnection();
        return connection;
        
    }
    public static Statement getStatement(){
        if(dbConnection == null)
            dbConnection = new DBConnection();
        return statement;
    }
    
}
