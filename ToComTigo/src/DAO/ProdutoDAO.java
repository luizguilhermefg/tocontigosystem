/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.ProdutoM;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author NUPSI-07
 */
public class ProdutoDAO {
    
    static public void salvar (ProdutoM produto) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "insert into Produto values (?,?,?,?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1,0);
        pst.setString(2, produto.getNome());
        pst.setString(3, produto.getMarca());
        pst.setString(4, produto.getGrupo());
        pst.setInt(5, produto.getUnidade()); 
        pst.setDouble(6, produto.getKilo());
        pst.setInt(7, produto.getQuantidade());
         
        pst.execute();
        pst.close();
    }
    
    static public void excluir(ProdutoM produto) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "delete from Produto where id = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, produto.getId_produto());
        pst.execute();
        pst.close();
    }
}
