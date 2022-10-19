package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 4500;
        String mensagemDoar = "Doar 500 reais para o devDojo";
        String mensagemNaoDoar = "Ainda não tenho condições";
        String resultado = salario >= 5000 ? mensagemDoar : mensagemNaoDoar;
                            //(condição)     (verdadeiro) : (false)
        System.out.println(resultado);
//Operador ternário: (condição) ? verdadeiro : falso

        /*operador && precisa que todas as condições sejam verdadeiras para o if retornar
        true, caso tenha alguma que não seja true o resultado será false*/
        //*operador || retorna true com apenas uma condição verdadeira

    double salario1 = 20000.0;
    double quantoPagar = 0;

    if (salario1 <=34712.0){
        quantoPagar = (salario1 * 9.7) / 100;
    }
    if (salario1 >= 34713.0){
        quantoPagar = (salario1 * 37.35) / 100;
    }
    if (salario1 >= 68508.0){
        quantoPagar = (salario1 * 49.5) / 100;
    }
        System.out.println(quantoPagar);
    }
}
