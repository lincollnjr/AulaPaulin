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

    public void saveUsuario(Usuario usuario) {

        try {
            /*Tenta salvar os dados do usuario*/
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("saida.dat"));           
            out.writeObject(usuario);
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Usuario loadUsuario() throws ClassNotFoundException {

        try {
            File testeArquivo = new File("saida.dat");
            if (testeArquivo.exists()) {
                /*Se o arquivo existir ele faz o load*/
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("saida.dat"));
                Usuario usuarioReturn = (Usuario) in.readObject();
                in.close();
                return (Usuario) usuarioReturn;
            } 
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
