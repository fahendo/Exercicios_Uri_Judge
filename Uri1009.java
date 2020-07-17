import java.util.Scanner;
public class Uri1009{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        String nome;
        double salario, totaldevendas_reais, total_receber;

        nome = teclado.nextLine();
        salario = teclado.nextDouble();
        totaldevendas_reais = teclado.nextDouble();
        
        total_receber = salario + totaldevendas_reais*0.15;  


        System.out.printf("TOTAL = R$ %.2f\n", total_receber);


    }
}