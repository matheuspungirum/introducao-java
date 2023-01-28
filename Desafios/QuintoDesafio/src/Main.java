/* Desafio
* A prefeitura de uma cidade A instalou uma câmera para verificar quem estava acima da velocidade permitida na rodovia
* da entrada da cidade. Porém, ela é uma cidade extremamente movimentada e a prefeitura não deu conta de enviar as
* multas necessárias para quem ultrapassasse a velocidade permitida de 60km/h.
*
* O seu papel será o de criar um programa que verifique os dados recebidos da câmera e envie uma mensagem dizendo se o
*  motorista será multado ou não.
*
* Entrada
*  A entrada vai ser a velocidade do motorista.
*
* Saída
* A saída será uma mensagem no console dizendo se o motorista foi multado ou não. (sem as aspas)
*
*            Exemplo
*  Entrada	           Saída
*   60	           "Nao foi multado"
*   68	           "Foi multado"
*  100	           "Foi multado" */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidadeAtual = leitor.nextInt();
        if (velocidadeAtual <= 60 || velocidadeAtual >= 300 ){
            System.out.println("Não foi multado");
        } else {
             System.out.println("Foi Multado");
        }
    }
}