import java.util.ArrayList;
import java.util.Objects;

public class Pessoa {
    private String nome;
    private int cpf;
    private ArrayList<Livros> livrosPegos = new ArrayList<>();

    public Pessoa(String nome, int cpf, ArrayList<Livros> livrosPegos) {
        this.nome = nome;
        this.cpf = cpf;
        this.livrosPegos = livrosPegos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public ArrayList<Livros> getLivrosPegos() {
        return livrosPegos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return cpf == pessoa.cpf;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cpf);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", livrosPegos=" + livrosPegos +
                '}';
    }


    public void adicionarLivos(Livros livro){
        livrosPegos.add(livro);
    }

}
