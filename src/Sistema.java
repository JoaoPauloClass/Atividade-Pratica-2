import java.util.ArrayList;
import java.util.List;


public class Sistema {

    public static void executar() {
        menu();
    }

    private static void menu() {
        int op;
        do {
            System.out.println("\n\nCADASTRO DE CARTAS - TCG");
            System.out.println("Selecione uma opção:");
            System.out.println("1) Cadastrar carta");
            System.out.println("2) Buscar carta");
            System.out.println("3) Editar carta");
            System.out.println("4) Excluir carta");
            System.out.println("5) Listar cartas");
            System.out.println("6) Excluir todas as cartas");
            System.out.println("0) Sair");
            System.out.print(">> ");
            op = Console.lerInt();

            switch (op) {
                case 1:
                    cadastrarCarta();
                    break;
                case 2:
                    buscarCarta();
                    break;
                case 3:
                    editarCarta();
                    break;
                case 4:
                    excluirCarta();
                    break;
                case 5:
                    listarCartas();
                    break;
                case 6:
                    ListaCartas.excluirTodasCartas();
                    System.out.println("Todas as cartas foram excluídas!");
                    break;
                case 0:
                    System.out.println("Encerrando sistema.");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }      
        } while (op != 0);
    }

    private static void cadastrarCarta() {
        int op;
        do {
            System.out.println("\n\nCADASTRAR CARTA");
            System.out.println("Selecione o tipo da carta:");
            System.out.println("1) Criatura");
            System.out.println("2) Feitiço");
            System.out.println("3) Artefato");
            System.out.println("0) Cancelar");
            System.out.print(">> ");
            op = Console.lerInt();

            switch (op) {
                case 1:
                    cadastrarCriatura();
                    break;
                case 2:
                    cadastrarFeitico();
                    break;
                case 3:
                    cadastrarArtefato();
                    break;
   
                case 0:
                    System.out.println("Cancelando operação.");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
                    break;
            }
            if (op >= 1 && op <= 3) {
                break;
            }
        } while(op != 0);
    }
    
    private static void cadastrarCriatura() {
        String nome;
        int custoMana;
        String raridade;
        int pontosVida;
        int ataque;
        int defesa;
        int numHabilidades;
        String tempHabilidade;

        System.out.println("\nCADASTRO DE CRIATURA");
        System.out.print("Nome da carta: ");
        nome = Console.lerString();
        System.out.print("Custo de mana: ");
        custoMana = Console.lerInt();
        System.out.print("Raridade: ");
        raridade = Console.lerString();
        System.out.print("Pontos de vida: ");
        pontosVida = Console.lerInt();
        System.out.print("Ataque: ");
        ataque = Console.lerInt();
        System.out.print("Defesa: ");
        defesa = Console.lerInt();

        
        Criatura temp = new Criatura("Criatura", nome, custoMana, raridade, "Invoca uma criatura para a batalha", pontosVida, ataque, defesa);
        
        System.out.println("HABILIDADES");
        System.out.print("Número de habilidades da criatura: ");
        numHabilidades = Console.lerInt();

        for (int i = 1; i <= numHabilidades; i++) {
            System.out.printf("Habilidade nº %d: ", i);
            tempHabilidade = Console.lerString();
            temp.addHabilidade(tempHabilidade);
        }

        ListaCartas.adicionarCarta(temp);
    }

    private static void cadastrarFeitico() {
        String nome;
        int custoMana;
        String raridade;
        String elemento;
        String efeitoAdicional;

        System.out.println("\nCADASTRO DE FEITIÇO");
        System.out.print("Nome da carta: ");
        nome = Console.lerString();
        System.out.print("Custo de mana: ");
        custoMana = Console.lerInt();
        System.out.print("Raridade: ");
        raridade = Console.lerString();
        System.out.print("Elemento: ");
        elemento = Console.lerString();
        System.out.print("Efeito adicional: ");
        efeitoAdicional = Console.lerString();


        Carta temp = new Feitico("Feitiço", nome, custoMana, raridade, "Conjura umm feitiço", elemento, efeitoAdicional);

        ListaCartas.adicionarCarta(temp);
    }

    private static void cadastrarArtefato() {
        String nome;
        int custoMana;
        String raridade;
        String tipoArtefato;
        int bonus;
        String efeitoAdicional;
        int durabilidade;

        System.out.println("\nCADASTRO DE ARTEFATO");
        System.out.print("Nome da carta: ");
        nome = Console.lerString();
        System.out.print("Custo de mana: ");
        custoMana = Console.lerInt();
        System.out.print("Raridade: ");
        raridade = Console.lerString();
        System.out.print("Tipo artefato: ");
        tipoArtefato = Console.lerString();
        System.out.print("Bonus: ");
        bonus = Console.lerInt();
        System.out.print("Efeito adicional: ");
        efeitoAdicional = Console.lerString();
        System.out.print("Durabilidade: ");
        durabilidade = Console.lerInt();


        Carta temp = new Artefato("Artefato", nome, custoMana, raridade, "Equipa um item a criatura", tipoArtefato, bonus, efeitoAdicional, durabilidade);

        ListaCartas.adicionarCarta(temp);
    }

    private static void buscarCarta() {
        int op;
        do {
            System.out.println("\n\nBUSCAR CARTA");
            System.out.println("Selecione o tipo de busca que deseja realizar:");
            System.out.println("1) Por nome");
            System.out.println("2) Por Custo de mana");
            System.out.println("3) Por Raridade");
            System.out.println("0) Sair");
            System.out.print(">> ");
            op = Console.lerInt();

            switch (op) {
                case 0:
                    System.out.println("Saindo...");
                    break;

                case 1:
                    buscarCartaPorNome();
                    break;

                case 2:
                    buscarCartaPorCustoDeMana();
                    break;

                case 3:
                    buscarCartaPorRaridade();
                    break;
            
                default:
                    System.out.println("Valor inválido, digite novamente");
                    break;
                }

        } while (op != 0);
    }
        
