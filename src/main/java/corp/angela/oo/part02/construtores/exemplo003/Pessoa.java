package corp.angela.oo.part02.construtores.exemplo003;

public class Pessoa {

    // Construtor padrao
    public Pessoa() {
    }

    // Construtor com parametro
    public Pessoa(String nome) {
        this.nome = nome;
    }

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
