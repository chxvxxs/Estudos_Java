package Lista01;
import java.util.Scanner;
import java.util.Locale;
public class Questao02 {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        double cotacao,valDolar,valReal;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a cotação do DOLAR HOJE: ");
        cotacao = sc.nextDouble();

        System.out.println("Qual o valor que desja converter?");
        System.out.println("Insira-o aqui: ");
        valDolar = sc.nextDouble();

        valReal = valDolar * cotacao;

        System.out.printf("Valor em reais de acordo com a cotação de hoje: %.2f\n", valReal);

    }
}
