import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus celsius: ");
        double c = input.nextDouble();
        double f = ((c*1.8)+32);
        System.out.println("A temperatura em fahrenheit é: "+f+"ºF");
        input.close();
    }
}
