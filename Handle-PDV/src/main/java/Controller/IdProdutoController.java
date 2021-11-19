package Controller;

import DAO.IdProdutoDAO;

public class IdProdutoController {

    IdProdutoDAO idProdutoDAO = new IdProdutoDAO();

    public long determinarId(){

        return (long) idProdutoDAO.usuarioID();
    }
}
