import java.util.Scanner;

/** Modifique o exercício 1 de maneira que o tamanho dos vetores seja definido pelo usuário. 
 * Pode acontecer dos vetores terem tamanhos diferentes.
 */

public class lista6Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos elementos terão o vetor 1?: ");
        int tam = sc.nextInt();

        int[] vetor = new int[tam];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira o elemento: ");
            vetor[i] = sc.nextInt();
        }

        System.out.print("Quantos elementos terão o vetor 2?: ");
        int tam2 = sc.nextInt();

        int[] vetor2 = new int[tam2];
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print("Insira o elemento: ");
            vetor[i] = sc.nextInt();
        }

    }
}