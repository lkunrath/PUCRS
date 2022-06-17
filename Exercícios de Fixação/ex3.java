import java.util.Scanner;

//3) Crie um algoritmo que leia o valor do salário mínimo e o valor do salário
//de um usuário, calcule a quantidade de salários mínimos esse usuário ganha
//e imprima o resultado.
public class ex3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Insira o valor atual do salário mínimo: ");
        double asm = sc.nextDouble();
        
        System.out.print("Insira o valor do salário do usuário: ");
        double su = sc.nextDouble();

        double qtdes = su/asm;
        System.out.printf("Este usuário ganha %.3f"+ qtdes + "salários mínimos.");
    }
}
