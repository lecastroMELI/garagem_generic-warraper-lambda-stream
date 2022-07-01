import classes.Garagem;
import classes.Veiculo;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> listaVeiculos = Dados.getVeiculos();
        Garagem garagem = new Garagem(2022, listaVeiculos);

        System.out.println("--------ORDENA POR PREÇO-------------");

        // EXERCÍCIO 3 - ordena por preço crescentemente
        listaVeiculos.stream()
            .sorted(Comparator.comparing(Veiculo::getPreco))
            .forEach(System.out::println);

        System.out.println("--------ORDENA POR MARCA-------------");

        // EXERCÍCIO 4
        listaVeiculos.stream()
            .sorted((v1, v2) -> v1.getMarca().compareTo(v2.getMarca()))
            .forEach(System.out::println);

        // EXERCÍCIO 5
        System.out.println("--------PREÇO ATÉ $999-------------");
        listaVeiculos.stream()
            .filter(v -> v.getPreco() < 1000)
            .forEach(System.out::println);

        System.out.println("--------PREÇO A PARTIR $1000-------------");
        listaVeiculos.stream()
            .filter(veiculo -> veiculo.getPreco() >= 1000)
            .forEach(System.out::println);

        System.out.println("--------PREÇO MÉDIO-------------");
        double mediaPrecos = listaVeiculos.stream()
            .mapToDouble(Veiculo::getPreco) // substituindo a lambda por um método de referência Classe::Metodo
            .average() // faz a média
            .getAsDouble(); // converte para Double;

        System.out.println(mediaPrecos);

        //------------------- OUTRA FORMA DE FAZER - CRIANDO MÉTODOS DENTRO DA CLASSE GARAGEM --------------------//
        // (obs. os stream acima poderiam estar todos lá)
        garagem.aplicarDescontoGeral(100.0);
    }
}
