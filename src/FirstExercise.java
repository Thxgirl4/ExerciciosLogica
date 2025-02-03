import java.util.Scanner;

public class FirstExercise {

    public static void main(String[] args) {
        System.out.println("Digite um valor Inteiro: ");
        Scanner integerScanner = new Scanner(System.in);
        int A = integerScanner.nextInt();
        System.out.println("Digite um valor Inteiro: ");
        int B = integerScanner.nextInt();
        System.out.println("Digite um valor Inteiro: ");
        int C = integerScanner.nextInt();

        int soma = A + B;
        if(soma <= C){
            System.out.println("A soma de A + B é: " + soma + "\t a soma de A + B é menor ou igual a C");
        } else{
            System.out.println("A soma de A + B é: " + soma + " a soma de A + B é maior que C");
        }
    }
}


