package connection;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luan Rodrigo Machado
 */
public class Connectionfactory {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost/3306/controledeexchange";
    private static final String USER = "root";
    private static final String PASS = "7.88_C&C-flip";
    
    public static Connection getConnection (){
        
        try {
            Class.forName(DRIVER);
            
            return (Connection) DriverManager.getConnection(URL, USER, PASS);
            
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão: ",ex);
        }        
    }
    
    public static void closeConnecion(Connection con){
        if(con!=null){
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Connectionfactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void closeConnecion(Connection con, PreparedStatement stnt){
        closeConnecion(con);
        
            try {
                if (stnt != null){
                    stnt.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Connectionfactory.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    public static void closeConnecion(Connection con, PreparedStatement stnt, ResultSet rs){
        closeConnecion(con, stnt);
        
            try {
               
                if (rs != null){
                    rs.close();
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Connectionfactory.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    public static void closeConnecion(java.sql.Connection con, PreparedStatement stnt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}