import java.util.Locale;
import java.util.Scanner;
//import java.text.DecimalFormat;

public class ContaTerminal{

    public static void main(String[] args) throws Exception {
        Formatar formatar = new Formatar();

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        String nome;
        String agencia;
        int conta;
        double saldo;
        
        System.out.println("Digite seu nome:");
        nome=scanner.next();

        System.out.println("Digite o numero da agencia: ");
        agencia= scanner.next();

        System.out.println("Digite o numero da conta: ");
        conta=scanner.nextInt();


        System.out.println("Digite seu saldo: ");
        saldo=scanner.nextDouble();
        formatar.decimalFormat(saldo);
        
        
        System.out.println("\nOlá " +nome+ ", obrigada por criar conta em nosso banco!");
        System.out.println("\nSua agencia é: " +agencia+ " \nConta: " +conta+"\nSaldo: R$"+saldo+ "");

    }
}   
