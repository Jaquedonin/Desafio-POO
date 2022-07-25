package Dominio;

public class Series extends Conteudo {


    public Series(String nome, String genero) {
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
