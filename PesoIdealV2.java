import java.util.Scanner;
public class PesoIdealV2{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        char sexo;
        double altura, peso;
        
        System.out.print("Qual seu sexo? (H/h = Homem ou M/m = Mulher)");
        sexo = teclado.nextLine().charAt(0);        // CharAt(0) quer dizer que vou pegar o primeiro caracter da palavra (Vetor)
        System.out.print("Qual sua altura?");
        altura = teclado.nextDouble();

        if(sexo == 'H' || sexo == 'h') 
        {
            peso = (72.7 * altura) - 58;   
            System.out.printf("Seu peso ideal é: %.2f Kg\n", peso);
 
        }
        else{
            if(sexo == 'M' || sexo == 'm')
            {
            peso = (62.1 * altura) - 44.7;
            System.out.printf("Seu peso ideal é: %.2f Kg\n", peso);

            }
            else{
                System.out.println("Opção inválida!");
            }
        }

    }
}