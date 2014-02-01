/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.cgd;
import br.ifes.cdp.Usuario;
import java.io.*;
/**
 *
 * @author 20121bsi0414
 */
public class Dados {
    
    public void saveUsuario(Usuario usuario){
    
        try{
        
            FileOutputStream arquivoGrav = new FileOutputStream("C://saida.dat");

            ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);

            objGravar.writeObject(usuario);
            objGravar.close();
            arquivoGrav.close(); 
        
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public Usuario loadUsuario(){
        
        try{            
            FileInputStream arquivoLeitura = new FileInputStream("C://saida.dat");
            ObjectInputStream objLeitura = new ObjectInputStream(arquivoLeitura);
            Usuario usuarioReturn = (Usuario) objLeitura.readObject();
            arquivoLeitura.close();
            objLeitura.close();
            return usuarioReturn;
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;        
    }
    
}
