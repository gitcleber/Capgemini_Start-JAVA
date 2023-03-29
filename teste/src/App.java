import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        var artigo = new Artigo("Vs Code com Java", new Autor("Jaqueline Oliveira"), LocalDate.of(2023, 01, 3), Categoria.HIGH );

        System.out.println(artigo);
    }
}
