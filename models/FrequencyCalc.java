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


    public Integer findMaxValueKey(Map<Integer,Integer> frequencies) {
        Integer maxValue = null;
        Integer maxKey = null;

        for (Map.Entry<Integer, Integer> entry: frequencies.entrySet()) {

            if (maxValue == null || maxValue < entry.getValue()) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        return maxKey;
    }


    public Integer getFrequency() {
        Map<Integer, Integer> frequencies = new HashMap<>();

        for (Integer number: nums) {
            if (frequencies.containsKey(number)) {
                Integer prevNum = frequencies.get(number);
                frequencies.replace(number, prevNum + 1);

            } else {
                frequencies.put(number, 1);
            }
        }

        Integer maxKey = findMaxValueKey(frequencies);
        frequencies.remove(maxKey);


        return findMaxValueKey(frequencies);

    }

}
