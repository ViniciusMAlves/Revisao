/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vinicius.objeto;

import java.util.Date;

/**
 *
 * @author vinicius.132217
 */
public class Produto {
    private int id;
    private String nome, descrcao;
    private float valor;
    private char status;
    private Date dataValidade, fabricacao;

    public Produto( String nome, String descrcao, float valor,  Date dataValidade, Date fabricacao) {
        
        this.nome = nome;
        this.descrcao = descrcao;
        this.valor = valor;
        this.status = 'A';
        this.dataValidade = dataValidade;
        this.fabricacao = fabricacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrcao() {
        return descrcao;
    }

    public void setDescrcao(String descrcao) {
        this.descrcao = descrcao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Date getFabricacao() {
        return fabricacao;
    }

    public void setFabricacao(Date fabricacao) {
        this.fabricacao = fabricacao;
    }

    @Override
    public String toString() {
        return "Produto\n" + "id=" + id + "\n nome=" + nome + "\n descrcao=" + descrcao + "\n valor=" + valor + "\n status=" + status +"\n fabricacao=" + fabricacao + "\n dataValidade=" + dataValidade   ;
    }
    
    
}
