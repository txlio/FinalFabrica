package servicos;

import entidades.LinhaDeProducao;

public class PlanejamentoDeProducao {
    public void planejarProducao(LinhaDeProducao linha) {
        System.out.println("Planejando produção para a linha: " + linha.getDescricao());
    }
}
