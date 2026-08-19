/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cartesiano;

/**
 *
 * @author 0040482511005
 */
public class Segmento {
    
    protected Ponto p1, p2;
    
    public Segmento(){
        
        p1 = new Ponto(0,0);
        p2 = new Ponto(0,1);
    }
    
    public Segmento(double p1x, double p1y, double p2x, double p2y){
        
        p1 = new Ponto(p1x,p1y);
        p2 = new Ponto(p2x,p2y);
        
    }
    
    public Segmento(Segmento s1){
        
        this.p1 = s1.p1;
        this.p2 = s1.p2;
        
    }

    public Ponto getP1() {
        return p1;
    }

    public void setP1(Ponto p1) {
        this.p1 = p1;
    }

    public Ponto getP2() {
        return p2;
    }

    public void setP2(Ponto p2) {
        this.p2 = p2;
    }
    
    
    
    public void assign(Segmento sg){
        
        p1.x = sg.p1.x;
        p1.y = sg.p1.y;
        p2.x = sg.p2.x;
        p2.y = sg.p2.y;
        
    }
    
    public void desloc(double x, double y){
        
        p1.desloc(x,y);
        p2.desloc(x,y);
    } 
    
    public void escale(double factor){
        
        p1.escale(factor);
        p2.escale(factor);
    }
    
    public String toString(){
        
        return "[ p1(" + p1.x + " , " + p1.y + ") , p2(" + p2.x + " , " + p2.y + ") ]";
        
    }
    
    public double length(){
    
        return p1.distance(p2.x, p2.y);
        
    }
    
    public boolean isValid(){
        
        if(p1 == null || p2 == null){
            return false;
            
        }else{
            if(p1.x == p2.x && p1.y == p2.y){
                return false;
            }
            
            return true;
        }
        
    }
    
    public Ponto midPoint(){
        
        double newX = (p1.x + p2.x) / 2; 
        double newY = (p1.y + p2.y) / 2; 
        
        Ponto pm = new Ponto(newX,newY);
        
        return pm;
    }
    
}
