import java.text.SimpleDateFormat;
import java.util.Date;
public class RodarAplicacao {


    public void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario servicosGerais = new ServicosGerais();


        //Funcionario gerente1 = new Gerente ("Matheus Pungirum", "Masculino", 1990, "27/01/2023") ;


        //Funcionario gerente2 =  new Gerente("Igor Lizardo", "Masculino", 1992, "27/01/2023");

       // gerente1.status();
        System.out.println("");
       // gerente2.status();
        System.out.println("");

        Funcionario vendedor1 = new Vendedor("matheus", "masc.", 1990, "28/01/2023"); /*"Cristiano", "Masculino", 1976, "27/01/2023"*/

        //Funcionario vendedor2 = new Vendedor("Ana Maria Pungirum", "Feminino", 1952, "13/01/2023");
        vendedor1.status();
        System.out.println("");
       // vendedor2.status();
        System.out.println("");

        //ServicosGerais auxiliar1 = new ServicosGerais("Lala", "Feminino", 1979, "15/01/2023");
        //auxiliar1.status();

    }
}
