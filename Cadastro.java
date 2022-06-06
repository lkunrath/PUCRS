import java.util.Scanner;

public class Cadastro {
    public static void main(String args[]){
        Funcionario[] lista = new Funcionario[100];

        lista[0] = new Funcionario("Lara", "8579744868", 8.47f,35,false);
        lista [1] = new Funcionario("Bernardo", "427964273", 8.47f, 35, false);
        lista [2] = new Funcionario("Carolina", "18447375845", 10.57f, 40, false);
        lista[3] = new Funcionario("Guilherme", "12769874089", 14.50f, 48, true);
        lista [4] = new Funcionario("Silvia", "7689546865", 14.50f, 45, true);

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
                cadastraFuncionario(lista);
            }

            if(opção == 2){
                removeFuncionario (lista);
            }

            if(opção == 3){
                editaSalario (lista);
            }

            if(opção == 4){
                funcionariosCadastrados (lista);
            }

            if(opção == 5){
                verMaiorSalario (lista);
            }

            if(opção == 6){
                percentualPais (lista);
            }

            if(opção == 7){
                sessaoRodando = false;
                System.out.println("Sessão encerrada!");
            }
        }while(sessaoRodando);   
}

    private static void cadastraFuncionario(Funcionario[] array) {
        int index = array.length;

        for (int i = 0; i < array.length; i++)
            if (array[i] == null) {
                index = i;
                break;
            }

        if (index == array.length) {
            System.out.println("\nNúmero máximo de funcionários registrados.\n");
            return;
        }

        System.out.println("\n********** CADASTRO DE FUNCIONÁRIO **********\n");
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do funcionário: ");
            String nome = sc.nextLine();
            if(nome == null){ 
                System.out.println("Nome inválido!");
                return;
            }
        
        System.out.print("CPF do funcionário: ");
            String CPF = sc.nextLine();
            if(CPF.length() != 11){
                System.out.println("CPF inválido!");
                return;
            }

        float valorHoraTrabalhada; int cargaHorariaSemanal; boolean filhos;

        System.out.print("Valor por hora: ");
            valorHoraTrabalhada = sc.nextFloat();
            if(valorHoraTrabalhada < 0){ 
                System.out.println("Valor inválido!");
                return;
            }

        System.out.print("Carga horaria semanal: ");
            cargaHorariaSemanal = sc.nextInt();
            if(cargaHorariaSemanal < 0){ 
                System.out.println("Hora inválido!");
                return;
            }if(cargaHorariaSemanal > 44){
                cargaHorariaSemanal = 44;
            }

        System.out.print("Tem filhos? Insira (true) para sim, e (false) para não: ");
            filhos = sc.nextBoolean();
        
        array[index] = new Funcionario(nome, CPF, valorHoraTrabalhada, cargaHorariaSemanal, filhos);
        System.out.println("Funcionário cadastrado com sucesso!");
    }
   
    private static void funcionariosCadastrados(Funcionario[] array) {
        System.out.println("\n********** LISTA DE FUNCIONÁRIOS CADASTRADOS **********\n");

        for (Funcionario f : array) {
            if (f == null) break;

            System.out.println(f);
        }
        System.out.println("\n");
    }

    private static void removeFuncionario(Funcionario[] array) {
        System.out.println("\n********** REMOVER FUNCIONÁRIO **********\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o CPF: ");
        String cpfUsuario = sc.nextLine();

        int index = 0;
        Funcionario funcionario = null;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].getCPF().equals(cpfUsuario)) {
                funcionario = array[i];
                index = i;
                break;
            }
        }

        if (funcionario == null) {
            System.err.println("Funcionário não encontrado.\n");
            return;
        }

        do {
            System.out.println("\nVocê deseja remover este funcionário?\n1 - Sim\n2 - Não");
            System.out.println(funcionario);

            char respostaUsuario = sc.nextLine().toLowerCase().charAt(0);
            if (respostaUsuario == '1') {

                array[index] = null;
                for (int i = index; i < array.length - 1; i++)
                    array[i] = array[i + 1];

                System.out.println("\nFuncionário removido.");
                return;
            }
            if (respostaUsuario == '2') {
                System.out.println("\nVoltando...");
                return;
            }

        } while (true);
    }
    private static void editaSalario(Funcionario[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o CPF do funcionário: ");

        String cpfUsuario = sc.nextLine();
        Funcionario funcionario = null;

        for (Funcionario f : array)
            if (f != null && f.getCPF().equals(cpfUsuario))
                funcionario = f;

        if (funcionario == null) {
            System.err.println("\nFuncionário não encontrado.\n");
            return;
        }

        float novoValorHoraTrabalhada;

        System.out.print("Insira o novo salário: (por hora) ");
            novoValorHoraTrabalhada = Float.parseFloat(sc.nextLine());

            if(novoValorHoraTrabalhada < 0){ 
            System.out.println("Valor inválido.\n");
            return;
        }

        funcionario.setValorHoraTrabalhada(novoValorHoraTrabalhada);
        System.out.print("\nO salário de " + funcionario.getNome() + " foi modificado.\n");
    }
    private static void verMaiorSalario(Funcionario[] array) {

        Funcionario funcionarioMaior = array[0];

        if (funcionarioMaior == null) {
            System.err.println("\nNenhum funcionário cadastrado.");
            return;
        }

        for (Funcionario f : array)
            if (f != null && f.getSalario() > funcionarioMaior.getSalario())
                funcionarioMaior = f;

        System.out.println("\n********** FUNCIONÁRIO COM O MAIOR SALÁRIO **********\n");
        System.out.println(funcionarioMaior);
    }
    
    private static void percentualPais(Funcionario[] array) {
        float total = 0, filhos = 0;

        for (Funcionario f : array)
            if (f != null) {
                total++;
                if (f.getFilhos()) filhos++;
            }
        System.out.println("\n********** PERCENTUAL DE PAIS **********\n");
        System.out.printf("%.2f %%\n", (filhos / total) * 100);
    }
}
