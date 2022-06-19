import java.util.Scanner;

/**2) Crie um algoritmo que leia a idade de uma pessoa e informe a sua classe
eleitoral:
não eleitor (abaixo de 16 anos);
eleitor obrigatório (entre a faixa de 18 e menor de 65 anos);
eleitor facultativo (de 16 até 18 anos e maior de 65 anos, inclusive). */

public class ex2cc {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Insira sua idade para descobrir sua classe eleitoral: ");
        int idade = sc.nextInt();

        if(idade <= 16){
            System.out.println("Não é eleitor.");
        }

        if(idade >= 18 && idade < 65){
            System.out.println("É eleitor obrigatório.");
        }

        if(idade > 16 && idade <= 17){
            System.out.println("É eleitor facultativo.");
        }

        if(idade > 65){
            System.out.println("É eleitor facultativo.");
        }
    }
}
