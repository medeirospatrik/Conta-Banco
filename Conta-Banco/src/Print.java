public class Print {
    public void printAccount(String name, String lastName, String agency, int number, double balance) {
        String fullName = name + " " + lastName;

        System.out.println("Olá " + fullName + " obrigado por crirar uma conta em nosso banco, sua agencia é: " + agency + ", conta: " + number + " e seu saldo: " + balance + " ja está disponivel para saque." );
    }
}
