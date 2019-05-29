import java.time.LocalDate;

public class Devolucao {
    private LocalDate data;
    private Emprestimo emprestimo;

    public Devolucao(LocalDate data, Emprestimo emprestimo) {
        this.data = data;
        this.emprestimo = emprestimo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }

    @Override
    public String toString() {
        return "Devolucao{" +
                "data=" + data.toString() +
                ", emprestimo=" + emprestimo.toString() +
                '}';
    }
}
