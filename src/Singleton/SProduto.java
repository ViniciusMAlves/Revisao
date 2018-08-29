/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import br.com.vinicius.objeto.Produto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vinicius.132217
 */
public class SProduto {

    private List<Produto> produtos = new ArrayList<>();

    public List<Produto> getProdutos() {
        return produtos;
    }

    private SProduto() {
    }

    public static SProduto getInstance() {
        return SProdutoHolder.INSTANCE;
    }

    private static class SProdutoHolder {

        private static final SProduto INSTANCE = new SProduto();
    }

    public Produto ultimoproduto() {
        return this.getProdutos().get(this.getProdutos().size() - 1);
    }

    public List<Produto> produtoAtivos() {

        List<Produto> pr = new ArrayList<>();
        for (Produto produto : produtos) {
            if (produto.getStatus() == 'A') {
                pr.add(produto);
            }
        }

        return pr;
    }

    public List<Produto> produtoInativo() {

        List<Produto> pr = new ArrayList<>();
        for (Produto produto : produtos) {
            if (produto.getStatus() == 'I') {
                pr.add(produto);
            }
        }

        return pr;
    }
}
