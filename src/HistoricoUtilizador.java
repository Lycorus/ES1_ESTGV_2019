import java.util.ArrayList;

public class HistoricoUtilizador extends Historico{
    private Utilizador utilizador;
    private ArrayList<RequisicaoCompra> requisicaosCompra;
    private ArrayList<Devolucao> devolucaos;
    private ArrayList<Coima> coimas;
    private ArrayList<PropostaManutencao> propostaManutencaos;
    private ArrayList<PropostaAquisicao> propostaAquisicaos;
    private ArrayList<Requisicao> requisicaos;

    public HistoricoUtilizador(Utilizador utilizador, RepositorioMem repo) {
        this.utilizador = utilizador;
        this.requisicaosCompra = repo.devolveRequisiacaosCompraByUtilizador(utilizador);
        this.devolucaos = repo.devolveDevolucaosByUtilizador(utilizador);
        this.coimas = repo.devolveCoimasByUtilizador(utilizador);
        this.propostaManutencaos = repo.devolvePropostasManutencaoByUtilizador(utilizador);
        this.propostaAquisicaos = repo.devolvePropostasAquisicaoByUtilizador(utilizador);
        this.requisicaos = repo.devolveRequisicaosByUtilizador(utilizador);
    }

    public ArrayList<Requisicao> getRequisicaos() {
        return requisicaos;
    }

    public void setRequisicaos(ArrayList<Requisicao> requisicaos) {
        this.requisicaos = requisicaos;
    }

    public void setRequisicaosCompra(ArrayList<RequisicaoCompra> requisicaosCompra) {
        this.requisicaosCompra = requisicaosCompra;
    }

    public void setDevolucaos(ArrayList<Devolucao> devolucaos) {
        this.devolucaos = devolucaos;
    }

    public void setCoimas(ArrayList<Coima> coimas) {
        this.coimas = coimas;
    }

    public void setPropostaManutencaos(ArrayList<PropostaManutencao> propostaManutencaos) {
        this.propostaManutencaos = propostaManutencaos;
    }

    public void setPropostaAquisicaos(ArrayList<PropostaAquisicao> propostaAquisicaos) {
        this.propostaAquisicaos = propostaAquisicaos;
    }

    public HistoricoUtilizador(Utilizador utilizador) {
        this.utilizador = utilizador;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }

    public ArrayList<RequisicaoCompra> getRequisicaosCompra() {
        return requisicaosCompra;
    }

    public ArrayList<Devolucao> getDevolucaos() {
        return devolucaos;
    }

    public ArrayList<Coima> getCoimas() {
        return coimas;
    }

    public ArrayList<PropostaManutencao> getPropostaManutencaos() {
        return propostaManutencaos;
    }

    public ArrayList<PropostaAquisicao> getPropostaAquisicaos() {
        return propostaAquisicaos;
    }

    public void adicionaRequisicaoCompra(RequisicaoCompra requisicao){
        requisicaosCompra.add(requisicao);
    }

    public void adicionaCopia(Coima coima){
        coimas.add(coima);
    }

    public void adicionaDevolucao(Devolucao devolucao){
        devolucaos.add(devolucao);
    }

    public void adicionaPropostaManutencao(PropostaManutencao propostaManutencao){
        propostaManutencaos.add(propostaManutencao);
    }

    public void adicionaPropostaAquisicao(PropostaAquisicao propostaAquisicao){
        propostaAquisicaos.add(propostaAquisicao);
    }

    public void adicionaRequisicao(Requisicao requisicao){
        requisicaos.add(requisicao);
    }

    @Override
    public String toString() {
        return "HistoricoUtilizador: \n" +
                "utilizador: " + utilizador + '\n' +
                "requisicaosCompra: " + mostrarHistorico(requisicaosCompra) +'\n' +
                "devolucaos: " + mostrarHistorico(devolucaos) +'\n' +
                "coimas: " + mostrarHistorico(coimas) +'\n' +
                "propostaManutencaos: " + mostrarHistorico(propostaManutencaos) +'\n' +
                "requisicaos: " + mostrarHistorico(requisicaos) +'\n' +
                "propostaAquisicaos: " + mostrarHistorico(propostaAquisicaos);
    }
}


