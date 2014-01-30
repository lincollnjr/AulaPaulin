/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.cih;

import br.ifes.cdp.Usuario;
import java.util.ArrayList;

/**
 *
 * @author 20121bsi0414
 */
public class View {
    
    public void imprimirMenu(){
        System.out.println("         Menu        ");
        System.out.println(" 1 - Cadastrar amigos");
        System.out.println(" 2 - Listar os amigos");
        System.out.println(" 3 - Remover amigo");
        System.out.println(" 4 - Pesquisar amigo");
    }
    
    public void imprimirAmigos(ArrayList<Usuario> listUsuarios){
        int contador;
        for(contador = 0; contador < listUsuarios.size(); contador++){
            
            
        }
    }
    
}
