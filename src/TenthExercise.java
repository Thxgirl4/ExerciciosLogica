import java.util.Scanner;

public class TenthExercise {
    public static void main(String[] args) {
        // Faça um algoritmo que leia três notas obtidas por um aluno,
        // e imprima na tela a média das notas.

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String aluno = sc.nextLine();
        sc.nextLine();

        System.out.println("Digite sua 1ª nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite sua 2ª nota: ");
        double nota2 = sc.nextDouble();

        System.out.println("Digite sua 3ª nota: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        if(media >= 6.5)
            System.out.println(" Parabéns " + aluno + ", voce foi aprovado! " + " sua média eh " + media);
        else
            System.out.println("Poxa " + aluno + ", voce foi reprovado! " + " sua media eh " + media);

    }
}
