import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int a = input.nextInt();
        System.out.println("Digite outro número inteiro: ");
        int b = input.nextInt();
        System.out.println("Agora digite um número real: ");
        double c = input.nextDouble();
        double n1 = (a*2+(b/2));
        double n2 = (c+(a*3));
        double n3 = Math.pow(c, 3);
        System.out.println("O dobro do primeiro número somado a metade do segundo número é: "+n1);
        System.out.println("O triplo do primeiro número somado com o terceiro número é: "+n2);
        System.out.println("O terceiro número elevado ao cubo é: "+n3);
        input.close();
    }
}
