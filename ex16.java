import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quantos metros quadrados deseja pintar?");
        double m = input.nextDouble();
        double tinta = m/3;
        double lata = tinta/18;
        double valor = lata*80;
        System.out.println("Você irá precisar de "+tinta+" Litros de tinta para pintar a sua parede");
        System.out.println("Será necessario comprar "+(lata)+" Lata(s)");
        System.out.println("Você irá pagar "+valor+("R$"));
        input.close();
    }
}
