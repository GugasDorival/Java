package livro_leito;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro() {
    }
    
    public Livro(String t, String a, int tP, Pessoa l) {
        this.titulo = t;
        this.autor = a;
        this.totPaginas = tP;
        this.setPagAtual(1);
        this.setAberto(false);
        this.leitor = l;
    }
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String t) {
        this.titulo = t;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String a) {
        this.autor = a;
    }

    public int getTotPaginas() {
        return totPaginas;
    }
    public void setTotPaginas(int tP) {
        this.totPaginas = tP;
    }

    public int getPagAtual() {
        return pagAtual;
    }
    public void setPagAtual(int pA) {
        this.pagAtual = pA;
    }

    public boolean isAberto() {
        return aberto;
    }
    public void setAberto(boolean ab) {
        this.aberto = ab;
    }

    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa l) {
        this.leitor = l;
    }

    public void detalhes(){
        System.out.println("====DETALHES DO LIVRO====");
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total de páginas do livro: " + this.getTotPaginas());
        System.out.println("Página atual: " + this.getPagAtual());
        System.out.println("Aberto? " + this.isAberto());
        System.out.println("Quem está lendo? " + this.getLeitor().getNome());
        System.out.println("=========================");
    }

    @Override
    public void abrir() {
        if(this.isAberto() == false){
            this.setAberto(true);
            System.out.println("Livro aberto");
        }else{
            System.out.println("Livro já aberto");
        }
    }

    @Override
    public void fechar() {
        if(this.isAberto() == true){
            this.setAberto(false);
            System.out.println("Livro fechado");
        }else {
            System.out.println("Livro já fechado");
        }
    }

    @Override
    public void avancarPag() {
        if(this.getPagAtual() != this.getTotPaginas()){
            this.setPagAtual(this.getPagAtual() + 1);
            System.out.println("Página atual: " + this.getPagAtual());
        }else{
            System.out.println("FIm do Livro");
        }
    }

    @Override
    public void voltarPag() {
        if (getPagAtual() > 1){
            this.setPagAtual(this.getPagAtual() - 1);
            System.out.println("Pagina atual: " + this.getPagAtual());
        }else{
            System.out.println("Impossivel voltar, começo do livro");
        }
    }

    @Override
    public void folhear(int p) {
        if (p < this.getTotPaginas()){
            this.setPagAtual(p);
            System.out.println("Páginal atual: " + getPagAtual());
        }else{
            System.out.println("Impossível folhear");
        }
    }
}
