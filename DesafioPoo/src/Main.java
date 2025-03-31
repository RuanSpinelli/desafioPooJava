import br.com.dio.desafio.dominio.*;
import java.time.LocalDate;



public class Main {
    public static void main(String[] args) {
        
        Curso curso1 = new Curso("Python com IA", "Aprenda a desenvolver linguagens de programação usando python", 12);
        Curso curso2 = new Curso("Curso JS", "Curso para aprender a programar com java script", 3);
        Mentoria mentoria = new Mentoria("Mentoria java", "Mentoria para programadores de java", LocalDate.now());
        
      


        Bootcamp bootcamp= new Bootcamp();

        bootcamp.setNome("Bootcamp web developer");
        bootcamp.setDescricao("Bootcamp voltado para formar desenvolvedores web, com foco em Java Script e Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);


        System.out.println("Conteúdos inscritos(Camila): "+ devCamila.getConteudosInscrito());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteúdos inscritos(Camila): "+ devCamila.getConteudosInscrito());
        System.out.println("Conteúdos concluídos(Camila): "+ devCamila.getConteudosConcluidos());
        System.out.println("XP: "+ devCamila.calcularTotalXp());


        System.out.println("=-".repeat(20)); // =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos(João): "+ devJoao.getConteudosInscrito());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteúdos inscritos(João): "+ devJoao.getConteudosInscrito());
        System.out.println("Conteúdos concluidos(João): "+ devJoao.getConteudosConcluidos());
        System.out.println("XP: "+ devJoao.calcularTotalXp());

    }
}
