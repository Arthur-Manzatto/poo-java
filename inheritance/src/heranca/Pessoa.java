/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author 0040482511005
 */
public class Pessoa {
    
    protected String nome;
    protected String rg;
    
    public Pessoa(){
        
    }
    
    public Pessoa(String nome, String rg){
        
        this.nome = nome;
        this.rg = rg;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
}
