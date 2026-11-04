/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package imobiliaria;

public interface ImoveisInt {
    
    public void cadastrarImovel(Imoveis imv) throws Exception;
    public void alugarImovel(int codigo, String corretor) throws Exception;
    public void venderImovel(int codigo, String corretor) throws Exception;
    public void listarImoveis(String titulo, boolean isAvailable, boolean residenciais) throws Exception;
    
    
}
