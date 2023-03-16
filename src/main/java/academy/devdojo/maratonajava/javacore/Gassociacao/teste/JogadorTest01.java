package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Neymar");
        Jogador jogador3 = new Jogador("Antony");
        /** Criando uma array de 3 objetos, no caso os três que foram instanciados.
         * Que também poderia ser criado com Objeto + "[]" para criar array + váriavel
         * + = [3]
         * */
        Jogador [] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores ){
            jogador.imprime();
        }
        /** - Associação unidirecional um para muitos
         *
         *
         * */
    }
}
