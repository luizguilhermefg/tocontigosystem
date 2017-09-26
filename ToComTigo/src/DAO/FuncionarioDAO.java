package DAO;

import Model.Funcionario;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class FuncionarioDAO {
    
    public void salvar (Funcionario funcionario) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "insert into Funcionario values (?,?,?,?,?,?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1,0);
        pst.setString(2, funcionario.getNome());
        pst.setString(3, funcionario.getCpf());
        pst.setString(4, funcionario.getRg());
        pst.setString(5, funcionario.getNasc());
        pst.setString(6, funcionario.getTelefone()); 
        pst.setString(7, funcionario.getLogin());
        pst.setString(8, funcionario.getSenha());
        pst.setString(9, funcionario.getFuncao());
         
        pst.execute();
        pst.close();
    }
    // Alterar Funcionario DAO Method
    //Created By : "G"
    
    public void Alterar (Funcionario funcionario) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "UPDATE Funcionario SET nome = ?, cpf = ?,rg = ?,data_nascimento = ?,telefone = ?,login = ?,senha = ?,funcao = ? WHERE id_funcionario = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, funcionario.getNome());
        pst.setString(2, funcionario.getCpf());
        pst.setString(3, funcionario.getRg());
        pst.setString(4, funcionario.getNasc());
        pst.setString(5, funcionario.getTelefone()); 
        pst.setString(6, funcionario.getLogin());
        pst.setString(7, funcionario.getSenha());
        pst.setString(8, funcionario.getFuncao());
        pst.setInt(9, funcionario.getId_funcionario());
         
        pst.execute();
        pst.close();
    }
    
    static public void excluir(Funcionario funcionario) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "delete from Funcionario where id = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, funcionario.getId_funcionario());
        pst.execute();
        pst.close();
    }
}
