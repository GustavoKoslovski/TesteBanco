
import Controller.ProdutoController;
import View.Menu;

public class Main {

    public static void main(String[] args){
        ProdutoController produtoController = new ProdutoController();

        Menu menu = new Menu();
        menu.menuPrincipal();

    }
}
