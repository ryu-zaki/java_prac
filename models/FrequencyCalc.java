package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class FrequencyCalc {

    private List<Integer> nums = new ArrayList<>();

    public FrequencyCalc(List<Integer> nums) {
        this.nums = nums;
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

        List<Map.Entry<Integer, Integer>> keyValues = new ArrayList<>(frequencies.entrySet());
        AtomicBoolean hasEven = new AtomicBoolean(true);

        keyValues.sort((a, b) -> {
                 int comparator = b.getValue() - a.getValue();

                 if (comparator == 0) return b.getKey() - a.getKey();

                 hasEven.set(false);
                 return comparator;
        });
        System.out.println(keyValues);

        return !hasEven.get() ? keyValues.get(1).getKey() : keyValues.get(0).getKey();

    }

}
