import java.util.Scanner;

public class CategoriaHabilitacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de rodas do veículo: ");
        int quantidadeRodas = scanner.nextInt();

        System.out.print("Informe o peso bruto do veículo (em kg): ");
        double pesoBruto = scanner.nextDouble();

        System.out.print("Informe a quantidade de pessoas no veículo: ");
        int quantidadePessoas = scanner.nextInt();

        if (quantidadeRodas >= 2 && quantidadeRodas <= 3) {
            System.out.println("Categoria de habilitação: A");
        } else if (quantidadeRodas == 4 && quantidadePessoas <= 8 && pesoBruto <= 3500) {
            System.out.println("Categoria de habilitação: B");
        } else if (quantidadeRodas >= 4 && pesoBruto > 3500 && pesoBruto <= 6000) {
            System.out.println("Categoria de habilitação: C");
        } else if (quantidadeRodas >= 4 && quantidadePessoas > 8) {
            System.out.println("Categoria de habilitação: D");
        } else if (quantidadeRodas >= 4 && pesoBruto > 6000) {
            System.out.println("Categoria de habilitação: E");
        } else {
            System.out.println("Categoria de habilitação não definida.");
        }

        scanner.close();
    }
}
