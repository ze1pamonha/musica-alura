package alura.musica;

public class Audio {

    private String Titulo;
   private double Duracao;

    public int getTotalDeReproducoes() {
        return TotalDeReproducoes;
    }

    public void setTotalDeReproducoes(int totalDeReproducoes) {
        TotalDeReproducoes = totalDeReproducoes;
    }

    private int TotalDeReproducoes;
    private int Curtidas;

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    private int classificacao;

public void curte(){
    this.TotalDeReproducoes++;
}
public void reproduz(){
    this.TotalDeReproducoes++;
}

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
}
