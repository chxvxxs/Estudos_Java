package Lista02;
import java.util.Scanner;
public class Questao23 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int valorUm, valorDois, opcao, adicao, subtracao, multiplicacao;
        double divisao;

        System.out.println("Primeiro valor: ");
        valorUm = sc.nextInt();
        System.out.println("Segundo valor: ");
        valorDois = sc.nextInt();

        System.out.println("Insira a operação que deseja relizar\n" +
                "|1|Somar números\n" +
                "|2|Subtrair números\n" +
                "|3|Multiplicar números\n" +
                "|4|Dividir números\n");
        opcao = sc.nextInt();

        switch(opcao){
            case 1:
                adicao = valorUm + valorDois;
                System.out.println("Resultado da soma: "+ adicao);
                break;
            case 2:
                subtracao = valorUm - valorDois;
                System.out.println("Resultado da subtração: "+ subtracao);
                break;
            case 3:
                multiplicacao = valorUm * valorDois;
                System.out.println("Resultado da multiplicação: "+ multiplicacao);
                break;
            case 4:
                if(valorDois !=0){
                    divisao = (double) valorUm/valorDois;
                    System.out.println("Resultado da divisão: "+ divisao);
                    break;
                }else{
                    System.out.println("Não foi possível realizar a divisão");
                }
            default:
                System.out.println("Opcao inválida!");
                System.out.println("---Encerrando o programa---");
        }
        sc.close();
    }
}
