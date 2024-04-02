import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;



public class ShoppingMall {
    private List<Magazin> magazine = new ArrayList<>();

    public void adaugaMagazin(Magazin magazin, Chirie strategieChirie) {
        magazin.setChirie(strategieChirie.calculChirie(magazin.getSuprafata()));
        magazine.add(magazin);
    }

    public void afiseazaMagazine() {
        magazine.stream()
                .sorted(Comparator.comparing((Magazin m) -> m.getProprietar().getNume())
                        .thenComparing(m -> m.getProprietar().getPrenume())
                        .thenComparing(Magazin::getChirie))
                .forEach(System.out::println);
    }

    public void afiseazaMagazineProprietar(Proprietar proprietar) {
        magazine.stream()
                .filter(magazin -> magazin.getProprietar().equals(proprietar))
                .sorted(Comparator.comparing(Magazin::getNumeMagazin)
                        .thenComparing(Magazin::getVenit)
                        .thenComparing(Magazin::getChirie)
                        .thenComparing(Magazin::getSuprafata))
                .forEach(System.out::println);
    }

    public double calculeazaVenitTotalProprietar(Proprietar proprietar) {
        return magazine.stream()
                .filter(magazin -> magazin.getProprietar().equals(proprietar))
                .mapToDouble(Magazin::getVenit)
                .sum();
    }

    public double calculeazaChirieTotalaProprietar(Proprietar proprietar) {
        return magazine.stream()
                .filter(magazin -> magazin.getProprietar().equals(proprietar))
                .mapToDouble(Magazin::getChirie)
                .sum();
    }
}