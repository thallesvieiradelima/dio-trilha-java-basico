import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.println("Por favor, digite o número da agência: ");
        String agencia = sc.nextLine();
        System.out.println("Digite o seu nome completo: ");
        String nomeCliente = sc.nextLine();
        System.out.println("Digite o valor do saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá, " + nomeCliente + ", " + " obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + numeroConta +  " e seu saldo: R$" + saldo +  " já está disponível para saque.");

        sc.close();
    }
}