/*
 * TO-DO:
 * # Métodos para gerenciar dados na lista, incluindo: 
 * 
 *XXXXXXXXXXXXXXcadastrar
 *XXXXXXXXXXXXXXlistar objetos específicos
 *XXXXXXXXXXXXXXbuscar
 *XXXXXXXXXXXXXXeditar dado
 *              excluir
 *              além de excluir todos os objetos da lista.
 * 
 *  Estas opções devem contemplar os diferentes tipos de objetos (ex: o sistema deve permitir cadastrar, buscar, excluir, editar e listar Professores, Coordenadores e Diretores) 
 */

// nome genérico, pode trocar se quiser.

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

    //buscar de outra forma além do nome, custo de mana e raridade?
    public static Carta buscarNomeCarta(String nome){
        Carta tempCarta = new Carta(); //não tem nome igual, então coloquei um unico objeto nesse

        for (Carta carta : listaCartas) {
            if (carta.getNome() == nome) {
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
            if (carta.getRaridade() == raridade) {
                tempList.add(carta);
            }
        }
        
        return tempList;

    }

    //editar algo além de nome, raridade e custo de mana?
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

    // public static void excluirCarta(String nome){
    //     Carta carta = buscarNomeCarta(nome);
    //     carta
    // }


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
        // for (Carta carta : listaCartas) {
        // }
    }


}
