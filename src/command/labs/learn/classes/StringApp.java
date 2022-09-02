package command.labs.learn.classes;

public class StringApp {
    public static void main(String[] args) {

        String name = "Panji Kusumarizki";
        String nameLowerCase = name.toLowerCase();
        String nameUpperCase = name.toUpperCase();

        System.out.println(name);
        System.out.println(nameLowerCase);
        System.out.println(nameUpperCase);
        System.out.println(name.length());
        System.out.println(name.startsWith("Panji"));
        System.out.println(name.endsWith("Kusumarizki"));

        String[] names = name.split(" ");

        for (var value : names) {
            System.out.println(value);
        }

        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println("".isEmpty());
        System.out.println(name.charAt(0));

        char[] chars = name.toCharArray();

        for (var valu : chars) {
            System.out.println(valu);
        }
    }
}
