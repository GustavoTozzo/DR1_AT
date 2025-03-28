package Atividade8;

public class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public String getNome() {
        return nome;
    }
}

class Gerente extends Funcionario {
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
        this.salarioBase *= 1.2;
    }
}

class Estagiario extends Funcionario {
    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
        this.salarioBase *= 0.9;
    }
}

class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Gustavo", 2500);
        Estagiario estagiario = new Estagiario("Ana", 1200);

        System.out.println("Salário do Gerente " + gerente.getNome() + ": R$" + gerente.calcularSalario());
        System.out.println("Salário do Estagiário " + estagiario.getNome() + ": R$" + estagiario.calcularSalario());
    }
}
