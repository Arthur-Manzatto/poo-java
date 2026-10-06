
package interfaceloja;


public class ItemEstoque implements ItemEstoqueInt{
    
    private String descricao;
    private int tamanho;
    private double preco;
    private int qtdEstoque;
    
    
    public ItemEstoque(String descricao, int tamanho, double preco){
        this.descricao = descricao;
        this.tamanho = tamanho;
        this.preco = preco;
        qtdEstoque = 0;
    }

    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    @Override
    public void incUnits(int qtd) {
        
        qtdEstoque += qtd;
        
    }

    @Override
    public boolean decUnits(int qtd) {
    
        if(qtd < qtdEstoque){
            
            qtdEstoque -= qtd;
            return true;
            
        }else{
            return false;
        }
    
    }

    @Override
    public int getUnits() {
        
        return qtdEstoque;
    
    }

    @Override
    public double getPrice() {
    
        return preco;
    
    }

    @Override
    public void print() {
        
        System.out.println("Descricao: " + descricao + "\n" +
                "Tamanho: " + tamanho + "\n" +
                "Preco: " + preco + "\n" +
                "Quantidade: " + qtdEstoque + "\n");
    
    }
}
