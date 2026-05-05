import models.FrequencyCalc;
import models.RandomNumber;

import java.util.ArrayList;
import java.util.List;

public class Program {


    public static void main(String[] args) {
        // RandomNumber.setIsTest();
        int random = RandomNumber.getInstance().getRandoNumber();

        System.out.println(random);


    }


}