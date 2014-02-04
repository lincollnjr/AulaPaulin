/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.cci;

import br.ifes.cdp.Endereco;
import br.ifes.cdp.Usuario;
import br.ifes.cgd.Dados;
import br.ifes.cgt.Controle;
import br.ifes.cih.View;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 20121bsi0414
 */
public class ControleGeral {
    
    private final View impressora = new View();
    private Usuario usuario;
    private final Dados dados = new Dados();
    private final Controle controle = new Controle();
    public void run() throws ClassNotFoundException{

        usuario = dados.loadUsuario();        
        impressora.imprimirMenu();
        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerStr = new Scanner(System.in);
        int opcao = scannerInt.nextInt();
        while(true){
            
            switch(opcao){
                case(0):{
                    if(usuario == null){
                        usuario = cadastraUsuario();
                    }
                    break;
                }
                case(1):{
                    if(usuario!=null){
                        usuario.adicionarAmigo(cadastraUsuario());
                    }
                    break;
                }
                case(2):{
                    impressora.imprimirListaAmigos(usuario.listarAmigos());
                    break;
                }
                
                case(3):{
                    int contador;
                    impressora.imprimirDeleteUsuario();
                    String nome = scannerStr.nextLine();
                    try{
                        Usuario usuarioExcluir = controle.procuraAmigo(usuario.listarAmigos(), nome);
                        controle.removeAmigo(usuario.listarAmigos(),usuarioExcluir);
                        impressora.imprimirAmigoRemovido();
                    }catch(Exception e){
                        impressora.imprimirAmigoNaoEncontrado();
                    }
                    break;
                }
                case(4):{
                    int contador;
                    impressora.imprimirPesquisarUsuario();
                    String nome = scannerStr.nextLine();
                    try{
                        Usuario usuarioImprimir = controle.procuraAmigo(usuario.listarAmigos(), nome);
                        impressora.imprimirAmigo(usuarioImprimir);
                    }catch(Exception e){
                        impressora.imprimirAmigoNaoEncontrado();
                    }
                    break;
                }
                case(5):{
                    dados.saveUsuario(usuario);  
                    System.exit(0);
                }            
            }
            impressora.imprimirMenu();
            opcao = scannerInt.nextInt();
        }       
    }
    
    public Usuario cadastraUsuario(){
        Usuario newUser = new Usuario();
        Endereco newEnd = new Endereco();
        Scanner scanner = new Scanner(System.in);
        impressora.imprimirCadastroNome();
        newUser.setNome(scanner.nextLine());
        
        impressora.imprimirCadastroIdade();
        newUser.setIdade(scanner.nextLine());
        
        impressora.imprimirCadastroTelefone();
        newUser.setTelefone(scanner.nextLine());
        
        impressora.imprimirCadastroLogradouro();
        newEnd.setLogradouro(scanner.nextLine());
        
        impressora.imprimirCadastroNumero();
        newEnd.setNumero(scanner.nextLine());
        
        impressora.imprimirCadastroBairro();
        newEnd.setBairro(scanner.nextLine());
        
        impressora.imprimirCadastroCidade();
        newEnd.setCidade(scanner.nextLine());
         
        impressora.imprimirCadastroEstado();
        newEnd.setEstado(scanner.nextLine());
        
        newUser.setEndereco(newEnd);
        return newUser;

    }
    
    
}
