package Lista01;
import java.util.Scanner;
import java.util.Locale;
public class Questao01 {
    public static void main(String[] args) {
        int qtdMinima, qtdMaxima;
        double estqMedio;
        Scanner sc =  new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Insira a quantidade mínima do produto: ");
        qtdMinima = sc.nextInt();
        System.out.println("Insira a quantidade máxima do produto: ");
        qtdMaxima = sc.nextInt();

        estqMedio = (qtdMinima + qtdMaxima)/2.0;

        System.out.printf("Estoque Médio: %.2f\n", estqMedio);

        sc.close();
    }
}