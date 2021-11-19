package Model;

import java.util.ArrayList;
import java.util.List;

public class Venda {

    private long idVenda;
    private long idCliente;
    private long idFuncionario;
    private List<Produto> produtoVenda = new ArrayList<Produto>();



    public Venda() {
    }
    public Venda(long idVenda, long idCliente, long idFuncionario, List<Produto> produtoVenda) {
        this.idVenda = idVenda;
        this.idCliente = idCliente;
        this.idFuncionario = idFuncionario;
        this.produtoVenda = produtoVenda;
    }
    public Venda(long idVenda, long idCliente, long idFuncionario) {
        this.idVenda = idVenda;
        this.idCliente = idCliente;
        this.idFuncionario = idFuncionario;
    }

    public long getIdVenda() {
        return idVenda;
    }
    public void setIdVenda(long idVenda) {
        this.idVenda = idVenda;
    }
    public long getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }
    public long getIdFuncionario() {
        return idFuncionario;
    }
    public void setIdFuncionario(long idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
    public List<Produto> getProdutoVenda() {
        return produtoVenda;
    }
    public void setProdutoVenda(List<Produto> produtoVenda) {
        this.produtoVenda = produtoVenda;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "idVenda=" + idVenda +
                ", idCliente=" + idCliente +
                ", idFuncionario=" + idFuncionario +
                ", produtoVenda=" + produtoVenda +
                '}';
    }
}
