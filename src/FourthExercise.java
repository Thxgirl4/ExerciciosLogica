import java.util.Scanner;

public class FourthExercise {
    public static void main(String[] args) {
        //Faça um algoritmo que receba um número inteiro
        // e imprima na tela do seu antecessor e do seu sucessor

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        int nextNum = num + 1;
        int previousNum = num - 1;
        System.out.println("O sucessor do numero " + num + " é " + nextNum);
        System.out.println("O antecessor do numero " + num + " é " + previousNum);
    }
}
