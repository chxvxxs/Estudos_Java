package ListaRevisao01;
import java.util.Scanner;
public class Questao06 {
    public static void main(String[]args){
        double n1, n2, n3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nota 1: ");
        n1 = sc.nextDouble();
        System.out.println("Nota 2: ");
        n2 = sc.nextDouble();
        System.out.println("Nota 3: ");
        n3 = sc.nextDouble();
        verificarMedia(n1,n2,n3);
        sc.close();
    }
    public static void verificarMedia(double a, double b, double c){
        double media;
        media = (a+b+c)/3;
        System.out.printf("A média obtida foi: %.2f", media);
    }
}
