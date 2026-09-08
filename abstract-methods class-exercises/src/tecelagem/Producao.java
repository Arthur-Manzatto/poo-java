package tecelagem;

public class Producao extends Funcionario{
    
    private int horasTrabDia;
    private int horasTrabNoite;
    private int horasTrabTotais;
    
    public Producao(){
        
    }
    
    public Producao(String nome, String rg, double salBaseHr){
        
        super(nome, rg, salBaseHr);
        this.horasTrabDia = 0;
        this.horasTrabNoite = 0;
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
        
        return (getSalBase() * horasTrabDia) + ((getSalBase() * horasTrabNoite) * 1.30) ;
        
    }
    
    @Override
    public void hollerith(){
        super.hollerith();
        System.out.println(
                "Horas Diurnas: " + this.horasTrabDia + "h\n" +
                "Horas Noturnas (+30%): " + this.horasTrabNoite + "h\n" +
                "Horas Trabalhadas Totais: " + this.horasTrabTotais + "h\n" +
                "Salario Liquido: R$" + salarioLiquido() + "\n");
    }
    
}
