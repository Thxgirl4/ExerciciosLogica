import java.util.Scanner;

public class FifthExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu salario: ");
        double salario = sc.nextDouble();
        double salarioMin = 1293.20;
        double total = salario / salarioMin;
        System.out.printf("O salario é: %.2fx o salario minimo ", total);
    }
}
