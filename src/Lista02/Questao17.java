package Lista02;
import java.util.Scanner;
public class Questao17 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Número: ");
        int num = sc.nextInt();

        if(num >= 0 && num<=9){
            System.out.println("Número Válido!");
        }else{
            System.out.println("Número Inválido.");
        }
        sc.close();
    }
}
