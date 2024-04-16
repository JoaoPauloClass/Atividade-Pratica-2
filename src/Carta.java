public class Carta {

    private String nome;
    private int custoMana;
    private String raridade;
    private String efeitos; // ? uma lista talvez (ou uma lista de objetos)
    // ! atributo tipo fica redundante por ser uma superclasse
    
    public Carta() {}

    public Carta(String nome, int custoMana, String raridade, String efeitos) {
        this.nome = nome;
        this.custoMana = custoMana;
        this.raridade = raridade;
        this.efeitos = efeitos;
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