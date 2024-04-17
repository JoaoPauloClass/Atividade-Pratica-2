public class Artefato extends Carta{
    
    private String tipoArtefato; // * tipo do artefato (ataque, defesa, agilidade, etc)
    private int bonus; // * bonus do tipo do artefato (+2, +5, +1)
    private String habilidadeAtiva;
    private int durabilidade;
    
    public Artefato(String tipoCarta, String nome, int custoMana, String raridade, String efeitos, String tipoArtefato, int bonus, String habilidadeAtiva, int durabilidade) {
        super(tipoCarta, nome, custoMana, raridade, efeitos);
        this.tipoArtefato = tipoArtefato;
        this.bonus = bonus;
        this.habilidadeAtiva = habilidadeAtiva;
        this.durabilidade = durabilidade;
    }

    public String getTipoArtefato() {
        return tipoArtefato;
    }

    public void setTipoArtefato(String tipo) {
        this.tipoArtefato = tipo;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public String getHabilidadeAtiva() {
        return habilidadeAtiva;
    }

    public void setHabilidadeAtiva(String habilidadeAtiva) {
        this.habilidadeAtiva = habilidadeAtiva;
    }

    public int getDurabilidade() {
        return durabilidade;
    }

    public void setDurabilidade(int durabilidade) {
        this.durabilidade = durabilidade;
    }

    @Override
    public String toString() {
        String txt = super.toString() + "\nTipo artefato: " + tipoArtefato + "\nBonus" + bonus + "\nHabilidade ativa: " + habilidadeAtiva + "\nDurabilidade: " + durabilidade;
        return txt;
    }
}
