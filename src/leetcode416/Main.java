package leetcode416;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = {4,2,3,1,2};
		
		System.out.println("Input: " + Arrays.toString(nums));
		
		CheckIfTwoSubsetEqualFunction solution = new CheckIfTwoSubsetEqualFunction();
		
		System.out.println("Is there two subsets equal to each other? " + solution.canPartition(nums));
	}
}
