
import java.lang.Math; 

public class Solution {
    /**
     * @param n: An integer
     * @return: true if this is a happy number or false
     */
    
    public boolean isHappy(int n) {
        int result = n;
        while (result != -1 && result != 1) {
            result = sumOfSquaredDigits(result);
        }
        return result == 1 ? true : false;
    }
    
    private int sumOfSquaredDigits(int testNumber) {
        int digitsOfNumber = (int)Math.log10(testNumber) + 1;
        int sum = 0;
        for (int i = 1; i <= digitsOfNumber; ++i) {
            sum += testNumber % Math.pow(10, i) / Math.pow(10, --i);
        } 
        System.out.println(sum);
        return testNumber == sum ? -1 : sum;
        
    }
}