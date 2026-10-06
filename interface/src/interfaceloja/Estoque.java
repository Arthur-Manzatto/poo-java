/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaceloja;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 0040482511005
 */
public class Estoque  {
    
    List<ItemEstoqueInt> lista = new ArrayList<>();
    
    public Estoque(){
       
    }
   
    public int add(ItemEstoqueInt item){
        
        lista.add(item);
        return lista.indexOf(item);
    }
    
    public boolean incUnits(int index, int qtd){
        
        if(index < lista.size() && index >= 0){
            lista.get(index).incUnits(qtd);
            return true;
        }
        return false;
       
        
    }
    
    public boolean decUnits(int index, int qtd){
        
        if(index < lista.size() && index >= 0){
            lista.get(index).decUnits(qtd);
            return true;
        }
        return false;
       
        
    }
    
    float total = 0;
    public void listAll(){
        for(ItemEstoqueInt i : lista){
            total += i.getPrice() * i.getUnits();
            
            i.print();
            
            System.out.println("Preco TOTAL: " + total);
            
        }
    }
    
    
}
