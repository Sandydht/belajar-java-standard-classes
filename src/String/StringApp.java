package String;

public class StringApp {
    public static void main(String[] args) {
//        stringMethod();
        stringBuilder();
    }

    public static void stringMethod() {
        String name = "Sandy Dwi Handoko Trapsilo";
        String nameLoweCase = name.toLowerCase();
        String nameUpperCase = name.toUpperCase();
        String[] names = name.split(" ");

        System.out.println(name);
        System.out.println(nameLoweCase);
        System.out.println(nameUpperCase);
        System.out.println(name.length());
        System.out.println(name.startsWith("Sandy"));
        System.out.println(name.endsWith("Dwi"));

        for (var value : names) {
            System.out.println(value);
        }
    }

    public static void stringBuilder() {
        StringBuilder builder = new StringBuilder();
        builder.append("Sandy");
        builder.append(" ");
        builder.append("Dwi");
        builder.append(" ");
        builder.append("Handoko");
        builder.append(" ");
        builder.append("Trapsilo");

        String fullname = builder.toString();
        System.out.println(fullname);
    }
}
