import java.util.Scanner;
public class Uri1073{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N = teclado.nextInt();
        int resultado;
    
        for(int count = 1; count <= N; count++){

            if(count % 2 == 0){
                resultado = count*count;
                System.out.println(count + "^2 = " + resultado);
            }  
        }
    }
}