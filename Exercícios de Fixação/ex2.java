import java.util.Scanner;

//2) Crie um programa que recebe dois números reais e imprima a média aritimética desses dois números.

public class ex2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira dois valores para calcular a sua média: \nValor a: ");
        double a = sc.nextDouble();

        System.out.print("Valor b: ");
        double b = sc.nextDouble();

        double media = (a+b)/2;
        System.out.printf("A média aritmética é: " + media);
    }
}
