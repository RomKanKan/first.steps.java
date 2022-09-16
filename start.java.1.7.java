package ua.foxminded.helloworld;

public class HelloWorld {

	public static void main(String[] args) {
		
		String message = "Hello World!";
		String words = "Java forever";
		String space = " ";
		int i = 6;
		int j = 7;
		int answer = i * j;
		String number = "-2";
		int result = answer + Integer.parseInt(number);
		String oneMoreAnswer = message + space + result;
				
		System.out.println(message + space + words);
		System.out.println(oneMoreAnswer);
		
		

	}

}
