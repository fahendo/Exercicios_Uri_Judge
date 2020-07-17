import java.util.Scanner;
public class Uri1160{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int PA, PB, anos;
        double G1, G2;
        int T;

        T = input.nextInt();
        for(int cont=0; cont<T; cont++){

            anos = 0;
            PA = input.nextInt();
            PB = input.nextInt();
            G1 = input.nextDouble();
            G2 = input.nextDouble();

            while(PA <= PB){
                PA = (int)(PA + PA * G1 / 100);
                PB = (int)(PB + PB * G2 / 100);
                anos++;
                if(anos > 100){
                    break;
                }
            }

            if(anos <= 100){
                System.out.println(anos+" anos.");
            }
            else{
                System.out.println("Mais de 1 seculo.");
            }
        } 
    }
}