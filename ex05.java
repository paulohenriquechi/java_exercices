import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a medida que deseja converter em metros para centimetros: ");
        double n = input.nextDouble();
        double r = n*100;
        System.out.println("O valor de "+n+" metros em centimetros é de "+r+"cm");
        input.close();
    }
}
