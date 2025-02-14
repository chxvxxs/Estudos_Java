package Lista01;
import java.util.Scanner;
public class Questao04 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a,b,c,d;
        System.out.println("Informe o valor de A:");
        a = sc.nextInt();
        System.out.println("Informe o valor de B:");
        b = sc.nextInt();
        System.out.println("Informe o valor de C:");
        c = sc.nextInt();
        System.out.println("Informe o valor de D:");
        d = sc.nextInt();

        //todas as somas
        int somaAB = a + b;
        int somaAC = a + c;
        int somaAD = a + d;
        int somaBC = b + c;
        int somaBD = b + d;
        int somaCD = c + d;

        //todas as multiplicações
        int multiAB = a * b;
        int multiAC = a * c;
        int multiAD = a * d;
        int multiBC = b * c;
        int multiBD = b * d;
        int multiCD = c * d;

        //imprimindo resultado das somas
        System.out.println("--Resultado das Somas--");
        System.out.println("A + B = " + somaAB);
        System.out.println("A + C = " + somaAC);
        System.out.println("A + D = " + somaAD);
        System.out.println("B + C = " + somaBC);
        System.out.println("B + D = " + somaBD);
        System.out.println("C + D = " + somaCD);

        //imprimindo resultado das multiplicações
        System.out.println("--Resultado das Multiplicações--");
        System.out.println("A x B = " + multiAB);
        System.out.println("A x C = " + multiAC);
        System.out.println("A x D = " + multiAD);
        System.out.println("B x C = " + multiBC);
        System.out.println("B x D = " + multiBD);
        System.out.println("C x D = " + multiCD);

        sc.close();
    }
}
