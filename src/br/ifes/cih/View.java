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
        System.out.println("          Menu");
        System.out.println(" 0 - Cadastrar usuario");
        System.out.println(" 1 - Cadastrar amigos");
        System.out.println(" 2 - Listar os amigos");
        System.out.println(" 3 - Remover amigo");
        System.out.println(" 4 - Pesquisar amigo");
        System.out.println(" 5 - Sair");
    }
    
    public void imprimirAmigo(Usuario usuario){
        System.out.println(usuario);
    }
    
    
    public void imprimirListaAmigos(ArrayList<Usuario> listUsuarios){
        int contador;
        for(contador = 0; contador < listUsuarios.size(); contador++){
            System.out.println(listUsuarios.get(contador));
        }
    }
    
    public void imprimirCadastroNome(){
        System.out.println("O nome do usuario: ");
    }
    
    public void imprimirCadastroIdade(){
        System.out.println("A idade do usuario: ");
    }
    
    public void imprimirCadastroTelefone(){
        System.out.println("O telefone do usuario: ");
    }
    
    public void imprimirCadastroLogradouro(){
        System.out.println("O logradouro do endereco do usuario: ");
    }
    
    public void imprimirCadastroNumero(){
        System.out.println("O número do endereco do usuario: ");
    }
    
    public void imprimirCadastroBairro(){
        System.out.println("O bairro do endereco do usuario: ");
    }
    
    public void imprimirCadastroCidade(){
        System.out.println("A cidade do endereco do usuario: ");
    }
    public void imprimirCadastroEstado(){
        System.out.println("O Estado do endereco do usuario: ");
    }
    
    public void imprimirDeleteUsuario(){
        System.out.println("O nome do usuario a ser removido: ");
    }
    
    public void imprimirPesquisarUsuario(){
        System.out.println("O nome do usuario a ser pesquisado: ");
    }
    
    public void imprimirAmigoRemovido(){
        System.out.println("Amigo removido.");
    }    
        
    public void imprimirAmigoNaoEncontrado(){
        System.out.println("Amigo nao encontrado.");
    }
    
    public void imprimirSalveSucess(){
        System.out.println("Arquivo salvo com sucesso.");
    }
}
