public class Feitico extends Carta{
    
    private String elemento;
    private String efeitoAdicional;
    
    public Feitico(String tipo, String nome, int custoMana, String raridade, String efeitos, String elemento,
            String efeitoAdicional) {
        super(tipo, nome, custoMana, raridade, efeitos);
        this.elemento = elemento;
        this.efeitoAdicional = efeitoAdicional;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public String getEfeitoAdicional() {
        return efeitoAdicional;
    }

    public void setEfeitoAdicional(String efeitoAdicional) {
        this.efeitoAdicional = efeitoAdicional;
    }

    @Override
    public String toString() {
        String txt = super.toString() + "\nElemento: " + elemento + "\nEfeito adicional: " + efeitoAdicional;
        return txt;
    }
}
