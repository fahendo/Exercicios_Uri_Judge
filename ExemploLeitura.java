import java.util.Scanner;
public class ExemploLeitura{
    public static void main(String args[]){
        int a, b, c;
        float d, e, f;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        a = input.nextInt();
        System.out.print("Digite o valor de b: ");
        b = input.nextInt();

        c = a + b;

        System.out.print("Digite o valor de d: ");
        d = input.nextFloat();

        System.out.print("Digite o valor de e: ");
        e = input.nextFloat();

        f = d + e;

        System.out.println("Valor do a = " + a);
        System.out.println("Valor do b = " + b);
        System.out.println("Valor do c = " + c);

        System.out.printf("Valor do a = %.2f\n", d);
        System.out.printf("Valor do a = %.2f\n", e);
        System.out.printf("Valor do a = %.2f\n", f);
    }
}