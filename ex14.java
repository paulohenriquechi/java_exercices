import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite quantos kilos de peixe você tem: ");
        double kg = input.nextDouble();
        double e = kg-50;
        double m = e*4;
        System.out.println("Você excedeu "+e+"kilos, o valor a ser pago de multa é de: "+m+"R$");
        input.close();
    }
}
