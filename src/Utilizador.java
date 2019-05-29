public class Utilizador {
    private String nome;
    private String estado;
    private TipoUtilizador tipoUtilizador;

    public Utilizador(String nome, String estado, TipoUtilizador tipoUtilizador) {
        this.nome = nome;
        this.estado = estado;
        this.tipoUtilizador = tipoUtilizador;
    }

    public String getNome() {
        return nome;
    }

    public TipoUtilizador getTipoUtilizador() {
        return tipoUtilizador;
    }

    public void setTipoUtilizador(TipoUtilizador tipoUtilizador) {
        this.tipoUtilizador = tipoUtilizador;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Utilizador{" +
                "nome='" + nome + '\'' +
                ", estado='" + estado + '\'' +
                ", tipoUtilizador=" + tipoUtilizador.toString() +
                '}';
    }
}
