package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public class Cliente {
    private String nome;
    private TipoCliente tipoCliente;
    public TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoClienteInt=" +tipoCliente.getValor()+
                ", tipoCliente=" + tipoCliente.getNomeRelatorio()+
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
    /** 80 - Orientação Objetos - Enumeração pt 01 - Introdução
     *
     * - Uma classe Enum é utilizada para declarar valores constantes pré-definidos, como
     * valores que sejam padrão e que não tem motivos para serem alterados. Como por exemplo
     * ao criar atributos como turnos de trabalho, manha, tarde e noite; esses valores podem
     * ser criados como uma classe Enum, setando esses valores pré-definidos(não podendo ser alterados).
     * Por padrao os valores Enum são criados em CAPSLOCK e com _ caso tenha mais de uma palavra.
     *
     *- Em métodos abstratos não temos corpo, temos que sobrescrever o método
     *
     * - Para comparar em caso de criação, caso não queira que os dados inseridos
     * como String sejam diferentes, deve-se utilizar o equals() a fim de comparação
     * e não o ==.
     * */
}
