import java.util.Scanner;

//1) Crie um algoritmo que leia um número inteiro e imprima o seu antecessor e seu sucessor.
public class ex1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um número: ");

        int valor = sc.nextInt();
        int sucessor = valor + 1;
        int antecessor = valor - 1;
        
        System.out.println("O antecessor desse valor é: "+ antecessor + "\ne seu sucessor é: " + sucessor);
    }
}
