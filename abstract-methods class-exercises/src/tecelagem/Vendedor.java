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

    protected double totalVenda;
    protected double comissao;
    
    public Vendedor(){
        
    }
    
    public Vendedor(String nome, String rg, double salBase, double totalVenda){
        super(nome, rg, salBase);
        this.totalVenda = totalVenda;
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    
    
    
    public void registraVenda(double valor){
        this.totalVenda += valor;
    }
   
    
    @Override
    public double salarioLiquido() {
      
        comissao = totalVenda * 3/100;
        return this.salBase + comissao;
    }

    @Override
    public void novoMes() {
      this.totalVenda = 0;
    }
    
    @Override
    public void hollerith(){
        System.out.println("Nome: " + this.nome + "\n" +
                "RG: " + this.rg + "\n" +
                "Salario Base: R$" + this.salBase + "\n" +
                "Total em Vendas: R$" + this.totalVenda + "\n" +
                "Comissao: R$" + comissao + "\n" +
                "Salario Liquido: R$" + salarioLiquido() + "\n");
    }
    
}
