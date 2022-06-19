import java.util.Scanner;

/*2) Crie um programa que leia o nome do usuário e um número N e escreva o
nome dele na tela N vezes. */

public class ex2cr {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Insira um nome: ");
        String nome = sc.nextLine();

        System.out.print("\nInsira a quantidade de vezes que o nome deve aparecer na tela: ");
        int qtde = sc.nextInt();

        for(int i = 0; i < qtde; i++){
            System.out.printf("\n%d. "+ nome, i);
        }
    }    
}
