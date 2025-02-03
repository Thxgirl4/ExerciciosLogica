import java.util.Scanner;

public class SeventhExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 1ª valor boleano: ");
        boolean value1 = sc.nextBoolean();
        System.out.println("Digite o 2ª valor boleano: ");
        boolean value2 = sc.nextBoolean();

        if(value1 && value2){
            System.out.println("Os valores são verdadeiros");
        } else if(!value1 && !value2){
            System.out.println("Os valores são falsos");
        } else{
            System.out.println("Valores diferentes");
        }
    }
}
