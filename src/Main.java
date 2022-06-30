import classes.Veiculo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> listaVeiculos = Dados.getVeiculos();

        listaVeiculos.stream()
            .forEach(System.out::println);
    }
}
