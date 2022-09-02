package command.labs.learn.classes;

public class NumberApp {
    public static void main(String[] args) {

        Integer intValue = 19;

        Long longValue = intValue.longValue();
        Double doubleValue = intValue.doubleValue();
        Short shortValue = doubleValue.shortValue();

        String nilai = "198.750";

        Double nilaiInt = Double.valueOf(nilai);
        System.out.println(nilaiInt);
    }
}
