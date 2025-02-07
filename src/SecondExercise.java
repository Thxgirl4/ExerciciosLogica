import java.util.Scanner;

public class SecondExercise {
    public static void main(String[] args) {
        //Faça um algoritmo para receber um número qualquer
        // e imprimir na tela se o número é par ou ímpar, positivo ou negativo

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        if(num >= 0){
            if(num % 2 == 0){
                System.out.println("O numero " + num + " é positivo e par");
            } else{
                System.out.println("O numero " + num + " é positivo e impar");
            }
        } else {
            if(num % 2 == 0){
                System.out.println("O numero " + num + " é negativo e par");
            } else{
                System.out.println("O numero " + num + " é negativo e impar");
            }
        }
    }
}
