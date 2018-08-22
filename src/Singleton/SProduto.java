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
        return this.getProdutos().get(this.getProdutos().size()-1);
    }
    
    public List<Produto> produtoAtivos() {
        for (int i = 0; i < this.getProdutos().size(); i++) {
            
            if (this.getProdutos().get(i).getStatus() == 'A') {
              produtoAtivos().add(this.getProdutos().get(i));
            }
        }
        
        
        return null;
    }
    
    public List<Produto> produtoInativo() {
        for (int i = 0; i < this.getProdutos().size(); i++) {
            if (this.getProdutos().get(i).getStatus() == 'I') {
                produtoInativo().add(this.getProdutos().get(i));
            }
  
        }
        
        return null;
    }
}
