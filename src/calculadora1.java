import java.util.Scanner;

public class Calculadora1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Vetor com 5 elementos
        int[] vetor = {10, 20, 30, 40, 50};

        // Laço for
        System.out.println("Laço FOR - Imprimindo elementos do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Elemento " + (i+1) + ": " + vetor[i]);
        }

        // Laço while
        System.out.println("\nLaço WHILE - Imprimindo elementos do vetor:");
        int i = 0;
        while (i < vetor.length) {
            System.out.println("Elemento " + (i+1) + ": " + vetor[i]);
            i++;
        }

        // Laço do/while
        System.out.println("\nLaço DO/WHILE - Imprimindo elementos do vetor:");
        i = 0;
        do {
            System.out.println("Elemento " + (i+1) + ": " + vetor[i]);
            i++;
        } while (i < vetor.length);

        // Variáveis para a calculadora
        double num1, num2, resultado;
        int operacao;
        char continuar;

        do {
            // Calculadora
            System.out.print("\nDigite o primeiro número: ");
            num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            num2 = scanner.nextDouble();

            System.out.println("Escolha a operação:");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.print("Digite o número da operação desejada: ");
            operacao = scanner.nextInt();

            try {
                switch (operacao) {
                    case 1:
                        resultado = num1 + num2;
                        System.out.println("Resultado da adição: " + resultado);
                        break;
                    case 2:
                        resultado = num1 - num2;
                        System.out.println("Resultado da subtração: " + resultado);
                        break;
                    case 3:
                        resultado = num1 * num2;
                        System.out.println("Resultado da multiplicação: " + resultado);
                        break;
                    case 4:
                        if (num2 == 0) {

