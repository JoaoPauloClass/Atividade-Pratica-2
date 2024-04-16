public class Carta {

    private String tipo;
    private String nome;
    private int custoMana;
    private String raridade;
    private String efeitos; // ? uma lista talvez (ou uma lista de objetos)
    
    public Carta() {}

    public Carta(String tipo, String nome, int custoMana, String raridade, String efeitos) {
        this.tipo = tipo;
        this.nome = nome;
        this.custoMana = custoMana;
        this.raridade = raridade;
        this.efeitos = efeitos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCustoMana() {
        return custoMana;
    }

    public void setCustoMana(int custoMana) {
        this.custoMana = custoMana;
    }

    public String getRaridade() {
        return raridade;
    }

    public void setRaridade(String raridade) {
        this.raridade = raridade;
    }

    public String getEfeitos() {
        return efeitos;
    }

    public void setEfeitos(String efeitos) {
        this.efeitos = efeitos;
    }
    
    @Override
    public String toString() {
        String txt = "\nNome: " + nome + "\nCusto de mana: " + custoMana + "\nRaridade: " + raridade;
        return txt;
    }
}