import java.util.Scanner;

public class inversao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int a = input.nextInt();
        System.out.println("Digite o segundo número");
        int b = input.nextInt();
        int a1 = b;
        int b2 = a;
        System.out.println("Invertendo os valores, A é igual a "+a1+" e B é igual a "+b2);
        input.close();
    }
}