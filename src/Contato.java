public class Contato {

    private String nome;
    private String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public void atualizar(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                ", Telefone: " + telefone;
    }
}
