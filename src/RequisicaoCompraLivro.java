import java.time.LocalDate;

public class RequisicaoCompraLivro extends RequisicaoCompra{
    private PropostaAquisicao propostaAquisicao;

    public RequisicaoCompraLivro(String estado, LocalDate data, String oficio, Livro livro, Utilizador utilizador, PropostaAquisicao propostaAquisicao) {
        super(estado, data, oficio, livro, utilizador);
        this.propostaAquisicao = propostaAquisicao;
    }

    public PropostaAquisicao getPropostaAquisicao() {
        return propostaAquisicao;
    }

    public void setPropostaAquisicao(PropostaAquisicao propostaAquisicao) {
        this.propostaAquisicao = propostaAquisicao;
    }
}
