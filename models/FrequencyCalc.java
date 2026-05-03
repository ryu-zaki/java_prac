package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCalc {

    private List<Integer> nums = new ArrayList<>();

    public FrequencyCalc(List<Integer> nums) {
        this.nums = nums;
    }


    public List<Integer> getFrequency() {


        Map<Integer, Integer> frequencies = new HashMap<>();

        int appearanceNum = 1;

        for (Integer number: nums) {

            if (frequencies.containsKey(number)) {
                appearanceNum++;
                frequencies.replace(number, appearanceNum);

            } else {
                appearanceNum = 1;
                frequencies.put(number, appearanceNum);
            }

        }

        System.out.println(frequencies);

        return new ArrayList<>();

    }

}
