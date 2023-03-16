package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
        public static void main(String[] args) {
                // +, -, *, /
        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero01 + numero02;

        System.out.println(numero01 + numero02 + " Valor " + numero02 + numero01);
        System.out.println("Valor " + resultado);

        //% (Resto)

        int resto = 20 % 2;
                System.out.println(resto);
         //< > <= >= == != operadores lógicos

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezDiferenteAVinte = 10 != 20;

        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualAVinte " + isDezIgualAVinte);
        System.out.println("isDezDiferenteAVinte " + isDezDiferenteAVinte);

        int idade = 18;
        float salario = 1099;
//&& (and), || (or), !!
        boolean isDentroDaLeiSalarioMinimo = idade >= 18 && salario >= 1100;
                System.out.println("Recebe sálario minímo ? " +isDentroDaLeiSalarioMinimo);

        double salarioAle = 10000;
        double valorTotalContaPoupanca = 20000;
        float precoPcGamer = 10000;
        boolean isPcgamerCompravel = salarioAle > precoPcGamer || valorTotalContaPoupanca > precoPcGamer;

        System.out.println("isPcGamerCompravel ? " + isPcgamerCompravel);

        // (operadores aritméticos) = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000; //bonus = bonus + 100
        bonus -= 1000; //bonus = bonus - 1000
        bonus *= 2; //bonus = bonus * 2
        bonus /= 2; //bonus = bonus / 1000
        bonus %= 2; // bonus = bonus % 2
                System.out.println(bonus);

        int contador = 0;
        contador += 1; //contador = contador + 1
        contador ++; //contaor = contador +1
        contador --; //contador = contador -1
        ++contador;//contaor = contador +1
        --contador; //contador = contador -1
        int contador2 = 0;
                System.out.println(++contador2);

        }
}
