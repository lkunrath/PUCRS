import java.util.Scanner;

public class DinossauroMain {
    static CadastroDinossauro cadDino = new CadastroDinossauro();
    public static void main(String[] args) {

        boolean sessaoRodando = true;
        do{
            System.out.print("""
                \n**************** BEM VINDO AO JURASSIC ZOO ****************
                MENU DE OPÇÕES

                1 - Cadastrar um novo dinossauro.
                2 - Ver dinossauros cadastrados.
                3 - Pesquisar um dinossauro.
                4 - Remover um dinossauro.
                5 - Ver relatório “Quantidade de animais de cada tipo x categoria”.
                6 - Ver relatório “Peso pesado”.
                7 - Ver relatório “Quantidade de carne para carnívoros”.
                8 - Ver relatório “Dá tempo de fugir?”.
                9 - Ver relatório “Top 10 mais velozes”
                10 - Encerrar a sessão.
                    """ );
            System.out.print("\nO que você deseja fazer? ");

            Scanner sc = new Scanner (System.in);
            int opção = sc.nextInt();

            switch(opção){
                case 1:
                    adicionarDino();
                    break;
                case 2:
                    verDinossauros();
                    break;
                case 3:
                    verUmDino();
                    break;
                case 4:
                    removerUmDino();
                    break;
                case 5:
                    relatorioTipoECategoria();
                    break;
                case 6:
                    relatorioMaisPesados();
                    break;
                case 7:
                    RelatorioKgDeCarne();
                    break;
                case 8:
                    RelatorioDeFuga();
                    break;
                case 9:
                    relatorioMaisVelozes();
                    break;
                case 10:
                    sessaoRodando = false;
                    System.out.println("Sessão encerrada com sucesso!");
                    break;
                default:
                    System.out.println("ERRO: Valor inválido");
            }
        }while(sessaoRodando);
    }
    private static void adicionarDino(){
        Dinossauro dinoAdicionado;

        do{
            System.out.println("\n********** CADASTRO DE DINOSSAURO **********\n");
            Scanner sc = new Scanner(System.in);

            System.out.print("Nome/Raça do dinossauro: ");
            String nomeRaca = sc.nextLine();

            if(nomeRaca == null){
                System.out.println("ERRO: Nome/Raça inválido!");
                return;
            }

            System.out.print("ID: ");
            int id = sc.nextInt();
            if(id < 0){
                System.out.println("ERRO: ID inválido!");
                return;
            }

            System.out.print("Tipo((1) - Carnívoro. (2) - Herbívoro): ");
            int tipo = sc.nextInt();
            if(tipo < 1 && tipo > 2){
                System.out.println("ERRO: Valor inválido!");
                return;
            }

            System.out.print("Categoria((1) - Porte Pequeno. (2) - Porte Médio. (3) - Porte Grande.): ");
            int categoria = sc.nextInt();
            if(categoria < 1 && categoria > 3){
                System.out.println("ERRO: Valor inválido!");
                return;
            }

            System.out.print("Peso kg: ");
            double peso = sc.nextDouble();
            if(peso < 0){
                System.out.println("ERRO: Valor inválido!");
                return;
            }

            System.out.print("Velocidade km/h: ");
            double velocidade = sc.nextDouble();
            if(velocidade < 0){
                System.out.println("ERRO: Valor inválido!");
                return;
            }
            dinoAdicionado = new Dinossauro(id, nomeRaca, tipo, categoria, peso, velocidade);
            System.out.println("Dinossauro cadastrado com sucesso!");
            break;
        }while(true);

        System.out.println(cadDino.adicionarDinossauro(dinoAdicionado));

    }

    private static void verDinossauros() {
            System.out.println("\n ********** LISTA DE DINOSSAUROS ********** ");
            System.out.print(cadDino.exibirDinossauros());
    }

    private static void verUmDino(){
        Scanner sc = new Scanner(System.in);
        int id;

        do {
            System.out.println("\n ********** PESQUISAR DINOSSAURO ********** ");
            System.out.print("\nInsira o ID do dinossauro que você deseja ver: ");

            id = Integer.parseInt(sc.nextLine());

            if(id < 0)
                System.out.println("\nID inválido.");

            System.out.println("\n" + cadDino.pesquisarDinossauro(id));
            break;

        }while(true);
    }


    private static void removerUmDino() {
        Scanner sc = new Scanner(System.in);
        int id;

        do {
            System.out.println("\n ********** REMOVER DINOSSAURO ********** ");
            System.out.print("Insira o ID do dinossauro que será removido: ");

            id = Integer.parseInt(sc.nextLine());

            if(id < 0)
                System.out.println("\nID inválido.");


            System.out.println("\n" + cadDino.removerDino(id));
            break;
        }while(true);
    }


    private static void relatorioTipoECategoria() {
        System.out.println("\n ********** RELATÓRIO NÚMERO DE DINOSSAUROS TIPO x CATEGORIA ********** \n");
        System.out.println(cadDino.relatorioTipoECategoria());
    }


    private static void relatorioMaisPesados() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n ********** PESO PESADO ********** \n");
        int tipo;
        int categoria;

        do {
            System.out.print("\nSelecione o tipo do dinossauro ((1) - Carnivoro. (2) - Herbivoro.): ");
            tipo = sc.nextInt();

            if (tipo != 1 && tipo != 2)
                System.out.println("\nTipo invalido.");


            System.out.print("\nSelecione a categoria do dinossauro (1) - Pequeno Porte (2) - Médio Porte. (3) - Grande Porte): ");
            categoria = sc.nextInt();

            if (categoria != 1 && categoria != 2 && categoria != 3)
                System.out.println("\nCategoria invalida.");
            break;
        }while (true);
        System.out.println("\n" + cadDino.relatorioPesoPesado(tipo, categoria));
    }


    private static void RelatorioKgDeCarne() {
        System.out.println("\n ********** QUANTIDADE DE CARNE PARA CARNÍVOROS ********** \n");
        System.out.println(cadDino.relatorioQuantidaDeCarne() + " kg/mes");
    }


    private static void RelatorioDeFuga() {
        Scanner sc = new Scanner(System.in);
        int id;
        double distanciaDinoBunker, distanciaPessBunker;

        do {
            System.out.println("\n ********** DA TEMPO DE FUGIR? ********** ");

            System.out.print("Insira o ID do dinossauro: ");
            id = sc.nextInt();

            if(id < 0){
                System.out.println("\nID inválido.");
                continue;
            }

            System.out.print("Insira a distância que o dinossauro está do banker (km): ");
            distanciaDinoBunker = Double.parseDouble(sc.nextLine());

            if(distanciaDinoBunker < 0){
                System.out.println("\nDistância inválida.");
                continue;
            }

            System.out.print("Insira a distância que a pessoa está do banker (km): ");
            distanciaPessBunker = Double.parseDouble(sc.nextLine());

            if(distanciaPessBunker < 0){
                System.out.println("\nDistância inválida.");
                continue;
            }
            break;
        } while (true);
        System.out.println("\n" + cadDino.relatorioFuga(id, distanciaDinoBunker, distanciaPessBunker));
    }


    private static void relatorioMaisVelozes() {
        System.out.println("\n ********** TOP 10 MAIS VELOZES ********** \n");
        int count = 0;
        for (Dinossauro d : cadDino.relatorioMaisRapidos()) {
            if (d == null)
                break;
            count = 1;
            System.out.println(d);
        }
        if (count == 0) System.out.println("Nenhum dinossauro encontrado.");
    }
}
