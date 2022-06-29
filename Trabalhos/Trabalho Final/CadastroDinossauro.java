public class CadastroDinossauro {
    
    Dinossauro[] dinossauros = new Dinossauro[100];
    int dinosCadastrados = 1;

    public boolean adicionarDinossauro(Dinossauro dino) {
        int pos = -1;
        for (int i = 0; i < dinossauros.length; i++)
            if (dinossauros[i] == null) {
                pos = i;
                break;
            }
        if (pos != -1) {
            dinossauros[pos] = dino;
            dinosCadastrados++;
            return true;
        }
        return false;
    }

    public boolean exibirDinossauros() {
        boolean encontrados = false;

        for (Dinossauro D : dinossauros) {
            if (D !=  null) {
                System.out.println(D);
                encontrados = true;
            }
        }
        return encontrados;
    }

    public Dinossauro pesquisarDinossauro(int id) {
        for (Dinossauro D : dinossauros) {
            if (D == null) break;
            if (D.getId() == id) return D;
        }
        return null;
    }
    public boolean removerDino(int id) {
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

    public String relatorioTipoECategoria() {
        int countCarnivoroPortePqno = 0; int countCarnivoroPorteMde = 0; int countCarnivoroPorteGrde = 0;
        int countHerbivoroPortePqno = 0; int countHerbivoroPorteMde = 0; int countHerbivoroPorteGrde = 0;

        //categoria - 1 pp 2 pm 3 pg
        //tipo - 1 carn 2 herb
        for (Dinossauro dino : dinossauros) {
            if (dino == null) break;
            if(dino.getTipo() == 1){
                if(dino.getCategoria() == 1) countCarnivoroPortePqno ++;
                if(dino.getCategoria() == 2) countCarnivoroPorteMde ++;
                if(dino.getCategoria() == 3) countCarnivoroPorteGrde ++;
            }
            if(dino.getTipo() == 2){
                if(dino.getCategoria() == 1) countHerbivoroPortePqno ++;
                if(dino.getCategoria() == 2) countHerbivoroPorteMde ++;
                if(dino.getCategoria() == 3) countHerbivoroPorteGrde ++;
            }
        }
        return "***** CARNÍVOROS *****\nPequeno Porte: " + countCarnivoroPortePqno + "\nMédio Porte: " + countCarnivoroPorteMde +
        "Grande Porte: " + countCarnivoroPorteGrde + "\n***** HERBÍVOROS *****\nPequeno Porte: " + countHerbivoroPortePqno + 
        "Médio Porte: " + countHerbivoroPorteMde + "Grande Porte: " + countHerbivoroPorteGrde;
    }


    public Dinossauro relatorioPesoPesado(int tipo, int categoria) {
        Dinossauro maisPesado = null;

        for (Dinossauro D : dinossauros) {
            if (D == null) break;
            if (D.getTipo() == tipo && D.getCategoria() == categoria) {
                maisPesado = D;
                break;
            }
        }

        for (Dinossauro D : dinossauros) {
            if (D == null || maisPesado == null) break;

            if (D.getTipo() == tipo && D.getCategoria() == categoria && D.getPeso() > maisPesado.getPeso()) {
                maisPesado = D;
            }
        }
        return maisPesado;
    }
    public double relatorioQuantidaDeCarne() {
        float valor = 0;

        for (Dinossauro D : dinossauros) {
            if (D == null) break;
            if (D.getTipo() == 1) {
                if (D.getCategoria() == 1) valor += (D.getPeso() * 0.1f); //10% do peso
                else if (D.getCategoria() == 2) valor += (D.getPeso() * 0.15f); //15% do peso
                else valor += (D.getPeso() * 0.2f); //20% do peso
            }
        }
        return valor * 30; //mês com 30 dias
    }
    public boolean relatorioFuga(int idDino, double distanciaDinoBunker, double distanciaPessoaBunker) {
        Dinossauro dino = null;

        for (Dinossauro D : dinossauros) {
            if (D == null) break;
            if (D.getId() == idDino) {
                dino = D;
                break;
            }
        }

        if (dino != null) {
            double tempoDinoAteBunker = distanciaDinoBunker / dino.getVelocidade();
            double tempoPessoaBunker = distanciaPessoaBunker / 20; //velocidade media de uma pessoa
            return tempoPessoaBunker < tempoDinoAteBunker;
        } else {
            System.out.println("\nDinossauro não encontrado.");
        }
        return false;
    }
    public Dinossauro[] relatorioMaisRapidos() {
        Dinossauro[] vetorDinos = new Dinossauro[100];

        for (int i = 0; i < 10; i++) {
            if (dinossauros[i] == null) break;
            vetorDinos[i] = dinossauros[i];
        }
        return bubbleSort(vetorDinos);
    }
    private Dinossauro[] bubbleSort(Dinossauro[] arr) {
        boolean mudar = true;

        while (mudar) {
            mudar = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if(arr[i + 1] == null) break;
                if (arr[i].getVelocidade() < arr[i + 1].getVelocidade()) {
                    Dinossauro temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    mudar = true;
                }
            }
        }
        return arr;
    }
    public int tamanhoVetorNaoNulo() {
        int count = dinosCadastrados;
        for (Dinossauro D : dinossauros) {
            if (D == null) break;
        }
        return count;
    }
   
}

