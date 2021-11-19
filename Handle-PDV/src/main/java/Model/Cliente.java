package Model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private long idCliente;
    private String nomeCliente;
    private long telefoneCliente;
    private List<Venda> produtosCliente = new ArrayList<Venda>();

    public Cliente() {
    }

    public Cliente(long idCliente, String nomeCliente, long telefoneCliente, List<Venda> produtosCliente) {
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.telefoneCliente = telefoneCliente;
        this.produtosCliente = produtosCliente;
    }

    public Cliente(long idCliente, String nomeCliente, long telefoneCliente) {
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.telefoneCliente = telefoneCliente;
    }

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public long getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(long telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public List<Venda> getProdutosCliente() {
        return produtosCliente;
    }

    public void setProdutosCliente(List<Venda> produtosCliente) {
        this.produtosCliente = produtosCliente;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente='" + idCliente +
                ", nomeCliente='" + nomeCliente +
                ", telefoneCliente=" + telefoneCliente +
                '}';
    }
}
