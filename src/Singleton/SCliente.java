/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import br.com.vinicius.objeto.Pessoa;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author vinicius.132217
 */
public class SCliente {
    
     private  List<Pessoa> clientes = new ArrayList<>();

    public List<Pessoa> getCliente() {
        return clientes;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cliente=" + clientes + '}';
    }
     
     

    
    
    private SCliente() {
          
        
    }
    
    
    
    
    public static SCliente getInstance() {
        return SClienteHolder.INSTANCE;
    }
    
    private static class SClienteHolder {

        private static final SCliente INSTANCE = new SCliente();
    }
}
