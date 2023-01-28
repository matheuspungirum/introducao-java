import java.text.SimpleDateFormat;
import java.util.Date;

public class Vendedor extends Funcionario {
    private String nome;
    private String sexo;
    private int anoNasc;
    private String dataContratacao;

    Vendedor(String nome, String sexo, int anoNasc, String dataContratacao) {
        this.nome = nome;
        this.sexo = sexo;
        this.anoNasc = anoNasc;
        this.dataContratacao = dataContratacao;
    }

    Vendedor() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public String getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContracao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public void status() {
        System.out.println("Nome: " + getNome());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Ano de Nascimento: " + getAnoNasc());
        System.out.println("Data de Contratação: " + getDataContratacao());
    }
}
