package ListaRevisao01;
public class Questao03 {
    public static void main (String[]args){
        int a, b, aux;
        a = 1;
        b = 0;
        for(int i = 0; i<10; i++){
            System.out.println(a);
            aux = a;
            a = a + b;
            b = aux;
        }
    }
}
