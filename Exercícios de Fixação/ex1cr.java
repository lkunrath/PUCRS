/*1) Escreva um algoritmo que exiba 20 vezes a mensagem “Eu amo de
estudar algoritmos!” */

public class ex1cr {
    public static void main(String args[]){
        for(int i = 0; i < 20; i++){
            System.out.printf("\n%d. Eu amo estudar algoritmos!\n", i);
        }
    }    
}
/*Outro modo de fazer:
int cont = 0;
while(cont < 20){
    System.out.println("Eu amo estudar algoritmos!);
    cont++
}
