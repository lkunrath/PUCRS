import java.util.Scanner;

/**1) Escreva um algoritmo que leia um número e informe se ele é divisível por
10, por 5 e/ou por 2 ou se não é divisível por nenhum deles. */
public class ex1cc{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Insira um valor: ");
        int valor = sc.nextInt();
        if(valor %2 == 0){
            System.out.println("É divisível por 2");
        }else{
            System.out.println("Não é divisível por 2");
        }
        if(valor %5 == 0){
            System.out.println("É divisível por 5");
        }else{
            System.out.println("Não é divisível por 5");
        }
        if(valor %10 == 0){
            System.out.println("É divisível por 10");
        }else{
            System.out.println("Não é divisível por 10");
        }
    }
}