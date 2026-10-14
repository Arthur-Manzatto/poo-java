/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vendasatacado;

/**
 *
 * @author 0040482511005
 */
public class Eventuais extends Clientes{
    
    private double lastPurchase;
    
    public Eventuais(String nome, String tel, String date, double lastPurchase) {
        super(nome, tel, date);
        this.lastPurchase = lastPurchase;
    }

    public void registrarCompra(double valor, String data) {
        
        super.setDataUltimaCompra(data);
        this.lastPurchase = valor;
    
    }


    @Override
    public void imprimirDados() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
