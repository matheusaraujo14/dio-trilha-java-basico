import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ContaBanco conta = new ContaBanco();

        //Pegando Numero da conta
        System.out.println("Digite o número da conta:");
        conta.setNumero(scanner.nextInt());

        //Pegando Agência
        System.out.println("Digite a agência:");
        conta.setAgencia(scanner.next());

        //Pegando Nome do Cliente
        System.out.println("Digite o nome do cliente:");
        conta.setNomeCliente(scanner.next());

        //Pegando Saldo
        System.out.println("Digite o saldo:");
        conta.setSaldo(scanner.nextDouble());

        //Imprimindo os dados da conta

        System.out.println("Olá " + conta.getNomeCliente() +", obrigado por criar uma conta em nosso banco, sua agência é "+ conta.getAgencia() + ", conta "+ conta.getNumero() +" e seu saldo "+ conta.getSaldo() +" já está disponível para saque.");

        scanner.close();
    }
}