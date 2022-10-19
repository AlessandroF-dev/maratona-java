package academy.devdojo.maratonajava.javacore.Fmodificadoresestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    //0- Bloco de inicialização estático é executado apenas uma vez quando a JVM carregar a classe
    //1- Alocado espaço em memória pro objeto
    //2- Cada atributo de classe é criado e inicializado com valores default ou o que for passado
    //3- Bloco de inicialização é executado
    //4- Construtor é executado

    static {
        System.out.println("Dentro do bloco de inicialização 1");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicializacao 2");
    }

    static {
        System.out.println("Dentro do bloco de inicializacao 3");
    }

    {
        System.out.println("Dentro do bloco de inicializacao não estático");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
            /**
             * Quando utilizamos atributos estáticos não utilizamos o "this"e
             sim o nome da classe. o nome do atributo estático */
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
