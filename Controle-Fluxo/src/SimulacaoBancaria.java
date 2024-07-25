import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        System.out.println("Defina uma opção para executar a ação.");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Consultar Saldo");
        System.out.println("4 - Encerrar");

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // DEPOSITAR -> TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    double valorDeposito = scanner.nextDouble();
                    saldo = saldo + valorDeposito;
                    System.out.printf("Saldo atual %.1f \n", saldo);
                    System.out.println("teste");
                    break;
                case 2:
                    // SACAR -> TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    System.out.println("Informe um valor para sacar: ");
                    double valorSaque = scanner.nextDouble();
                    if(valorSaque > saldo){
                        System.out.println("Saldo insuficiente.");
                        break;
                    }
                    else {
                        saldo = saldo - valorSaque;
                        System.out.printf("Saldo atual %.1f", saldo, "\n");
                        break;
                    }                   
                case 3:
                    // CONSULTAR SALDO -> TODO: Exibir o saldo atual da conta.
                    System.out.printf("Saldo atual %.1f", saldo, "\n");
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}