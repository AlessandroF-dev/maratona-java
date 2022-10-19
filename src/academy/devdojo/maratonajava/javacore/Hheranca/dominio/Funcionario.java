package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de funcionário");
    }
    static {
        System.out.println("Dentro do bloco de inicialização estático de funcionário");
    }

    {
        System.out.println("Dentro do bloco de inicializaçõ de funcionário 1");
    }

    {
        System.out.println("Dentro do bloco de inicializaçõ de funcionário 2");
    }



    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento (){
        System.out.println(this.nome
                + "recebi o salário de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
