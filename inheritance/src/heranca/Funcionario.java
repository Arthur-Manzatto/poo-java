/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author 0040482511005
 */
public class Funcionario extends Pessoa {
    
    protected double salarioHora;
    protected int horasTrab;
    
    public Funcionario(){
        super();
        salarioHora = 0;
        horasTrab = 0;
        
    }
    
    public Funcionario(String nome, String rg, double salarioHora, int horasTrab){
        
        super(nome, rg);
        
        if(salarioHora >= 0)
            this.salarioHora = salarioHora;
        
        if(horasTrab >= 0)
            this.horasTrab = horasTrab;
        
        
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getHorasTrab() {
        return horasTrab;
    }

    public void setHorasTrab(int horasTrab) {
        this.horasTrab = horasTrab;
    }
    
    
    
    public void adicionarHora(int horas){
        horasTrab += horas;
    }
    
    public double salarioLiquido(){
        
        return horasTrab * salarioHora;
    }
    
    
    public void print(){
        
        System.out.printf(String.format("O Funcionario: %s, de RG: %s, tem o salario/hora de R$%.2f, e trabalhou %d horas;\n"
                + "Logo seu salario liquido e de: R$%.2f\n", nome, rg, salarioHora, horasTrab, salarioLiquido()));
        
    }
}
