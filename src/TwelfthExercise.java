import java.util.Scanner;

public class TwelfthExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String produto = "Motorola motoG59 256Gb";
        double valorProduto = 5200.0;
        System.out.printf("Produtos no estoque: %s Valor: %.2f%n%n", produto, valorProduto );
        System.out.println("1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto");
        System.out.println("2 - À Vista no cartão de crédito, recebe 10% de desconto");
        System.out.println("3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros");
        System.out.println("4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%*/");
        System.out.println("Escolha uma das 4 opcoes pra pagar");
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                double sum = (valorProduto * 15) / 100;
                double resultado = valorProduto - sum;
                System.out.printf("valor do produto com 15%% a vista no pix ou dinheiro eh: ", resultado);
                break;
                case 2:
        }

    }
}
