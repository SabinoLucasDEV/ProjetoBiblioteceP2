public class Main {
    public static void main(String[] args) {
     Biblioteca bli = new Biblioteca();
        Pessoa sabino = new Pessoa("Sabino",121212);

        sabino.adicionarLivos(bli.livro1);
        System.out.println(sabino);



    }
}