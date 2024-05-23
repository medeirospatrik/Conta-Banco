import java.util.Random;

public class AccountNumber {
    public int numberAccount() {
        Random random = new Random();
        int numeroQuatroDigitos = 1000 + random.nextInt(9000);  // Gera um número entre 1000 e 9999
        return numeroQuatroDigitos;
    }
}