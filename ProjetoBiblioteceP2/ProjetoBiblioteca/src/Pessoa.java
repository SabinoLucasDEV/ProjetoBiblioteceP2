import java.util.ArrayList;
import java.util.Objects;

public class Pessoa {
    private String nome;
    private String cpf;
    private ArrayList<Livros> livrosPegos = new ArrayList<>();

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
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
