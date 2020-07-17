import java.util.Scanner;
public class Uri1014{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        double X,Y, km_l;

        X = teclado.nextDouble();
        Y = teclado.nextDouble();

        km_l = X/Y;

        System.out.printf("%.3f km/l\n", km_l);
        

    }
}