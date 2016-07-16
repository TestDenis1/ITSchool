package SQLDate;

import Connection.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import static javax.management.remote.JMXConnectorFactory.connect;

public class AuthorList {
    
    private ArrayList<Author> authorList = new ArrayList<Author>();
    Statement stmt = null;
    ResultSet rs = null;
    Connection conn = null;
    
    private ArrayList<Author> getAuthors(){
    
        try {
           
            conn = DBConnection.init();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM author ORDER BY fio");
            while(rs.next()){
                Author author = new Author();
                author.setId(rs.getLong("id"));
                author.setFio(rs.getString("fio"));
                authorList.add(author);
            } 
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            try {
                if (stmt!=null) stmt.close();
                if (rs!=null)rs.close();
                if (conn!=null)conn.close();
        } catch(SQLException ex){
            ex.printStackTrace();
          }
        }    
       return authorList;
    }
 
    public ArrayList<Author> getAuthorList(){
        if(!authorList.isEmpty()){
            return authorList;
        }else{
            return getAuthors();
        }
    }
}
