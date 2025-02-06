import java.util.Scanner;

public class NinethExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu peso: ");
        double peso = sc.nextDouble();
        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();
        double alturaElevada = Math.pow(altura, 2.0);
        double imc = peso / alturaElevada;
        if(imc <= 18.5 ){
        System.out.println("Voce está abaixo do peso, desnutrida!" + "seu imc eh: " + imc);
    } else if(imc >= 18.6 && imc <= 24.9){
        System.out.println("Voce esta em seu peso ideal, não faz mais que sua obrigação!" + "seu imc eh: " + imc);
        } else if(imc >= 25.0 && imc <= 29.9){
            System.out.println("Voce está acima do peso, vai pra academia!" + "seu imc eh: " + imc);
        } else if(imc >= 30.0 && imc <= 34.9){
            System.out.println("Voce está obeso, favor ir se tratar!" + "seu imc eh: " + imc);
        } else if(imc >= 35.0 && imc <= 39.9){
            System.out.println("Voce esta muito obeso, sério, vai se tratar!" + "seu imc eh: " + imc);
        } else {
            System.out.println("Rolha de poço, seu imc é: " + imc);
        }
    }
}

/*
Faça um algoritmo que calcula o IMC (Índice de Massa Corporal) de uma pessoa,
leia o seu peso e sua altura e imprima na tela sua condição
de acordo com a tabela abaixo:

Fórmula do IMC = peso / (altura)²

Tabela Condições IMC

Abaixo de 18,5 | Abaixo do peso

Entre 18,6 e 24,9 | Peso ideal (parabéns)

Entre 25,0 e 29,9 | Nível acima do peso

Entre 30,0 e 34,9 | Obesidade grau I

Entre 35,0 e 39,9 | Obesidade grau II (severa)

Maior ou igual a 40 | Obesidade grau III (mórbida)

 */