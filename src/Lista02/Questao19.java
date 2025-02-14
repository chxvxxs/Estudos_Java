package Lista02;
import java.util.Scanner;
public class Questao19 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Valor do lado A: ");
        a = sc.nextInt();
        System.out.println("Valor do lado B: ");
        b = sc.nextInt();
        System.out.println("Valor do lado C: ");
        c = sc.nextInt();

        if(a < b+c && b < a+c && c < b+a){
            if (a == b && b ==c ){
                System.out.println("O triângulo é equilátero");
            }else if(a==b || a ==c || b ==c){
                System.out.println("O triângulo é isósceles");
            }else{
                System.out.println("O triângulo é escaleno");
            }
        }else{
            System.out.println("A figura não se caracteriza como um triângulo");
        }
        sc.close();
    }
}
