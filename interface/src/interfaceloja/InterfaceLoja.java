/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaceloja;

/**
 *
 * @author 0040482511005
 */
public class InterfaceLoja {

    public static void main(String[] args) {

        Estoque estoque = new Estoque();

        ItemEstoque item1 = new ItemEstoque("Camisa", 42, 50.00);
        ItemEstoque item2 = new ItemEstoque("Calca", 40, 100.00);

        // Testando add()
        System.out.println("=== TESTE ADD ===");

        int indice1 = estoque.add(item1);
        int indice2 = estoque.add(item2);

        System.out.println("Indice do item1: " + indice1);
        System.out.println("Indice do item2: " + indice2);

        // Testando incUnits()
        System.out.println("\n=== TESTE INCUNITS ===");

        boolean inc1 = estoque.incUnits(0, 10);
        boolean inc2 = estoque.incUnits(1, 5);

        System.out.println("Aumentou item1? " + inc1);
        System.out.println("Aumentou item2? " + inc2);

        // Testando incUnits() com índice inválido
        System.out.println("\n=== TESTE INCUNITS INVALIDO ===");

        boolean incInvalido = estoque.incUnits(10, 5);

        System.out.println("Resultado: " + incInvalido);

        // Testando decUnits()
        System.out.println("\n=== TESTE DECUNITS ===");

        boolean dec1 = estoque.decUnits(0, 3);
        boolean dec2 = estoque.decUnits(1, 2);

        System.out.println("Diminuiu item1? " + dec1);
        System.out.println("Diminuiu item2? " + dec2);

        // Testando decUnits() com índice inválido
        System.out.println("\n=== TESTE DECUNITS INVALIDO ===");

        boolean decInvalido = estoque.decUnits(20, 2);

        System.out.println("Resultado: " + decInvalido);

        // Testando listAll()
        System.out.println("\n=== TESTE LISTALL ===");

        estoque.listAll();
    }

}
