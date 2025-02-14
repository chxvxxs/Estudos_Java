package ListaRevisao01;
import java.util.Scanner;
public class Questao08 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o número: ");
        int num = sc.nextInt();

        if(ehPrimo(num)){
            System.out.println("O número é primo");
        }else{
            System.out.println("O número não é primo");
        }
    }
    private static Boolean ehPrimo(int num){
        if(num<2){
            return false;
        }else{
            for(int i = 2; i <=num/2; i++){
                if(num%i==0){
                    return false;
                }
            }
            return true;
        }
    }

}
