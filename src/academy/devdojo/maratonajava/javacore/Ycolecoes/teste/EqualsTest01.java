package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone(null, "Aple");
        Smartphone s2 = new Smartphone("12AB", "Aple");
        System.out.println(s1.equals(s2));
    }
}
/** # Coleções - Equals
 *
 * - O método equals() é utilizado para comparações onde se quer confirmar se os
 * valores dos objetos são iguais, retornando assim um true ou false.
 *
 * - No exemplo abaixo teremos o resultado false, pois o método equals compara não
 * somente a escrita ou a String dos objetos, mas sim comparando objeto com objeto, e
 * nesse caso nós temos dois objetos diferentes (pois os dois foram instânciados como
 * new)
 * ```
 *      Smartphone s1 = new Smartphone("12AB", "Aple");
 *      Smartphone s2 = new Smartphone("12AB", "Aple");
 *      System.out.println(s1.equals(s2));
 * ```
 *
 * - Já no exemplo abaixo teremos o resultado true, pois o comparativo sera o objeto
 * em si
 * ```
 *      Smartphone s1 = new Smartphone("12AB", "Aple");
 *      Smartphone s2 = s1;
 *      System.out.println(s1.equals(s2));
 * ```
 * #### Sobrescrevendo o método equals()
 *
 * - Podemos sobrescrever passando um "parâmetro" (atributo) para comparação, no nosso caso será
 * o atributo serialNumber.
 *
 * ```
 *   @Override
 *   public boolean equals(Object obj) {
 *      if(obj == null) return false;
 *      if(this == obj) return true;
 *      if (this.getClass() != obj.getClass()) return false;
 *      Smartphone smartphone = (Smartphone) obj;
 *      return serialNumber != null & serialNumber.equals(smartphone.serialNumber);
 * ```
 *
 * - Regras que devem ser seguidas antes de sobrescrever o método equals():
 *      - Reflexivo: x.equals(x) tem que ser true para tudo o que for diferente de null
 *      - Simétrico: para x e y diferentes de null, se x.equals(y) == true logo, y.equals(x) == true
 *      - Transitividade: para x,y,z diferentes de null, se x.equals(y) == true, e x.equals(z) == true logo, y.equals(z) == true
 *      - Consistente: x.equals(x) sempre retorna true se x for diferente de null
 *      - para x diferente de null x.equals(null) tem que retornar false.
 *
 * */