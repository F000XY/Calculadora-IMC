package view;

import model.Calculadora;
import java.util.Scanner;

public class Menu {

    public static void opcoes() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção: ");
            System.out.println("1- Calcular IMC");
            System.out.println("2- Sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Calculadora calculadora = new Calculadora();
                    calculadora.inserir();
                    calculadora.calcularIMC();
                    break;
                case 2:
                    while (true) {
                        System.out.println("Tem certeza que deseja sair? Digite 'S' para sim e 'N' para não");
                        char confirmacao = scanner.next().charAt(0);
                        if (confirmacao == 'S' || confirmacao == 's') {
                            System.out.println("Saindo do programa...");
                            System.exit(0);
                        } else if (confirmacao == 'N' || confirmacao == 'n') {
                            break;
                        } else {
                            System.out.println("Opção inválida! Digite S para sair ou N para continuar.");
                        }
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}