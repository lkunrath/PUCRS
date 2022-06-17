import java.util.Scanner;

/** 5) Faça um algoritmo que leia a idade de uma pessoa expressa em anos,
meses e dias e mostre-a expressa em dias. Leve em consideração o ano com
365 dias e o mês com 30. Exemplo: 3 anos, 2 meses e 15 dias = 1170 dias.

 */
public class ex5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira a idade da pessoa em anos, meses e dias, respectivamente: ");
        
        System.out.print("Anos: ");
        int anos = sc.nextInt();
        
        System.out.print("Meses: ");
        int meses = sc.nextInt();
        
        System.out.print("Dias: ");
        int dias = sc.nextInt();

        int idadeDias = (anos * 365) + (meses * 30) + dias;
        System.out.print("Essa pessoa tem "+ idadeDias +" dias de idade.");
    }
}
