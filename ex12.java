import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua altura: ");
        double h = input.nextDouble();
        double w = ((72.7*h)-58);
        System.out.println("Seu peso ideal é: "+w+"KG");
        input.close();
    }
}
