/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecelagem;

public class Equipe {
    
    private Funcionario[] equipe;
    private int contador;
    
    public Equipe(int c){
        contador = 0;
        equipe = new Funcionario[c];
        
    }

    public Funcionario[] getEquipe() {
        return equipe;
    }

    public int getContador() {
        return contador;
    }

   
    public boolean add(Funcionario f){
        
        if(contador < equipe.length){
           equipe[contador] = f;
           contador++; 
           return f instanceof Funcionario; 
        }else{
            System.out.println("ARRAY LOTADO");
            return false;
        }
        
        
        
    }
    
    public void relatorioAdministracao(){
        for(Funcionario i : equipe){
            if(i instanceof Administracao){
                System.out.println("FUNCIONARIOS ADMINISTRATIVOS: \n");
                i.hollerith();
                System.out.println("\n======================================\n");
            }
        }
    }
    
    public void relatorioVendas(){
        for(Funcionario i : equipe){
            if(i instanceof Vendedor){
                System.out.println("VENDEDORES:\n");
                i.hollerith();
                System.out.println("\n======================================\n");
            }
        }
    }
    
    public void relatorioProducao(){
        for(Funcionario i : equipe){
            if(i instanceof Producao){
                System.out.println("FUNCIONARIOS PRODUCAO:\n");
                i.hollerith();
                System.out.println("\n======================================\n");
            }
        }
    }
    
    
    
    
    
    
    
}
