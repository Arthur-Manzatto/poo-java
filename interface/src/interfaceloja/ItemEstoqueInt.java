/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaceloja;

/**
 *
 * @author 0040482511005
 */
public interface ItemEstoqueInt {
    void incUnits(int qtd);

    boolean decUnits(int qtd);

    int getUnits();

    double getPrice();

    void print();
    
}
