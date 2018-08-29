/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vinicius.objeto;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author vinicius.132217
 */
public class Pessoa {

    private String nome, rg, cpf;
    private int id, idade;
    private Date datanascimento;

    public Pessoa(String nome, String rg, String cpf, Date datanascimento) {

        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.datanascimento = datanascimento;
        this.idade = Idade(datanascimento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Date getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }

    public static int Idade(java.util.Date datanascimento) {

        Calendar dateOfBirth = new GregorianCalendar();

        dateOfBirth.setTime(datanascimento);

        Calendar today = Calendar.getInstance();

        int anos = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);

        dateOfBirth.add(Calendar.YEAR, anos);

        if (today.before(dateOfBirth)) {

            anos--;

        }

        return anos;

    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + "\n rg=" + rg + "\n cpf=" + cpf + "\n id=" + id + "\n idade=" + idade + "\n datanascimento=" + datanascimento + '}';
    }

}
