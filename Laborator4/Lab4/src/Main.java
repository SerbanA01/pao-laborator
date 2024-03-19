import Shapes.*;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("raza cercului: ");
        Scanner scanner = new Scanner(System.in);
        double raza = scanner.nextDouble();
        Cerc cerc = new Cerc(raza);
        System.out.println("permietrul cercului este: " + cerc.CalculPerimetru());

        System.out.println("latura 1 a patrulaterului: ");
        double latura1 = scanner.nextDouble();
        System.out.println("latura 2 a patrulaterului: ");
        double latura2 = scanner.nextDouble();
        Patrulater patrulater = new Patrulater(latura1, latura2);
        System.out.println("perimetrul patrulaterului este: " + patrulater.CalculPerimetru());


    }
}