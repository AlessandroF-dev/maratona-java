package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setCep("123123-30");
        endereco.setRua("Rua jundiaí");

        Pessoa pessoa = new Pessoa("Alessandro");
        pessoa.setCpf("12312312312");
        pessoa.setEndereco(endereco);

        pessoa.imprime();
        System.out.println("------------");
        Funcionario funcionario = new Funcionario("Alessandro");
        funcionario.setCpf("12312312312");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(10000);

        funcionario.imprime();
    }
}
