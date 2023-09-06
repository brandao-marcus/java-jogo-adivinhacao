import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String ... args) {
        Scanner leitura = new Scanner(System.in);
        Random gerador = new Random();
        int numeroMisterioso = gerador.nextInt(100);
        int numero;
        int tentativas = 0;

        System.out.println("Adivinhe o número entre 1 e 100 em até 5 tentativas: ");

        while (tentativas < 5) {
            numero = leitura.nextInt();
            tentativas++;

            if (numero < 1 || numero > 100) {
                System.out.println("Digite um número válido entre 1 e 100");
                continue;
            }

            if (numero < numeroMisterioso) {
                System.out.println("O número misterioso é maior, tente novamente");
            } else if (numero > numeroMisterioso) {
                System.out.println("O número misterioso é menor, tente novamente");
            } else {
                System.out.println("Parabéns, você acertou! O número misterioso era " + numeroMisterioso);
                break;
            }
        }

        if (tentativas == 5) {
            System.out.println("Que pena, você não acertou. O número misterioso era: " + numeroMisterioso);
        }
    }
}