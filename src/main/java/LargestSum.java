
import java.util.ArrayList;
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        List<Integer> numbers = new ArrayList<>(nums);
        int[] numsInArray = new int[numbers.size()];
        
        int largest = Integer.MIN_VALUE;
        int secondLargest =Integer.MIN_VALUE; 
        
        for(int num : nums) {
            if(num > largest){
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest){
                secondLargest = num;
            }
        }

        return largest + secondLargest;

    }
}