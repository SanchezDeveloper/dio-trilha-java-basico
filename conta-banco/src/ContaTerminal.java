import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 
        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores para o nosso usuário
        double saldo = 237.48;

        System.out.println("Olá! Por favor, digite o número de USUÁRIO");
        int numero = scanner.nextInt();
        
        System.out.println("Digite o número da sua AGÊNCIA");
        String agencia = scanner.next();

        System.out.println("Por favor, Digite seu nome e sobrenome");
        String nome = scanner.next();

        //Exibir a mensagem conta criada
        System.out.println("Olá, " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
