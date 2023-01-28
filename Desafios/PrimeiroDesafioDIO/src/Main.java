
/* Primeiro Desafio de código do Bootcamp da DIO */

/*Desafio
 * Seu sobrinho começou a ganhar mesada dos pais. No auge dos seus 8 anos recebendo 50 reais por mês, ele quer saber
 *quanto terá se juntar todo o dinheiro, sem gastar nada, durante alguns meses. E você, como um bom tio com habilidades
 *de programação, vai criar um programa que com as entradas do seu sobrinho vai calcular automaticamente a quantidade
 *de dinheiro que ele terá em X meses.
 *
 *Entrada
 * A entrada será o número de meses que o sobrinho polpará o dinheiro.
 *Saída
 * A saída deve ser o valor que o sobrinho terá ao final dos meses. (sem as aspas)
 *
 *Exemplo
 * Entrada	         Saída
 *    2	      "Voce tera 100 reais"
 *    4	      "Voce tera 200 reais"
 *   10	      "Voce tera 500 reais"
 */


//Foram feitos dois métodos e o método aceito foi o switch
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o número referente ao mês: ");
        int entrada = leitor.nextInt();
        int mesada = 50;
        int valorMes = mesada * entrada;
        System.out.println("O valor que meu sobrinho tem no mês " + entrada + " é de " + valorMes);*/

        Scanner leitor = new Scanner(System.in);
        int entrada = leitor.nextInt();
        int mesada = 50;
        switch (entrada) {
            case 1:
                System.out.println(50);
             break;
            case 2:
                System.out.println(100);
             break;
            case 3:
                System.out.println(150);
             break;
            case 4:
                System.out.println(200);
             break;
            case 5:
                System.out.println(250);
             break;
            case 6:
                System.out.println(300);
             break;
            case 7:
                System.out.println(350);
             break;
            case 8:
                System.out.println(400);
             break;
            case 9:
                System.out.println(450);
             break;
            case 10:
                System.out.println(500);
             break;
            case 11:
                System.out.println(550);
             break;
            case 12:
                System.out.println(600);
             break;
            default:
                System.out.println(50);
                break;
        }

    }
}