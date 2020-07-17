import java.util.Scanner;
public class Uri1035{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int A,B,C,D,SomaCD,SomaAB;

        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();
        SomaCD = C + D;
        SomaAB = A + B;

        if(B > C && D > A && SomaCD > SomaAB && C > 0 && D > 0){
            System.out.println("Valores aceitos");
        }
        else{
            System.out.println("Valores nao aceitos");
        }




    }
}