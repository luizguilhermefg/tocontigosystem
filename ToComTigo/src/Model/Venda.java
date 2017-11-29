/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Geder
 */
public class Venda {
    private int codigoVenda;
    private Cliente cliente;
    private Funcionario vendedor;
    private List<ItensVenda> itensVenda;
    private float totalVenda;
    
    // Ctor Void
    public Venda(){
        this.itensVenda = new ArrayList<>();
    }
    
    public Venda(int idVenda, Cliente cliente, Funcionario vendedor, List<ItensVenda> itensVenda, float totalVenda ){
        this.codigoVenda = idVenda;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.totalVenda = totalVenda;
        
    }

    /**
     * @return the codigoVenda
     */
    public int getCodigoVenda() {
        return codigoVenda;
    }

    /**
     * @param codigoVenda the codigoVenda to set
     */
    public void setCodigoVenda(int codigoVenda) {
        this.codigoVenda = codigoVenda;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the vendedor
     */
    public Funcionario getVendedor() {
        return vendedor;
    }

    /**
     * @param vendedor the vendedor to set
     */
    public void setVendedor(Funcionario vendedor) {
        this.vendedor = vendedor;
    }

    /**
     * @return the itensVenda
     */
    public List<ItensVenda> getItensVenda() {
        return itensVenda;
    }

    /**
     * @param itensVenda the itensVenda to set
     */
    public void setItensVenda(List<ItensVenda> itensVenda) {
        this.itensVenda = itensVenda;
    }

    /**
     * @return the totalVenda
     */
    public float getTotalVenda() {
        return totalVenda;
    }

    /**
     * @param totalVenda the totalVenda to set
     */
    public void setTotalVenda(float totalVenda) {
        this.totalVenda = totalVenda;
    }


}
