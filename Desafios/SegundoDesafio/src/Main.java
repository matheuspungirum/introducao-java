import java.util.Scanner;

/* Desafio 2
       * Você foi contratado para criar um gerenciador de pacotes. Porém, o que restou para você fazer foi o contador de
       * porcentagem de download dos pacotes. Mas como o espaço para essa informação ficou pequeno, a empresa optou por
       * fazer uma escala de 10 – 1. Então a escala será 1 = 10%, 2 = 20%, 3 = 30% e etc.
       * Para cada 10% de download, o programa deve printar, em sequência e sem espaços, uma barra “/”.
       *
       * Entrada
       * A entrada será um número que representará a porcentagem
       *
       * Saída
       * A saída serão as barras sem espaços entre elas.
       *
       * Exemplo
       * Entrada	Saída
       * 1	           /
       * 3	          ///
       * 7	        ///////

  */
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();
        switch (tamanho){
            case 1:
                System.out.print("/");
                break;
            case 2:
                System.out.print("//");
                break;
            case 3:
                System.out.print("///");
                break;
            case 4:
                System.out.print("////");
                break;
            case 5:
                System.out.print("/////");
                break;
            case 6:
                System.out.print("//////");
                break;
            case 7:
                System.out.print("///////");
                break;
            case 8:
                System.out.print("////////");
                break;
            case 9:
                System.out.print("/////////");
                break;
            case 10:
                System.out.print("//////////");
                break;
            default:
                System.out.print(" ");
                break;
        }
    }
}