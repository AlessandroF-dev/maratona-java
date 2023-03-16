package academy.devdojo.maratonajava.javacore.Oexeption.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao();
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando o recurso liberado pelo SO");
        }
        return "Conexão aberta";
    }

    private static void abreConexao2() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
        } finally {
            System.out.println("Fechando o recurso liberado pelo SO");
        }
    }
}