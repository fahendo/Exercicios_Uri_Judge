import java.util.Scanner;
public class Uri1037{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double recebeValor;

        recebeValor = teclado.nextDouble();
        
        if(0 <= recebeValor && recebeValor <= 25){
            System.out.println("Intervalo [0,25]");
        }
        else{
            if(25 < recebeValor && recebeValor <= 50){
            System.out.println("Intervalo (25,50]");
            }
            else{
                if(50 < recebeValor && recebeValor <= 75){
                    System.out.println("Intervalo (50,75]");
                }
                else{
                    if(75 < recebeValor && recebeValor <= 100){
                        System.out.println("Intervalo (75,100]");
                    }
                    else{
                        System.out.println("Fora de intervalo");
                    }
                }
            }
        }
    }
}