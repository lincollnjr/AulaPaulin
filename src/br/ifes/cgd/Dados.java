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
public class Dados<T extends Serializable> {

    public void saveUsuario(T objeto) {

        try {
            /*Tenta salvar os dados do usuario*/
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("saida.dat"));           
            out.writeObject(objeto);
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public T loadUsuario() throws ClassNotFoundException {

        try {
            File testeArquivo = new File("saida.dat");
            if (testeArquivo.exists()) {
                /*Se o arquivo existir ele faz o load*/
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("saida.dat"));
                T usuarioReturn = (T) in.readObject();
                in.close();
                return (T) usuarioReturn;
            } 
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
