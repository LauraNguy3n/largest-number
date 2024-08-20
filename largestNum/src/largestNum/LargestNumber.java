package largestNum;

public class LargestNumber {

	static void something(int num1, int num2, int num3) {
		int largest;
		if (num1>=num2 && num1 >=num3) {
		largest=num1;
			
		}
		else if (num2 >= num1 && num2 >= num3) {
			largest=num2;
		}
		else {
			largest=num3;
		}
		System.out.print("the largest number is " + largest);
		
		
	}
	
	public static void main(String[] args) {
		

		something(7,40,10);
		
		
	}

}
