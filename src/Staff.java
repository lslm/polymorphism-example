public class Staff extends Programador {
    public Staff(String nome) {
        super(nome, "staff");
    }

    @Override
    public String qualificacoes() {
        return "Gerenciamento de projetos de grande porte";
    }
}
