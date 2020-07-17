import java.util.Scanner;
public class Uri1142{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int a=1;
        
        for(int count = 1; count <= N; count++){
            
            System.out.printf("%d %d %d PUM\n", a, ++a, ++a);
            a = a + 2;

        }

    }
}