import java.util.Scanner;

/*4) Escreva um algoritmo que leia 10 números do usuário e exiba quantos
números são pares. */

public class ex4cr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        for(int i = 0; i < 10; i++){
            System.out.print("Insira um número: ");
            num = sc.nextInt();
        }
    }    
}
