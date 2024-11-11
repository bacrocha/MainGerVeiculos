    // Classe principal que instancia objetos e demonstra o funcionamento
    import java.util.ArrayList;
    import java.util.List;

    public class MainGerVeiculos {
        public static void main(String[] args) {
            // Cria uma lista de veículos (Carros e Motos)
            List<ClassePaiVeiculo> veiculos = new ArrayList<>();

            // Adiciona alguns veículos de exemplo à lista
            veiculos.add(new ClasseFilhaCarro("Renalt", "Stepway", 2014, 5)); // Adiciona um carro com 4 portas
            veiculos.add(new ClasseFilhaMoto("Harley-Davidson", "FAT BOB 114", 2024, true)); // Adiciona uma moto com sidecar
            veiculos.add(new ClasseFilhaCarro("Chevrolet", "Tracker", 2022, 5)); // Adiciona outro carro com 4 portas

            // Exibe o cabeçalho para a listagem de detalhes dos veículos
            System.out.println(); // Linha em branco para separação visual
            System.out.println("===========================================================");
            System.out.println("                   Detalhes dos Veículos                   ");
            System.out.println("===========================================================");

            // Loop através da lista de veículos para exibir os detalhes de cada um
            for (int i = 0; i < veiculos.size(); i++) {
                ClassePaiVeiculo veiculo = veiculos.get(i); // Obtém o veículo atual da lista

                // Exibe o título de cada veículo (número sequencial)
                System.out.println(); // Linha em branco para separar os veículos visualmente
                System.out.println("Veículo " + (i + 1) + ":"); // Exibe a posição do veículo na lista

                // Chama o método exibirDetalhes para exibir as informações do veículo (marca, modelo, etc.)
                veiculo.exibirDetalhes();

                // Linha para separar visualmente os veículos após a exibição dos detalhes
                System.out.println("-----------------------------------------------------------");
            }
        }
    }

