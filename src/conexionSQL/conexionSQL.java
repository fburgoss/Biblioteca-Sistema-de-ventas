package conexionSQL;


import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


/**
 *
 * @author Pc gamer
 */
public class conexionSQL {
    
    Connection conectar=null;
    
    public Connection conexion(){
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/biblioteca","root","");
            
            JOptionPane.showMessageDialog(null,"Conexion Exitosa  :) ");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error Conexion" + e.getLocalizedMessage());
        }
        
        return conectar;
        
    }


}