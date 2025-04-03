public class AlunoGraduacao extends Aluno{

    private String materia;
    private float mensalidade;

    public String getMateria(){
        return this.materia;
    }

    public void setMateria(String materia){
        this.materia = materia;
    }
    
    public float getMensalidade(){
        return this.mensalidade;
    }

    public void setMensalidade(float mensalidade){
        this.mensalidade = mensalidade;
    }

    public AlunoGraduacao(String nome, int idade, String endereco, String telefone, 
    String cpf, String matricula, String turma,String horario,
    String escola,int nota,String materia, float mensalidade){
        super(nome, idade, endereco, telefone, cpf,matricula,turma,horario,escola,nota);
        this.materia = materia;
        this.mensalidade = mensalidade;
    }

}