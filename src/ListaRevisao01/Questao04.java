package ListaRevisao01;
import java.util.Scanner;
public class Questao04 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        calcularNumeroFatorial(num);
        sc.close();
    }
    public static void calcularNumeroFatorial(int a) {
        int fatorial = 1;
        for (int i = a; i > 0; i--) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + a + " é: " + fatorial);
    }
}
