// A classe Carro herda de Veiculo e representa um carro específico.
// Ela tem atributos e comportamentos adicionais em relação à classe pai.
public class ClasseFilhaCarro extends ClassePaiVeiculo {
    // Atributo específico de Carro.
    private int numeroDePortas;  // Representa o número de portas do carro.

    // Construtor da classe Carro que chama o construtor da classe pai e inicializa o atributo específico.
    public ClasseFilhaCarro(String marca, String modelo, int ano, int numeroDePortas) {
        // A palavra-chave "super" chama o construtor da classe pai (Veiculo) para inicializar os atributos comuns.
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;  // Inicializa o atributo específico de Carro.
    }

    // Método sobrescrito para exibir os detalhes do carro, incluindo o número de portas.
    @Override
    public void exibirDetalhes() {
        // Chamando o método da classe pai para reutilizar a exibição dos atributos comuns (marca, modelo, ano).
        super.exibirDetalhes();
        // Exibe o número de portas específico do carro.
        System.out.println("Número de portas: " + numeroDePortas);
    }
}
