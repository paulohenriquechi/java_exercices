import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o raio do circulo que deseja saber a área: ");
        double r = input.nextDouble();
        double a = 3.14*(Math.pow(r, 2));
        System.out.println("A área da circunferencia informada é: "+a);
        input.close();
    }
}
