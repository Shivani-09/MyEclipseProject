package main;

import java.util.HashMap;
import java.util.Map;

class  MajorityElement{
    public int majorityElement(int[] nums) {
        // Create a HashMap to store number -> frequency mappings
        Map<Integer, Integer> counts = new HashMap<>();
        int n = nums.length;
        int majorityThreshold = n / 2; // Integer division is fine here, as we compare with >

        // Step 1: Count frequencies
        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        // Step 2: Check for majority
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (entry.getValue() > majorityThreshold) {
                return entry.getKey();
            }
        }

        // According to the problem statement, a majority element always exists,
        // so this line should theoretically not be reached.
        return -1; // Or throw an IllegalArgumentException
    }

}
