package Lista02;
import java.util.Scanner;
public class Questao12 {
    public static void main(String[]args){
        int x, modulo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor de X: ");
        x = sc.nextInt();

        if(x>=0){
            modulo = x;
        }else{
            modulo = x*(-1);
        }
        System.out.printf("O módulo |X| de %d é: %d",
                x, modulo);
        sc.close();
    }
}
