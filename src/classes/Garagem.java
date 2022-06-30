package classes;

import java.util.List;

public class Garagem {
    private int id;
    List<Veiculo> listaVeiculos;

    public Garagem(int id, List<Veiculo> listaVeiculos) {
        this.id = id;
        this.listaVeiculos = listaVeiculos;
    }

    public int getId() {
        return id;
    }

    public List<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }
}
