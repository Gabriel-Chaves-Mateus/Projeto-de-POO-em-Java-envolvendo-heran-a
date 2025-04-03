public class ExAluno extends Pessoa{
    
    private String historico;
    private String descricao;

    public String getHistorico(){
        return this.historico;
    }

    public void setHistorico(String historico){
        this.historico = historico;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public ExAluno(String nome, int idade, String endereco, String telefone,
                   String cpf, String historico, String descricao){
        super(nome, idade, endereco, telefone, cpf);
        this.historico = historico;
        this.descricao = descricao;
    }

}