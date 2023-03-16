package academy.devdojo.maratonajava.javacore.Dconstrutores.test;


import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto", "Tv", 12, "romance", "pixar");
        anime.imprime();
    }
}
/**## CONSTRUTORES
 *
 * - Construtores não tem nenhum tipo de retorno, e sua sintaxe para ser criado é:
 * modificador de acesso (public, private, protected, etc) + nome da classe + parenteses () e chaves{}.
 * - Construtores te forçam a seguir algumas regras, como por exemplo:
 *
 *      public Anime (String nome){
 *      this.nome = nome;
 *      }
 * - Aqui estamos dizendo, para criação de um novo objeto é obrigatório que o mesmo
 * possua um nome, caso contrário dará erro. Então na hora de instânciar um novo objeto
 * na classe de teste como: Anime anime = new Anime(aqui devemos colocar a regra que
 * inserimos no construtor, ou seja o nome);
 *
 * - O construtor é sempre inicializado antes de qualquer método.
 *
 * - Também podemos utilizar a sobrecarga de construtor, da mesma forma da sobrecarga de método.
 * Porém não conseguimos sobrescrever com o this. + nome do construtor, como é feito na
 * sobrescreção de método. Temos uma sintaxe especial, podemos apenas inserir this + parenteses (); (isso no
 * construtor que você quer sobrescrever (o primeiro criado, provávelmente)), assim ele chama o
 * construtor sobrescrito. E no construtor que estamos a sobrescrever inserimos no this os parâmetros
 * inseridos no construtor rema, e em outra linha inserimos o nosso novo atributo.
 *
 * (esse this(); para sobrescrever pode somente ser utilizado dentro do construtor, e DEVE ser
 * inicializado sempre na primeira linha executável do corpo construtor).
 *
 * - A sobrecarga de construtor é utlizada quando precisamos inserir um novo atributo no nosso objeto,
 * no exemplo abaixo vamos incluir um novo atributo por nome de "genero".
 *
 * Ex:
 *
 *      public Anime (String nome, String tipo){
 *      this.nome = nome;
 *      this.tipo = tipo;
 *      (construtor padrão, para exemplo)
 *      }
 *
 *      public Anime (String nome, String tipo){
 *      this();
 *      this.nome = nome;
 *      this.tipo = tipo
 *      (construtor pronto para ser sobrescrevido, após inserido o this();)
 *      }
 *
 *      public Anime (String nome, String tipo, String genero){
 *      this(nome, tipo);
 *      this.genero = genero;
 *      (construtor sobrescrevendo e inserindo um novo atributo)
 *      }
 */

