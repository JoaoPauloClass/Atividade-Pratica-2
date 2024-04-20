import java.util.ArrayList;
import java.util.List;

public class ListaCartas {
    
    private static List<Carta> listaCartas = new ArrayList<>();


    public static void adicionarCarta(Carta carta){
        listaCartas.add(carta);
    }


    public static List<Carta> getListaCartas(){
        return listaCartas;
    }

    public static List<Carta> getArtefatos(){
        List<Carta> tempList = new ArrayList<>();

        for (Carta carta : listaCartas) {
            if (carta instanceof Artefato) {
                tempList.add(carta);
            }
        }

        return tempList;
    }

    public static List<Carta> getCriaturas(){
        List<Carta> tempList = new ArrayList<>();

        for (Carta carta : listaCartas) {
            if (carta instanceof Criatura) {
                tempList.add(carta);
            }
        }

        return tempList;
    }

    public static List<Carta> getFeiticos(){
        List<Carta> tempList = new ArrayList<>();

        for (Carta carta : listaCartas) {
            if (carta instanceof Feitico) {
                tempList.add(carta);
            }
        }

        return tempList;
    }

    public static Carta buscarNomeCarta(String nome){
        Carta tempCarta = null;

        for (Carta carta : listaCartas) {
            if (carta.getNome().equals(nome)) {
                tempCarta = carta;
            }
        }

        return tempCarta;

    }

    public static List<Carta> buscarCustoManaCarta(int custoMana){
        List<Carta> tempList = new ArrayList<>();

        for (Carta carta : listaCartas) {
            if (carta.getCustoMana() == custoMana) {
                tempList.add(carta);
            }
        }
        
        return tempList;

    }

    public static List<Carta> buscarRaridadeCarta(String raridade){
        List<Carta> tempList = new ArrayList<>();

        for (Carta carta : listaCartas) {
            if (carta.getRaridade().equalsIgnoreCase(raridade)) {
                tempList.add(carta);
            }
        }
        
        return tempList;

    }

    public static void editarNomeCarta(String nomeAntigo, String nomeNovo){
        Carta carta = buscarNomeCarta(nomeAntigo); //apontar para o mesmo objeto
        carta.setNome(nomeNovo);
    }

    public static void editarCustoManaCarta(String nome, int custoMana){
        Carta carta = buscarNomeCarta(nome);
        carta.setCustoMana(custoMana);
    }

    public static void editarRaridadeCarta(String nome, String raridade){
        Carta carta = buscarNomeCarta(nome); 
        carta.setRaridade(raridade);
    }

    public static boolean excluirCarta(String nome){
        for (Carta carta : listaCartas) {
            if (carta.getNome() == nome) {
                listaCartas.remove(carta);
                return true;
            }
        }

        return false;
    }

    public static void excluirTodasCartas(){
        listaCartas.removeAll(listaCartas);
    }


}
