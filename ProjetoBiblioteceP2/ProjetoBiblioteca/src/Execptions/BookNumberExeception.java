package Execptions;

import java.util.InputMismatchException;

public class BookNumberExeception extends InputMismatchException {

    public BookNumberExeception() {
        super("Dado para busca de livros inválido");

    }
}
