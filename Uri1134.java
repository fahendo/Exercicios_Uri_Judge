import java.util.Scanner;
public class Uri1134{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int Fim = 0;
        int Alcool = 0;
        int Gasolina = 0;
        int Diesel = 0;

        while (Fim != 4){
            
            Fim = teclado.nextInt();

            if(Fim == 1){
                Alcool = Alcool + 1;
            }
            else if(Fim == 2){
                Gasolina = Gasolina + 1;
            }
            else if(Fim == 3){
                Diesel = Diesel + 1;
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + Alcool);
        System.out.println("Gasolina: " + Gasolina);
        System.out.println("Diesel: " + Diesel);
        
    }
}