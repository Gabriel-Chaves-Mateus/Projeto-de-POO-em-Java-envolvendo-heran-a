public class AlunoPosGraduacao extends Aluno{

    private String universidade;
    private String curso;

    public String getUniversidade(){
        return this.universidade;
    }

    public void setUniversidade(String universidade){
        this.universidade = universidade;
    }

    public String curso(){
        return this.curso;
    }

    public void curso(String curso){
        this.curso = curso;
    }

    public AlunoPosGraduacao(String nome, int idade, String endereco, String telefone, 
    String cpf, String matricula, String turma,String horario,
    String escola,int nota,String universidade, String curso){
        super(nome, idade, endereco, telefone, cpf,matricula,turma,horario,escola,nota);
        this.universidade = universidade;
        this.curso = curso;
    }

}