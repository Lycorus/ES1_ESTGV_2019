public class Coima {
    private String descricao;
    private float valor;
    private Devolucao devolucao;
    private Utilizador utilizador;

    public Coima(String descricao, float valor, Devolucao devolucao, Utilizador utilizador) {
        this.utilizador = utilizador;
        this.descricao = descricao;
        this.valor = valor;
        this.devolucao = devolucao;
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

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Devolucao getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(Devolucao devolucao) {
        this.devolucao = devolucao;
    }
}