    private static void buscarCartaPorNome() {
        String nome;
        Carta tempCarta = new Carta();
        System.out.println("BUSCAR CARTA POR NOME");
        System.out.print("Nome da carta: ");
        nome = Console.lerString();
        tempCarta = ListaCartas.buscarNomeCarta(nome);

        if (tempCarta == null) {
            System.out.println("\nCarta não encontrada.");
        } else {
            System.out.println("Carta encontrada!");
            System.out.println(tempCarta.toString());
        }
    }

    private static void buscarCartaPorCustoDeMana() {
        int custo;
        List<Carta> tempList = new ArrayList<>();
        System.out.println("BUSCAR CARTAS POR CUSTO DE MANA");
        System.out.print("Custo de mana da carta: ");
        custo = Console.lerInt();
        tempList = ListaCartas.buscarCustoManaCarta(custo);

        if (tempList.size() == 0) {
            System.out.println("\nCartas não encontradas.");
        } else {
            System.out.println("Cartas encontradas!\n");
            for (Carta carta : tempList) {
                System.out.println(carta.toString());
            }
        }
    }

    private static void buscarCartaPorRaridade() {
        String raridade;
        List<Carta> tempList = new ArrayList<>();
        System.out.println("BUSCAR CARTAS POR RARIDADE");
        System.out.print("Raridade da carta: ");
        raridade = Console.lerString();
        tempList = ListaCartas.buscarRaridadeCarta(raridade);

        if (tempList.size() == 0) {
            System.out.println("\nCartas não encontradas.");
        } else {
            System.out.println("Cartas encontradas!\n");
            for (Carta carta : tempList) {
                System.out.println(carta.toString());
            }
        }
    }

    private static void editarCarta() {
        String nome;
        int op;
        do {
            System.out.println("\n\nEDITAR CARTA");
            System.out.print("Digite o nome da carta que deseja editar (digite SAIR para sair): ");
            nome = Console.lerString();

            if (ListaCartas.buscarNomeCarta(nome) == null) {
                System.out.println("Carta não encontrada.");
                if (nome.equals("SAIR")) {
                    break;
                }
            }

        } while (ListaCartas.buscarNomeCarta(nome) == null);

        if (!nome.equals("SAIR")) {
            System.out.println("\nEDITAR CARTA -> " + nome);
            System.out.println("1) Editar nome");
            System.out.println("2) Editar Custo de mana");
            System.out.println("3) Editar Raridade");
            System.out.println("0) Sair");
            System.out.print(">> ");
            op = Console.lerInt();

            switch (op) {
                case 0:
                    System.out.println("Saindo...");
                    break;

                case 1:
                    editarCartaNome(nome);
                    break;

                case 2:
                    editarCartaCustoDeMana(nome);
                    break;

                case 3:
                    editarCartaRaridade(nome);
                    break;

                default:
                    System.out.println("Valor inválido, digite novamente");
                    break;
            }
        }

    }
    

    private static void editarCartaNome(String nome){
        System.out.print("Digite o novo nome: ");
        String nomeNovo = Console.lerString();
        ListaCartas.editarNomeCarta(nome, nomeNovo);
        System.out.println("Carta editada.");
    }

    private static void editarCartaCustoDeMana(String nome){
        System.out.print("Digite o novo valor de mana: ");
        int manaNova = Console.lerInt();
        ListaCartas.editarCustoManaCarta(nome, manaNova);
    }

    private static void editarCartaRaridade(String nome){
        System.out.print("Digite a nova raridade da carta: ");
        String raridadeNova = Console.lerString();
        ListaCartas.editarRaridadeCarta(nome, raridadeNova);
    }

    private static void excluirCarta() {
        String nome;
        boolean exclusao;

        System.out.println("EXCLUSÃO DE CARTA");
        System.out.print("Nome da carta: ");
        nome = Console.lerString();
        exclusao = ListaCartas.excluirCarta(nome);
        if (exclusao) {
            System.out.println("Carta excluída.\n");
        } else {
            System.out.println("Carta não encontrada.\n");
        }
        
    }

    private static void listarCartas() {
        int op;
        do {
            System.out.println("\n\nLISTAR CARTA");
            System.out.println("Selecione o tipo da carta que deseja listar:");
            System.out.println("1) Todas");
            System.out.println("2) Criatura");
            System.out.println("3) Feitiço");
            System.out.println("4) Artefato");
            System.out.println("0) Cancelar");
            System.out.print(">> ");
            op = Console.lerInt();

            switch (op) {
                case 1:
                    System.out.println("TODAS AS CARTAS");
                    for (Carta carta : ListaCartas.getListaCartas()) {
                        System.out.println(carta);
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("CARTAS TIPO CRIATURA");
                    for (Carta carta : ListaCartas.getCriaturas()) {
                        System.out.println(carta);
                        System.out.println();

                    }
                    break;
                case 3:
                    System.out.println("CARTAS TIPO FEITIÇO");
                    for (Carta carta : ListaCartas.getFeiticos()) {
                        System.out.println(carta);
                        System.out.println();

                    }
                    break;
                case 4:
                    System.out.println("CARTAS TIPO ARTEFATO");
                    for (Carta carta : ListaCartas.getArtefatos()) {
                        System.out.println(carta);
                        System.out.println();

                    }
                    break;
                case 0:
                    System.out.println("Cancelando operação.");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
                    break;
            }
            if (op >= 1 && op <= 4) {
                break;
            }
        } while(op != 0);
        
    }
}