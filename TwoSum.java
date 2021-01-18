/**
 * 
 */
package Arrays;

import java.util.Hashtable;
/**
 * @author Nikhil
 *
 */
public class TwoSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {2,7,11,15};
		int	target = 9;
		int op[]=twoSum(nums,target);
		for(int i=0;i<op.length;i++)
		{
			System.out.println(op[i]);
		}
	}

	public static int[] twoSum(int[] numbers, int target) {
	    int[] result = new int[2];
	    Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();
	    
	    for(int i = 0; i < numbers.length; i++){
	        if(table.containsKey(numbers[i])){
	        	
				/*
				 * if(table.get(numbers[i])>0) result[0] = table.get(numbers[i])-1; else
				 * result[0] = table.get(numbers[i]);
				 */
	        	
	            result[0] = table.get(numbers[i]);
	            result[1] = i ;
	        }
	        table.put(target - numbers[i], i);
	    }
	    
	    return result;
	}
	
}
