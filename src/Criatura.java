public class Criatura extends Carta{
    
    private int pontosVida;
    private int ataque;
    private int defesa;
    // TODO: como implementar as habilidades?
    
    public Criatura(String nome, int custoMana, String raridade, String efeitos, int pontosVida, int ataque,
            int defesa) {
        super(nome, custoMana, raridade, efeitos);
        this.pontosVida = pontosVida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public int getPontosVida() {
        return pontosVida;
    }

    public void setPontosVida(int pontosVida) {
        this.pontosVida = pontosVida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    @Override
    public String toString() {
        String txt = super.toString() + "\nPontos de vida: " + pontosVida + "\nAtaque" + ataque + "\nDefesa: " + defesa;
        return txt;
    }

    
}
