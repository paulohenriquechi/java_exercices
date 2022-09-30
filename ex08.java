import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quanto você ganha por hora trabalhada? R$:");
        double a = input.nextDouble();
        System.out.println("Quantas horas você trabalha por mês?:");
        double b = input.nextDouble();
        double c = a*b;
        System.out.println("Você receberá "+c+"R$");
        input.close();
    }
}
