package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {
    
    
    static private String host;
    static private String root;
    static private String password;
    static private String nameDB;
    static private String url;
    
    private static  Properties properties = new Properties();
    private static Connection mysqlConnection = null;
    private static DBConnection connect = null;
   
    public DBConnection(String host, String root, String password, String nameDB){
        this.host = host;
        this.root = root;
        this.password = password;
        this.nameDB = nameDB;
    }
    
    
   
    
     static private void initProperties(){
       if (connect == null ){
        connect = new DBConnection("localhost:3306", "root", "qazwsx7", "library");
        url = "jdbc:mysql://" + host + "/" + nameDB;
        
        properties.setProperty("user", root);
        properties.setProperty("password", password);
        properties.setProperty("characterEncoding", "UTF-8");
        properties.setProperty("useUnocode", "true");
        
        System.out.println("URL: " + url);
       }else{
           
       }
    }
    
       static public Connection init(){
       initProperties();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            mysqlConnection = DriverManager.getConnection(url, root, password);
        } catch (ClassNotFoundException ex) {
             ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
       
       return mysqlConnection;
    }
    
    public  void finalize(){
        try {
            mysqlConnection.close();
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
    }
    
    public ResultSet query(String query){
        ResultSet result = null;
        try {
            Statement stmt = mysqlConnection.createStatement();
            result = stmt.executeQuery(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    public void updateQuery(String query){
        try {
            Statement stmt = mysqlConnection.createStatement();
            stmt.executeUpdate(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}