import java.util.ArrayList;
import java.util.List;

public class Criatura extends Carta{
    
    private int pontosVida;
    private int ataque;
    private int defesa;
    private List<String> habilidades = new ArrayList<String>();
    
    public Criatura(String tipo, String nome, int custoMana, String raridade, String efeitos, int pontosVida, int ataque, int defesa) {
        super(tipo, nome, custoMana, raridade, efeitos);
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

    public void setHabilidades(List<String> habilidades) {
        this.habilidades = habilidades;
    }

    public List<String> getHabilidades() {
        return habilidades;
    }


    public void addHabilidade(String habilidade) {
        habilidades.add(habilidade); 
        // * implemetar no sistema quando for cadastrar criatura a opção de indicar quantas habilidades a criatura vai ter (minimo 1) 
    }

    @Override
    public String toString() {
        String txt = super.toString() + "\nPontos de vida: " + pontosVida + "\nAtaque" + ataque + "\nDefesa: " + defesa + "\nHabilidades: ";

        for (String habilidade : habilidades) {
            txt += "\n  " + habilidade; 
        }
        return txt;
    }

    
}
