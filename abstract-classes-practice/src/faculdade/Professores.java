/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faculdade;

/**
 *
 * @author Usuario
 */
public class Professores extends Pessoa{
    
    private String curso;
    private int horaAula;
    
    
    public Professores(){
        
    }
    
    public Professores(String nome, String rg, int qtdFilhos, String curso, int salBase){
        super(nome, rg, qtdFilhos, salBase);
        this.curso = curso;
        
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getHoraAula() {
        return horaAula;
    }

    
    
    public void registraAulas(int qtd){
        horaAula += qtd;
    }
    
    @Override
    public double calcularSalario(){
        return getSalBase() * getHoraAula() + auxilioProcriacao();
    }
    
    @Override
    public void zerarMes(){
        horaAula = 0;
    }
    
    @Override
    public void hollerith(){
        super.hollerith();
        System.out.println("Curso que leciona: " + getCurso()+ "\n" +
                "Horas aula dadas: " + getHoraAula() + "h\n" +
                "Salario por hora: R$" + getSalBase()+ "\n" +
                "SALARIO FINAL DO MES: R$" + calcularSalario() + "\n" );
    }
    
}
