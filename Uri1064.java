import java.util.Scanner;
public class Uri1064{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double num, soma, media;
        int qdte = 0;
        soma = 0;

        for(int cont=1; cont<=6 ; cont++){
            num = teclado.nextDouble();
            if(num > 0){
                qdte = qdte + 1;
                soma = soma + num;
            }
        }

        System.out.println(qdte + " valores positivos");
        media = soma/qdte;
        System.out.printf("%.1f\n", media);
    }
}