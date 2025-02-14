package Lista02;
import java.util.Scanner;
public class Questao22 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a, b, valor;

        a = 0;
        b = 0;
        valor = sc.nextInt();

        if(valor>=0){
            a = valor;
            System.out.printf("O valor %d está armazenado em A", valor);
        }else{
            b = valor;
            System.out.printf("O valor %d está armazenado em b", valor);
        }
        sc.close();
    }
}
