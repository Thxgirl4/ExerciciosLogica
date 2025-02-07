import java.util.Scanner;

public class TerceiroExercicio {
    public static void main(String[] args) {
        /* Faça um algoritmo que leia dois valores inteiros A e B,
        se os valores de A e B forem iguais, deverá somar os dois valores,
        caso contrário deve-se multiplicar A por B.
        Ao final de qualquer um dos cálculos deve-se referir o resultado
        a uma variável C e
        imprimir seu valor na tela.
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int A = sc.nextInt();
        System.out.println("Digite um numero: ");
        int B = sc.nextInt();
        int C;
        if(A == B){
            C = A + B;
            System.out.println("A soma de A e B é: " + C);
        } else{
            C = A * B;
            System.out.println("A multiplicação de A e B é: " + C);
        }
    }
}
