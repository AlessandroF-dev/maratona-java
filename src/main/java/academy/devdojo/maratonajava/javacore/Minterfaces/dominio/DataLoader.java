package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    static final int MAX_DATA_SIZE = 10;
    void load();
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }
    static void retrieveMaxDataSize (){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
/** 87 - Orientação Objetos - Interfaces pt 01 - Introdução
 *
 * - POR PADRÃO OS MÉTODOS CRIADOS NA INTERFACE SÃO PUBLICOS E ABSTRATOS,
 * NÃO SENDO NECESSÁRIO O USO DE MODIFICADOR DE ACESSO PUBLICO NEM DA NOMENCLATURA
 * ABSTRACT.
 *
 * - As interfaces tinha intuito de serem usadas como contratos
 * - Todos os métodos na interface são publicos e abstratos
 * - Para utilizar uma interface é necessário utilizar o modificador de acesso +
 * classe+ implements + nome da interface {}.
 * */