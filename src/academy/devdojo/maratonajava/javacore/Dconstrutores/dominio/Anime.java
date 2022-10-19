package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String tipo;
    private int episodios;
    private String nome;
    private String genero;
    private String estudio;

    public Anime (String nome, String tipo, int episodios, String genero){
        this(); //sintaxe utilizada para sobrescrever
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
        this.nome = nome;
    }

    public Anime (String nome, String tipo, int episodios, String genero, String estudio){
        this(nome, tipo, episodios, genero);
        this.estudio = estudio;
    }

    public Anime (){
        System.out.println("Dentro do construtor sem argumentos");
    }

    public void imprime (){
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.nome);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }

    public void setGenero (String genero){
        this.genero = genero;
    }

    public String getGenero (){
        return this.genero;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
}
