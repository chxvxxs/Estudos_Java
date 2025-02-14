package ListaRevisao01;
import java.util.Scanner;
public class Questao07 {
    public static void main (String[]args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Informe o número: ");
        int a = sc.nextInt();
        System.out.printf((a>0) ? "O número é positivo!" : (a<0)?"O número é negativo!" : "O número é zero!");
    }
}
