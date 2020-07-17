import java.util.Scanner;
public class Uri1143{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int a = 1;

        if(0 < N && N <= 1000){

            for(int count = 1; count <= N; count++){
                
                System.out.printf("%d %d %d\n", a, a*a, a*a*a);
                a = a + 1;

            }
        }
    }
}