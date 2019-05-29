import java.time.LocalDate;

public class Requisicao {
    private LocalDate data;
    private Utilizador utilizador;
    private Copia copia;

    public Requisicao(LocalDate data, Utilizador utilizador, Copia copia) {
        this.data = data;
        this.utilizador = utilizador;
        this.copia = copia;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }

    public void setUtilizador(Utilizador utilizador) {
        this.utilizador = utilizador;
    }

    public Copia getCopia() {
        return copia;
    }

    public void setCopia(Copia copia) {
        this.copia = copia;
    }

    @Override
    public String toString() {
        return "Requisicao{" +
                "data=" + data.toString() +
                ", utilizador=" + utilizador.toString() +
                ", copia=" + copia.toString() +
                '}';
    }
}
