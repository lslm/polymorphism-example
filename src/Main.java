import java.util.List;

public class Main {
    public static void main(String[] args) {
        Junior camila = new Junior("Camila");
        Junior gustavo = new Junior("Gustavo");

        Pleno leticia = new Pleno("Leticia");
        Pleno gabriel = new Pleno("Gabriel");

        Senior amanda = new Senior("Amanda");

        Staff george = new Staff("George");

        List<Programador> programadores = List.of(camila, gustavo, leticia, gabriel, amanda, george);

        for(Programador programador : programadores) {
            System.out.println(programador.getNome() + " - " + programador.getSenioridade() + " - " + programador.qualificacoes());
        }
    }
}
