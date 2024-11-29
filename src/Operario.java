package entidades;

public class Operario {
    private int id;
    private String nome;

    public Operario(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String toString() {
        return "Operario [id=" + id + ", nome=" + nome + "]";
    }
}
