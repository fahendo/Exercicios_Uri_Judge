import java.util.Scanner;
public class Uri1017{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        double tempo_gasto_h, velocidade_media, litros;

        tempo_gasto_h = teclado.nextDouble();
        velocidade_media = teclado.nextDouble();

        litros = (tempo_gasto_h * velocidade_media) / 12;

        System.out.printf("%.3f\n", litros);
        

    }
}