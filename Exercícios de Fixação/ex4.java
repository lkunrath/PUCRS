import java.util.Scanner;

//4) Crie um programa em Java que use a fórmula de Bhaskara para calcular
//as raízes de uma equação do 2º grau. O programa deve receber os valores
//de a, b e c.

public class ex4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira os valores de a, b e c da equação");
        System.out.print("Valor de a: ");
        int a = sc.nextInt();
        System.out.print("Valor de b: ");
        int b = sc.nextInt();
        System.out.print("Valor de c: ");
        int c = sc.nextInt();

        double delta = (b * b) + (-4 * (a * c));
        if(delta < 0){
            System.out.println("O delta não possui raíz!");
        }
        
        double x1 = (-(b) + Math.sqrt(delta)) / 2 * a;
        double x2 = (-(b) - Math.sqrt(delta)) / 2 * a;

        System.out.println("X1 = " + x1);
        System.out.println("X2 = " + x2);
    }
}
