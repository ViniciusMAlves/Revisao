/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vinicius;

import Singleton.SProduto;
import br.com.vinicius.objeto.Produto;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author vinicius.132217
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        int id = 1;
        String nome = "tv", descrcao = "passa filme", pessoa = "eu";
        float valor = 200;
        char status = 'A';
        Date dataValidade = null;
        Date fabricacao = null;
        dataValidade = sdf.parse("10/09/2000");
        fabricacao = sdf.parse("30/08/2018");

        SProduto.getInstance().getProdutos().add(new Produto(nome, descrcao, valor, dataValidade, fabricacao));
        SProduto.getInstance().getProdutos().get(SProduto.getInstance().getProdutos().size() - 1).setId(id);
        JOptionPane.showMessageDialog(null, SProduto.getInstance().produtoAtivos().get(SProduto.getInstance().produtoAtivos().size() - 1));

    }

}
