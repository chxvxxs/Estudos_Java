package Lista02;
import java.util.Scanner;
public class Questao24 {
    public static void main(String[]args){
        Scanner sc =  new Scanner(System.in);
        int valorUm, valorDois, opcao;
        double media;

        System.out.println("Valor um:");
        valorUm = sc.nextInt();
        System.out.println("Valor dois:");
        valorDois = sc.nextInt();

        do{
            System.out.println("Insira a operação que deseja relizar\n" +
                    "|1|Verificar se um dos números lidos é ou não múltiplo do outro\n" +
                    "|2|Verificar se os dois números lidos são pares\n" +
                    "|3|Verificar se a média dos dois números é maior ou igual a 7.\n" +
                    "|4|Encerrar programa\n");
            opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    if(valorUm%valorDois == 0){
                        System.out.printf("%d é múltiplo de %d\n", valorUm,valorDois);
                    }else if(valorDois%valorUm == 0){
                        System.out.printf("%d é múltiplo de %d\n", valorDois,valorUm);
                    }else{
                        System.out.println("Os números não são multiplos\n");
                    }
                    break;
                case 2:
                    if(valorUm%2 == 0 && valorDois%2 == 0){
                        System.out.println("Ambos os valores são números pares\n");
                    }else if(valorUm%2==0){
                        System.out.printf("Apenas o número %d é um valor par\n",valorUm);
                    }else if(valorDois%2 == 0){
                        System.out.printf("Apenas o número %d é um valor par\n", valorDois);
                    }else{
                        System.out.println("Nenhum valor informado é um número par!\n");
                    }
                    break;
                case 3:
                    media = (double)(valorUm+valorDois) /2;
                    if(media>=7){
                        System.out.printf("A média dos números %d e %d é maior que sete e possui o valor de: %f\n", valorUm, valorDois, media);
                    }else{
                        System.out.printf("A média dos números é inferior a sete e possui valor de: %f\n", media);
                    }
                    break;
                case 4:
                    System.out.println("--Encerrando o programa--\n");
                    break;
                default:
                    System.out.println("Opção inválida!\n");
                    break;
            }
        }while(opcao!=4);
        sc.close();
    }
}
