
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
        
        int previousSum = 0;
        int currentSum =0; 
        
        for(int i =0; i<numsInArray.length-1; i++) {

                for(int j = 1; j<numsInArray.length; j++){
                    currentSum = numsInArray[i] + numsInArray[j];
                    if (currentSum < previousSum) {
                        currentSum = previousSum;
                    }
                    else previousSum = currentSum;
                }
        }

        return currentSum;

    }
}