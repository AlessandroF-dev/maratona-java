package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Neymar");
        Jogador jogador2 = new Jogador("Messi");

        Time time = new Time("PSG");
        Jogador [] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("---- Jogador ----");

        jogador.imprime();

        System.out.println("---- Time ----");

        time.imprime();
    }
}
