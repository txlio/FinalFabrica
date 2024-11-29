package principal;

import entidades.*;
import entidades.Operario;
import repositorios.*;
import servicos.*;

import java.util.List;
import java.util.ArrayList;

public class SistemaDeControleDeProducao {
    public static void main(String[] args) {

        RepositorioDeProdutos repositorioProdutos = new RepositorioDeProdutos();
        RepositorioDeLinhasDeProducao repositorioLinhas = new RepositorioDeLinhasDeProducao();

        Produto p1 = new Produto(1, "Produto A", 15.0);
        Produto p2 = new Produto(2, "Produto B", 8.0);
        repositorioProdutos.adicionarProduto(p1);
        repositorioProdutos.adicionarProduto(p2);

        Operario o1 = new Operario(1, "Operário 1");
        Operario o2 = new Operario(2, "Operário 2");

        List<Operario> operarios = new ArrayList<>();
        operarios.add(o1);
        operarios.add(o2);
        LinhaDeProducao linha1 = new LinhaDeProducao(1, "Linha A", operarios);
        repositorioLinhas.adicionarLinha(linha1);

        ControleDeQualidade controle = new ControleDeQualidade();
        PlanejamentoDeProducao planejamento = new PlanejamentoDeProducao();

        System.out.println("Verificando qualidade dos produtos:");
        for (Produto produto : repositorioProdutos.listarProdutos()) {
            System.out.println(produto + " Qualidade: " + (controle.verificarQualidade(produto) ? "Aprovado" : "Reprovado"));
        }
        System.out.println("\nPlanejamento de produção:");
        for (LinhaDeProducao linha : repositorioLinhas.listarLinhas()) {
            planejamento.planejarProducao(linha);
        }
    }
}
