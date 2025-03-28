package Atividade9;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual de " + titular + ": R$" + saldo);
    }
}

class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("João", 1000);

        conta.exibirSaldo();
        conta.depositar(500);
        conta.sacar(300);
        conta.sacar(1500);
        conta.exibirSaldo();
    }
}
