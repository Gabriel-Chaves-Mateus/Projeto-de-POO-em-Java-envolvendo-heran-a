public class Aluno extends Pessoa{
    
    protected String matricula;
    protected String turma;
    protected String horario;
    protected String escola;
    protected int nota;

    public String getMatricula(){
        return this.matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public String getTurma(){
        return this.turma;
    }

    public void setTurma(String turma){
        this.turma = turma;
    }

    public String getHorario(){
        return this.horario;
    }

    public void setHorario(String horario){
        this.horario = horario;
    }

    public String getEscola(){
        return this.escola;
    }

    public void setEscola(String escola){
        this.escola = escola;
    }

    public int getNota(){
        return this.nota;
    }

    public void setNota(int nota){
        this.nota = nota;
    }

    public Aluno(String nome, int idade, String endereco, String telefone, 
                 String cpf, String matricula, String turma,String horario,
                 String escola,int nota){
        super(nome, idade, endereco, telefone, cpf);
        this.matricula = matricula;
        this.turma = turma;
        this.horario = horario;
        this.escola = escola;
        this.nota = nota;
    }

}