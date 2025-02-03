import java.util.Scanner;

public class TerceiroExercicio {
    public static void main(String[] args) {
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
