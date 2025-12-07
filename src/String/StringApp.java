package String;

public class StringApp {
    public static void main(String[] args) {
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
}
