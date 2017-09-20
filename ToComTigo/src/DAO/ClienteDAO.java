/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import Model.Cliente;

/**
 *
 * @author Danilo
 */
public class ClienteDAO {
    
    public void salvar (Cliente cliente) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "insert into Cliente values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1,0);
        pst.setString(2, cliente.getNome());
        pst.setString(3, cliente.getCpf());
        pst.setString(4, cliente.getCnpj());
        pst.setString(5, cliente.getRg()); 
        pst.setString(6, cliente.getRua());
        pst.setString(7, cliente.getCep());
        pst.setString(8, cliente.getCidade());
        pst.setString(9, cliente.getTel());
        pst.setString(10, cliente.getTelCom());
        pst.setString(11, cliente.getCel());
        pst.setString(12, cliente.getEstado());
        pst.setString(13, cliente.getPais());
        pst.setString(14, cliente.getBairro());
        pst.setString(15, cliente.getComplemento());
        pst.setString(16, cliente.getNumero());
        pst.setString(17, cliente.getNasc());
        pst.setDouble(18, cliente.getLimite());
         
        pst.execute();
        pst.close();
    }
    
    //ClienteDao Alterar
    //Create By "G"
    public void alterar (Cliente cliente) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "UPDATE Cliente SET nome = ?, cpf = ?, cnpj = ?, rg = ?, rua = ?, cep = ?, cidade = ?, telefone = ?, telefone_comercial = ?, celular = ?, estado = ?, pais = ?, bairro = ?, complemento = ?, data_nascimento = ?, limite = ? WHERE id_cliente = ?" ;
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, cliente.getNome());
        pst.setString(2, cliente.getCpf());
        pst.setString(3, cliente.getCnpj());
        pst.setString(4, cliente.getRg()); 
        pst.setString(5, cliente.getRua());
        pst.setString(6, cliente.getCep());
        pst.setString(7, cliente.getCidade());
        pst.setString(8, cliente.getTel());
        pst.setString(9, cliente.getTelCom());
        pst.setString(10, cliente.getCel());
        pst.setString(11, cliente.getEstado());
        pst.setString(12, cliente.getPais());
        pst.setString(13, cliente.getBairro());
        pst.setString(14, cliente.getComplemento());
        pst.setString(15, cliente.getNasc());
        pst.setDouble(16, cliente.getLimite());
        pst.setInt(17, cliente.getId_cliente());
         
        pst.execute();
        pst.close();
    }
    
    static public void excluir(Cliente cliente) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "delete from Cliente where id = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, cliente.getId_cliente());
        pst.execute();
        pst.close();
    }
}
