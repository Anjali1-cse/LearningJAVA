package task;

public class SkipZero {

	public static void main(String[] args) {
		  int number = 10008;
	        int result = 0;
	       

	        
	        int temp = 0;
	        while (number > 0) {
	            temp = temp * 10 + number % 10;
	            number = number / 10;
	        }

	       
	        while (temp > 0) {
	            int rem = temp % 10;
	            if (rem != 0) {
	                result = result * 10 + rem;
	            }
	            temp = temp / 10;
	        }

	        System.out.println(result);

	}

}
