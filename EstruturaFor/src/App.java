import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Faça um algoritmo que receba o preço de custo
        // e o preço de venda de 40 produtos. Mostre o
        // resultado se houve lucro, prejuízo ou empate
        // para cada produto. Informe o valor de custo de
        // cada produto, o valor de venda,
        // a média de preço de custo e do preço de venda

        String nomeProduto;
        float precoCusto;
        float precoVenda;
        float totalCusto = 0.0f;
        float totalVenda = 0.0f;

        Scanner scan = new Scanner(System.in);
        // Faça um algoritmo que receba o preço de custo
        // e o preço de venda de 40 produtos
        int i = 0;
        for (; i < 3; i++) {
            System.out.println("Nome do Produto: ");
            nomeProduto = scan.nextLine();

            System.out.println("Preço de Custo: ");
            precoCusto = scan.nextFloat();

            System.out.println("Preço de Venda: ");
            precoVenda = scan.nextFloat();

            // totaliza os preços para calcular média de preço de custo e do preço de venda
            totalCusto += precoCusto;
            totalVenda += precoVenda;

            // resultado se houve lucro, prejuízo ou empate
            // Mostre o valor de custo e venda de cada produto
            System.out.println(nomeProduto + " - preço de custo = " + precoCusto
                    + " - Preço de Venda: " + precoVenda);
            System.out.println();

            if (precoCusto == precoVenda) {
                System.out.println("Houve empate entre preço custo e preço de venda");

            } else {
                if (precoCusto > precoVenda) {
                    System.out.println("Houve Prejuízo");

                } else {
                    System.out.println("Houve Lucro");
                }
            }
            scan.nextLine();
        }

        // a média de preço de custo e do preço de venda
        System.out.println("Média do preço de Venda: " + (totalVenda / i));
        System.out.println("Média do preço de Custo: " + (totalCusto / i));
        scan.close();

    }
}
