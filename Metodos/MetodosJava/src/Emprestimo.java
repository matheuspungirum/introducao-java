public class Emprestimo {

    public static int getDuasParcelas(){
        return 2;
    }
    public static int getTresParcelas(){
        return 3;
    }

    public static int getCincoParcelas(){
        return 5;
    }
    public static double getTaxaDuasParcelas() {
        return 0.3;
    }

    public static double getTaxaTresParcelas() {
        return 0.45;
    }

    public static double getTaxaCincoParcelas() {
        return 0.60;
    }
    public static void valor (double valor, int parcelas) {
        if (parcelas == 2) {
            double valorFinal = valor + (valor * getTaxaDuasParcelas());
            System.out.println( "O valor final do empréstimo com 2 parcelas é de R$ "+ valorFinal);
        } else if (parcelas == 3){
            double valorFinal = valor + (valor * getTaxaTresParcelas());
            System.out.println("O valor final do emprétimo com 3 parcelas é de R$ " + valorFinal);
        } else if (parcelas == 5){
            double valorFinal = valor + (valor * getTaxaCincoParcelas());
            System.out.println("O valor final do emprétimo com 5 parcelas é de R$ " + valorFinal);
        } else {
            System.out.println("Não pode ser parcelado acima de 3x");
        }
    }
}
