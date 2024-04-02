public class Main {
    public static void main(String[] args) {


        Proprietar proprietar1 = new Proprietar("Andrei", "Popescu", 40);
        Proprietar proprietar2 = new Proprietar("Daniel", "Marian", 35);

        ShoppingMall mall = new ShoppingMall();
        mall.adaugaMagazin(new Magazin(1, "mag1", proprietar1, 10000, 50, 0), new MagazinAlimentar());
        mall.adaugaMagazin(new Magazin(2, "mag2", proprietar2, 20000, 40, 0), new MagazinHaine());
        mall.adaugaMagazin(new Magazin(3, "mag3", proprietar1, 15000, 30, 0), new MagazinChimicale());

        System.out.println("magazine sortate:");
        mall.afiseazaMagazine();
        System.out.println("magazinele proprietarului " + proprietar1.getNume() + ":");
        mall.afiseazaMagazineProprietar(proprietar1);
        System.out.println("venitul total pentru " + proprietar1.getNume() + ": " + mall.calculeazaVenitTotalProprietar(proprietar1));
        System.out.println("chiria totală pentru " + proprietar1.getNume() + ": " + mall.calculeazaChirieTotalaProprietar(proprietar1));

    }
}