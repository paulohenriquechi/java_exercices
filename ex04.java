import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a 1º nota: ");
        double n1 = input.nextDouble();
        System.out.println("Digite a 2º nota: ");
        double n2 = input.nextDouble();
        System.out.println("Digite a 3º nota: ");
        double n3 = input.nextDouble();
        System.out.println("Digite a 4º nota: ");
        double n4 = input.nextDouble();
        input.close();
        double r = (n1+n2+n3+n4)/4;
        System.out.println("A sua média foi de: "+r);
    }
}
