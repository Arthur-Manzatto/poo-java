package imobiliaria;


public class Imoveis implements ImoveisInt {
    
    private int codigo, cep;
    private String endereco, proprietario;
    private boolean alugado, vendido;
    ImoveisInt lista[];
    
    public Imoveis(int codigo, int cep, String endereco, String proprietario, int nLista){
        
        this.codigo = codigo;
        this.cep = cep;
        this.endereco = endereco;
        this.proprietario = proprietario;
        alugado = false;
        vendido = false;
        lista = new Imoveis[nLista];
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public boolean isAlugado() {
        return alugado;
    }

    public boolean isVendido() {
        return vendido;
    }

    private int contador = 0;

    public int getContador() {
        return contador;
    }
    
    
    @Override
    public void cadastrarImovel(ImoveisInt imv) throws Exception{
    
        if(getContador() >= lista.length){
            
            throw new Exception();
            
        }else{
   
            lista[getContador()] = imv;
            
        }
        
        contador++;
        
    
    
    }

    @Override
    public void alugarImovel(int codigo, String corretor) {
     
    
    
    }

    @Override
    public void venderImovel(int codigo, String corretor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void listarImoveis(String titulo, boolean isAvailable, boolean residenciais) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public Imoveis buscarCodigo(int code){
        
        for(int i = 0; i < getContador(); i++){
           
            
            
        }
        
        
        return null;
    }

   
    
    
    
    
    
    
    
    
}
