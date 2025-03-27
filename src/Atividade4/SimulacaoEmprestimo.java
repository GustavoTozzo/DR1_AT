package Atividade4;
import java.util.Scanner;

public class SimulacaoEmprestimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o valor do empréstimo: R$");
        double valorEmprestimo = scanner.nextDouble();

        int parcelas;
        do {
            System.out.print("Digite o número de parcelas (mínimo 6, máximo 48): ");
            parcelas = scanner.nextInt();
            if (parcelas < 6 || parcelas > 48) {
                System.out.println("Número de parcelas inválido. Tente novamente.");
            }
        } while (parcelas < 6 || parcelas > 48);

        double taxaJuros = 0.03;
        double valorTotal = valorEmprestimo * Math.pow(1 + taxaJuros, parcelas);
        double valorParcela = valorTotal / parcelas;

        System.out.println("\nSimulação de Empréstimo para " + nome);
        System.out.printf("Valor Total Pago: R$ %.2f\n", valorTotal);
        System.out.printf("Valor da Parcela: R$ %.2f\n", valorParcela);

        scanner.close();
    }
}
