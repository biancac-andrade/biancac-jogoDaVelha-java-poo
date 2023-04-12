package JogoDaVelha;

import java.util.Random;


// classe não utilizada, pois não se comportado o necessario para IA
public class ComputadorModoA extends Computador { 

    public ComputadorModoA(int jogador) {
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

        Random rand = new Random();
        int movimento = rand.nextInt(9) + 1;
        boolean resultado = checaTentativa(tentativa, tabuleiro);

        while (!resultado) {
            movimento = rand.nextInt(9) + 1;
            resultado = checaTentativa(tentativa, tabuleiro);

        }

        System.out.println("escolheu a posição " + movimento);
        tabuleiro.setPosicao(tentativa, jogador);

    }
}
