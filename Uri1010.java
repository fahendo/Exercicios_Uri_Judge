import java.util.Scanner;
public class Uri1010{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int cod_peca1, num_peca1, cod_peca2, num_peca2;
        double valor_peca1, valor_pagar1, valor_peca2, valor_pagar2, preco_total;

        cod_peca1 = teclado.nextInt();
        num_peca1 = teclado.nextInt();
        valor_peca1 = teclado.nextDouble();
        
        cod_peca2 = teclado.nextInt();
        num_peca2 = teclado.nextInt();
        valor_peca2 = teclado.nextDouble();
        
        valor_pagar1 = num_peca1 * valor_peca1;

        valor_pagar2 = num_peca2 * valor_peca2;
        
        preco_total = valor_pagar1 + valor_pagar2;

        //valor_pagar = cod_peca + num_peca + valor_peca;
        

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", preco_total);


    }
}