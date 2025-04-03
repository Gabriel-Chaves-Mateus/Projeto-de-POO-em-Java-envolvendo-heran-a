public class Empregado extends Pessoa{

    protected String rg;
    protected String profissao;

    public String getRg(){
        return this.rg;
    }

    public void setRg(String rg){
        this.rg = rg;
    }

    public String getProfissao(){
        return this.profissao;
    }

    public void setProfissao(String profissao){
        this.profissao = profissao;
    }

    public Empregado(String nome, int idade, String endereco,
                     String telefone, String cpf, String rg, String profissao){
        super(nome,idade,endereco,telefone,cpf);
        this.rg = rg;
        this.profissao = profissao;
    }
}