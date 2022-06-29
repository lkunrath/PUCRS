import java.util.Scanner;

public class CadastroDinossauro {
    
    
    Dinossauro[] dinossauros = new Dinossauro[100];
    int dinosCriados = 0;

    public boolean adicionarDinossauro(Dinossauro dino) {
        int pos = -1;
        for (int i = 0; i < dinossauros.length; i++)
            if (dinossauros[i] == null) {
                pos = i;
                break;
            }
        if (pos != -1) {
            dinossauros[pos] = dino;
            dinosCriados++;
            return true;
        }
        return false;
    }
    public Dinossauro pesquisarDinossauro(int id) {
        for (Dinossauro d : dinossauros) {
            if (d == null) break;
            if (d.getId() == id) return d;
        }
        return null;
    }
    public boolean removerDinossauro(int id) {
        int index = -1;
        for (int i = 0; i < dinossauros.length; i++) {
            if (dinossauros[i] == null) break;
            if (dinossauros[i].getId() == id) index = i;
        }
        if (index != -1) {
            dinossauros[index] = null;

            for (int i = index; i < dinossauros.length - 1; i++) {
                dinossauros[i] = dinossauros[i + 1];
            }
        }
        return index != -1;
    }
    public boolean exibirDinossauros() {
        boolean achou = false;
        for (Dinossauro d : dinossauros) {
            if (d !=  null) {
                System.out.println(d);
                achou = true;
            }
        }
        return achou;
    }

    //          MÉTODOS PARA GERAR RELATÓRIOS

    public String relatorioPorTipoECategoria() {
        int carPP = 0, carMP = 0, carGP = 0;
        int herPP = 0, herMP = 0, herGP = 0;

        for (Dinossauro d : dinossauros) {
            if (d == null) break;
            if (d.getTipo() == 1) {
                if (d.getCategoria() == 1) carPP++;
                else if (d.getCategoria() == 2) carMP++;
                else carGP++;
            } else {
                if (d.getCategoria() == 1) herPP++;
                else if (d.getCategoria() == 2) herMP++;
                else herGP++;
            }
        }
        return "Carnivoros: PP: " + carPP + ", MP: " + carMP + ", GP: " + carGP + ".\nHerbivoros: PP: " + herPP + ", MP: " + herMP + ", GP: " + herGP + ".";
    }
    public Dinossauro relatorioPesoPesado(int tipo, int categoria) {
        Dinossauro maisPesado = null;

        for (Dinossauro d : dinossauros) {
            if (d == null) break;
            if (d.getTipo() == tipo && d.getCategoria() == categoria) {
                maisPesado = d;
                break;
            }
        }

        for (Dinossauro d : dinossauros) {
            if (d == null || maisPesado == null) break;

            if (d.getTipo() == tipo && d.getCategoria() == categoria && d.getPeso() > maisPesado.getPeso()) {
                maisPesado = d;
            }
        }
        return maisPesado;
    }
    public double relatorioQntCarneCarnivoros() {
        float valor = 0;

        for (Dinossauro d : dinossauros) {
            if (d == null) break;
            if (d.getTipo() == 1) {
                if (d.getCategoria() == 1) valor += (d.getPeso() * 0.1f);
                else if (d.getCategoria() == 2) valor += (d.getPeso() * 0.15f);
                else valor += (d.getPeso() * 0.2f);
            }
        }
        return valor * 30;
    }
    public boolean relatorioPossivelFuga(int idDino, double distanciaDinoBunker, double distanciaPessoaBunker) {
        Dinossauro dino = null;

        for (Dinossauro d : dinossauros) {
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
    public Dinossauro[] relatorioMaioresVelocidades() {
        Dinossauro[] vetorDinos = new Dinossauro[100];

        for (int i = 0; i < 10; i++) {
            if (dinossauros[i] == null) break;
            vetorDinos[i] = dinossauros[i];
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
        int count = dinosCriados;
        for (Dinossauro d : dinossauros) {
            if (d == null) break;
        }
        return count;
    }
    public static void main(String args[]) {
        boolean sessaoRodando = true;
        do{
            System.out.println("""
                \n**************** BEM VINDO AO CONTROLE DE FUNCIONÁRIOS ****************
                MENU DE OPÇÕES

                1 - Cadastre um novo funcionário.
                2 - Remover um funcionário.
                3 - Editar um salário.
                4 - Ver funcionários cadastrados.
                5 - Ver funcionário com maior salário
                6 - Percentual de funcionários com filhos.
                7 - Encerrar sessão.
                O que você deseja fazer?
                    """);
            
            Scanner sc = new Scanner (System.in);
            int opção = sc.nextInt();
            
            if(opção < 1 || opção > 7){
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
                sessaoRodando = false;
                System.out.println("Sessão encerrada!");
            }
        }while(sessaoRodando);   
}
}
