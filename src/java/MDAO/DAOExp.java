package MDAO;

import Inter.MetodosExpediente;
import Model.Expediente;
import conex.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EMProducciones
 */
public class DAOExp implements MetodosExpediente{

    // sql
    private static final String sqlInsert="INSERT INTO expe VALUES (NULL,?,?,?,?,?)";
    
    
    
    private Connection c = null;
    private PreparedStatement pre = null;
    private ResultSet resul = null;
    private Expediente expe;
    private Conexion con = null;
    
    @Override
    public void cargarExpediente(Expediente exp) {
        con = new Conexion();
        try {
            c = con.getConnection();
            pre = c.prepareStatement(sqlInsert);
            pre.setInt(1, exp.getNroExp());
            pre.setString(2, exp.getCara());
            pre.setString(3, exp.getFuero());
            pre.setInt(4, exp.getNroJuzgado());
            //pre.setDate(5, (Date) exp.getFeUlUpdate());
            java.sql.Timestamp fechita = new java.sql.Timestamp(new java.util.Date().getTime());
            pre.setTimestamp(5,fechita);
            pre.execute();
   
        } catch (SQLException ex) {
            Logger.getLogger(DAOExp.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                //pre.close();
                c.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAOExp.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }        
    }   
}
