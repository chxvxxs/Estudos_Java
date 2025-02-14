package Lista02;
import java.util.Scanner;
public class Questao16 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int valorUm, valorDois, menor, maior;

        System.out.println("Valor um: ");
        valorUm = sc.nextInt();
        System.out.println("Valor dois: ");
        valorDois = sc.nextInt();

        if(valorUm<valorDois){
            menor = valorUm;
            maior = valorDois;
            System.out.printf("Maior valor: %d, menor valor: %d.",
                    maior, menor);
        }else if(valorDois<valorUm){
            menor = valorDois;
            maior = valorUm;
            System.out.printf("Maior valor: %d, menor valor: %d.",
                    maior, menor);
        }else{
            System.out.println("Os valores são iguais!");
        }
        sc.close();
    }
}
