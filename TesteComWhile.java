import java.util.Scanner;
public class TesteComWhile{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int a = 1;

        while(a <= 10){
            System.out.println("O valor de a = " + a);
            a = a + 1;
        }
    }
}