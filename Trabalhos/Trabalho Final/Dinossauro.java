public class Dinossauro{
    int id;
    int categoria;
    int tipo;
    double kg;
    double velocidade;
    String nomeRaça;

    public Dinossauro(String nomeRaça, int id, int categoria, int tipo, double kg, double velocidade){
        this.nomeRaça = nomeRaça;
        this.id = id;
        this.categoria = categoria;
        this.tipo = tipo;
        this.kg = kg;
        this.velocidade = velocidade;
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getKg() {
        return kg;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public String getNomeRaça() {
        return nomeRaça;
    }

    public void setNomeRaça(String nomeRaça) {
        this.nomeRaça = nomeRaça;
    }

    @Override
    public String toString() {
        return "Dinossauro [categoria=" + categoria + ", id=" + id + ", kg=" + kg + ", nomeRaça=" + nomeRaça + ", tipo="
                + tipo + ", velocidade=" + velocidade + "]";
    }
    
}
