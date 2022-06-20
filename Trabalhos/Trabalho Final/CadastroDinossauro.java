import java.util.Scanner;

public class CadastroDinossauro {
    public static void main(String args[]) {
        Dinossauro[] lista = new Dinossauro[100];


        boolean sessãoRodando = true;
        
        do{
            System.out.println("""
                \n**************** BEM VINDO  ****************
                MENU DE OPÇÕES

                1 - Cadastre um novo Dinossauro.
                2 - Procurar um Dinosssuro.
                3 - Remover um Dinossauro. 
                4 - Relatório “Quantidade de animais de cada tipo e categoria”.
                5 - Relatório “Peso pesado”.
                6 - Relatório “Quantidade de carne para carnívoros”.
                7 - Relatório “Dá tempo de fugir?”.
                8 - Relatório “Top 10 mais velozes”.
                    """);
            
            Scanner sc = new Scanner (System.in);
            int opção = sc.nextInt();

            switch(opção){
                case 1:
                    cadastroDinossauro(lista);
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                default:
                    System.out.println("ERRO: Opção inválida");
            }

        }while(sessãoRodando);

       
        private static void cadastroDinossauro(Dinossauro[] array) {
            int index = array.length;
    
            for (int i = 0; i < array.length; i++)
                if (array[i] == null) {
                    index = i;
                    break;
                }
    
            if (index == array.length) {
                System.out.println("\nNúmero máximo de dinossauros registrados.\n");
                return;
            }
    
            System.out.println("\n********** CADASTRO DE DINOSSAURO **********\n");
            Scanner sc = new Scanner(System.in);
    
            System.out.print("Nome do dinossauro: ");
                String nomeRaça = sc.nextLine();
                if(nomeRaça == null){ 
                    System.out.println("Nome inválido!");
                    return;
                }
            
            System.out.print("ID do dinossauro: ");
                int id = sc.nextInt();
                if(id <= 0){
                    System.out.println("ID inválido!");
                    return;
                }
    
            System.out.print("Categoria: ");
                int categoria = sc.nextInt();
                if(categoria < 0 && categoria > 3){ 
                    System.out.println("Categoria inválida!");
                    return;
                }
    
            System.out.print("Tipo: ");
                int tipo = sc.nextInt();
                if(tipo < 1 && tipo > 2){ 
                    System.out.println("Tipo inválido!");
                    return;
                }
            
            System.out.print("Kg: ");
                double kg = sc.nextDouble();
                if(kg < 0){ 
                    System.out.println("Kg inválido!");
                    return;
                }

            System.out.print("Velocidade: ");
                double velocidade = sc.nextDouble();
                if(velocidade < 0){ 
                    System.out.println("Velocidade inválida!");
                    return;
                }
            
            array[index] = new Dinossauro(nomeRaça, id, categoria, tipo, kg, velocidade);
            System.out.println("Dinossauro cadastrado com sucesso!");
        }

        private static void dinossaurosCadastrados(Dinossauro[] array) {
            System.out.println("\n********** LISTA DE DINOSSAUROS CADASTRADOS **********\n");
    
            for (Dinossauro f : array) {
                if (f == null) break;
    
                System.out.println(f);
            }
            System.out.println("\n");
        }
    }
}
