/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import br.com.vinicius.objeto.Compra;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vinicius.132217
 */
public class SCompra {
    private List<Compra> compras = new ArrayList<>();

    public List<Compra> getCompras() {
        return compras;
    }
    
    
    
    private SCompra() {
    }
    
    public static SCompra getInstance() {
        return CompraHolder.INSTANCE;
    }
    
    private static class CompraHolder {

        private static final SCompra INSTANCE = new SCompra();
    }
}
