import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
   public static void main(String[]args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("insira dois numeros: ");
       int n1 = scanner.nextInt();
       int n2 = scanner.nextInt();

       System.out.println("Perfeito! agora escolha uma das 4 operações abaixo: ");
       System.out.println("1. Adição");
       System.out.println("2. Subtração");
       System.out.println("3. Multiplicação");
       System.out.println("4. Divisão");

       int opera = scanner.nextInt();
       if (opera == 1){
           System.out.println("Você escolheu adição!");
           System.out.println("Somando os numeros.....");
       int   soma = n1 + n2;

           System.out.println("A soma dos dois numeros escolhidos foi " +" " + soma);
       } else if (opera == 2) {
           System.out.println("Você escolheu subtração");
           System.out.println("Subtraindo.....");
         int  sub = n1 - n2;

           System.out.println("A subtração dos numeros foi: " + " " +sub);
       } else if (opera == 3 ) {
           System.out.println("Voce escolheu multiplicação!");
           System.out.println("Multiplicando......");
           int mult = n1 * n2;

           System.out.println("A multiplicação dos numeros foi: " +" "+ mult);
       } else if (opera == 4){
           System.out.println("Então escolheste a divisão");
           System.out.println("Dividindo......");

           int div2 = n1 / n2;

           System.out.println("A divisão dos numeros que escolheu foi: " + " " +div2);

       } else {
           System.out.println("Nenhuma operação foi escolhida, resete o sistema");
       }

   }
   }





