import java.util.Scanner;
public class Uri1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int horaInicio, horaFim, minInicio, minFim, duracaoHora, duracaoMin, duracaoTotal;

        horaInicio = teclado.nextInt();
        minInicio = teclado.nextInt();

        horaFim = teclado.nextInt();
        minFim = teclado.nextInt();

        duracaoHora = (horaFim - horaInicio)*60;
        duracaoMin = (minFim - minInicio);

        duracaoTotal = duracaoHora + duracaoMin








        /*if(duracaoMin <= 0 && duracaoHora > 0){
            duracaoMin + 60;
            duracaoHora - 1;
            System.out.println("O JOGO DUROU " + duracaoHora + " HORA(S) E " + duracaoMin + " MINUTO(S)");
        }
        else{
            if(duracaoHora <= 0 && duracaoMin <= 0){
                duracaoHora + 23;
                duracaoMin + 60;
                System.out.println("O JOGO DUROU " + duracaoHora + " HORA(S) E " + duracaoMin + " MINUTO(S)");
            }
            else{
                if(duracaoHora <= 0 && duracaoMin > 0){
                    duracaoHora + 24;
                    System.out.println("O JOGO DUROU " + duracaoHora + " HORA(S) E " + duracaoMin + " MINUTO(S)");
                }
                else{
                    System.out.println("O JOGO DUROU " + duracaoHora + " HORA(S) E " + duracaoMin + " MINUTO(S)");
                }
            }
        }
        */
    }
}