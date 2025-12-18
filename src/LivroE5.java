public class LivroE5 {

    private String titulo;
    private String autor;
    private int paginas;
    double preco;
    Categoria categoria;

    public LivroE5(String titulo, String autor, int paginas, double preco, Categoria categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.preco = preco;
        this.categoria = categoria;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public double getPreco() {
        return preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
