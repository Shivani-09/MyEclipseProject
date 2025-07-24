package main;

public class MajorityElementsUsingForLoop {

	public int majorityEles(int[] nums) {

		int n = nums.length;
		int freq = n / 2;

		for (int i = 0; i < nums.length; i++) {

			int index = nums[i];
			int freqCount = 0;

			for (int j = 0; j < nums.length; j++) {
				if (nums[j] == index) {
					freqCount++;
				}
			}
			if (freqCount >= freq) {
				return index;
			}
		}

		return -1;
	}
}