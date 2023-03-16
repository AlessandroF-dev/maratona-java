package academy.devdojo.maratonajava.javacore.Fmodificadoresestatico.dominio;

public class Carro {

    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 180;

    /** - Modificador de acesso estático faz o atributo pertencer a classe e todos
     * os objetos vão compartilhar desse mesmo valor (fazendo todas as instancias
     * desse objeto terem esse valor setado).
     *
     * - Utilizar o método estático quando os métodos não acessam uma váriavel ou um
     * atributo da instância
     *
     * */

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }


    public void imprime(){
        System.out.println("-----------------");
        System.out.println("Nome " + this.nome +
                " Velocidade Máxima " + this.velocidadeMaxima
                + " Velocidade Limite " + Carro.velocidadeLimite);
    }

    public static void setVelocidadeLimite (double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite(){
        return velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
