public class TecnicoAdministrativo extends Empregado{

    private float cargaHoraria;
    private int equipe;

    public float getCargaHoraria(){
        return this.cargaHoraria;
    }

    public void setCargaHoraria(float cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }

    public int getEquipe(){
        return this.equipe;
    }

    public void setEquipe(int equipe){
        this.equipe = equipe;
    }

    public TecnicoAdministrativo(String nome, int idade, String endereco,
    String telefone, String cpf,String rg, String profissao, float cargaHoraria, int equipe){
        super(nome,idade,endereco,telefone,cpf,rg,profissao);
        this.cargaHoraria = cargaHoraria;
        this.equipe = equipe;
    }

}