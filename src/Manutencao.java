import java.time.LocalDate;

public class Manutencao {
    private RequisicaoManutencao requisicaoManutencao;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public Manutencao(RequisicaoManutencao requisicaoManutencao, LocalDate dataInicio, LocalDate dataFim) {
        this.requisicaoManutencao = requisicaoManutencao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public RequisicaoManutencao getRequisicaoManutencao() {
        return requisicaoManutencao;
    }

    public void setRequisicaoManutencao(RequisicaoManutencao requisicaoManutencao) {
        this.requisicaoManutencao = requisicaoManutencao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    @Override
    public String toString() {
        return "Manutencao{" +
                "requisicaoManutencao=" + requisicaoManutencao.toString() +
                ", dataInicio=" + dataInicio.toString() +
                ", dataFim=" + dataFim.toString() +
                '}';
    }
}
