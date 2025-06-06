public class livroFisico extends Livro {
    private int numeroDePaginas;

    public livroFisico(String titulo, int anoPublicacao, Autor autor, int numeroDePaginas) {
        super(titulo, anoPublicacao, autor);
        this.numeroDePaginas = numeroDePaginas;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public String exibirDetalhes() {
        return "Título do livro: " + this.getTitulo() + "\n" +
               "Ano de publicação do livro: " + this.getAnoPublicacao() + "\n" +
               "Nome do autor do livro: " + this.getAutor().getNome() + "\n" +
               "Nacionalidade do autor do livro: " + this.getAutor().getNacionalidade() + "\n" +
               "Número de páginas do livro: " + this.getNumeroDePaginas() + "\n";
    }
}
