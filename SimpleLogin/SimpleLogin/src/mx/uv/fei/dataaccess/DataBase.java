/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uv.fei.dataaccess;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rvo
 */
public class DataBase {
    public static Connection connection;
    private Statement statement;
    public static DataBase database;
    private DataBase() {
    }
    
    private static void setConnection(){
        Configuration configuration= new Configuration();
        Properties configurationProperties=null;
        try {
            configurationProperties = configuration.loadConfiguration();
             String url= "jdbc:mysql://"+configurationProperties.getProperty("server")+"/";
            String databaseName = configurationProperties.getProperty("database");
            String userName = configurationProperties.getProperty("username");
            String password = configurationProperties.getProperty("password");
       
            connection = (Connection)DriverManager.getConnection(url+databaseName,userName,password);
        } catch (IOException | SQLException ex) {
            java.util.logging.Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }
    
    public static DataBase getDataBaseConnection() {
        if ( database == null ) {
            database = new DataBase();
        }
        setConnection();
        return database;
 
    }
    
    public static void closeConnection(){
        if(connection!=null){
            try {
                if(!connection.isClosed()){
                    connection.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public ResultSet executeQuery(String query) throws SQLException{
        statement = connection.createStatement();
        ResultSet result =statement.executeQuery(query);
        return result;        
    }
}
