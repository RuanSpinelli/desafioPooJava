import java.time.LocalDate;

import br.com.dio.desafio.dominio.*;



public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("Java developer", "Curso para você aprender sobre java", 5);

        Mentoria mentoria = new Mentoria("Currículo vencedor", 
        "Orientações dos profissionais de como montar um currículo sedutor e atrativo para os recrutadores", 
        LocalDate.now());


        System.out.println(curso);
        System.out.println(mentoria);


    }
}
