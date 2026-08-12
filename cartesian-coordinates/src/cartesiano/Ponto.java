/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cartesiano;

/**
 *
 * @author 0040482511005
 */
public class Ponto {
    
    protected double x;
    protected double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
       
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    
    public Ponto(){
        
    }
    
    public Ponto(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public Ponto(Ponto pn){
        this.x = pn.x;
        this.y = pn.y;
    }
    
    
    public void setXY(double newX, double newY){
        x = newX;
        y = newY;
    }
    
    public void assign(Ponto pn){
        
        x = pn.x;
        y = pn.x;
        
    }
    
    public double deltaX(double vX){
        return vX - x;
    }
    
    public double deltaY(double vY){
        return vY - y;
    }
    
    public double distance(double posX, double posY){
        double dx = deltaX(posX);
        double dy = deltaY(posY);
        
        return Math.sqrt(dx*dx + dy*dy);
                
    }
    
    public void desloc(double dX, double dY){
        x += dX;
        y += dY;
    }
    
    public void escale(double factor){
        x *= factor;
        y *= factor;
    }
   
    
}
