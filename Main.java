import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Livro> biblioteca = new ArrayList<>();
        
        Autor stephenKing = new Autor("Stephen King", "Americano");
        Autor williamShakespeare = new Autor("William Shakespeare", "Inglês");

        boolean end = false;
        int op;

        do {
            System.out.println("Bem-vindo à biblioteca");
            System.out.println("---------------------------");
            System.out.println("1) Adicionar livros no acervo");
            System.out.println("2) Listar livros no acervo");
            System.out.println("3) Excluir um livro do acervo");
            System.out.println("0) Sair");
            System.out.println("---------------------------");
            System.out.print("> ");
            op = scan.nextInt();
            
            if(op == 0) {
                end = true;
            } else if(op == 1) {
                String titulo;
                int autor;
                int anoPublicacao;
                int numeroDePaginas;
                double tamanhoDoArquivoMB;
                System.out.println("Você deseja adicionar um livro físico ou digital? ");
                System.out.println("1) Físico");
                System.out.println("2) Digital");
                System.out.print("> ");
                op = scan.nextInt();
                
                if(op == 1) {
                    System.out.println("Selecione o autor");
                    System.out.println("1) Stephen King");
                    System.out.println("2) William Shakespeare");
                    System.out.print("> ");
                    autor = scan.nextInt();
                    System.out.println("Digite o título do livro");
                    System.out.print("> ");
                    titulo = scan.nextLine();
                    System.out.println("Digite o ano de publicação do livro");
                    System.out.print("> ");
                    anoPublicacao = scan.nextInt();
                    System.out.println("Digite o número de páginas do livro");
                    System.out.print("> ");
                    numeroDePaginas = scan.nextInt();
                    
                    if(autor == 1) {
                        
                    } else if(autor == 2) {

                    }
                } else if(op == 2) {

                } else{
                    System.out.println("Opção inválida!");
                }
            } else if(op == 2) {
                
            } else if(op == 3) {

            } else {
                System.out.println("Opção inválida!");
            }
        } while(end == false);
    }
}
