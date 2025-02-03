import java.util.Scanner;

public class SixthExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        double valor = sc.nextDouble();
        double total = valor * .05;
        double result = valor + total;
        System.out.printf("O valor com acrescimo de 5%% é: %.2f" , result);
    }
}
