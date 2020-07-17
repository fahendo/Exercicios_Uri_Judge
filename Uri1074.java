import java.util.Scanner;
public class Uri1074{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N = teclado.nextInt();
    
        for(int count = 1; count <= N; count++){

            int X = teclado.nextInt();

            if(X % 2 == 0 && X > 0 && X != 0){
                System.out.println("EVEN POSITIVE");
            }
            else if(X % 2 != 0 && X < 0 && X != 0){
                System.out.println("ODD NEGATIVE");
            }
            if(X % 2 == 0 && X < 0 && X != 0){
                System.out.println("EVEN NEGATIVE");
            }
            else if(X % 2 != 0 && X > 0 && X != 0){
                System.out.println("ODD POSITIVE");
            }
            if(X == 0){
                System.out.println("NULL");
            }
        }
    }
}