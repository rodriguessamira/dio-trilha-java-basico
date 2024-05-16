
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
       
       //String nome = args [0];
       // String sobrenome = args [1];
       //int idade = Integer.parseInt(args [2]);
       //double altura = Double.parseDouble(args[3]);
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        String nome;
        String sobrenome;
        int idade;
        double altura;

        System.out.println("Digite o seu nome: ");
        nome= scanner.next();

        System.out.println("Digite o seu sobrenome: ");
        sobrenome= scanner.next();

        System.out.println("Digite sua idade: ");
        idade=scanner.nextInt();

        System.out.println("Digite sua altura ");
        altura=scanner.nextDouble();

       System.out.println("\n----------------------------------");
        System.out.println("\nOlá, me chamo " + nome + " " +sobrenome);
        System.out.println("Tenho " + idade + " anos" );
        System.out.println("E tenho " + altura + " de altura" );

    } 
}
