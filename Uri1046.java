import java.util.Scanner;
public class Uri1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int horaInicio, horaFim, duracao;

        horaInicio = teclado.nextInt();
        horaFim = teclado.nextInt();
        
        duracao = horaFim - horaInicio;

        if(duracao <= 0){
            duracao = duracao + 24;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        }
        else{
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        }
    }
}