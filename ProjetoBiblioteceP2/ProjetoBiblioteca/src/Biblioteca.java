import java.util.ArrayList;
import java.util.Arrays;

public class Biblioteca {
    Livros livro1 = new Livros(
            "Dom Casmurro",
            "Machado de Assis",
            "9788535910663"
    );

    Livros livro2 = new Livros(
            "O Pequeno Príncipe",
            "Antoine de Saint-Exupéry",
            "9788595081512"
    );

    Livros livro3 = new Livros(
            "Clean Code",
            "Robert C. Martin",
            "9780132350884"
    );

    public ArrayList<Livros> livros = new ArrayList<>(Arrays.asList(livro1, livro2, livro3));

    @Override
    public String toString() {
        return "Biblioteca{" +
                "livro1=" + livro1 + ",\n" +
                ", livro2=" + livro2 + ",\n" +
                ", livro3=" + livro3 + ",\n" +
                '}';
    }
}
