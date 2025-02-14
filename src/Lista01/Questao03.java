package Lista01;
import java.util.Scanner;
import java.util.Locale;

public class Questao03 {
    public static void main(String[]args){
        int idVendedor, idPeca, qtdVendida;
        double precoUnid, comicaoTotal;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Seu numero de identificação: ");
        idVendedor = sc.nextInt();

        System.out.println("O código da peça: ");
        idPeca = sc.nextInt();

        System.out.println("Quantidade de peças vendidas: ");
        qtdVendida = sc.nextInt();

        System.out.println("Valor unitário da peça: ");
        precoUnid = sc.nextDouble();

        comicaoTotal = (qtdVendida*precoUnid)*0.05;

        System.out.printf(
                "O vendedor de id: %d vendeu %d peças de id: %d, com o preço unitário de %.2f, totalizando sua comissão em R$%.2f%n",
                idVendedor, qtdVendida, idPeca, precoUnid, comicaoTotal
        );
        sc.close();
    }
}
