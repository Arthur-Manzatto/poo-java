/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faculdade;

/**
 *
 * @author Usuario
 */
public abstract class Pessoa {
    
    private String nome, rg;
    private int qtdFilhos;
    private double salBase;
    
    public Pessoa(){
        
    }
    
    public Pessoa(String nome, String rg, int qtdFilhos, double salBase){
        
        this.nome = nome;
        this.rg = rg;
        this.qtdFilhos = qtdFilhos;
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

    public int getQtdFilhos() {
        return qtdFilhos;
    }

    public void setQtdFilhos(int qtdFilhos) {
        this.qtdFilhos = qtdFilhos;
    }

    public double getSalBase() {
        return salBase;
    }

    public void setSalBase(double salBase) {
        this.salBase = salBase;
    }
    
    
    
    public double auxilioProcriacao(){
        return getQtdFilhos() * 100;
    }
    
    public abstract double calcularSalario();
    
    public abstract void zerarMes();
    
    public void hollerith(){
        System.out.println("Nome: " + getNome() + "\n" +
                "RG: " + getRg() + "\n" +
                "Qtd de Filhos: " + getQtdFilhos()+ "\n" +
                "Auxilio Procricacao: " + auxilioProcriacao());
    }
    
    
}
