public class Magazin {

    private int id;
    private String numeMagazin;
    private Proprietar proprietar;
    private double venit;
    private double suprafata;
    private double chirie;

    public Magazin(int id, String numeMagazin, Proprietar proprietar, double venit, double suprafata, double chirie) {
        this.id = id;
        this.numeMagazin = numeMagazin;
        this.proprietar = proprietar;
        this.venit = venit;
        this.suprafata = suprafata;
        this.chirie = chirie;
    }

    public int getId() {
        return id;
    }

    public String getNumeMagazin() {
        return numeMagazin;
    }

    public Proprietar getProprietar() {
        return proprietar;
    }

    public double getVenit() {
        return venit;
    }

    public double getSuprafata() {
        return suprafata;
    }

    public double getChirie() {
        return chirie;
    }

    public void setChirie(double chirie) {
        this.chirie = chirie;
    }


    @Override
    public String toString() {
        return "\n\t\tMagazin{" +
                "id=" + id +
                ", numeMagazin='" + numeMagazin + '\'' +
                ", proprietar='" + proprietar + '\'' +
                ", venit=" + venit +
                ", suprafata=" + suprafata +
                ", chirie=" + chirie +
                '}';
    }
}
