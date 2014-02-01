/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.cdp;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author 20121bsi0414
 */
public class Usuario implements Serializable {
    
    private String nome;
    private String idade;
    private String telefone;
    private ArrayList<Usuario> conhece;
    private Endereco endereco;
    
    public void adicionarEnd(Endereco end){
        endereco.setNumero(end.getNumero());
        endereco.setBairro(end.getBairro());
        endereco.setCidade(end.getCidade());
        endereco.setEstado(end.getEstado());
        endereco.setLogradouro(end.getLogradouro());
    }
    
    public void adicionarAmigo(Usuario user){
        conhece.add(user);
    }
    
    
    @Override
    public String toString(){
        return "Nome: " +nome +"/n"
                +"Idade: " +idade +"/n"   
                +"Telefone: " +telefone +"/n"
                +"Endereco: /n" +endereco.toString();   
    }           

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public String getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(String idade) {
        this.idade = idade;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

   

    /**
     * @return the endereco
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the conhece
     */
    public ArrayList<Usuario> listarAmigos() {
        return conhece;
    }

    /**
     * @param conhece the conhece to set
     */
    public void setConhece(ArrayList<Usuario> conhece) {
        this.conhece = conhece;
    }
            
}
