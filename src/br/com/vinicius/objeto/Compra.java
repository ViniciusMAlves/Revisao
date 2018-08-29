/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vinicius.objeto;

import Singleton.SProduto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vinicius.132217
 */
public class Compra {

    private int id;
    private Pessoa comprador;
    private List<Produto> produtos = new ArrayList<>();
    private float totalValo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pessoa getComprador() {
        return comprador;
    }

    public void setComprador(Pessoa comprador) {
        this.comprador = comprador;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public float getTotalValo() {
        return totalValo;
    }

    public void setTotalValo(float totalValo) {
        this.totalValo = totalValo;
    }

    public void AlteraStatus(Produto produto) {
        SProduto.getInstance().getProdutos().get(produto.getId()).setStatus('I');

    }

    public void incrementaTotaldaCompra(Produto produto) {

        this.totalValo += produto.getValor();

    }

    public void alterarProdutoCompra(Produto produto) {
        produtos.add(produto);
        AlteraStatus(produto);
        incrementaTotaldaCompra(produto);
    }

}
