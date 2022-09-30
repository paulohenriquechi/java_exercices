import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quanto você recebe por hora? R$");
        double d = input.nextDouble();
        System.out.println("Quantas horas você trabalha por mês?:");
        double h = input.nextDouble();
        double sb = d*h;
        double ir = sb*0.11;
        double inss = sb*0.08;
        double sd = sb*0.05;
        double sl = sb-ir-inss-sd;
        System.out.println("Seu salário bruto é de: "+sb+"R$");
        System.out.println("Será descontado 11% de Imposto de renda totalizando: "+ir+"R$");
        System.out.println("Será descontado 8% de INSS totalizando: "+inss+"R$");
        System.out.println("Será descontado 5% de sindicato totalizando: "+sd+"R$");
        System.out.println("Seu salário liquido será de: "+sl+"R$");        
        input.close();
    }
}
