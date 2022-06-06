public class Funcionario {
    
    private String nome;
    private String CPF;
    private float valorHoraTrabalhada;
    private int cargaHorariaSemanal;
    private boolean filhos;

    public Funcionario(String nome, String CPF, float valorHoraTrabalhada, int cargaHorariaSemanal, Boolean filhos){
        this.nome = nome;
		this.CPF = CPF;
		this.valorHoraTrabalhada = valorHoraTrabalhada;
        this.cargaHorariaSemanal = cargaHorariaSemanal;
        this.filhos = filhos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public double getValorHoraTrabalhada() {
        return valorHoraTrabalhada;
    }

    public void setValorHoraTrabalhada(float valorHoraTrabalhada) {
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }

    public int getCargaHorariaSemanal() {
        return cargaHorariaSemanal;
    }

    public void setCargaHorariaSemanal(int cargaHorariaSemanal) {
        if(cargaHorariaSemanal > 44){
            cargaHorariaSemanal = 44;
        }
        //this.cargaHorariaSemanal = cargaHorariaSemanal > 44 ? 44 : cargaHorariaSemanal;
    }

    public double getSalario(){
        return valorHoraTrabalhada *cargaHorariaSemanal;
    }

    public boolean getFilhos() {
        return filhos;
    }

    public void setFilhos(Boolean filhos) {
        this.filhos = filhos;
    }
    
    @Override
    public String toString(){
        return "Nome = " + nome + "\nCPF = " + CPF + "\nValor da Hora Trabalhada = R$ " + valorHoraTrabalhada +
                "\nCarga Horária Semanal = " + cargaHorariaSemanal + "h" + "\nSalário = R$ " + getSalario() + "\nPossui filhos? "
                    + (filhos ? "Sim" : "Não") + "\n"; 
                }
}
