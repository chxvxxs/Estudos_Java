package Lista02;
import java.util.Scanner;
public class Questao21 {
    public static void main(String[]args){
        Scanner sc  = new Scanner(System.in);
        int val;

        while(true){
            System.out.println("--Informe abaixo o valor INTEIRO a ser verificado (para encerrar o programa digite zero)--");
            System.out.println("Insira o número aqui: ");
            val = sc.nextInt();
            if(val>0){
                System.out.println("O número informado é positivo");
            }else if(val<0){
                System.out.println("O número informado é negativo");
            }else{
                System.out.println("Encerrando o programa");
                break;
            }
        }
        sc.close();
    }
}
