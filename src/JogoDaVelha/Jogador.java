package JogoDaVelha;

public abstract class Jogador {

    protected int[] tentativa = new int[9]; 
    protected int jogador;

    public Jogador(int jogador) {
        this.jogador = jogador;
    }

    public abstract void jogar(Tabuleiro tabuleiro);

    public abstract void Tentativa(Tabuleiro tabuleiro);

    public boolean checaTentativa(int[] tentativa, Tabuleiro tabuleiro) {
        if (tabuleiro.getPosicao(tentativa) == 0) {
            boolean b = false;
            return b;
        } else {
            return true;
        }

    }
}