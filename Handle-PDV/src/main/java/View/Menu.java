package View;
import Controller.ProdutoController;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

    Scanner input = new Scanner(System.in);
    ProdutoController produtoController = new ProdutoController();


    public void menuPrincipal() {

        while (true) {

            System.out.println("-           1 > Produtos               -");

            int escolha = input.nextInt();
            switch (escolha) {

                case 1:
                    menuProdutos();
                    break;
            }
        }
    }

    public int menuProdutos() {

        ProdutoView produtoView = new ProdutoView();
        while (true) {
            System.out.println("-------------Menu Produtos-------------");
            System.out.println("-       1 > Cadastrar Produtos        -");
            System.out.println("-       2 > Editar Produtos           -");
            System.out.println("-       3 > Remover Produtos          -");
            System.out.println("-       4 > Listar Produtos           -");
            System.out.println("-       5 > Voltar                    -");
            System.out.println("---------------------------------------");

            int escolha = input.nextInt();
            switch (escolha) {

                case 1:
                    produtoView.cadastrarProduto();
                    break;
                case 2:
                    produtoView.editarProduto();
                    break;
                case 3:
                    produtoView.removerProduto();
                    break;
                case 4:
                    produtoView.listarProdutos();
                    break;
                case 5:
                    return -1;

            }
        }
    }
}

