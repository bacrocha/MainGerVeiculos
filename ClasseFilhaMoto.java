// A classe Moto herda de Veiculo e representa uma moto específica.
// Ela tem um atributo e comportamento adicional relacionado ao sidecar.
public class ClasseFilhaMoto extends ClassePaiVeiculo {
    // Atributo específico de Moto.
    private boolean temSidecar;  // Indica se a moto possui um sidecar (verdadeiro ou falso).

    // Construtor da classe Moto que chama o construtor da classe pai e inicializa o atributo específico.
    public ClasseFilhaMoto(String marca, String modelo, int ano, boolean temSidecar) {
        // Chama o construtor da classe pai para inicializar os atributos comuns (marca, modelo, ano).
        super(marca, modelo, ano);
        this.temSidecar = temSidecar;  // Inicializa o atributo específico de Moto.
    }

    // Método sobrescrito para exibir os detalhes da moto, incluindo a presença de sidecar.
    @Override
    public void exibirDetalhes() {
        // Chama o método da classe pai para reutilizar a exibição dos atributos comuns.
        super.exibirDetalhes();
        // Exibe se a moto tem ou não sidecar.
        System.out.println("Tem sidecar: " + (temSidecar ? "Sim" : "Não"));
    }
}
