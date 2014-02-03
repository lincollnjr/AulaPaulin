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

            FileOutputStream arquivoGrav = new FileOutputStream("C:\\saida.dat");
            ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);

            objGravar.writeObject(usuario);
            objGravar.close();
            arquivoGrav.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Usuario loadUsuario() throws ClassNotFoundException {

        try {
            File testeArquivo = new File("C:\\saida.dat");
            if (testeArquivo.exists()) {
                FileInputStream arquivoLeitura = new FileInputStream("C:\\saida.dat");
                ObjectInputStream objLeitura = new ObjectInputStream(arquivoLeitura);
                Usuario usuarioReturn = (Usuario) objLeitura.readObject();
                arquivoLeitura.close();
                objLeitura.close();
                return usuarioReturn;
            } else {
                BufferedWriter out = new BufferedWriter(new FileWriter("C:\\saida.dat"));
                out.write("");
                out.close();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
