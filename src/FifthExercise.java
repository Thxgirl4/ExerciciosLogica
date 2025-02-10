import java.util.Scanner;

public class FifthExercise {
    public static void main(String[] args) {
        /*
         Faça um algoritmo que leia o valor do salário mínimo
         e o valor do salário de um usuário, calcule quantos intervalos mínimos esse
         o usuário ganha e imprime na tela o resultado.
         (Base para o Salário mínimo R$ 1.293,20)
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu salario: ");
        double salario = sc.nextDouble();
        double salarioMin = 1293.20;
        double total = salario / salarioMin;
        System.out.printf("O salario é: %.2fx o salario minimo ", total);
    }
}
