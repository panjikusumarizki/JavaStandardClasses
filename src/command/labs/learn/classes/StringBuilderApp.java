package command.labs.learn.classes;

public class StringBuilderApp {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        builder.append("Panji");
        builder.append(" ");
        builder.append("Kusumarizki");

        String name = builder.toString();
        System.out.println(name);
    }
}
