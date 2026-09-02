package tecelagem;

public class Administracao extends Funcionario {

    protected int qtdFaltas;
    
    public Administracao(){
        
    }
    
    public Administracao(String nome, String rg, double salBase, int faltas) {
        super(nome, rg, salBase);
        this.qtdFaltas = faltas;
    }

    public int getQtdFaltas() {
        return qtdFaltas;
    }

    public void setQtdFaltas(int qtdFaltas) {
        this.qtdFaltas = qtdFaltas;
    }
    
    
    
    public void registrarFalta(){
        qtdFaltas++;
    }
    
    @Override
    public void novoMes(){
        this.qtdFaltas = 0;
    }
    
    double desconto = 0;
    @Override
    public double salarioLiquido(){
        
        desconto = this.qtdFaltas * (this.salBase / 30);
        
        return this.salBase - desconto;
        
    }
    
    @Override
    public void hollerith(){
        System.out.println("Nome: " + this.nome + "\n" +
                "RG: " + this.rg + "\n" +
                "Salario Base: R$" + this.salBase + "\n" +
                "Quantidade de faltas: " + this.qtdFaltas + "\n" +
                "Desconto: -R$" + desconto + "\n" +
                "Salario Liquido: R$" + salarioLiquido() + "\n");
    }
}
