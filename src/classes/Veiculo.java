package classes;

public class Veiculo {
    private String modelo;
    private String marca;
    private Double preco;

    public Veiculo(String modelo, String marca, Double preco) {
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

    public Double getPreco() {
        return preco;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Veiculo {" +
            "modelo='" + modelo + '\'' +
            ", marca='" + marca + '\'' +
            ", preco=" + preco +
            '}';
    }
}
