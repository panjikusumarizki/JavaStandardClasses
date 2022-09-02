package command.labs.learn.classes;

import java.util.Random;

public class RandomApp {
    public static void main(String[] args) {

        Random random = new Random();

        for (var i = 0; i < 100; i++) {
            int value = random.nextInt(100);
            System.out.println(value);
        }
    }
}
