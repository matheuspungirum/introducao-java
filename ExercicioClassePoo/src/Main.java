//Aula bootcamp inter de orientação objetos herança, associação, interface, pacote e visibilidade
public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro();

        c1.setCor("Azul");
        c1.setModelo("Ford Fiesta");
        c1.setTanque(39f);

        System.out.println("Modelo " + c1.getModelo());
        System.out.println("O carro é da cor " + c1.getCor());
        System.out.println("Com a capacidade de " + c1.getTanque() + " Litros");
        System.out.println("Valor para encher o tanque é de R$ " + c1.totalValorCombustivel(5.57f));

        System.out.println(" ");

        Carro c2 = new Carro ("Preto", "Mercedes Benz Classe C", 66f);

        System.out.println("Modelo " + c2.getModelo());
        System.out.println("O carro é da cor " + c2.getCor());
        System.out.println("Com a capacidade de " + c2.getTanque() + " Litros");
        System.out.println("Valor para encher o tanque é de R$ " + c2.totalValorCombustivel(5.57f));


    }
}