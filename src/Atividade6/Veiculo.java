package Atividade6;

public class Veiculo {
    private String placa;
    private String modelo;
    private int anoFabricacao;
    private double quilometragem;

    public Veiculo(String placa, String modelo, int anoFabricacao, double quilometragem) {
        this.placa = placa;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.quilometragem = quilometragem;
    }

    public void exibirDetalhes() {
        System.out.println("-------------------------");
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Quilometragem: " + quilometragem + " km");
        System.out.println("-------------------------\n");
    }

    public void registrarViagem(double km) {
        if (km > 0) {
            quilometragem += km;
            System.out.println("Viagem registrada: " + km + " km");
        } else {
            System.out.println("Distância inválida para viagem.");
        }
    }

    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("ABC-1234", "Fusca", 1998, 45000);
        Veiculo veiculo2 = new Veiculo("DEF-5678", "Vectra", 2006, 55000);

        System.out.println("Detalhes dos veículos antes da viagem:");
        veiculo1.exibirDetalhes();
        veiculo2.exibirDetalhes();

        veiculo1.registrarViagem(150.5);
        veiculo2.registrarViagem(300.8);

        System.out.println("\nDetalhes dos veículos após a viagem:");
        veiculo1.exibirDetalhes();
        veiculo2.exibirDetalhes();
    }
}
