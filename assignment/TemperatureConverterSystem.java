package assignment;

abstract class TempConverter {
    abstract double toC(double val);
    abstract double fromC(double c);
}

class FahrenheitConverter extends TempConverter {
    double toC(double f) {
        return (f - 32) * 5 / 9;
    }

    double fromC(double c) {
        return c * 9 / 5 + 32;
    }
}

class KelvinConverter extends TempConverter {
    double toC(double k) {
        if (k < 0) throw new IllegalArgumentException("Below absolute zero");
        return k - 273.15;
    }

    double fromC(double c) {
        return c + 273.15;
    }
}

public class TemperatureConverterSystem {
    public static void main(String[] args) {
        try {
            TempConverter f = new FahrenheitConverter();
            TempConverter k = new KelvinConverter();

            System.out.println("25C to F = " + f.fromC(25));
            System.out.println("300K to C = " + k.toC(300));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}