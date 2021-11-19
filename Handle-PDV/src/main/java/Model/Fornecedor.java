package Model;

import java.util.ArrayList;
import java.util.List;

public class Fornecedor {

    private long idFornecedor;
    private String nomeFornecedor;
    private long telefoneFornecedor;
    private List<Produto> fornecedorProduto = new ArrayList<Produto>();


    public Fornecedor() {
    }

    public Fornecedor(long idFornecedor, String nomeFornecedor, long telefoneFornecedor, List<Produto> fornecedorProduto) {
        this.idFornecedor = idFornecedor;
        this.nomeFornecedor = nomeFornecedor;
        this.telefoneFornecedor = telefoneFornecedor;
        this.fornecedorProduto = fornecedorProduto;
    }

    public Fornecedor(long idFornecedor, String nomeFornecedor, long telefoneFornecedor) {
        this.idFornecedor = idFornecedor;
        this.nomeFornecedor = nomeFornecedor;
        this.telefoneFornecedor = telefoneFornecedor;
    }

    public long getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(long idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public long getTelefoneFornecedor() {
        return telefoneFornecedor;
    }

    public void setTelefoneFornecedor(long telefoneFornecedor) {
        this.telefoneFornecedor = telefoneFornecedor;
    }

    public List<Produto> getFornecedorProduto() {
        return fornecedorProduto;
    }

    public void setFornecedorProduto(List<Produto> fornecedorProduto) {
        this.fornecedorProduto = fornecedorProduto;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "idFornecedor=" + idFornecedor +
                ", nomeFornecedor='" + nomeFornecedor +
                ", telefoneFornecedor=" + telefoneFornecedor +
                ", fornecedorProduto=" + fornecedorProduto +
                '}';
    }
}
