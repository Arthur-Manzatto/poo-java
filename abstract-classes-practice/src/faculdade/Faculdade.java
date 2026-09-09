/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package faculdade;

/**
 *
 * @author Usuario
 */
public class Faculdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // ==========================================
        // CRIAÇÃO DOS OBJETOS
        // ==========================================
        Professores professor = new Professores(
                "Arthur Manzatto",
                "12.345.678-9",
                2,
                "Desenvolvimento de Sistemas",
                50
        );

        Funcionario funcionario = new Funcionario(
                "Joao da Silva",
                "98.765.432-1",
                1,
                3000,
                "Secretaria"
        );

        // ==========================================
        // TESTANDO PROFESSOR
        // ==========================================
        System.out.println("==========================================");
        System.out.println("           TESTE DO PROFESSOR");
        System.out.println("==========================================");

        // Registra aulas
        professor.registraAulas(10);
        professor.registraAulas(5);

        // Calcula salário
        System.out.println(
                "Salario calculado: R$ "
                + professor.calcularSalario()
        );

        // Imprime holerite
        professor.hollerith();

        // ==========================================
        // TESTANDO FUNCIONÁRIO
        // ==========================================
        System.out.println("==========================================");
        System.out.println("          TESTE DO FUNCIONARIO");
        System.out.println("==========================================");

        // Registra faltas
        funcionario.registraFalta();
        funcionario.registraFalta();

        // Calcula salário
        System.out.println(
                "Salario calculado: R$ "
                + funcionario.calcularSalario()
        );

        // Imprime holerite
        funcionario.hollerith();

        // ==========================================
        // TESTANDO ZERAR MES
        // ==========================================
        System.out.println("==========================================");
        System.out.println("             NOVO MES");
        System.out.println("==========================================");

        professor.zerarMes();
        funcionario.zerarMes();

        System.out.println("Dados mensais zerados.");

        // ==========================================
        // TESTANDO NOVAMENTE APÓS ZERAR O MÊS
        // ==========================================
        System.out.println("\n==========================================");
        System.out.println("     TESTE APOS ZERAR O MES");
        System.out.println("==========================================");

        System.out.println(
                "Salario do professor apos zerar: R$ "
                + professor.calcularSalario()
        );

        System.out.println(
                "Salario do funcionario apos zerar: R$ "
                + funcionario.calcularSalario()
        );

        professor.hollerith();
        funcionario.hollerith();

    }

}
