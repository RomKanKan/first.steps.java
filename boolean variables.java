package start.java.operation.arithmetic;

public class ArithmeticOperation {

	public static void main(String[] args) {
		
		int i = 6;
		int j = 7;
		
		boolean evenNumber;
		if (i % 2 == 0) {
			evenNumber = true;
		} else {
			evenNumber = false;
		}
		
		System.out.println(evenNumber);

		if (j % 2 == 0) {
			evenNumber = true;
		} else {
			evenNumber = false;
		}
		
		System.out.println(evenNumber);
	}

}
