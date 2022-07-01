package classes;

public class Veiculo implements Comparable<Veiculo> {
// public class Veiculo {
    private String modelo;
    private String marca;
    private double preco;

    public Veiculo(String modelo, String marca, Integer preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Veiculo {" +
            "modelo: '" + modelo + '\'' +
            ", marca: '" + marca + '\'' +
            ", preco: '" + preco +
            '}';
    }

    @Override
    public int compareTo(Veiculo outroVeiculo) {
        // SINAL DE < PARA A ORDENAÇÃO SER DECRESCENTE
        if (outroVeiculo.preco < this.preco) {
            return -1;
        } else {
            if (outroVeiculo.preco > this.preco) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
