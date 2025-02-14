package ListaRevisao01;
import java.util.Scanner;
public class Questao05 {
    public static void main(String[]args){
        Scanner sc  = new Scanner(System.in);
        String texto = sc.next();
        exibirCaracteres(texto);
        inverterPalavra(texto);
        sc.close();
    }
    private static void exibirCaracteres(String txt){
        System.out.println("Todos os caracteres da palavra:");
        for(int i = 0; i < txt.length(); i++){
            System.out.println(txt.charAt(i));
        }
    }
    private static void inverterPalavra(String txt){
        System.out.println("Palavra invertida:");
        for(int j = txt.length()-1; j>=0; j--){
            System.out.print(txt.charAt(j));
        }
    }
}
