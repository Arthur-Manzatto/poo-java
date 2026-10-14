/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vendasatacado;

/**
 *
 * @author 0040482511005
 */
public abstract class Clientes implements ClienteInt{
    
    private String nome, telefone, dataUltimaCompra;
    
    public Clientes(String nome, String tel, String date){
        this.nome = nome;
        telefone = tel;
        dataUltimaCompra = date;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataUltimaCompra() {
        return dataUltimaCompra;
    }

    public void setDataUltimaCompra(String dataUltimaCompra) {
        this.dataUltimaCompra = dataUltimaCompra;
    }
    
    
    @Override
    public void imprimirDados(){
        System.out.println("Cliente: " + getNome() + "\n" +
                "Telefone: " + getTelefone()+ "\n" +
                "Ultima Compra: " + getDataUltimaCompra()+ "\n");
    }
    
    
   @Override
    public void atribuirDesconto(double porcent) {
        
        System.out.println("O CLIENTE NAO PODE RECEBER DESCONTO!!!");
    
    }

    @Override
    public void atribuirParcelas(int numParcelas) {
     
        System.out.println("O CLIENTE NAO PODE parcelarO!!!");
    
    }
    
    
    
    
}
    
    
    
