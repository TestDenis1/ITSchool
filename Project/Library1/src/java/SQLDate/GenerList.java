package SQLDate;

import Connection.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GenerList {
   
   
    
    private ArrayList<Genre> genreList = new ArrayList<Genre>();
    
    private ArrayList<Genre> getGeners(){
         Connection conn = null;
         Statement stmt = null;
         ResultSet rs = null;
       
         try{
         conn = DBConnection.init();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM genre ORDER BY name");
            while(rs.next()){
                Genre genre = new Genre();
                genre.setName(rs.getString("name"));
                genre.setId(rs.getLong("id"));
                genreList.add(genre);
              } 
            } catch (SQLException ex){
                ex.printStackTrace();
            } finally{
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (rs != null) {
                    rs.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }    
       return genreList;
            
        }
        
    public ArrayList<Genre> getAllGeners(){
        if(!genreList.isEmpty()){
            return genreList;
        }else{
        return getGeners();
        }
     }
       
    
}
    

