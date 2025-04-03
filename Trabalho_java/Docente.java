public class Docente extends Empregado{

    protected float salario;
    protected String empresa;

    public float getSalario(){
        return this.salario;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }

    public String getEmpresa(){
        return this.empresa;
    }

    public void setEmpresa(String empresa){
        this.empresa = empresa;
    }

    public Docente(String nome, int idade, String endereco,
    String telefone, String cpf,String rg, String profissao,
    float salario, String empresa){
        super(nome,idade,endereco,telefone,cpf,rg,profissao);
        this.salario = salario;
        this.empresa = empresa;
    }

}