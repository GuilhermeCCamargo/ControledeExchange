/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.Connectionfactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Deposito;

/**
 *
 * @author Luan Rodrigo Machado
 */
public class DepositoDAO {
    
    public void creat(Deposito d){
        
        Connection con = Connectionfactory.getConnection();
        PreparedStatement stnt = null;
        
        try {
            stnt = con.prepareStatement("INSERT INTO depositos (DataDep, ValorDep, TipoDep, FontDep)VALUES(?,?,?,?)");
            stnt.setFloat(1, d.getDataDep());
            stnt.setFloat(2, d.getValorDep());
            stnt.setString(3,d.getTipoDep());
            stnt.setString(4,d.getFontDep());
            
            stnt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar:"+ex);
        }finally{
            Connectionfactory.closeConnecion(con, stnt);
        }
        
    }

    public void creat(view.Deposito d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
