package Lista02;
import java.util.Scanner;
public class Questao14{
    public static void main(String[]args){
        int primeiroNum, segundoNum, valorDiferenca, maiorValor, menorValor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor do primeiro nùmero: ");
        primeiroNum = sc.nextInt();
        System.out.println("Valor do segundo nùmero: ");
        segundoNum = sc.nextInt();
        if(primeiroNum<segundoNum){
            valorDiferenca = segundoNum - primeiroNum;
            maiorValor = segundoNum;
            menorValor = primeiroNum;
        }else{
            valorDiferenca = primeiroNum - segundoNum;
            maiorValor = primeiroNum;
            menorValor = segundoNum;
        }
        System.out.printf("O maior valor é %d, o menor valor é %d e a diferença do maior valor para o menor valor é de %d",
                maiorValor, menorValor, valorDiferenca);
        sc.close();
    }
}