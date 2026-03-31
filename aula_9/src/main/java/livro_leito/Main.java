package livro_leito;

public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Gustavo", 20, "M");
        p[1] = new Pessoa("Maria", 20, "F");

        l[0] = new Livro("Sei lá", "EU", 1000, p[0]);
        l[1] = new Livro("Visual novel bem legar", "Toby Fox", 25, p[1]);
        l[2] = new Livro("Revan", "Drew Karpyshyn", 352, p[0]);

        l[2].detalhes();
        l[2].abrir();
        l[2].folhear(254);
        l[2].avancarPag();
        l[2].fechar();
        l[2].voltarPag();
    }
}