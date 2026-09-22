package tecelagem;

public class Administracao extends Funcionario {

    private int qtdFaltas;
    
    public Administracao(){
        
    }
    //faltas não vai pro construtor pq é um Atributo de Estado, que muda durante o código
    //E o SET também não pode
    public Administracao(String nome, String rg, double salBase) {
        super(nome, rg, salBase);
        qtdFaltas = 0;
    }

    public int getQtdFaltas() {
        return qtdFaltas;
    }
    
    
    public void registrarFalta(){
        qtdFaltas++;
    }
    
    @Override
    public void novoMes(){
        this.qtdFaltas = 0;
    }
    
    public double desconto(){
        return this.qtdFaltas * (getSalBase() / 30);
    }
    
    @Override
    public double salarioLiquido(){
        
        
        return getSalBase() - desconto();
        
    }
    
    @Override
    public void hollerith(){
        super.hollerith();
        System.out.println(
                "Quantidade de faltas: " + this.qtdFaltas + "\n" +
                "Desconto: -R$" + desconto() + "\n" +
                "Salario Liquido: R$" + salarioLiquido() + "\n");
    }
}
