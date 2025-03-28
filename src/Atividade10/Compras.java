package Atividade10;
import java.io.*;
import java.util.Scanner;

public class Compras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("compras.txt"))) {
            for (int i = 0; i < 3; i++) {

                System.out.print("Produto: ");
                String produto = scanner.nextLine();
                System.out.print("Quantidade: ");
                int quantidade = scanner.nextInt();
                System.out.print("Preço Unitário: ");
                double preco = scanner.nextDouble();
                scanner.nextLine();
                writer.write(produto + ", " + quantidade + ", " + preco);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo.");
        }
        scanner.close();

        System.out.println("\nCompras registradas:");
        try (BufferedReader reader = new BufferedReader(new FileReader("compras.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo.");
        }
    }
}
