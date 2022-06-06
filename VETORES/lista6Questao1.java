import java.util.Scanner;

/** Elabore um programa onde são criados dois vetores de 4 posições ambos armazenando números inteiros. 
 * Os valores devem ser armazenados nos vetores a partir de leitura interativa com usuário. 
 * Após concluir a leitura ambos vetores  devem ser impressos.
*/
public class lista6Questao1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira 4 valores para o primeiro vetor: ");
        int [] vetor1 = new int [4];
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Insira um número: ");
            vetor1[i] = sc.nextInt();   
            }
        
        System.out.println("Insira 4 valores para o segundo vetor: ");
        int [] vetor2 = new int [4];
        for (int i = 0; i < vetor2.length; i++) {
            System.out.println("Insira um número: ");
            vetor2[i] = sc.nextInt();
        }

        for (int valor : vetor1){
            System.out.print(valor + ", ");
        }
        System.out.println();
        
        for (int valor : vetor2){
            
            System.out.print(valor + ", ");
        }
            
    }    
}