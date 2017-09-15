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
public class Cliente {
    private int id_cliente;
    private String nome;
    private String cpf;
    private String cnpj;
    private String rg;
    private String rua;
    private String cep;
    private String cidade;
    private String tel;
    private String telCom;
    private String cel;
    private String estado;
    private String pais;
    private String bairro;
    private String complemento;
    private String numero;
    private String nasc;
    private double limite;

    public Cliente() {
    }

    public Cliente(int id_cliente, String nome, String cpf, String cnpj, String rg, String rua, String cep, String cidade, String tel, String telCom, String cel, String estado, String pais, String bairro, String complemento, String numero, String nasc, double limite) {
        this.id_cliente = id_cliente;
        this.nome = nome;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.rg = rg;
        this.rua = rua;
        this.cep = cep;
        this.cidade = cidade;
        this.tel = tel;
        this.telCom = telCom;
        this.cel = cel;
        this.estado = estado;
        this.pais = pais;
        this.bairro = bairro;
        this.complemento = complemento;
        this.numero = numero;
        this.nasc = nasc;
        this.limite = limite;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTelCom() {
        return telCom;
    }

    public void setTelCom(String telCom) {
        this.telCom = telCom;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNasc() {
        return nasc;
    }

    public void setNasc(String nasc) {
        this.nasc = nasc;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    
}
