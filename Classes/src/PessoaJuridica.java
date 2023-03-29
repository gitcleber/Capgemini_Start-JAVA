import java.util.Date;

public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public PessoaJuridica(String nome, Date nascimento, String cnpj) {
        super(nome, nascimento);
        this.cnpj = cnpj;
    }

}
