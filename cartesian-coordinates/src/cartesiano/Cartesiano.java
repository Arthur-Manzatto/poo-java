/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cartesiano;

/**
 *
 * @author 0040482511005
 */
public class Cartesiano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Ponto p1 = new Ponto(10, 20);
       // p1.print(1);
        Ponto p2 = new Ponto(20,10);
        //p2.print(2);
        Ponto p3 = new Ponto(p2);
       //p3.print(3);
        
        p3.escale(2);
        //p3.print(3);;
           
        
        
       // System.out.println("A distancia do P2 para o P1 e: "+ p2.distance(p1.x, p1.y));
        
        Segmento seg1 = new Segmento(p1.x, p1.y, p2.x, p2.y);
        System.out.println(seg1.isValid());
        
        
        Segmento seg2 = new Segmento();
        System.out.println(seg2);
    }
    
}
