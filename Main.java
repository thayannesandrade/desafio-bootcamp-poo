import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.setDataInicial(LocalDate.now());
        bootcamp.setDataFinal(LocalDate.now().plusDays(45));
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devThayanne = new Dev();
        devThayanne.setNome("Thayanne");
        devThayanne.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Thayanne:" + devThayanne.getConteudosInscritos());
        devThayanne.progredir();
        devThayanne.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Thayanne:" + devThayanne.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Thayanne:" + devThayanne.getConteudosConcluidos());
        System.out.println("XP:" + devThayanne.calcularTotalXp());
    }
}

