package Lista01;
import java.util.Scanner;
public class Questao05 {
    public static void main(String[]args){
        double distancia, litrosUsados, tempo, velocidadeMedia;
        Scanner sc = new Scanner(System.in);

        System.out.println("Quanto tempo ao total durou a viagem: ");
        tempo = sc.nextDouble();
        System.out.println("Qual a velocidade média do automóvel: ");
        velocidadeMedia = sc.nextDouble();

        distancia = tempo*velocidadeMedia;

        litrosUsados = distancia/12;

        System.out.printf("O veículo percorreu uma distância de %.2f Km, em %.2f horas, com uma velocidade média de %.2f KM/H, consumindo um total de %.2f Litros de Gasolina",
                distancia, tempo, velocidadeMedia, litrosUsados
        );
    }
}
