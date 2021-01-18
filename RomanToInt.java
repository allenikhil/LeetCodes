/**
 * 
 */
package Arrays;

/**
 * @author Nikhil
 *
 */
public class RomanToInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
System.out.println(romanToInt("III"));
System.out.println(romanToInt("IV"));
System.out.println(romanToInt("VI"));
System.out.println(romanToInt(""));
	}
	
	 public static int romanToInt(String s) {
	        int[] map = new int[256];
	        map['I'] = 1; map['V'] = 5; map['X'] = 10; map['L'] = 50; map['C'] = 100; map['D'] = 500; map['M'] = 1000;
	        
	        int result = 0, previous = 1;
	        for (int i = s.length()-1; i >= 0; --i) {
	            int current = map[s.charAt(i)];
	            if (current < previous)
	            {
	                result -= current;
	            }
	            else {
	                previous = current;
	                result += current;
	            }
	        }
	        return result;
	    }

}
