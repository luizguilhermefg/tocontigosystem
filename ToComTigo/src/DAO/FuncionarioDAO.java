/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.FuncionarioM;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author NUPSI-07
 */
public class FuncionarioDAO {
    
    public void salvar (FuncionarioM funcionario) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "insert into Funcionario values (?,?,?,?,?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1,0);
        pst.setString(2, funcionario.getNome());
        pst.setString(3, funcionario.getCpf());
        pst.setString(4, funcionario.getRg());
        pst.setString(5, funcionario.getTelefone()); 
        pst.setString(6, funcionario.getLogin());
        pst.setString(7, funcionario.getSenha());
        pst.setString(8, funcionario.getFuncao());
         
        pst.execute();
        pst.close();
    }
    
    static public void excluir(FuncionarioM funcionario) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "delete from Funcionario where id = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, funcionario.getId_funcionario());
        pst.execute();
        pst.close();
    }
}
