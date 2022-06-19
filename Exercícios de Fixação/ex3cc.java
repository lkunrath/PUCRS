import java.util.Scanner;

/*3) Criar um algoritmo que leia o um número inteiro entre 1 e 7 e escreva o
dia da semana correspondente. Caso o usuário digite um número fora desse
intervalo, deverá aparecer uma mensagem informando que não existe dia da
semana com esse número */

public class ex3cc {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Insira um número entre 1 e 7 para ver o dia correspondente: ");
        int dia = sc.nextInt();

        switch(dia){
            case 1: 
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("ERRO: número inválido.");
        }
    }    
}
