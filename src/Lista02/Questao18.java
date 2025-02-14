package Lista02;
import java.util.Scanner;
public class Questao18 {
    public static void main(String[]args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Código: ");
        int codigo = sc.nextInt();

        if(codigo == 1 | codigo == 2 | codigo ==3 ){
            switch(codigo){
                case 1:
                    System.out.println("-Código Válido-");
                    System.out.println("Um");
                    break;
                case 2:
                    System.out.println("-Código Válido-");
                    System.out.println("Dois");
                    break;
                case 3:
                    System.out.println("-Código Válido-");
                    System.out.println("Três");
                    break;
                default:
                    System.out.println("Código inválido!");
            }
        }else{
            System.out.println("Valor inválido!");
        }
        sc.close();
    }
}
