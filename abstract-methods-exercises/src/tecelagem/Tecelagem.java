package tecelagem;

public class Tecelagem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Administracao adm = new Administracao("Ze", "123123123", 10000);
        adm.registrarFalta();
        adm.hollerith();
        
        Producao prod = new Producao("Cleber", "98989898", 50);
        prod.registratHorasDiurnas(100);
        prod.registratHorasNoturnas(100);
        prod.hollerith();
        
        Vendedor ven = new Vendedor("Fabiana", "45454545", 1500);
        ven.registraVenda(100000);
        ven.registraVenda(100000);
        ven.hollerith();
    }
    
}
