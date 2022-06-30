import classes.Veiculo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> listaVeiculos = Dados.getVeiculos();

        listaVeiculos.stream()
            .sorted((v1, v2) -> v1.getMarca().compareTo(v2.getMarca()))
            .forEach(System.out::println);
    }
}
