package StringJoiner;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(
                ", ", "[", "]"
        );

        joiner.add("Sandy");
        joiner.add("Dwi");
        joiner.add("Handoko");
        joiner.add("Trapsilo");

        System.out.println(joiner.toString());
    }
}
