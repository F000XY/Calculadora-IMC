package model;
import java.util.Scanner;

public class Calculadora {
    Scanner scanner = new Scanner(System.in);

    public void inserir() {
        System.out.println("Insira o seu nome:");
        String nome = scanner.next();
        System.out.println("Bem-vindo " + nome + "! Vamos calcular o seu IMC.");
    }

    public void calcularIMC() {
        System.out.println("Insira sua altura (em metros):");
        double altura = scanner.nextDouble();
        System.out.println("Insira seu peso (em quilogramas):");
        double peso = scanner.nextDouble();
        double imc = peso / (altura * altura);
        System.out.printf("O seu IMC é: %.2f%n", imc);
            if(imc < 18.5){
                System.out.println("Voce está com a classificação: Magreza");
            }else if(imc > 18.4 && imc < 25){
                System.out.println("Voce está com a classificação: Normal");
            }else if(imc > 24.9 && imc < 30){
                System.out.println("Voce está com a classificação: Sobrepeso");
            } else if(imc > 29.9 && imc < 35){
                System.out.println("Voce está com a classificação: Obesidade grau 1");
            } else if(imc > 34.9 && imc < 40){
                System.out.println("Voce está com a classificação: Obesidade grau 2");
            } else if(imc > 40){
                System.out.println("Voce está com a classificação: Obesidade grau 3");
            }else{
                System.out.println("Digite valores válidos para calcularmos seu IMC");
            }
    }

}