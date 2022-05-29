import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("Curso de Fundamentos na linguagem java: ");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso de C#");
        curso2.setDescricao("Curso de fundamentos na linguagem C#: ");
        curso2.setCargaHoraria(9);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria  de java");
        mentoria1.setDescricao("Mentoria do curso de java");
        mentoria1.setData(LocalDate.now());




        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);



    }
}
