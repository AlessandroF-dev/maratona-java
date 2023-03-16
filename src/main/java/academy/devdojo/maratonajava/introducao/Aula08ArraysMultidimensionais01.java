package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        //1,2,3,4,5 meses
        //31,28,31,30
        int[][] dias = new int[3][3];
//primeiro colchete do new (tamanho Array), segundo colchete (quantidade de Arrays).

//caso queira devolver a posição de n° 0, basta utilizar a váriavel + [0].

//mês 0 = janeiro, irá receber o valor dia 31
//navegando pela primeira Array de 3 posições (veja primeiro colchete com número 0).

        dias[0][0] = 31;
        dias[0][2] = 31;
        dias[0][1] = 28;

//Navegando pela Array 2

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

//Navegando pela Array 3

        dias[2][0] = 31;
        dias[2][1] = 28;
        dias[2][2] = 31;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("--------------------------");

        for (int[] arrayBase : dias) {
            for (int num: arrayBase){
                System.out.println(num);
            }
        }
    }
}