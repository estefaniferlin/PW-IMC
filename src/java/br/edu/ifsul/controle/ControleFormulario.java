/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.controle;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author 20202PF.CC0011
 */

@Named(value = "controleFormulario")
@SessionScoped
public class ControleFormulario implements Serializable{
    
    private Double peso;
    private Double altura;
    
    public ControleFormulario(){
        
    }
    
    public String irFormulario(){
        return "formulario?faces-redirect=true";
    }

    public String exibirDados(){
        return "dados?faces-redirect=true";
    }
    
    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    
    
    
    
}
