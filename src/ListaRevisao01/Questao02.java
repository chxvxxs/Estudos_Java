package ListaRevisao01;
import java.util.Scanner;
public class Questao02 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Primeiro valor");
        int a = sc.nextInt();
        System.out.println("Segundo valor");
        int b = sc.nextInt();
        System.out.println("Terceiro valor");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.printf("O maior número é: %d", a);
        }else if(b>c){
            System.out.printf("O maior número é: %d", b);
        }else{
            System.out.printf("O maior número é %d", c);
        }
        sc.close();


    }
}
