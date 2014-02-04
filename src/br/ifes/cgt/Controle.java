/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.cgt;

import br.ifes.cdp.Usuario;
import java.util.ArrayList;

/**
 *
 * @author 20121bsi0414
 */
public class Controle {
    
    public Usuario procuraAmigo(ArrayList<Usuario> listUsuarios, String nome) throws Exception{
        
        for(int contador = 0; contador < listUsuarios.size(); contador++){
            if(listUsuarios.get(contador).getNome().equals(nome)){
                return listUsuarios.get(contador);
            }
        }
        throw new Exception();
    }
    
    public void removeAmigo(ArrayList<Usuario> listUsuarios, Usuario usuario){
        listUsuarios.remove(usuario);
    }
}      
