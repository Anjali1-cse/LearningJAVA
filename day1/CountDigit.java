package task;

public class CountDigit {

	public static void main(String[] args) {
		int number = 6780;
		int count=0;
		while (number>0) {
			int rem =number%10;
			number=number/10;
			count++;
			
		}
		System.out.println(count);

	}

}
