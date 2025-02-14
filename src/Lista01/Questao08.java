package Lista01;
import java.util.Scanner;
public class Questao08 {
    public static void main(String[]args){
        double volumeLata, raioLata, alturaLata;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o raio da lata: ");
        raioLata = sc.nextDouble();
        System.out.println("Qual a altura da lata: ");
        alturaLata = sc.nextDouble();

        volumeLata = 3.14159 * raioLata * raioLata * alturaLata;

        System.out.printf("Volume da lata:  %.4f cm",
                volumeLata
        );
    }
}
