import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a medida do quadrado: ");
        double n = input.nextDouble();
        double a  = Math.pow(n, 2)*2;
        System.out.println("O dobro da área desse quadrado é: "+a+"cm²");
        input.close();        
    }
}
