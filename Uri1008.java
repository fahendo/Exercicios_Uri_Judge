import java.util.Scanner;
public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int func, horastrabalhadas;
        double valorhora, salario;

        func = teclado.nextInt();
        horastrabalhadas = teclado.nextInt();
        valorhora = teclado.nextDouble();

        salario = horastrabalhadas * valorhora;

        System.out.println("NUMBER = " + func);
        System.out.printf("SALARY = U$ %.2f\n", salario);


    }
}