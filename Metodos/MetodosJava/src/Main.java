import java.util.Calendar;


public class Main {

    public static void main(String[] args) {
        //Operações aritméticas
        System.out.println("Exercicio de Operações Aritméticas.");
        OperacaoAritmetica.soma(1, 2);
        OperacaoAritmetica.subtracao(3, 4);
        OperacaoAritmetica.multiplicacao(2, 3);
        OperacaoAritmetica.divisao(4, 2);

        //Mensagem do dia
        System.out.println("Exercício de Mensagem de acordo com a hora do dia.");
        MensagemHoraDoDia.main();

        // Empréstimo
        System.out.println("Exercício Emprestimo");
        Emprestimo.valor(1000, Emprestimo.getDuasParcelas());
        Emprestimo.valor(2000, Emprestimo.getTresParcelas());
        Emprestimo.valor(5000, Emprestimo.getCincoParcelas());
        Emprestimo.valor(2000, 6);
    }
}
