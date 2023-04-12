package JogoDaVelha;

import java.util.Scanner;

// classe não utilizada, pois não se comportado o necessario para IA
public class ComputadorModoC extends Computador { 

    public Scanner entrada = new Scanner(System.in);

    public ComputadorModoC(int jogador) {

        super(jogador);
        System.out.println("O jogador [ computador ] acabou de ser criado.");
    }

    @Override
    public void jogar(Tabuleiro tabuleiro) {
        Tentativa(tabuleiro);
        tabuleiro.setPosicao(tentativa, jogador);
    }

    @Override
    public void Tentativa(Tabuleiro tabuleiro) {
        do {
            do {
                System.out.print("Linha: ");
                tentativa[0] = entrada.nextInt();

                if (tentativa[0] > 3 || tentativa[0] < 1) {
                    System.out.println("Linha inválida. É 1, 2 ou 3");
                }

            } while (tentativa[0] > 3 || tentativa[0] < 1);

            do {
                System.out.print("Coluna: ");
                tentativa[1] = entrada.nextInt();

                if (tentativa[1] > 3 || tentativa[1] < 1) {
                    System.out.println("Coluna inválida. É 1, 2 ou 3");
                }

            } while (tentativa[1] > 3 || tentativa[1] < 1);

            tentativa[0]--;
            tentativa[1]--;

            if (checaTentativa(tentativa, tabuleiro)) {
                System.out.println("Esse local já foi marcado. Tente outro.");
            }
        } while (checaTentativa(tentativa, tabuleiro));
    }
}