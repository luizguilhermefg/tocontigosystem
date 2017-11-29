/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.ItensVenda;
import Model.Venda;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author Geder
 */
public class VendaDAO {
    
   public void salvar (Venda venda) throws SQLException{
       int idVenda = 0;
        PreparedStatement pst;
        String sql;
        sql = "insert into Venda values(?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1,0);
        pst.setInt(2, venda.getCliente().getId_cliente());
        pst.setInt(3, venda.getVendedor().getId_funcionario());
        pst.setFloat(4, venda.getTotalVenda());
              
         
        pst.executeUpdate();
        ResultSet rs = pst.getGeneratedKeys();
        
        while (rs.next()){
           idVenda = rs.getInt(1);
        }
           
        pst.close();
        salvarItensVenda(venda.getItensVenda(), idVenda);
    }
   
   public void salvarItensVenda (List<ItensVenda> itensVenda, int idVenda) throws SQLException{
       for(ItensVenda itens : itensVenda){
            PreparedStatement pst;
            String sql;
            sql = "insert into ItemVenda values(?,?,?,?,?,?)";
            pst = Conexao.getInstance().prepareStatement(sql);
            pst.setInt(1,0);
            pst.setInt(2, idVenda);
            pst.setInt(3, itens.getProduto().getId_produto());
            pst.setFloat(4, itens.getQuantidade());
            pst.setFloat(5, itens.getPreco());
            pst.setFloat(6, itens.getPrecototalitem());
            pst.executeUpdate();
            pst.close();
       }
    }
    
}
