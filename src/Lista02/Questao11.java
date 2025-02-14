package Lista02;
import java.util.Scanner;
public class Questao11 {
    public static void main(String[]args){
        int valorA, valorB, varAuxiliar;
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor de A: ");
        valorA = sc.nextInt();
        System.out.println("Valor de B: ");
        valorB = sc.nextInt();

        varAuxiliar = valorB;
        valorB = valorA;
        valorA = varAuxiliar;


        System.out.println("--Valores inversos--");
        System.out.printf("A = %d | B = %d",
                valorA, valorB
                );
        sc.close();
    }
}
