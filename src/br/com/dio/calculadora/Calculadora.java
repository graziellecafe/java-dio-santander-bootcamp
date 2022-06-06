package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a,b;

        System.out.println("Digite o primeiro valor");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor");
        b = scan.nextInt();

        int somar = Somar(a, b);
        int subtrair = Subtrair(a, b);
        int multiplicar = Multiplicar(a, b);
        int dividir = Dividir(a, b);

        System.out.println("Soma: " + somar);
        System.out.println("Subtracão: " + subtrair);
        System.out.println("Multiplicacão: " + multiplicar);
        System.out.println("Divisão: " + dividir);
    }

    public static int Somar(int a, int b) {
        return a + b;
    }

    public static int Subtrair(int a, int b) {
        return a - b;
    }

    public static int Multiplicar(int a, int b) {
        return a * b;
    }

    public static int Dividir(int a, int b) {
        return a / b;
    }
}
