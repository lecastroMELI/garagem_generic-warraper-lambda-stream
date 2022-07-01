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

    public void setId(int id) {
        this.id = id;
    }

    public void setListaVeiculos(List<Veiculo> listaVeiculos) {
        this.listaVeiculos = listaVeiculos;
    }

    // EXIBIR NA TELA EM ORDEM DECRESCENTE DE PREÇO
    public void ordenarDescrescentemente() {
        System.out.println("Ordenados Decrescentemente");
        // O .sorted() NÃO PRECISA DE PARÂMETRO, PQ FOI IMPLEMENTADO O MÉTODO compareTo NA CLASSE VEÍCULO
        listaVeiculos.stream().sorted().forEach(System.out::println);
    }

    //--------- IMPLEMENTAÇÕES ABAIXO REALIAZADAS COM BASE NO REPO:
    //--------- https://github.com/MauriKlein/com.dh.meli.LambdaEStream


    // APLICAR DESCONTO EM TODOS OS VEÍCULOS
    public void aplicarDescontoGeral(Double porcentagemDesconto) {
        System.out.println("__________________________________________________________________________________");
        System.out.println("Listando os veículos após a aplicação do desconto de " + porcentagemDesconto + "%.");
        System.out.println("----------------------------------------------------------------------------------");

        listaVeiculos.forEach((veiculo) -> {
            // 1º vai realizar o cálculo do preço, obtendo o preço através do método getPreco. Essa conta vai resultar
            // um valor double.
            // 2º Essa resultado será setado, por meio do setPreco, para todos os veículos
            veiculo.setPreco(veiculo.getPreco() - veiculo.getPreco() * (porcentagemDesconto / 100));
        });

        // printt da lista
        listaVeiculos.forEach(System.out::println);
    }

    // LISTAR TODOS OS VEÍCULOS ORDENADOS POR MORDELO E DEPOIS POR VALOR
    public void ordenarPorMarcaEValor() {
        System.out.println("__________________________________________________________________________________");
        System.out.println("Ordernados por Modelo e por Valor de forma descrescente de valor");

        listaVeiculos.stream()
            .sorted((v1, v2) -> v1.getModelo().compareTo(v2.getModelo())) // por marca
            .sorted() // por valor usando o compareTo da classe Veículo como parâmetro
            .forEach(System.out::println);
    }
}
