package Dominio;

public class Filmes extends Conteudo{


    public Filmes(String nome, String genero) {
        super(nome, genero);
    }

    @Override
    public String toString() {
        return "Series{" +
                "nome='" + getNome() + '\'' +
                ", genero='" + getGenero() + '\'' +
                '}';
    }
}
