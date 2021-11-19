package Model;

import java.util.Scanner;

public class Produto {

    private long idProduto;
    private String nomeProduto;
    private long quantProduto;
    private long codigoDeBarras;
    private Double valorCusto;
    private Double valorVenda;
    private long idCategoria;
    private long idFornecedor;


    public Produto() {
    }

    public Produto(long idProduto, String nomeProduto, long quantProduto, long codigoDeBarras, Double valorCusto, Double valorVenda, long idCategoria, long idFornecedor) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.quantProduto = quantProduto;
        this.codigoDeBarras = codigoDeBarras;
        this.valorCusto = valorCusto;
        this.valorVenda = valorVenda;
        this.idCategoria = idCategoria;
        this.idFornecedor = idFornecedor;
    }

    public long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(long idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public long getQuantProduto() {
        return quantProduto;
    }

    public void setQuantProduto(long quantProduto) {
        this.quantProduto = quantProduto;
    }

    public long getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(long codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public Double getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(Double valorCusto) {
        this.valorCusto = valorCusto;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(long idCategoria) {
        this.idCategoria = idCategoria;
    }

    public long getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(long idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "idProduto=" + idProduto +
                ", nomeProduto='" + nomeProduto +
                ", quantProduto=" + quantProduto +
                ", codigoDeBarras=" + codigoDeBarras +
                ", valorCusto=" + valorCusto +
                ", valorVenda=" + valorVenda +
                ", idCategoria=" + idCategoria +
                ", idFornecedor=" + idFornecedor +
                '}';
    }
}
