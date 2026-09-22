package tecelagem;

public class Tecelagem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Administracao adm = new Administracao("Ze", "123123123", 10000);
        adm.registrarFalta();
        adm.hollerith();
        
        Administracao adm2 = new Administracao("Ze323232", "123123123", 10000);
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
        
        
        Equipe eqp = new Equipe(3);
        
        eqp.add(adm);
        eqp.add(adm2);
        eqp.add(ven);
        eqp.add(prod);
        
        eqp.relatorioAdministracao();
        eqp.relatorioVendas();
        eqp.relatorioProducao();
    }
    
}
