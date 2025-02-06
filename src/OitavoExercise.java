import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OitavoExercise {
    public static void main(String[] args) {
    // Faça um algoritmo que leia três valores inteiros diferentes e
        // imprima na tela os valores em ordem decrescente.

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valor1 = sc.nextInt();

        System.out.println("Digite um valor: ");
        int valor2 = sc.nextInt();

        System.out.println("Digite um valor: ");
        int valor3 = sc.nextInt();

        int[] valores = {valor1, valor2, valor3};
        Arrays.sort(valores);

        System.out.println("Valores em ordem decrescente: ");
        for(int i = valores.length - 1; i>=0; i--) {
            System.out.println(valores[i] + " ");
        }


    }
}
