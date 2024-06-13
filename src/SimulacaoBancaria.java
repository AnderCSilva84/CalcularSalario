import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;

        boolean continuar = true;

        while (continuar) {
            System.out.println(">>>>>MENU<<<<<");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Saldo em Conta");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Qual o valor a ser depositado? ");
                    double deposito = scanner.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito realizado com sucesso.");
                    } else {
                        System.out.println("Valor de depósito inválido.");
                    }
                    break;

                case 2:
                    System.out.print("Qual o valor a ser sacado? ");
                    double saque = scanner.nextDouble();
                    if (saque > 0 && saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saque realizado com sucesso.");
                    } else if (saque > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        System.out.println("Valor de saque inválido.");
                    }
                    break;

                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false; // Atualiza a variável de controle para encerrar o loop
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            System.out.println();
        }
        scanner.close();
    }
}
