import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = input.nextInt();
        input.close();
        System.out.println("O número informado foi "+n);
    } 
}
