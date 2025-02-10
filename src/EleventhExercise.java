import java.util.Scanner;

public class EleventhExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua 1ª nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite sua 2ª nota: ");
        double nota2 = sc.nextDouble();

        System.out.println("Digite sua 3ª nota: ");
        double nota3 = sc.nextDouble();

        System.out.println("Digite sua 4ª nota: ");
        double nota4 = sc.nextDouble();

        double resultado = nota1 + nota2 + nota3 + nota4;
        double media = resultado / 4;

        if(media > 5 && media < 7 ) {
            System.out.printf("Você está em Recuperação %s e sua média eh %.2f", nome, media);
        } else if(media > 7){
            System.out.printf("Você está Aprovado %s e sua média eh %.2f", nome, media);
        } else {
            System.out.printf("Você está reprovado %s e sua media eh %.2f", nome, media);
        }
    }
}
