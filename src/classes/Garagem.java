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

    //--------- IMPLEMENTAÇÕES ABAIXO REALIAZADAS COM BASE NO REPO:
    //--------- https://github.com/MauriKlein/com.dh.meli.LambdaEStream

    // APLICAR DESCONTO EM TODOS OS VEÍCULOS
    public void aplicarDescontoGeral(Double porcentagemDesconto){
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
}
