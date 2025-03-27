package Atividade3;
import java.util.Scanner;

public class CalculoImpostoRenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu salário mensal: ");
        double salarioMensal = scanner.nextDouble();

        double salarioAnual = salarioMensal * 12;
        double imposto = calcularImposto(salarioAnual);
        double salarioLiquido = salarioAnual - imposto;

        System.out.println("Nome: " + nome);
        System.out.printf("Salário Anual: R$ %.2f\n", salarioAnual);
        System.out.printf("Imposto de Renda: R$ %.2f\n", imposto);
        System.out.printf("Salário Líquido: R$ %.2f\n", salarioLiquido);

        scanner.close();
    }

    public static double calcularImposto(double salarioAnual) {
        if (salarioAnual <= 22847.76) {
            return 0;
        } else if (salarioAnual <= 33919.80) {
            return salarioAnual * 0.075;
        } else if (salarioAnual <= 45012.60) {
            return salarioAnual * 0.15;
        } else {
            return salarioAnual * 0.275;
        }
    }
}
