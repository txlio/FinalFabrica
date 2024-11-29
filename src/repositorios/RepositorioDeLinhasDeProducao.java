package repositorios;

import entidades.LinhaDeProducao;
import java.util.ArrayList;
import java.util.List;

public class RepositorioDeLinhasDeProducao {
    private List<LinhaDeProducao> linhasDeProducao = new ArrayList<>();

    public void adicionarLinha(LinhaDeProducao linha) {
        linhasDeProducao.add(linha);
    }
    public List<LinhaDeProducao> listarLinhas() {
        return linhasDeProducao;
    }
}
