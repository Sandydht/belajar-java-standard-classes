package StringBuilder;

public class StringBuilderApp {
    public static void main(String[] args) {
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
