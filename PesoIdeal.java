import java.util.Scanner;
public class PesoIdeal{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int sexo;
        double altura, peso;
        
        System.out.print("Qual seu sexo? (0 = Homem / 1 = Mulher)");
        sexo = teclado.nextInt();
        System.out.print("Qual sua altura?");
        altura = teclado.nextDouble();

        if(sexo == 0) 
        {
            peso = (72.7 * altura) - 58;    
        }
        else
        {
            peso = (62.1 * altura) - 44.7;
        }

        System.out.printf("Seu peso ideal é: %.2f\n", peso);

    }
}