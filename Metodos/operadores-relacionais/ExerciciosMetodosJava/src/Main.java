import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
        }
        System.out.println("Digite um número: ");
        System.out.println("Digite outro número: ");
        double n1, n2;
        double resultado = n1 + n2;
        System.out.println("O resultado da soma de " + n1 + " e " + n2 + " é " + resultado);
    }
}