package models;
import java.util.*;

public class RandomNumber {

    private Random r = null;
    private static RandomNumber instance = null;
    private static boolean isTest = false;

    private RandomNumber() {
        if (isTest) {
            r = new Random(1000);
        } else {
            r = new Random();
        }

    }

    public static void setIsTest() {
        isTest = true;
    }

    public static RandomNumber getInstance() {

        if (instance == null) {
            instance = new RandomNumber();
        }

        return instance;
    }

    public int getRandoNumber() {
        return r.nextInt(10);
    }

}
