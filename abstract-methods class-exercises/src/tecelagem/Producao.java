package tecelagem;

public class Producao extends Funcionario{
    
    protected int horasTrabDia;
    protected int horasTrabNoite;
    protected int horasTrabTotais;
    
    public Producao(){
        
    }
    
    public Producao(String nome, String rg, double salBaseHr, int horasTrabDia, int horasTrabNoite){
        
        super(nome, rg, salBaseHr);
        this.horasTrabDia = horasTrabDia;
        this.horasTrabNoite = horasTrabNoite;
        this.horasTrabTotais = horasTrabDia + horasTrabNoite;
    }

    public int getHorasTrabDia() {
        return horasTrabDia;
    }

    public void setHorasTrabDia(int horasTrabDia) {
        this.horasTrabDia = horasTrabDia;
    }

    public int getHorasTrabNoite() {
        return horasTrabNoite;
    }

    public void setHorasTrabNoite(int horasTrabNoite) {
        this.horasTrabNoite = horasTrabNoite;
    }

    public int getHorasTrabTotais() {
        return horasTrabTotais;
    }

    public void setHorasTrabTotais(int horasTrabTotais) {
        this.horasTrabTotais = horasTrabTotais;
    }
    
    
    
    
    public void registratHorasDiurnas(int h){
        this.horasTrabDia+= h;
    }
    
    public void registratHorasNoturnas(int h){
        this.horasTrabNoite+= h;
    }
    
    @Override
    public void novoMes(){
        this.horasTrabNoite = 0;
        this.horasTrabDia = 0;
        this.horasTrabTotais = 0;
        
    }
    
    @Override
    public double salarioLiquido(){
        horasTrabTotais = horasTrabDia + horasTrabNoite;
        
        return (this.salBase * horasTrabDia) + ((this.salBase * horasTrabNoite) * 1.30) ;
        
    }
    
    @Override
    public void hollerith(){
        System.out.println("Nome: " + this.nome + "\n" +
                "RG: " + this.rg + "\n" +
                "Salario Base: R$" + this.salBase + "\n" +
                "Horas Diurnas: " + this.horasTrabDia + "\n" +
                "Horas Noturnas (+30%): " + this.horasTrabNoite + "\n" +
                "Horas Trabalhadas Totais: " + this.horasTrabTotais + "\n" +
                "Salario Liquido: R$" + salarioLiquido() + "\n");
    }
    
}
