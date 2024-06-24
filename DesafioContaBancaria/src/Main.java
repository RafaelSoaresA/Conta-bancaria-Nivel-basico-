import java.util.Scanner;

public class Main {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        String nome = "";
        String tipoConta = "";
        double saldo = 0;
        double manipulacao = 0;

        int opcao = 0;
        Conta conta = new Conta(nome, tipoConta, saldo);

        System.out.println("<---------------------->");
        System.out.println("Digite seu nome: ");
        conta.setNome(entrada.nextLine());
        System.out.println("Digite seu tipo de conta: ");
        conta.setTipoConta(entrada.nextLine());
        System.out.println("Digite seu saldo atual: ");
        conta.setSaldo(entrada.nextDouble());
        System.out.println("<---------------------->");

        while (opcao != 4) {
            System.out.println("1 - Consultar saldos");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair\n");
            System.out.println("Digite a opção desejada");
            opcao = entrada.nextInt();

            if (opcao == 1) {
                System.out.println("<---------------------->");
                System.out.println("Nome: " + conta.getNome());
                System.out.println("Tipo: " + conta.getTipoConta());
                System.out.println("Saldo: " + conta.getSaldo());
                System.out.println("<---------------------->");

            }else if (opcao == 2) {
                System.out.println("Digite o valor que deseja depositar: ");
                manipulacao = entrada.nextDouble();
                conta.setSaldo(conta.getSaldo() + manipulacao);

            }else if (opcao == 3) {
                System.out.println("Digite o valor que deseja transferir: ");
                manipulacao = entrada.nextDouble();
                conta.setSaldo(conta.getSaldo() - manipulacao);


            }else if (opcao == 4) {
                System.out.println("Aplicação encerrada");
                break;
            }else{
                System.out.println("Valor não encontrado!");
            }
        }
    }




}