import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua altura: ");
        double h = input.nextDouble();
        double m  = ((72.7*h)-58);
        double w  = ((62.1*h)-44.7);
        System.out.println("Peso ideal para homem: "+m+"KG");
        System.out.println("Peso ideal para mulher: "+w+"KG");
        input.close();
    }
}
