package entidades;

import java.util.List;

public class LinhaDeProducao {
    private int id;
    private String descricao;
    private List<entidades.Operario> operarios;

    public LinhaDeProducao(int id, String descricao, List<entidades.Operario> operarios) {
        this.id = id;
        this.descricao = descricao;
        this.operarios = operarios;
    }
    public int getId() {
        return id;
    }
    public String getDescricao() {
        return descricao;
    }
    public List<entidades.Operario> getOperarios() {
        return operarios;
    }
    public String toString() {
        return "LinhaDeProducao [id=" + id + ", descricao=" + descricao + "]";
    }
}

