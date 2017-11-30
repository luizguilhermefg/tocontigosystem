package DAO;

import Model.Funcionario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//ZZZ
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
    
    public void alterar (Funcionario funcionario) throws SQLException{
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
    
    // List Funcionario DAO Method Created By : "G"
    
    static public List<Funcionario> listaTodos() throws SQLException{
       PreparedStatement pst;
       String sql;
       List<Funcionario> listaFunc = new ArrayList<Funcionario>();
       sql = "SELECT * FROM Funcionario ORDER BY nome";
       pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
           listaFunc.add(new Funcionario(rs.getInt("id_funcionario"),rs.getString("nome"), rs.getString("cpf"), rs.getString("rg"),rs.getString("data_nascimento"), rs.getString("telefone"), rs.getString("login"), rs.getString("senha"), rs.getString("funcao")));
        }
        pst.close();
        return listaFunc;
    }
    
    // List Funcionario DAO Order By Name Method
    // Created By : "G"
    static public List<Funcionario> buscaNomeLista(String Nome) throws SQLException{
        PreparedStatement pst;
        String sql;
        int cont = 0;
        List<Funcionario> listaFunc = new ArrayList<Funcionario>();
        String name = "%"+Nome+"%";
        sql = "SELECT * FROM Funcionario WHERE nome LIKE ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, name);
        pst.execute();
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
           listaFunc.add(new Funcionario(rs.getInt("id_funcionario"),rs.getString("nome"), rs.getString("cpf"), rs.getString("rg"),rs.getString("data_nascimento"), rs.getString("telefone"), rs.getString("login"), rs.getString("senha"), rs.getString("funcao")));
        cont++;
        }
        
        if(cont == 0){
            return null;
        }
        
        pst.close();
        return listaFunc;
    }
    
    // Search Funcionario by id DAO Method Created By : "G"
    
    public Funcionario busca(int id) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "SELECT * FROM Funcionario WHERE id_funcionario = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, id);
        Funcionario funcionario = null;
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
           funcionario = new Funcionario(rs.getInt("id_funcionario"),rs.getString("nome"), rs.getString("cpf"), rs.getString("rg"),rs.getString("data_nascimento"), rs.getString("telefone"), rs.getString("login"), rs.getString("senha"), rs.getString("funcao"));
        }
        pst.close();
        return funcionario;
    }
    
    // Search Funcionario by Name DAO Method
    // Created By : "G"
    
    static public Funcionario buscaNome(String Nome) throws SQLException{
        PreparedStatement pst;
        String sql;
        //String name = "%"+Nome+"";
        sql = "select * from Entidade where nome = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, Nome);
        Funcionario funcionario = null;
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            funcionario = new Funcionario(rs.getInt("id_funcionario"),rs.getString("nome"), rs.getString("cpf"), rs.getString("rg"),rs.getString("data_nascimento"), rs.getString("telefone"), rs.getString("login"), rs.getString("senha"), rs.getString("funcao"));
         }
         pst.close();
         return funcionario;
     }
    
    
    
    static public void excluir(Funcionario funcionario) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "delete from Funcionario where id_funcionario = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, funcionario.getId_funcionario());
        pst.execute();
        pst.close();
    }
    
    public Funcionario buscaLogin(String login, String senha) throws SQLException
    {
        PreparedStatement pst;
        String sql;
        sql = "select * from funcionario where login COLLATE utf8_bin = ? and senha COLLATE utf8_bin = ?";
        Funcionario funcionario = null;
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, login);
        pst.setString(2, senha);
        pst.executeQuery();
        
        ResultSet rs = pst.getResultSet();
        while (rs.next())
        {
            funcionario = new Funcionario(rs.getInt("id_funcionario"), rs.getString("nome"),rs.getString("cpf"),rs.getString("rg")
            , rs.getString("data_nascimento"),rs.getString("telefone"),rs.getString("login"), rs.getString("senha"), rs.getString("funcao"));
        }
        return funcionario;
    }
}
