import java.util.Scanner;

public class Calculadora1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2, resultado;

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Digite o número da operação desejada: ");
        int operacao = scanner.nextInt();

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
                        System.out.println("Erro: Não é possível dividir por zero.");
                    } else {
                        resultado = num1 / num2;
                        System.out.println("Resultado da divisão: " + resultado);
                    }
                    break;
                default:
                    System.out.println("Erro: Operação inválida.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Erro: Ocorreu um problema na operação.");
        } finally {
            scanner.close();
        }
    }
}
