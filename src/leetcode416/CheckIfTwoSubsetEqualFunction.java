package leetcode416;

public class CheckIfTwoSubsetEqualFunction {
    public boolean canPartition(int[] nums) {
    	// Add up all the numbers as sum
        int sum = 0;
        
        for(int i : nums){
            sum += i;
        }
        
        // Since there is suppose to have two group of numbers equal to each other, it needs to be even number
        if(sum % 2 == 1){
            return false;
        }
        
        // The sum should just be the half of the total
        sum = sum / 2;
        
        // This dp will keep track of previous sum that we found
        boolean[] dp = new boolean[sum + 1];
        
        // there is always a sum of 0
        dp[0] = true;
        
        // Go through each given number
        for(int num : nums){
        	// From each sum, mark all the possible sum to true
            for(int i = sum; i > 0; i--){
                if(i >= num){
                    dp[i] = (dp[i] || dp[i - num]); 
                }
            }
            
            // Check if we already found the other half of the total sum
            if(dp[sum]){
                return true;
            }
        }
        
        return false;
    }
}
