package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();//criando objeto
        professor.idade = 22;
        professor.sexo = 'M';
        professor.nome = "Alessandro";
        //imprimindo as informações em uma única linha
        System.out.println(professor.nome + " "
                + professor.idade + " " + " "
                + professor.sexo);
    }
}
