import java.util.ArrayList;

public class HistoricoBiblioteca extends Historico{
    private ArrayList<HistoricoUtilizador> historicoUtilizadors;
    private ArrayList<Emprestimo> emprestimos;
    private ArrayList<Encomenda> encomendas;
    private ArrayList<Manutencao> manutencaos;
    private ArrayList<Coima> coimas;
    private ArrayList<RequisicaoCompra> requisicaoCompras;
    private ArrayList<RequisicaoManutencao> requisicaoManutencaos;

    public HistoricoBiblioteca(ArrayList<HistoricoUtilizador> historicoUtilizadors, RepositorioMem repo) {
        this.historicoUtilizadors = historicoUtilizadors;
        this.emprestimos = repo.getArrayEmprestimo();
        this.encomendas = repo.getArrayEncomenda();
        this.manutencaos = repo.getArrayManutencao();
        this.coimas = repo.getArrayCoima();
        this.requisicaoCompras = repo.getArrayRequisicaoCompra();
        this.requisicaoManutencaos = repo.getArrayRequisicaoManutencao();
    }

    public void setHistoricoUtilizadors(ArrayList<HistoricoUtilizador> historicoUtilizadors) {
        this.historicoUtilizadors = historicoUtilizadors;
    }

    public void setEmprestimos(ArrayList<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public void setEncomendas(ArrayList<Encomenda> encomendas) {
        this.encomendas = encomendas;
    }

    public void setManutencaos(ArrayList<Manutencao> manutencaos) {
        this.manutencaos = manutencaos;
    }

    public void setCoimas(ArrayList<Coima> coimas) {
        this.coimas = coimas;
    }

    public void setRequisicaoCompras(ArrayList<RequisicaoCompra> requisicaoCompras) {
        this.requisicaoCompras = requisicaoCompras;
    }

    public void setRequisicaoManutencaos(ArrayList<RequisicaoManutencao> requisicaoManutencaos) {
        this.requisicaoManutencaos = requisicaoManutencaos;
    }

    public ArrayList<HistoricoUtilizador> getHistoricoUtilizadors() {
        return historicoUtilizadors;
    }

    public ArrayList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public ArrayList<Encomenda> getEncomendas() {
        return encomendas;
    }

    public ArrayList<Manutencao> getManutencaos() {
        return manutencaos;
    }

    public ArrayList<Coima> getCoimas() {
        return coimas;
    }

    public ArrayList<RequisicaoCompra> getRequisicaoCompras() {
        return requisicaoCompras;
    }

    public ArrayList<RequisicaoManutencao> getRequisicaoManutencaos() {
        return requisicaoManutencaos;
    }


    public void adicionaHistoricoUtilizador(HistoricoUtilizador historicoUtilizador){
        historicoUtilizadors.add(historicoUtilizador);
    }

    public void adicionaEmprestimo(Emprestimo emprestimo){
        emprestimos.add(emprestimo);
    }

    public void adicionaEncomenda(Encomenda encomenda){
        encomendas.add(encomenda);
    }

    public void adicionaManutencao(Manutencao manutencao){
        manutencaos.add(manutencao);
    }

    public void adicionaCoima(Coima coima){
        coimas.add(coima);
    }

    public void adicionaRequisicaoCompra(RequisicaoCompra requisicaoCompra){
        requisicaoCompras.add(requisicaoCompra);
    }

    public void adicionaRequisicaoManutencao(RequisicaoManutencao requisicaoManutencao){
        requisicaoManutencaos.add(requisicaoManutencao);
    }

    @Override
    public String toString() {
        return "Historico Biblioteca: \n" +
                "historicoUtilizadors: " + mostrarHistorico(historicoUtilizadors) + '\n' +
                "emprestimos: " + mostrarHistorico(emprestimos) +'\n' +
                "encomendas: " + mostrarHistorico(encomendas) +'\n' +
                "manutencaos: " + mostrarHistorico(manutencaos) +'\n' +
                "coimas: " + mostrarHistorico(coimas) +'\n' +
                "requisicaoCompras: " + mostrarHistorico(requisicaoCompras) +'\n' +
                "requisicaoManutencaos: " + mostrarHistorico(requisicaoManutencaos) +'\n';
    }
}
