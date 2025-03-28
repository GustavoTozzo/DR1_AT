package Atividade11;
import java.util.Scanner;
import java.util.Random;

public class LoteriaSimples {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numerosSorteados = new int[6];
        int acertos = 0;

        for (int i = 0; i < 6; i++) {
            numerosSorteados[i] = random.nextInt(60) + 1;
        }

        Scanner scanner = new Scanner(System.in);
        int[] numerosUsuario = new int[6];

        System.out.println("Digite 6 números entre 1 e 60:");
        for (int i = 0; i < 6; i++) {
            numerosUsuario[i] = scanner.nextInt();
        }
        scanner.close();

        for (int num : numerosUsuario) {
            for (int sorteado : numerosSorteados) {
                if (num == sorteado) {
                    acertos++;
                    break;
                }
            }
        }

        System.out.println("Números sorteados: ");
        for (int num : numerosSorteados) {
            System.out.print(num + " ");
        }
        System.out.println("\nVocê acertou " + acertos + " número(s)!");
    }
}
