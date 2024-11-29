
import entidades.Produto;
import java.util.ArrayList;
import java.util.List;

public class RepositorioDeProdutos {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }
    public List<Produto> listarProdutos() {
        return produtos;
    }
}

