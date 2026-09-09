/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faculdade;

/**
 *
 * @author Usuario
 */
public class Funcionario extends Pessoa{
    
    private String depto;
    private int qtdFaltas;
    
    public Funcionario(){
        
    }
    
    public Funcionario(String nome, String rg, int qtdFilhos, double salBase, String depto){
        super(nome, rg, qtdFilhos, salBase);
        this.depto = depto;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public int getQtdFaltas() {
        return qtdFaltas;
    }

    public void registraFalta(){
        this.qtdFaltas++;
    }
    
    @Override
    public void zerarMes(){
        this.qtdFaltas = 0;
    }
    
    public double desconto(){
        return (getSalBase() / 20) * getQtdFaltas();
    }
    @Override
    public double calcularSalario(){
        
        return getSalBase() + valeCoxinha() + auxilioProcriacao() - desconto();
        
    }
    
    public double valeCoxinha(){
        return 42;
    }
    
    @Override
    public void hollerith(){
        super.hollerith();
        System.out.println("Departamento: " + getDepto()+ "\n" +
                "Salario fixo: R$" + getSalBase()+ "\n" +
                "Vale Coxinha: +R$" + valeCoxinha()+ "\n" +
                "Faltas: " + getQtdFaltas() + "\n" +
                "Desconto: " + desconto() + "\n" +
                "SALARIO FINAL DO MES: R$" + calcularSalario() + "\n" );
    }
    
    
}
