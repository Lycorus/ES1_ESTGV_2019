import java.time.LocalDate;

public class RequisicaoManutencao {
    private LocalDate dataRequisicao;
    private PropostaManutencao propostaManutencao;

    public RequisicaoManutencao(LocalDate dataRequisicao, PropostaManutencao propostaManutencao) {
        this.dataRequisicao = dataRequisicao;
        this.propostaManutencao = propostaManutencao;
    }

    public LocalDate getDataRequisicao() {
        return dataRequisicao;
    }

    public void setDataRequisicao(LocalDate dataRequisicao) {
        this.dataRequisicao = dataRequisicao;
    }

    public PropostaManutencao getPropostaManutencao() {
        return propostaManutencao;
    }

    public void setPropostaManutencao(PropostaManutencao propostaManutencao) {
        this.propostaManutencao = propostaManutencao;
    }

    @Override
    public String toString() {
        return "RequisicaoManutencao{" +
                "dataRequisicao=" + dataRequisicao.toString() +
                ", propostaManutencao=" + propostaManutencao.toString() +
                '}';
    }
}
