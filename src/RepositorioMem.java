import java.util.ArrayList;

public class Repositorio {

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


    public Repositorio() {
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

    public Emprestimo devolveEmprestimoDaRequisicao(Requisicao r){
        for(Emprestimo e : arrayEmprestimo){
            if(e.getRequisicao() == r){
                return e;
            }
        }
        return null;
    }
}