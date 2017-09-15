/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Leandro
 */
public class Funcionario {
    private int id_funcionario;
    private String nome;
    private String cpf;
    private String rg;
    private String nasc;
    private String telefone;      
    private String login;
    private String senha;
    private String funcao;      

    public Funcionario() {
    }

    public Funcionario(int id_funcionario, String nome, String cpf, String rg, String nasc, String telefone, String login, String senha, String funcao) {
        this.id_funcionario = id_funcionario;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.nasc = nasc;
        this.telefone = telefone;
        this.login = login;
        this.senha = senha;
        this.funcao = funcao;
    }

    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNasc() {
        return nasc;
    }

    public void setNasc(String nasc) {
        this.nasc = nasc;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    
}
