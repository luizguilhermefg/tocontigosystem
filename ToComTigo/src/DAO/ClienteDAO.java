package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import Model.Cliente;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class ClienteDAO {
    
    
    public void salvar (Cliente cliente) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "insert into Cliente values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
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
        sql = "UPDATE Cliente SET nome = ?, cpf = ?, cnpj = ?, rg = ?, rua = ?, cep = ?, cidade = ?, telefone = ?, telefone_comercial = ?, celular = ?, estado = ?, pais = ?, bairro = ?, complemento = ?, Numero = ?, data_nascimento = ?, limite = ? WHERE id_cliente = ?" ;
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
        pst.setString(15, cliente.getNumero());
        pst.setString(16, cliente.getNasc());
        pst.setDouble(17, cliente.getLimite());
        pst.setInt(18, cliente.getId_cliente());
         
        pst.execute();
        pst.close();
    }
    
    // Search By Id Cliente DAO Method
    // Created By : "G"
    public Cliente busca(int id) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "SELECT * FROM Cliente WHERE id_cliente = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, id);
        Cliente cliente = null;
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
           cliente = new Cliente(rs.getInt("id_cliente"),rs.getString("nome"),rs.getString("cpf"),rs.getString("cnpj"),rs.getString("rg"), rs.getString("rua"), rs.getString("cep"), rs.getString("cidade"), rs.getString("telefone"), rs.getString("telefone_comercial"), rs.getString("celular"), rs.getString("estado"), rs.getString("pais"), rs.getString("bairro"), rs.getString("complemento"), rs.getString("numero"), rs.getString("data_nascimento"), rs.getDouble("limite"));
        }
        pst.close();
        return cliente;
    }
    
    //Search By Nome Cliente DAO Method
    // Created By : "G"
    public Cliente buscaNome(String nome) throws SQLException{
        PreparedStatement pst;
        String sql;
        
        sql = "SELECT * FROM Cliente WHERE nome like ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, nome);
        Cliente cliente = null;
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            cliente = new Cliente(rs.getInt("id"),rs.getString("nome"),rs.getString("cpf"),rs.getString("cnpj"),rs.getString("rg"), rs.getString("rua"), rs.getString("cep"), rs.getString("cidade"), rs.getString("telefone"), rs.getString("telefone_comercial"), rs.getString("celular"), rs.getString("estado"), rs.getString("pais"), rs.getString("bairro"), rs.getString("complemento"), rs.getString("numero"), rs.getString("data_nascimento"), rs.getDouble("limite"));
         }
         pst.close();
         return cliente;
     }
    
    // Lista Clientes DAO Method 
    // Created By : "G"
    
    public List<Cliente> listaTodos() throws SQLException{
        PreparedStatement pst;
        String sql;
       List<Cliente> listaCli = new ArrayList<Cliente>();
       sql = "SELECT * FROM Cliente ORDER BY nome";
       pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
           listaCli.add(new Cliente(rs.getInt("id_cliente"),rs.getString("nome"),rs.getString("cpf"),rs.getString("cnpj"),rs.getString("rg"), rs.getString("rua"), rs.getString("cep"), rs.getString("cidade"), rs.getString("telefone"), rs.getString("telefone_comercial"), rs.getString("celular"), rs.getString("estado"), rs.getString("pais"), rs.getString("bairro"), rs.getString("complemento"), rs.getString("numero"), rs.getString("data_nascimento"), rs.getDouble("limite")));
        }
        pst.close();
        return listaCli;
    }
    
    // Busca Lista Clientes DAO Method
    // Created By : "G"
    public List<Cliente> buscaNomeLista(String Nome) throws SQLException{
        PreparedStatement pst;
        String sql;
        List<Cliente> listaCli = new ArrayList<Cliente>();
        int cont = 0;
        String name = "%"+Nome+"%";
        sql = "SELECT * FROM Cliente WHERE nome LIKE ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, name);
        pst.execute();
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
           listaCli.add(new Cliente(rs.getInt("id_cliente"),rs.getString("nome"),rs.getString("cpf"),rs.getString("cnpj"),rs.getString("rg"), rs.getString("rua"), rs.getString("cep"), rs.getString("cidade"), rs.getString("telefone"), rs.getString("telefone_comercial"), rs.getString("celular"), rs.getString("estado"), rs.getString("pais"), rs.getString("bairro"), rs.getString("complemento"), rs.getString("numero"), rs.getString("data_nascimento"), rs.getDouble("limite")));
        cont++;
        }
        
        if(cont == 0){
            return null;
        }
        
        pst.close();
        return listaCli;
    }
    
    public void excluir(Cliente cliente) throws SQLException{
        PreparedStatement pst;
        String sql;
        sql = "delete from Cliente where id_cliente = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, cliente.getId_cliente());
        pst.execute();
        pst.close();
    }
}
