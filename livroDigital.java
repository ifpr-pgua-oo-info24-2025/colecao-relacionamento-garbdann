public class livroDigital extends Livro {
    private double tamanhoDoArquivoMB;

    public livroDigital(String titulo, int anoPublicacao, Autor autor, double tamanhoDoArquivoMB) {
        super(titulo, anoPublicacao, autor);
        this.tamanhoDoArquivoMB = tamanhoDoArquivoMB;
    }

    public double getTamanhoDoArquivoMB() {
        return tamanhoDoArquivoMB;
    }

    public void setTamanhoDoArquivoMB(double tamanhoDoArquivoMB) {
        this.tamanhoDoArquivoMB = tamanhoDoArquivoMB;
    }

    @Override
    public String exibirDetalhes() {
        return "Título do livro: " + this.getTitulo() + "\n" +
               "Ano de publicação do livro: " + this.getAnoPublicacao() + "\n" +
               "Nome do autor do livro: " + this.getAutor().getNome() + "\n" +
               "Nacionalidade do autor do livro: " + this.getAutor().getNacionalidade() + "\n" +
               "Tamanho do arquivo do livro (Em MB): " + this.getTamanhoDoArquivoMB() + "\n";
    }
}
