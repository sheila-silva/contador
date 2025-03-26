import java.util.Scanner;

// classe auxiliar
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite dois números dentro de um intervalo numérico");

            System.out.print("Digite o menor número inteiro: ");
            int num1 = scanner.nextInt();

            System.out.print("Digite o maior número inteiro: ");
            int num2 = scanner.nextInt();

            if (num1 >= num2) {
                throw new ParametrosInvalidosException("O primeiro número deve ser menor que o segundo.");
            }

            System.out.println("O primeiro número digitado é " + num1);
            System.out.println("O segundo número digitado é " + num2);

            System.out.println("Contando de " + num1 + " até " + num2 + ":");
            for (int i = num1; i <= num2; i++) {
                System.out.println("Interação " + (i - num1 + 1) + ": " + i);
            }

        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
