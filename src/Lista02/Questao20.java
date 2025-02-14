package Lista02;

import java.util.Scanner;

public class Questao20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, maior, menor, multiplicacao;
        double divisao;

        a = leituraValor(sc, "Digite o valor de |a|: ");
        b = leituraValor(sc, "Digite o valor de |b|: ");
        c = leituraValor(sc, "Digite o valor de |c|: ");

        menor = acharMenor(a, b, c);
        maior = acharMaior(a, b, c);

        multiplicacao = maior * menor;
        divisao = (double) maior/menor;

        System.out.printf("Resultado do menor valor multiplicado pelo maior: %d\n",
                multiplicacao);
        System.out.printf("Resultado do maior valor dividido pelo menor: %f\n",
                divisao);
        sc.close();
    }
    private static int leituraValor(Scanner sc, String mensagem){
        int valor;
        while(true){
            System.out.println(mensagem);
            valor = sc.nextInt();
            if(valor>0){
                break;
            }else{
                System.out.println("Valor inválido, o valor deve ser maior!");
            }
        }
        return valor;
    }
    private static int acharMenor( int a, int b, int c){
        int menor = a;
        if(b<menor){
            menor = b;
        }
        if(c<menor){
            menor = c;
        }
        return menor;
    }
    private static int acharMaior(int a, int b, int c){
        int maior = a;
        if (b>maior){
            maior = b;
        }
        if(c>maior){
            maior = c;
        }
        return maior;
    }
}
