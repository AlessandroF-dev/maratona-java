package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {

    public static void main(String[] args) {
        int idade = 50;
        boolean isAutorizadoComprarBebida = idade >= 18;
    //!
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcólica");
        }
        else {
            System.out.println("Não autorizado a comprar bebida alcólica");
        }
        if (idade >= 90) {
            System.out.println("Por favor não beba muito, isso pode te fazer mal");
        }
        }
    }

