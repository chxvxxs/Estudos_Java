package Lista02;
import java.util.Scanner;
public class Questao25 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua alura em metros: ");
        double altura = sc.nextDouble();
        System.out.println("--Informe o seu gênero biológico--" +
                "\n|M| - Masculino" +
                "\n|F| - Feminino");
        char genero = sc.next().toUpperCase().charAt(0);

        double pesoIdeal;

        if(genero == 'M'){
            pesoIdeal = (72.7*altura) - 58;
            System.out.printf("O peso ideal para o seu gênero biológico é: %f kg",pesoIdeal);
        } else if (genero=='F') {
            pesoIdeal = (62.1*altura) - 44.7;
            System.out.printf("O peso ideal para o seu gênero biológico é: %f kg",pesoIdeal);
        }else{
            System.out.println("Informação inválida");
        }
        sc.close();
    }
}
