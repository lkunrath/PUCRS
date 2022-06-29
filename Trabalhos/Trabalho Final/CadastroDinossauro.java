import java.util.Scanner;

public class CadastroDinossauro {
    
    static Dinossauro[] lista = new Dinossauro[100];
    int dinosCadastrados = 1;

    private int posicaoAtual = 0;
    private int idAtual = 0;

    public int getPosicaoAtual() {
        return posicaoAtual;
    }

    public int getIdAtual() {
        return idAtual++;
    }

    public boolean cheio() {
        return posicaoAtual >= lista.length;
    }

    public boolean adicionarDinossauro(Dinossauro dinossauro) {
        if (cheio()) {
            idAtual--;
            return false;
        }

        lista[posicaoAtual++] = dinossauro;
        return true;

     System.out.println("\n********** CADASTRO DE DINOSSAURO **********\n");
        Scanner sc = new Scanner(System.in);
        int countCarnivoroPortePqno = 0; int countCarnivoroPorteMde = 0; int countCarnivoroPorteGrde = 0;
        int cuntHerbivoroPortePqno = 0; int countHerbivoroPorteMde = 0; int countHerbivoroPorteGrde = 0;

        System.out.print("Nome/Raça do dinossauro: ");
            String nomeRaça = sc.nextLine();
            if(nomeRaça == null){ 
                System.out.println("ERRO: Nome/Raça inválido!");
                return;
            }
        
        System.out.print("ID: ");
            String id = sc.nextLine();
            if(id.length() < 0){
                System.out.println("ERRO: ID inválido!");
                return;
            }

        int tipo; int categoria; double peso; double velocidade; 

        System.out.print("Tipo((1) - Carnívoro. (2) - Herbívoro): ");
            tipo = sc.nextInt();
            if(tipo < 1 && tipo > 2){ 
                System.out.println("ERRO: Valor inválido!");
                return;
            }

        System.out.print("Categoria((1) - Porte Pequeno. (2) - Porte Médio. (3) - Porte Grande.): ");
            categoria = sc.nextInt();
            if(categoria < 1 && categoria > 3){ 
                System.out.println("ERRO: Valor inválido!");
                return;
            }
            if() countPortePqno = countPortePqno + 1;
            if(tipo == 2) countPorteMde = countPorteMde + 1;
            if(tipo == 3) countPorteGrde = countPorteGrde + 1;
        
        lista[index] = new Dinossauro(id, nomeRaca, tipo, peso, velocidade);
        System.out.println("Dinossauro cadastrado com sucesso!");
    }
       
    }
    

    public Dinossauro pesquisarDinossauro(int id) {
        for (Dinossauro d : lista) {
            if (d == null) break;
            if (d.getId() == id) return d;
        }
        return null;
    }
    public boolean removerDinossauro(int id) {
        int index = -1;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == null) break;
            if (lista[i].getId() == id) index = i;
        }
        if (index != -1) {
            lista[index] = null;

            for (int i = index; i < lista.length - 1; i++) {
                lista[i] = lista[i + 1];
            }
        }
        return index != -1;
    }

    // public static void relatorioTiposECategorias(){
    //     System.out.printf("Pequeno Porte e Carnívoro: ",)
    // }


    public Dinossauro relatorioPesoPesado(int tipo, int categoria) {
        Dinossauro maisPesado = null;

        for (Dinossauro d : lista) {
            if (d == null) break;
            if (d.getTipo() == tipo && d.getCategoria() == categoria) {
                maisPesado = d;
                break;
            }
        }

        for (Dinossauro d : lista) {
            if (d == null || maisPesado == null) break;

            if (d.getTipo() == tipo && d.getCategoria() == categoria && d.getPeso() > maisPesado.getPeso()) {
                maisPesado = d;
            }
        }
        return maisPesado;
    }
    public double relatorioQuantidadeCarne() {
        float valor = 0;

        for (Dinossauro d : lista) {
            if (d == null) break;
            if (d.getTipo() == 1) {
                if (d.getCategoria() == 1) valor += (d.getPeso() * 0.1f);
                else if (d.getCategoria() == 2) valor += (d.getPeso() * 0.15f);
                else valor += (d.getPeso() * 0.2f);
            }
        }
        return valor * 30;
    }
    public boolean relatorioFuga(int idDino, double distanciaDinoBunker, double distanciaPessoaBunker) {
        Dinossauro dino = null;

        for (Dinossauro d : lista) {
            if (d == null) break;
            if (d.getId() == idDino) {
                dino = d;
                break;
            }
        }

        if (dino != null) {
            double tempoDinoBunker = distanciaDinoBunker / dino.getVelocidade();
            double tempoPessoaBunker = distanciaPessoaBunker / 20;
            return tempoPessoaBunker < tempoDinoBunker;
        } else {
            System.out.println("\nDinossauro não encontrado.");
        }
        return false;
    }
    public Dinossauro[] relatorioMaisRapidos() {
        Dinossauro[] vetorDinos = new Dinossauro[100];

        for (int i = 0; i < 10; i++) {
            if (lista[i] == null) break;
            vetorDinos[i] = lista[i];
        }
        return bubbleSort(vetorDinos);
    }
    private Dinossauro[] bubbleSort(Dinossauro[] arr) {
        boolean trocou = true;

        while (trocou) {
            trocou = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if(arr[i + 1] == null) break;
                if (arr[i].getVelocidade() < arr[i + 1].getVelocidade()) {
                    Dinossauro temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    trocou = true;
                }
            }
        }
        return arr;
    }
    public int tamanhoVetorNaoNulo() {
        int count = dinosCadastrados;
        for (Dinossauro d : lista) {
            if (d == null) break;
        }
        return count;
    }
    public static void Main(String args[]) {

        lista[0] = new Dinossauro(001, "Triceratops", 2, 2, 8000.0, 28.0);
        
        boolean sessaoRodando = true;
        do{
            System.out.println("""
                \n**************** BEM VINDO AO JURASSIC ZOO ****************
                MENU DE OPÇÕES

                1 - Cadastrar um novo dinossauro.
                2 - Pesquisar um dinossauro.
                3 - Remover um dinossauro.
                4 - Ver relatório “Quantidade de animais de cada tipo e categoria”.
                5 - Ver relatório “Peso pesado”.
                6 - Ver relatório “Quantidade de carne para carnívoros”.
                7 - Ver relatório “Dá tempo de fugir?”.
                8 - Ver relatório “Dá tempo de fugir?”
                9 - Encerrar a sessão.
                O que você deseja fazer?
                    """);
            
            Scanner sc = new Scanner (System.in);
            int opção = sc.nextInt();
            
            if(opção < 1 || opção > 9){
                System.out.println("Opção inválida!");
            }

            if(opção == 1){
                
            }

            if(opção == 2){
                
            }

            if(opção == 3){
                
            }

            if(opção == 4){
                
            }

            if(opção == 5){
                
            }

            if(opção == 6){
                
            }

            if(opção == 7){
                
            }

            if(opção == 8){
                
            }

            if(opção == 9){
                sessaoRodando = false;
                System.out.println("Sessão encerrada!");
            }
        }while(sessaoRodando);   
    }
}
