/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author Leandro
 */
public class ProdutoM {
  private int id_produto;
  private String nome;
  private String marca;
  private String grupo;
  private int unidade;
  private double kilo;
  private int quantidade;

    public ProdutoM() {
    }

    public ProdutoM(int id_produto, String nome, String marca, String grupo, int unidade, double kilo, int quantidade) {
        this.id_produto = id_produto;
        this.nome = nome;
        this.marca = marca;
        this.grupo = grupo;
        this.unidade = unidade;
        this.kilo = kilo;
        this.quantidade = quantidade;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public int getUnidade() {
        return unidade;
    }

    public void setUnidade(int unidade) {
        this.unidade = unidade;
    }

    public double getKilo() {
        return kilo;
    }

    public void setKilo(double kilo) {
        this.kilo = kilo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
  
  
}

