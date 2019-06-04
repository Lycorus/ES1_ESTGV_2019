import java.util.ArrayList;

public interface Repositorio {

    public void adicionaUtilizador(Utilizador utilizador);

    public void adicionaTipoUtilizador(TipoUtilizador tipo);

    public void adicionaRequisicao(Requisicao requisicao);

    public void adicionaCopia(Copia copia);

    public void adicionaLivro(Livro livro);

    public void adicionaEmprestimo(Emprestimo emprestimo);

    public void adicionaNotificacao(Notificacao notificacao);

    public void adicionaDevolucao(Devolucao devolucao);

    public void adicionaCoima(Coima coima);

    public void adicionaEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro);

    public void adicionaPropostaRequisicao(PropostaAquisicao proposta);

    public void adicionaRequisicaoCompra(RequisicaoCompra requisicaoCompra);

    public void adicionaEncomenda(Encomenda encomenda);

    public void adicionaPropostaManutencao(PropostaManutencao propostaManutencao);

    public void adicionaRequisicaoManutencao(RequisicaoManutencao requisicaoManutencao);

    public void adicionaManutencao(Manutencao manutencao);

    public Emprestimo devolveEmprestimoDaRequisicao(Requisicao r);

    public ArrayList<RequisicaoCompra> devolveRequisiacaosCompraByUtilizador(Utilizador u);

    public ArrayList<Coima> devolveCoimasByUtilizador(Utilizador u);

    public ArrayList<Devolucao> devolveDevolucaosByUtilizador(Utilizador u);

    public ArrayList<PropostaManutencao> devolvePropostasManutencaoByUtilizador(Utilizador u);

    public ArrayList<PropostaAquisicao> devolvePropostasAquisicaoByUtilizador(Utilizador u);

    public ArrayList<Requisicao> devolveRequisicaosByUtilizador(Utilizador u);
}
