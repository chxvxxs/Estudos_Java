package Lista01;
import java.util.Scanner;
public class Questao09 {
    public static void main(String[]args){
        int dias, anos, mes, totalDeDias;
        Scanner sc  = new Scanner(System.in);

        System.out.println("Insira a sua idade na seguinte ordem -> 1 - Anos | 2 - Meses | 3 - Dias: ");
        anos = sc.nextInt();
        mes  = sc.nextInt();
        dias = sc.nextInt();

        totalDeDias = (365*anos) + (30*mes) + dias;

        System.out.println("Total de dias = " + totalDeDias);

    }
}
