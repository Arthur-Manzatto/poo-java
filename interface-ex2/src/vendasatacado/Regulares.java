/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vendasatacado;

/**
 *
 * @author 0040482511005
 */
public class Regulares extends Clientes {
    
    private double valorMinimo;
    private double desconto;
    
    
    public Regulares(String nome, String tel, String date, double valorMinimo) {
        super(nome, tel, date);
        this.valorMinimo = valorMinimo;
        this.desconto = 0;
    }

    public double getValorMinimo() {
        return valorMinimo;
    }

    public void setValorMinimo(double valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    public double getDesconto() {
        return desconto;
    }

    
    

    @Override
    public void registrarCompra(double valor, String data) {
        
        if(valor > valorMinimo){
            super.setDataUltimaCompra(data);
            
        }
    
    }

    @Override
    public void atribuirDesconto(double porcent) {
      
       if(porcent < 20){
           desconto = porcent ;
       }else{
           System.out.println("PORCENTAGEM DE DESCONTO MAIOR QUE 20");
       }
   
    
    }


    @Override
    public void imprimirDados() {
    
        super.imprimirDados();
        System.out.println("Valor Minimo de Compra: " + getValorMinimo() + "\n" +
                "Desconto: " + getDesconto()+ "%\n");
    }
    
    public double aplicarDesconto(double valor){
        return valor * (100 - desconto) / 100;
    }
    
}
