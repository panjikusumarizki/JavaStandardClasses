package command.labs.learn.classes;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {

        StringJoiner joiner = new StringJoiner(", ","[","]");

        joiner.add("Panji");
        joiner.add("Kusumarizki");

        String value = joiner.toString();
        System.out.println(value);
    }
}
