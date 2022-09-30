import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        float n1 = input.nextFloat();
        System.out.println("Digite o segundo número: ");
        float n2 = input.nextFloat();
        input.close();
        float r = n1+n2;
        System.out.println("A soma dos valores é igual a : "+r);
    }
}
