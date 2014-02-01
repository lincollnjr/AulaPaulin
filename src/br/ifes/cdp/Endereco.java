/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.cdp;

import java.io.Serializable;

/**
 *
 * @author 20121bsi0414
 */
public class Endereco implements Serializable{
    
    private String logradouro;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    
    @Override
   public String toString(){
       return "Logradouro: " +logradouro +"/n"
               +"Numero: " +numero +"/n"
               +"Bairro: " +bairro +"/n"
               +"Cidade: " +cidade +"/n"
               +"Estado: " +estado +"/n";
   } 

    /**
     * @return the logradouro
     */
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * @param logradouro the logradouro to set
     */
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
