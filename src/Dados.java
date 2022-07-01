import classes.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class Dados {
    static List<Veiculo> veiculos = new ArrayList<>() {
        {
            add(new Veiculo("Ford", "Fiesta", 1000));
            add(new Veiculo("Ford", "Focus", 1200));
            add(new Veiculo("Ford", "Explorer", 2500));
//            add(new Veiculo("Fiat", "Uno", 500));
//            add(new Veiculo("Fiat", "Cronos", 1000));
//            add(new Veiculo("Fiat", "Torino", 1250));
//            add(new Veiculo("Chevrolet", "Aveno", 1250));
//            add(new Veiculo("Chevrolet", "Spin", 2500));
//            add(new Veiculo("Toyota", "Corolla", 1200));
//            add(new Veiculo("Toyota", "Fortuner", 3000));
//            add(new Veiculo("Renault", "Logan", 950));
        }
    };

    public static List<Veiculo> getVeiculos() {
        return veiculos;
    }
}
