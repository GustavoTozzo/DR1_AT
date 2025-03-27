package Atividade2;
import java.util.Scanner;

public class ValidadorSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        String senha;
        while (true) {
            System.out.print("Digite sua senha: ");
            senha = scanner.nextLine();

            String validacao = validarSenha(senha);
            if (validacao.equals("Valida")) {
                System.out.println("Senha cadastrada com sucesso!");
                break;
            } else {
                System.out.println(validacao);
            }
        }

        scanner.close();
    }

    public static String validarSenha(String senha) {
        if (senha.length() < 8) {
            return "A senha deve ter pelo menos 8 caracteres.";
        }
        if (!senha.matches(".*[A-Z].*")) {
            return "A senha deve conter pelo menos uma letra maiúscula.";
        }
        if (!senha.matches(".*[0-9].*")) {
            return "A senha deve conter pelo menos um número.";
        }
        if (!senha.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\,.<>?/].*")) {
            return "A senha deve conter pelo menos um caractere especial.";
        }
        return "Valida";
    }
}
