import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso 1");
        curso1.setCargaHoraria(80);
        curso1.setDescricao("curso1 sobre java");

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso 2");
        curso2.setCargaHoraria(80);
        curso2.setDescricao("curso2 sobre java");

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Mentoria 1");
        mentoria1.setDescricao("mentoria1 sobre java");
        mentoria1.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp 1");
        bootcamp1.setDescricao("bootcamp1 sobre java");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Dev 1");
        dev1.inscreverBootcamp(bootcamp1);
        System.out.println("conteudos inscritos: " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("conteudos concluidos: " + dev1.getConteudosConcluidos());
        dev1.progredir();
        System.out.println("XP: " + dev1.calcularTotalXp());

        Dev dev2 = new Dev();
        dev2.setNome("Dev 2");


    }
}