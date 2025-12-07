package Number;

public class NumberApp {
    public static void main(String[] args) {
        Integer integerValue = 10;
        Long longValue = integerValue.longValue();
        Double doubleValue = integerValue.doubleValue();
        Short shortValue = doubleValue.shortValue();

        System.out.println(integerValue);
        System.out.println(longValue);
        System.out.println(doubleValue);
        System.out.println(shortValue);

        String contohInteger = "10000";
        Integer integerValueOf= Integer.valueOf(contohInteger);
        System.out.println(integerValueOf);
    }
}
