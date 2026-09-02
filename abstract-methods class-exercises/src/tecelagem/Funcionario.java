/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecelagem;

/**
 *
 * @author 0040482511005
 */
public abstract class Funcionario {
    
    protected String nome;
    protected String rg;
    protected double salBase;
    
    public Funcionario (){
        
    }
    
    public Funcionario(String nome, String rg, double salBase){
        this.nome = nome;
        this.rg = rg;
        this.salBase = salBase;
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

    public double getSalBase() {
        return salBase;
    }

    public void setSalBase(double salBase) {
        this.salBase = salBase;
    }
    
    
    public abstract double salarioLiquido();
    
    public abstract void novoMes();
    
    public abstract void hollerith();
        
    
    
 
    
    
}
