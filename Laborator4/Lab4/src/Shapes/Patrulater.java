package Shapes;

import Interface.Calcul;
public class Patrulater implements Calcul {
    private double latura1;
    private double latura2;

    public Patrulater(double latura1, double latura2) {
        this.latura1 = latura1;
        this.latura2 = latura2;
    }

    @Override
    public double CalculPerimetru() {
        return 2 * (latura1 + latura2);
    }
}
