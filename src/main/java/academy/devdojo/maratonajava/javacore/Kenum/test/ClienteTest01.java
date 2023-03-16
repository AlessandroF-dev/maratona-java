package academy.devdojo.maratonajava.javacore.Kenum.test;


import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Alessandro", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Alessandro", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente);
        System.out.println(cliente2);

        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        TipoCliente tipoCliente3 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa 233");
        System.out.println(tipoCliente2);
        System.out.println(tipoCliente3);
    }
}
