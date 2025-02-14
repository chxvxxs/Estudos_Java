package Lista01;
import java.util.Locale;
import java.util.Scanner;
public class Questao06 {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        double celsius, farenheit;
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a temperatura em CELSIUS a ser convertida: ");
        celsius = sc.nextDouble();

        farenheit = (9*celsius+160)/5;

        System.out.printf("Temperatura em FARENHEIT: %.4f\n", farenheit);

        sc.close();
    }
}
