package imobiliaria;


public class Imoveis implements ImoveisInt {
    
    private int codigo, cep;
    private String endereco, proprietario, corretor;
    private boolean alugado, vendido;
    Imoveis lista[];
    
    public Imoveis(int codigo, int cep, String endereco, String proprietario, int nLista){
        
        this.codigo = codigo;
        this.cep = cep;
        this.endereco = endereco;
        this.proprietario = proprietario;
        
        alugado = false;
        vendido = false;
        lista = new Imoveis[nLista];
        
        corretor = "";
        
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

    public String getCorretor() {
        return corretor;
    }

    public void setCorretor(String corretor) {
        this.corretor = corretor;
    }

    
    
    private int contador = 0;

    public int getContador() {
        return contador;
    }
    
    
    @Override
    public void cadastrarImovel(Imoveis imv) throws Exception{
    
        if(getContador() >= lista.length){
            
            throw new Exception();
            
        }else if(buscarCodigo(codigo) != null){
   
            throw new Exception();
            
        }else{
            lista[getContador()] = imv;
            contador++;
        }
        
        
        
    
    
    }

    @Override
    public void alugarImovel(int codigo, String corretor) throws Exception {
     
        Imoveis atual = buscarCodigo(codigo);
        
        if(atual == null){
            throw new Exception();
        }else if(atual.isAlugado() || atual.isVendido()){
            throw new Exception();
        }else{
            
            atual.setCorretor(corretor);
            atual.alugado = true;
        }    
    }

    @Override
    public void venderImovel(int codigo, String corretor) throws Exception {
       
        Imoveis atual = buscarCodigo(codigo);
        
        
        if(atual == null){
            throw new Exception();
        }else if(atual.isVendido()){
            throw new Exception();
        }else{
            
            atual.setCorretor(corretor);
            atual.vendido = true;
            
        }  
    
    }

    @Override
    public void listarImoveis(String titulo, boolean isAvailable, boolean residenciais) {
    
        if(isAvailable && residenciais){
           
            for(Imoveis c : lista){
                if(!c.isAlugado() && !c.isVendido()){

                }
            }
            
        }else if(isAvailable){
            
            for(Imoveis c : lista){
                if(!c.isAlugado() && !c.isVendido()){

                }
            }
            
        }else if(residenciais){
            
        }else{
            
        }
        
        
        
        
        
        System.out.println("print todos");
    
    }

    
    public Imoveis buscarCodigo(int code){
        
        for(int i = 0; i < getContador(); i++){
           
            if(code == lista[i].getCodigo()){
                return lista[i];
            }
            
        }
        
        
        return null;
    }

   
    
    
    
    
    
    
    
    
}
