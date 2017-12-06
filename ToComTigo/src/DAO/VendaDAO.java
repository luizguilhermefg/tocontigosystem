/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Geder
 */
public class VendaDAO {
    PreparedStatement pst;
    String sql;
    
    public void salvar (Venda venda) throws SQLException{
        int idVenda = 0;
        
        sql = "insert into Venda values(?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
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
            
            sql = "insert into ItemVenda values(?,?,?,?,?,?)";
            pst = Conexao.getInstance().prepareStatement(sql);
            pst.setInt(1,0);
            pst.setInt(2, idVenda);
            pst.setInt(3, itens.getProduto().getId_produto());
            pst.setFloat(4, itens.getQuantidade());
            pst.setFloat(5, itens.getPreco());
            pst.setFloat(6, itens.getPrecototalitem());
            pst.execute();
            pst.close();
        }
    }
    
    public void excluir(Venda venda) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "delete from venda where id_venda = ? ";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, venda.getCodigoVenda());
        pst.execute();
        pst.close();
    }
   
    public List<Venda> listaTodos() throws SQLException{
        List<Venda> listaVenda = new ArrayList<>();
        sql = "select * from venda ";
        pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        
        while(rs.next()){
           listaVenda.add(new Venda(
                   rs.getInt("id_venda"),
                   ClienteDAO.busca(rs.getInt("id_cliente")),
                   FuncionarioDAO.busca(rs.getInt("id_vendedor")),
                   rs.getFloat("totalvenda")));
                   
        }
      
        
        pst.close();
        return listaVenda;
    }
    
    public List<Venda> buscaNome(String Nome) throws SQLException{
        PreparedStatement pst;
        String sql;
        List<Venda> listaVenda = new ArrayList<>();
        String name = "%"+Nome+"%";
        sql = "SELECT * FROM venda v INNER JOIN cliente c ON v.id_cliente = c.id_cliente where c.nome like ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, name);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            listaVenda.add(new Venda(
                rs.getInt("id_venda"),
                ClienteDAO.busca(rs.getInt("id_cliente")),
                FuncionarioDAO.busca(rs.getInt("id_vendedor")),
                rs.getFloat("totalvenda")));
        }
        pst.close();
        return listaVenda;
    }
}
