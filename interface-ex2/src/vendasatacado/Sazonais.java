/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vendasatacado;

/**
 *
 * @author 0040482511005
 */
public class Sazonais extends Clientes {
    
    private String mes;
    private double valorMinimo;
    private int parcelas;
    
    public Sazonais(String nome, String tel, String date, String mes, double valorMinimo) {
        super(nome, tel, date);
        this.mes = mes;
        this.valorMinimo = valorMinimo;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public double getValorMinimo() {
        return valorMinimo;
    }

    public void setValorMinimo(double valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    public int getParcelas() {
        return parcelas;
    }

    
    

    @Override
    public void registrarCompra(double valor, String data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  

    @Override
    public void atribuirParcelas(int numParcelas) {
        
        if(parcelas < 6){
           parcelas = numParcelas;
        }else{
            System.out.println("PARCELA MAIOR QUE 6 NAO SUPORTADA");
        }
        
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Mes de Compra: " + getMes()+ "%\n" + 
                "Valor Minimo de Compra: " + getValorMinimo() + "\n" +
                "Parcelas: " + getParcelas()+ "%\n");
    }
    
    public double calcularParcela(double valor){
        return valor / parcelas;
    }
    
}
