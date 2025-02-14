package ListaRevisao01;

import java.util.Scanner;
public class Questao01 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o número a ser verificado");
        int num = sc.nextInt();
        verificarPar(num);
        sc.close();
    }
    private static void verificarPar(int numero){
        if(numero%2==0){
            System.out.println("O número informado é par");
        }else if(numero%2!=0){
            System.out.println("O número informado é ímpar");
        }else{
            System.out.println("O número é neutro");
        }
    }
}
