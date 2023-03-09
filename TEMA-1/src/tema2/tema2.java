package tema2;

public class tema2 {

    public static void main(String[] args) {

        double value = 100.0;
        double ivaRate = 0.21;
        double total = addIVA(value, ivaRate);
        System.out.println("Total with IVA: " + total);


    }

        public static double addIVA(double value, double ivaRate) {
        double iva = value * ivaRate;
        double total = value + iva;
        return total;
        }



}
