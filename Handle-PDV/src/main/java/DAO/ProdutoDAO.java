package DAO;

import Factory.ConnectionFactory;
import Model.Produto;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ProdutoDAO {

    private Connection connection;
    static List<Produto> produtos = new ArrayList<>();

    public ProdutoDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

//   public void adicionarProduto(Produto produto){
//       this.tabelaProdutos();
//       this.cadastrarProduto(produto);
//   }

    public void tabelaProdutos(){

        String sql = "CREATE TABLE IF NOT EXISTS produtos (" +
                "idProduto INT PRIMARY KEY AUTO_INCREMENT," +
                "nomeProduto VARCHAR(50) NOT NULL," +
                "quantProduto INT ," +
                "codigoDeBarras INT," +
                "valorCusto DECIMAL (20,2),"+
                "valorVenda DECIMAL (20,2)"+")";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.execute();
            stmt.close();

            System.out.println("Produto cadastrado com sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void cadastrarProduto(Produto p){

        String sql = "INSERT INTO produtos" +
                " (nomeProduto, quantProduto, codigoDeBarras,valorCusto,valorVenda) " +
                "VALUES (?,?,?,?,?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            stmt.setString(1, p.getNomeProduto());
            stmt.setLong(2,  p.getQuantProduto());
            stmt.setLong(3,  p.getCodigoDeBarras());
            stmt.setDouble(4, p.getValorCusto());
            stmt.setDouble(5, p.getValorVenda());

            stmt.execute();

            ResultSet resultSet = stmt.getGeneratedKeys();

            while (resultSet.next()) {
                p.setIdProduto(resultSet.getLong(1));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void editarProduto(int i, String conteudo, int opcao){
        switch (opcao){
            case 1:
                produtos.get(i).setNomeProduto(conteudo);
                this.tabelaProdutos();
                break;

            case 2:
                produtos.get(i).setQuantProduto(Long.parseLong(conteudo));
                this.tabelaProdutos();
                break;

            case 3:
                produtos.get(i).setCodigoDeBarras(Long.parseLong(conteudo));
                this.tabelaProdutos();
                break;

            case 4:
                produtos.get(i).setValorCusto(Double.parseDouble(conteudo));
                this.tabelaProdutos();
                break;

            case 5:
                produtos.get(i).setValorVenda(Double.parseDouble(conteudo));
                this.tabelaProdutos();
                break;
        }
    }


    public void removerProduto(Produto produto){
        String sql = "DELETE FROM produtos WHERE idProduto = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setLong(1, produto.getIdProduto());
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Produto> listarProdutos() {
        String sql = "SELECT * FROM produtos";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();

            List<Produto> produtos = new ArrayList<>();
            Produto produto;

            while (resultSet.next()) {
                produto = new Produto();
                produto.setIdProduto(resultSet.getInt("idProduto"));
                produto.setNomeProduto(resultSet.getString("nomeProduto"));
                produto.setQuantProduto(resultSet.getInt("quantProduto"));
                produto.setCodigoDeBarras(resultSet.getInt("codigoDeBarras"));
                produto.setValorCusto(resultSet.getDouble("valorCusto"));
                produto.setValorVenda(resultSet.getDouble("valorVenda"));
                produtos.add(produto);
            }
            return produtos;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

 /* try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Produtos.txt"));
            for (int i = 0; i < produtos.size(); i++){
                bufferedWriter.write(  produtos.get(i).getIdProduto() + "|" + produtos.get(i).getNomeProduto()
                        + "|" + produtos.get(i).getQuantProduto() + "|" + produtos.get(i).getCodigoDeBarras() +
                        "|" + produtos.get(i).getValorCusto() + "|"
                        + produtos.get(i).getValorVenda());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }
        catch (IOException e) {
            Logger.getLogger(Produto.class.getName()).log(Level.SEVERE, null, e);
        }
}
    public void carregarProduto(){
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader("Produtos.txt"));
            while (true){
                String linha = bufferedReader.readLine();
                if (linha == null){
                    break;
                }
                else{
                    StringTokenizer stringTokenizer = new StringTokenizer(linha, "|");
                    Produto produto = new Produto();
                    produto.setIdProduto(Long.parseLong(stringTokenizer.nextToken()));
                    produto.setNomeProduto(stringTokenizer.nextToken());
                    produto.setQuantProduto(Long.parseLong(stringTokenizer.nextToken()));
                    produto.setCodigoDeBarras(Long.parseLong(stringTokenizer.nextToken()));
                    produto.setValorCusto(Double.parseDouble(stringTokenizer.nextToken()));
                    produto.setValorVenda(Double.parseDouble(stringTokenizer.nextToken()));
                    produtos.add(produto);
                }
            }
        }
        catch (IOException ex) {
            System.out.println("Erro em ler arquivo dos Produtos.");
        }
    }*/