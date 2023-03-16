package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Naruto", "TV", 21, "Ação");
        anime.imprime();
    }
}

/**- Na criação de métodos é preciso entender qual a sua função,
 * para assim entender o tipo do retorno do mesmo como no exemplo acima.
 *De costume fariamos setando os atributos um a um com o set, porém já que
 * queremos retornar tudo junto, ou seja, são informações de um único objeto; podemos
 * criar um método que contenha todas essas informações para assim poder retornar
 * as informações.
 *
 * - No método "init" passamos como parâmetro (String nome, String tipo, int episodios)
 * pois são os atributos que queremos retornar, e o código do método é this + nome do atributo
 * (criado para o objeto, que nesse caso são os mesmos que passamos como parâmetro) +
 * variáveis que passamos como parametro no método.
 *
 * Sendo assim temos:
 *
 *  public void init(String nome, String tipo, int episodios){
 *         this.nome = nome;
 *         this.tipo = tipo;
 *         this.episodios = episodios;
 *     }
 *
 * - Também criamos um método para imprimir "imprime", com System.Out.println cada atributo do
 * objeto:
 *
 * public void imprime (){
 *     System.Out.println (this.nome = nome);
 *     System.Out.println (this.tipo = tipo);
 *     System.Out.println (this.episodios = episodios);
 * }
 *
 * - Sobrecarga de métodos: métodos com o mesmo nome, quantidade e parametros precisam ser diferentes
 */

