import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         while (n >= 0) {
             sum = sum + n;
             if(sum >= 100)
                 sum = 0;

         }
         System.out.println(sum);
    }
}
