import java.util.Scanner;

public class Eleição{ 
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);


        int cont1 = 0;
            int cont2 = 0;
            int cont3 = 0;
            int cont4 = 0;
            int cont5 = 0;

        boolean votaçãoAberta = true;
        do{ 

            System.out.println("""
                \nEm qual opção você irá votar? 
                1 - canditato 1 
                2 - canditato 2 
                3 - candidato 3 
                4 - voto em branco 
                5 - voto nulo
            """);
            System.out.print("Opção escolhida: ");
            int opção = sc.nextInt();
    
            if(opção == 1){
                cont1 = cont1+ 1;
                System.out.println("Voto computado! \nInsira -1 para encerrar a votação");
            }
            if(opção == 2){
                cont2 = cont2+ 1;
                System.out.println("Voto computado! \nInsira -1 para encerrar a votação");
            }
            if(opção == 3){
                cont3 = cont3+ 1;
                System.out.println("Voto computado! \nInsira -1 para encerrar a votação");
            }
            if(opção == 4){
                cont4 = cont4+ 1;
                System.out.println("Voto computado! \nInsira -1 para encerrar a votação");
            }
            if(opção == 5){
                cont5 = cont5+ 1;
                System.out.println("Voto computado! \nInsira -1 para encerrar a votação");
            }
            if(opção == -1){
                votaçãoAberta = false;
                System.out.println("Votação encerrada com sucesso!");
            }if(opção < -1  || opção > 5){
                System.out.println("ERRO: O valor inserido é inválido");
            }
                        
        }while (votaçãoAberta);

        float total =cont1 + cont2 + cont3 + cont4 + cont5;
        float porcentagem = (cont4+cont5)/ total *100;

        System.out.println("Canditato 1 possui "+ cont1 + " votos.");
        System.out.println("Canditato 2 possui "+ cont2 + " votos.");
        System.out.println("Canditato 3 possui "+ cont3 + " votos.");
        System.out.println("A votação possui "+ cont4 + " votos brancos.");
        System.out.println("A votação possui "+ cont5 + " votos nulos.");
        System.out.println("Foram computados "+total+ " votos ao total, com "+porcentagem+"% deles sendo brancos ou nulos.");
    }   
}
