package servicos;

import entidades.Produto;

public class ControleDeQualidade {
    public boolean verificarQualidade(Produto produto) {
        return produto.getPreco() > 10;
    }
}
