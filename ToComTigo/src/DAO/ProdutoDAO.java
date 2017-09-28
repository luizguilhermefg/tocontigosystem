package DAO;

import Model.Produto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ProdutoDAO {
    
    static public void salvar (Produto produto) throws SQLException{
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
    // Alterar Produto DAO Method
    // Create By : "G"
    static public void alterar (Produto produto) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "UPDATE Produto SET nome = ?, marca = ?, grupo = ?, unidade = ?, kilo = ?, quantidade = ? WHERE id_produto = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, produto.getNome());
        pst.setString(2, produto.getMarca());
        pst.setString(3, produto.getGrupo());
        pst.setInt(4, produto.getUnidade()); 
        pst.setDouble(5, produto.getKilo());
        pst.setInt(6, produto.getQuantidade());
        pst.setInt(7, produto.getId_produto());
         
        pst.execute();
        pst.close();
    }
    
    
    
    // Produto List DAO Method Created By : "G"
    
    static public List<Produto> listaTodos() throws SQLException{
       PreparedStatement pst;
       String sql;
       List<Produto> listaProd = new ArrayList<Produto>();
       sql = "SELECT * FROM Produto ORDER BY nome";
       pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
           listaProd.add(new Produto(rs.getInt("id_produto"),rs.getString("nome"),rs.getString("marca"), rs.getString("grupo"), rs.getInt("unidade"), rs.getDouble("kilo"), rs.getInt("quantidade") ));
        }
        pst.close();
        return listaProd;
    }
    
    //List Produto search by nome DAO Method
    // Created By : "G"
    static public List<Produto> buscaNomeLista(String Nome) throws SQLException{
        PreparedStatement pst;
        String sql;
        List<Produto> listaProd = new ArrayList<Produto>();
        String name = "%"+Nome+"%";
        sql = "SELECT * FROM Produto WHERE nome LIKE ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, name);
        pst.execute();
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
           listaProd.add(new Produto(rs.getInt("id_produto"),rs.getString("nome"),rs.getString("marca"), rs.getString("grupo"), rs.getInt("unidade"), rs.getDouble("kilo"), rs.getInt("quantidade") ));
        }
        pst.close();
        return listaProd;
    }
    
    // Produto Search DAO Method Created By : "G"
    
    static public Produto busca(int id) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "SELECT * FROM Produto WHERE id_produto = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, id);
        Produto produto = null;
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
           produto = new Produto(rs.getInt("id_produto"),rs.getString("nome"),rs.getString("marca"), rs.getString("grupo"), rs.getInt("unidade"), rs.getDouble("kilo"), rs.getInt("quantidade"));
        }
        pst.close();
        return produto;
    }
    
    static public void excluir(Produto produto) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "delete from Produto where id_produto = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, produto.getId_produto());
        pst.execute();
        pst.close();
    }
    
    
}
