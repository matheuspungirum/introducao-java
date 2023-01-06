import java.nio.file.SecureDirectoryStream;

public class Operadores {
    public static void main(String[] args) {

        boolean condicao1 = true;
        boolean condicao2 = true;

        if (condicao1 && condicao2){
            System.out.print("As duas condições são verdadeiras. ");
        }
        if(condicao1 || condicao2){
            System.out.print("\nUma das Condições é verdadeira. ");
        }
  }
}