/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package vendasatacado;

/**
 *
 * @author 0040482511005
 */
public interface ClienteInt {
   void registrarCompra(double valor, String data);
   void atribuirDesconto(double porcent); //throws DescontoInvExc;
   void atribuirParcelas(int numParcelas); //throws ParcelamentoInvExc;
   void imprimirDados();

}
