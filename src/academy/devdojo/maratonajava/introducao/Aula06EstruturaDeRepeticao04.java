package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao04 {
    public static void main(String[] args) {
        //dado o valor de um carro, descubra em quantas ele pode ser parcelado
        //condição valorParcela >= 1000
        double valorTotal = 30000;

//        for (int parcela = 2; parcela <= valorTotal; parcela++) {
//            double valorParcela = valorTotal / parcela;
//            if (valorParcela >= 1000) {
//                System.out.println("parcela " + parcela + " R$ " + valorParcela);
//            } else {
//                break;
//            }
            for (int parcela1 = 1; parcela1 <= valorTotal; parcela1++) {
                double valorParcela1 = valorTotal / parcela1;
                if (valorParcela1 < 1000){
                    break;
                }
                System.out.println("parcela " + parcela1 + " R$ " + valorParcela1);
            }
            }
    }