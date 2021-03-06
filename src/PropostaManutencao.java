import java.time.LocalDate;

public class PropostaManutencao {
    private LocalDate dataProposta;
    private Utilizador utilizador;
    private String descricao;

    public PropostaManutencao(LocalDate dataProposta, Utilizador utilizador, String descricao) {
        this.dataProposta = dataProposta;
        this.utilizador = utilizador;
        this.descricao = descricao;
    }

    public LocalDate getDataProposta() {
        return dataProposta;
    }

    public void setDataProposta(LocalDate dataProposta) {
        this.dataProposta = dataProposta;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }

    public void setUtilizador(Utilizador utilizador) {
        this.utilizador = utilizador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "PropostaManutencao: \n" +
                "dataProposta: " + dataProposta.toString() + '\n' +
                "utilizador: " + utilizador.toString() + '\n' +
                "descricao: " + descricao;
    }
}
