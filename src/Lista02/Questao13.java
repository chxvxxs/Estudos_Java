package Lista02;
import java.util.Scanner;
public class Questao13 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int primeiroNum, segundoNum, terceiroNum;
        int menor, medio, maior;

        System.out.println("--Organização de números--");
        System.out.println("Insira o primeiro número: ");
        primeiroNum = sc.nextInt();
        System.out.println("Insira o Segundo número: ");
        segundoNum = sc.nextInt();
        System.out.println("Insira o terceiro número: ");
        terceiroNum = sc.nextInt();

        if(primeiroNum<segundoNum && primeiroNum<terceiroNum){
            menor = primeiroNum;
            if(segundoNum<terceiroNum){
                medio = segundoNum;
                maior = terceiroNum;
            }else{
                medio = terceiroNum;
                maior = segundoNum;
            }
        }
        else if(segundoNum<primeiroNum && segundoNum<terceiroNum){
            menor = segundoNum;
            if(primeiroNum<terceiroNum){
                medio = primeiroNum;
                maior = terceiroNum;
            }else{
                medio = terceiroNum;
                maior = primeiroNum;
            }
        }
        else{
            menor = terceiroNum;
            if(primeiroNum<segundoNum){
                medio = primeiroNum;
                maior = segundoNum;
            }else{
                medio = segundoNum;
                maior = primeiroNum;
            }
        }
        System.out.println("--Números em ordem decrescente--");
        System.out.printf("%d, %d, %d.",
                maior, medio, menor);
    }
}
