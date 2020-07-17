import java.util.Scanner;
public class Uri1043{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double A,B,C,perTriangulo,areaTrapezio;

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        if((A + B) > C && (B + C) > A && (C + A) > B){
            perTriangulo = A + B + C;
            System.out.printf("Perimetro = %.1f\n", perTriangulo);
        }
        else{
            areaTrapezio = ((A + B) * C) / 2;
                System.out.printf("Area = %.1f\n", areaTrapezio);
        }
    }
}