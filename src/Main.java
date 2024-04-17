import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        * APAGAR TUDO AQUI QUANDO TERMINAR OS TESTES
        */

        //Ler ListaCartas linha 70 e 110


        //criação de cartas para teste
        
        //artefatos
        Artefato meuArtefato = new Artefato("Artefato", "Espada Mágica", 3, "Raro", "Aumenta o dano em combate", "Equipamento", 2, "Ataque Duplo", 10);
        Artefato outroArtefato = new Artefato("Artefato", "Anel da Invisibilidade", 5, "Épico", "Torna o portador invisível por 3 rodadas", "Acessório", 0, "Invisibilidade", 5);
        Artefato artefatoDefesa = new Artefato("Artefato", "Escudo Sagrado", 4, "Lendário", "Oferece proteção contra ataques mágicos", "Equipamento", 3, "Escudo de Energia", 15);
        Artefato artefatoDuravel = new Artefato("Artefato", "Armadura Resistente", 6, "Comum", "Aumenta a resistência do usuário em combate", "Equipamento", 1, "Resistência Reforçada", 20);
        Artefato artefatoEspecial = new Artefato("Artefato", "Amuleto da Cura", 2, "Incomum", "Recupera 20 pontos de vida por turno", "Acessório", 0, "Cura Continuada", 10);

        //criaturas, não tem as habilidades
        Criatura criatura1 = new Criatura("Criatura", "Dragão de Fogo", 6, "Épico", "Pode atacar duas vezes por turno", 100, 30, 20);
        Criatura criatura2 = new Criatura("Criatura", "Guerreiro Orc", 4, "Raro", "Ganha +2 de ataque quando em combate corpo a corpo", 80, 25, 15);
        Criatura criatura3 = new Criatura("Criatura", "Mago Arcano", 5, "Raro", "Pode lançar feitiços poderosos", 70, 20, 10);
        Criatura criatura4 = new Criatura("Criatura", "Lobisomem", 3, "Comum", "Ganha resistência a ataques físicos durante a noite", 60, 18, 12);
        Criatura criatura5 = new Criatura("Criatura", "Espectro Sombrio", 2, "Incomum", "Pode atravessar objetos sólidos", 50, 15, 8);

        //feitiços
        Feitico feitico1 = new Feitico("Feitiço", "Bola de Fogo", 5, "Raro", "Causa dano de fogo ao alvo", "Fogo", "Queimação adicional");
        Feitico feitico2 = new Feitico("Feitiço", "Relâmpago", 6, "Épico", "Causa dano elétrico e paralisa o alvo", "Raio", "Paralisia prolongada");
        Feitico feitico3 = new Feitico("Feitiço", "Escudo Arcano", 3, "Comum", "Cria uma barreira mágica de proteção", "Arcano", "Resistência a magias");
        Feitico feitico4 = new Feitico("Feitiço", "Cura das Fadas", 4, "Incomum", "Recupera pontos de vida do alvo", "Natureza", "Regeneração");
        Feitico feitico5 = new Feitico("Feitiço", "Maldição das Trevas", 7, "Lendário", "Causa dano contínuo e reduz resistência do alvo", "Trevas", "Debilitação prolongada");
        
        //adição das cartas para teste de filtro
        ListaCartas.adicionarCarta(meuArtefato);
        ListaCartas.adicionarCarta(outroArtefato);
        ListaCartas.adicionarCarta(artefatoDefesa);
        ListaCartas.adicionarCarta(artefatoDuravel);
        ListaCartas.adicionarCarta(artefatoEspecial);
        ListaCartas.adicionarCarta(feitico1);
        ListaCartas.adicionarCarta(feitico2);
        ListaCartas.adicionarCarta(feitico3);
        ListaCartas.adicionarCarta(feitico4);
        ListaCartas.adicionarCarta(feitico5);
        ListaCartas.adicionarCarta(criatura1);
        ListaCartas.adicionarCarta(criatura2);
        ListaCartas.adicionarCarta(criatura3);
        ListaCartas.adicionarCarta(criatura4);
        ListaCartas.adicionarCarta(criatura5);
        
        //laços para percorrer a ListaCartas

        

        // for (Carta carta : ListaCartas.getArtefatos()) {
        //     System.out.println(carta.toString());
        // }

        // for (Carta carta : ListaCartas.getCriaturas()) {
        //     System.out.println(carta.toString());
        // }

        // for (Carta carta : ListaCartas.getFeiticos()) {
        //     System.out.println(carta.toString());
        // }

        // for (Carta carta : ListaCartas.buscarRaridadeCarta("Incomum")) {
        //     System.out.println(carta.toString());
        // }
            
        
        // ListaCartas.editarNomeCarta("Bola de Fogo", "Bola de Gelo");

        // ListaCartas.editarCustoManaCarta("Bola de Fogo", 999);
        // ListaCartas.editarRaridadeCarta("Bola de Fogo", "Lendário");
        
        // ListaCartas.excluirTodasCartas();

        for (Carta carta : ListaCartas.getListaCartas()) {
            System.out.println(carta.toString());
        }

        // for (Carta carta : ListaCartas.buscarCustoManaCarta(3)) {
        //     System.out.println(carta.toString());
        // }

    }
}
