import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int totalAlunos = 10;

        Scanner sc = new Scanner(System.in);

        while (totalAlunos > 0) {
            System.out.println("Nome do aluno: ");
            String nomeAluno = sc.nextLine();
            System.out.println("Idade: ");
            int idadeAluno = sc.nextInt();

            System.out.println("O nome do aluno é: " + nomeAluno + " e sua idade é: " + idadeAluno);

            totalAlunos -= totalAlunos;
        }

        int num;
        do {
            System.out.println("Digite -1 para sair");
            System.out.println("Digite um Numero: ");
            num = sc.nextInt();

            num = num % 2;
            if (num == 0) {
                System.out.println("Numero é 0");
            }
            if (num > 0) {
                System.out.println("Numero é maior que zero");
            } else {
                System.out.println("Numero é menor que zero");
            }

            System.out.println("Numero digitado: " + num);
            System.out.println();

        } while (num != -1);
        sc.close();
    }
}
