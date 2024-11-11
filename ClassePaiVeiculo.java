// A classe Veiculo serve como a superclasse (classe pai) para diferentes tipos de veículos.
public class ClassePaiVeiculo {
    // Atributos comuns a todos os veículos.
    private String marca;  // Marca do veículo.
    private String modelo; // Modelo do veículo.
    private int ano;       // Ano de fabricação do veículo.

    // Construtor da classe Veiculo que inicializa os atributos comuns.
    // O construtor é usado para criar instâncias da classe com valores fornecidos.
    public ClassePaiVeiculo(String marca, String modelo, int ano) {
        this.marca = marca;    // Atribui o valor da marca ao atributo da classe.
        this.modelo = modelo;  // Atribui o valor do modelo ao atributo da classe.
        this.ano = ano;        // Atribui o valor do ano ao atributo da classe.
    }

    // Método para exibir os detalhes do veículo.
    // Ele será reutilizado ou sobrescrito pelas classes filhas.
    public void exibirDetalhes() {
        // Exibe os detalhes do veículo no console.
        System.out.println("Marca: " + marca);     // Exibe a marca do veículo.
        System.out.println("Modelo: " + modelo);   // Exibe o modelo do veículo.
        System.out.println("Ano: " + ano);         // Exibe o ano do veículo.
    }   
}
