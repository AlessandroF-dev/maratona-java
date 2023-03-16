package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual = 10000;
        double primeiraFaixa = 9.7 / 100;
        double segundaFaixa = 7.35 / 100;
        double terceiraFaixa = 49.5 / 100;
        double valorImposto;

        if (salarioAnual <= 34712.0){
            valorImposto = salarioAnual * primeiraFaixa;
        }
        else if (salarioAnual >= 34713.0 && salarioAnual <= 68507.0){
            valorImposto = salarioAnual * segundaFaixa;
        }
        else{
            valorImposto = salarioAnual * terceiraFaixa;
        }
        System.out.println(valorImposto);
     /*operador && precisa que todas as condições sejam verdadeiras para o if retornar
        true, caso tenha alguma que não seja true o resultado será false
        operador || retorna true com apenas uma condição verdadeira*/
    }
}
