/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecelagem;

/**
 *
 * @author 0040482511005
 */
public class Vendedor extends Funcionario {

    private double totalVenda;
    
    public Vendedor(){
        
    }
    
    public Vendedor(String nome, String rg, double salBase){
        super(nome, rg, salBase);
        this.totalVenda = 0;
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    
    public void registraVenda(double valor){
        this.totalVenda += valor;
    }
   
    public double comissao(){
        return totalVenda*0.03;
    }
    
    @Override
    public double salarioLiquido() {
      
        return getSalBase() + comissao();
    }

    @Override
    public void novoMes() {
      this.totalVenda = 0;
    }
    
    @Override
    public void hollerith(){
        super.hollerith();
        System.out.println(
                "Total em Vendas: R$" + this.totalVenda + "\n" +
                "Comissao: R$" + comissao() + "\n" +
                "Salario Liquido: R$" + salarioLiquido() + "\n");
    }
    
}
