package Lista01;
import java.util.Locale;
import java.util.Scanner;
public class Questao07 {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        double celsius, farenheit;
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a temperatura em FARENHEIT a ser convertida: ");
        farenheit = sc.nextDouble();

        celsius = (farenheit-32)* 5/9;

        System.out.printf("Temperatura em FARENHEIT: %.4f\n", celsius);

        sc.close();
    }
}
