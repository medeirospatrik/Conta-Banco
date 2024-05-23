import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Print print = new Print();
        AccountNumber accountNumber = new AccountNumber();
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu nome:");
        String nome = scanner.next();

        System.out.println("Por favor, digite seu sobrenome:");
        String sobreNome = scanner.next();

        System.out.println("Qual numero da agencia ?");
        String agencia = scanner.next();

        System.out.println("Por favor, digite qual valor gostaria de depositar na sua conta?");
        double saldo = scanner.nextDouble();

        int conta = accountNumber.numberAccount();
        
        print.printAccount(nome, sobreNome, agencia, conta, saldo);
    }
}
