import java.util.Scanner;
public class Uri1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int valor;
        int qtdePar = 0;
        int qtdeImp = 0;
        int qtdePos = 0;
        int qtdeNeg = 0;

        for(int cont = 1; cont <= 5; cont++){

            valor = teclado.nextInt();

            if(valor % 2 == 0 ){
                qtdePar = qtdePar + 1;
            }
            else{
                qtdeImp = qtdeImp + 1;
            }

            if(valor > 0){
                qtdePos = qtdePos + 1;
            }
            else if(valor < 0){
                qtdeNeg = qtdeNeg + 1;
            }
        }

        System.out.println(qtdePar + " valor(es) par(es)");
        System.out.println(qtdeImp + " valor(es) impar(es)");
        System.out.println(qtdePos + " valor(es) positivo(s)");
        System.out.println(qtdeNeg + " valor(es) negativo(s)");

    }
}