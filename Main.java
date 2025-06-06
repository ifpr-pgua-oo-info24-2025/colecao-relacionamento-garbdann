import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Livro> biblioteca = new ArrayList<>();

        Autor autor1 = new Autor("Stephen King", "Americano");
        Autor autor2 = new Autor("William Shakespeare", "Inglês");

        boolean end = false;
        int op;

        while (!end) {
            System.out.println("\nBem-vindo à biblioteca");
            System.out.println("1) Adicionar livro");
            System.out.println("2) Listar livros");
            System.out.println("0) Sair");
            System.out.print("> ");
            op = scan.nextInt();
            scan.nextLine();

            switch (op) {
                case 0:
                    end = true;
                    break;

                case 1:
                    System.out.println("Tipo do livro: 1) Físico | 2) Digital");
                    System.out.print("> ");
                    int tipo = scan.nextInt();
                    scan.nextLine();

                    if (tipo != 1 && tipo != 2) {
                        System.out.println("Tipo inválido!");
                        break;
                    }

                    System.out.println("Escolha o autor: 1) Stephen King | 2) William Shakespeare");
                    System.out.print("> ");
                    int autor = scan.nextInt();
                    scan.nextLine();

                    Autor autorSelecionado = null;
                    if (autor == 1) {
                        autorSelecionado = autor1;
                    } else if (autor == 2) {
                        autorSelecionado = autor2;
                    } else {
                        System.out.println("Autor inválido!");
                        break;
                    }

                    System.out.print("Título: ");
                    String titulo = scan.nextLine();

                    System.out.print("Ano de publicação: ");
                    int ano = scan.nextInt();
                    scan.nextLine();

                    if (tipo == 1) {
                        System.out.print("Número de páginas: ");
                        int paginas = scan.nextInt();
                        scan.nextLine();
                        biblioteca.add(new livroFisico(titulo, ano, autorSelecionado, paginas));
                    } else {
                        System.out.print("Tamanho do arquivo (MB): ");
                        double tamanho = Double.parseDouble(scan.nextLine());
                        biblioteca.add(new livroDigital(titulo, ano, autorSelecionado, tamanho));
                    }

                    System.out.println("Livro adicionado com sucesso!");
                    break;

                case 2:
                    if (biblioteca.isEmpty()) {
                        System.out.println("Nenhum livro no acervo.");
                    } else {
                        System.out.println("\nLivros no acervo:");
                        for (Livro livro : biblioteca) {
                            System.out.println("---------------------------");
                            if (livro instanceof livroFisico) {
                                System.out.println("Livro físico");
                            } else if (livro instanceof livroDigital) {
                                System.out.println("Livro digital");
                            }
                            System.out.println(livro.exibirDetalhes());
                        }
                    }
                break;

                default:
                    System.out.println("Opção inválida!");
                break;
            }
        }

        scan.close();
        System.out.println("Tchau tchau!");
    }
}
