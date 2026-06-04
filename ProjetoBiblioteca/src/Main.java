import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca bli = new Biblioteca();
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        System.out.print("Deseja fazer o cadastro na biblioteca(s/n)? ");
        char sy = sc.next().charAt(0);
        sc.nextLine();

        if(sy == 's'){
            System.out.print("Digite o seu nome completo: ");
            String nome = sc.nextLine();

            System.out.print("Digite o seu cpf: ");
            String cpf = sc.nextLine();

            Pessoa p = new Pessoa(nome, cpf);
            pessoas.add(p);
        }

        if(pessoas.isEmpty()){
            System.out.println("Nenhuma pessoa cadastrada.");
        }
        else {
            System.out.print("Deseja adicionar um livro para uma pessoa(s/n)? ");
            sy = sc.next().charAt(0);
            sc.nextLine();

            if(sy == 's'){
                System.out.println("Qual livro você quer adicionar? ");
                System.out.println(bli.toString());

                System.out.print("Digite o seu cpf: ");
                String cpf = sc.nextLine();

                boolean encontrado = false;
                for(Pessoa p : pessoas){
                    if(Objects.equals(p.getCpf(), cpf)){
                        encontrado = true;

                        System.out.print("Qual livro deseja adicionar(1/2/3)? ");
                        int num = sc.nextInt();
                        sc.nextLine();

                        if(num > 3 || num < 1){
                            System.out.println("Número inválido");
                        }
                        else{
                            p.adicionarLivos(bli.livros.get(num-1));
                            System.out.println("Livro adicionado com sucesso, boa leitura!");
                            System.out.println(pessoas);
                        }
                    }
                }

                if(!encontrado) {
                    System.out.println("Aviso: CPF não encontrado no sistema!");
                }
            }
        }
        sc.close();
    }
}