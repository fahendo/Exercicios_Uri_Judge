import java.util.Scanner;
public class Uri1011{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        double R, volume;

        R = teclado.nextDouble();
        volume = (4/3.0) * 3.14159 * (R*R*R);

        System.out.printf("VOLUME = %.3f\n", volume);


    }
}