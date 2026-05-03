import models.FrequencyCalc;

import java.util.ArrayList;
import java.util.List;

public class Program {


    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(3);
        nums.add(3);
        nums.add(3);

        FrequencyCalc calc = new FrequencyCalc(nums);

        System.out.println("Max Key: " + calc.getFrequency());


    }


}