public class Administrador extends Docente{

    private float tempoCarreira;
    private float horaAlmoco;
    private float salarioAdm;

    public float getTempoCarreira(){
        return this.tempoCarreira;
    }

    public void setTempoCarreira(float tempoCarreira){
        this.tempoCarreira = tempoCarreira;
    }

    public float getHoraAlmoco(){
        return this.horaAlmoco;
    }

    public void setHoraAlmoco(float horaAlmoco){
        this.horaAlmoco = horaAlmoco;
    }

    public Administrador(String nome, int idade, String endereco,
    String telefone, String cpf,String rg, String profissao,
    float salario, String empresa, float tempoCarreira, float horaAlmoco){
        super(nome,idade,endereco,telefone,cpf,rg,profissao,salario,empresa);
        this.tempoCarreira = tempoCarreira;
        this.horaAlmoco = horaAlmoco;
    }

    public void obterSalario(){
        Docente doc = new Docente();
        System.out.println(doc.salario);
    }

}