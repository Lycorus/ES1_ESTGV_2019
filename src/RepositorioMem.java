import java.util.ArrayList;

public class RepositorioMem implements Repositorio{

    ArrayList<Utilizador> arrayUser = new ArrayList<>();
    ArrayList<TipoUtilizador> arrayTipoUser = new ArrayList<>();
    ArrayList<Requisicao> arrayRequisicao = new ArrayList<>();
    ArrayList<Copia> arrayCopia = new ArrayList<>();
    ArrayList<Livro> arrayLivro = new ArrayList<>();
    ArrayList<Emprestimo> arrayEmprestimo = new ArrayList<>();
    ArrayList<Notificacao> arrayNotificacao = new ArrayList<>();
    ArrayList<Devolucao> arrayDevolucao = new ArrayList<>();
    ArrayList<Coima> arrayCoima = new ArrayList<>();
    ArrayList<EntradaNovoLivro> arrayEntradaNovoLivro = new ArrayList<>();
    ArrayList<PropostaAquisicao> arrayPropostaAquisicao = new ArrayList<>();
    ArrayList<RequisicaoCompra> arrayRequisicaoCompra = new ArrayList<>();
    ArrayList<Encomenda> arrayEncomenda = new ArrayList<>();
    ArrayList<PropostaManutencao> arrayPropostaManutencao = new ArrayList<>();
    ArrayList<RequisicaoManutencao> arrayRequisicaoManutencao = new ArrayList<>();
    ArrayList<Manutencao> arrayManutencao = new ArrayList<>();


    public RepositorioMem() {
    }

















    public void adicionaUtilizador(Utilizador utilizador){
        arrayUser.add(utilizador);
    }

    public void adicionaTipoUtilizador(TipoUtilizador tipo){
        arrayTipoUser.add(tipo);
    }

    public void adicionaRequisicao(Requisicao requisicao){
        arrayRequisicao.add(requisicao);
    }

    public void adicionaCopia(Copia copia){
        arrayCopia.add(copia);
    }

    public void adicionaLivro(Livro livro){
        arrayLivro.add(livro);
    }

    public void adicionaEmprestimo(Emprestimo emprestimo){
        arrayEmprestimo.add(emprestimo);
    }

    public void adicionaNotificacao(Notificacao notificacao){
        arrayNotificacao.add(notificacao);
    }

    public void adicionaDevolucao(Devolucao devolucao){
        arrayDevolucao.add(devolucao);
    }

    public void adicionaCoima(Coima coima){
        arrayCoima.add(coima);
    }

    public void adicionaEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro){ arrayEntradaNovoLivro.add(entradaNovoLivro); }

    public void adicionaPropostaRequisicao(PropostaAquisicao proposta){ arrayPropostaAquisicao.add(proposta); }

    public void adicionaRequisicaoCompra(RequisicaoCompra requisicaoCompra){ arrayRequisicaoCompra.add(requisicaoCompra); }

    public void adicionaEncomenda(Encomenda encomenda){ arrayEncomenda.add(encomenda); }

    public void adicionaPropostaManutencao(PropostaManutencao propostaManutencao){
        arrayPropostaManutencao.add(propostaManutencao);
    }

    public void adicionaRequisicaoManutencao(RequisicaoManutencao requisicaoManutencao){
        arrayRequisicaoManutencao.add(requisicaoManutencao);
    }

    public void adicionaManutencao(Manutencao manutencao){
        arrayManutencao.add(manutencao);
    }

    public Emprestimo devolveEmprestimoDaRequisicao(Requisicao r){
        for(Emprestimo e : arrayEmprestimo){
            if(e.getRequisicao() == r){
                return e;
            }
        }
        return null;
    }

    @Override
    public ArrayList<RequisicaoCompra> devolveRequisiacaosCompraByUtilizador(Utilizador u) {
        ArrayList<RequisicaoCompra> rqcompra = new ArrayList<>();
        for(RequisicaoCompra r : arrayRequisicaoCompra){
            if(r.getUtilizador() == u){
                rqcompra.add(r);
            }
        }
        return rqcompra;
    }

    @Override
    public ArrayList<Coima> devolveCoimasByUtilizador(Utilizador u) {
        ArrayList<Coima> coimas = new ArrayList<>();
        for(Coima c : arrayCoima){

            if(c.getUtilizador() == u){
                coimas.add(c);
            }
        }
        return coimas;
    }

    @Override
    public ArrayList<Devolucao> devolveDevolucaosByUtilizador(Utilizador u) {
        ArrayList<Devolucao> devolucaos = new ArrayList<>();
        for(Devolucao d : arrayDevolucao){

            if(d.getEmprestimo().getRequisicao().getUtilizador() == u){
                devolucaos.add(d);
            }
        }
        return devolucaos;
    }

    @Override
    public ArrayList<PropostaManutencao> devolvePropostasManutencaoByUtilizador(Utilizador u) {
        ArrayList<PropostaManutencao> propostaManutencaos = new ArrayList<>();
        for(PropostaManutencao pm : arrayPropostaManutencao){

            if(pm.getUtilizador() == u){
                propostaManutencaos.add(pm);
            }
        }
        return propostaManutencaos;
    }

    @Override
    public ArrayList<PropostaAquisicao> devolvePropostasAquisicaoByUtilizador(Utilizador u) {
        ArrayList<PropostaAquisicao> propostaAquisicaos = new ArrayList<>();
        for(PropostaAquisicao pa : arrayPropostaAquisicao){

            if(pa.getUtilizador() == u){
                propostaAquisicaos.add(pa);
            }
        }
        return propostaAquisicaos;
    }
}
