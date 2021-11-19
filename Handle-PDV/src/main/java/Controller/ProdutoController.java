package Controller;

import DAO.ProdutoDAO;
import Model.Produto;
import java.util.List;

public class ProdutoController {

    ProdutoDAO produtoDAO = new ProdutoDAO();
    public void adicionarProduto(Produto produto) {
        produtoDAO.tabelaProdutos();
        produtoDAO.cadastrarProduto(produto);

    }
    public List<Produto> listarProdutos() {
        return produtoDAO.listarProdutos();
    }

    public void removerProduto(Produto produto) {

    }

    public void editarProduto(int i, String conteudo, int opcao){
        produtoDAO.editarProduto(i,conteudo,opcao);
    }
}
