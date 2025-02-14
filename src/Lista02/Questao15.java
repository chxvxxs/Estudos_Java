package Lista02;
import java.util.Scanner;
import java.util.Locale;
public class Questao15 {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        double notaUm, notaDois, notaTres, notaQuatro, media, notaRecuperacao, mediaRecuperacao;
        Scanner sc = new Scanner(System.in);

        System.out.println("Primeira Nota: ");
        notaUm = sc.nextDouble();
        System.out.println("Segunda Nota: ");
        notaDois = sc.nextDouble();
        System.out.println("Terceira Nota: ");
        notaTres = sc.nextDouble();
        System.out.println("Quarta Nota: ");
        notaQuatro = sc.nextDouble();

        media = (notaUm+notaDois+notaTres+notaQuatro)/4;

        if(media<7){
            System.out.println("Insira a nota da recuperação: ");
            notaRecuperacao = sc.nextDouble();
            mediaRecuperacao = media + notaRecuperacao /2;
            if(mediaRecuperacao>=7){
                System.out.printf("aprovado com média: %.2f",
                        mediaRecuperacao);
            }else{
                System.out.printf("reprovado com média: %.2f",
                        mediaRecuperacao);
            }
        }else{
            System.out.printf("Aprovado com média: %.2f",
                    media);
        }
    }
}
