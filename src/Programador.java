public abstract class Programador implements IQualificacoes {
    private String nome;

    private String senioridade;

    private String leader;

    public Programador(String nome, String senioridade) {
        this.nome = nome;
        this.senioridade = senioridade;
    }

    public String getNome() {
        return nome;
    }

    public String getSenioridade() {
        return senioridade;
    }
}
