package fizzbuzz;

import java.util.Scanner;

public class FizzBuzzApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		FizzBuzz myFizzBuzz = new FizzBuzz(); 
			
		System.out.println("Welcome to Fizz Buzz!");
		System.out.println("Enty a non zero number and get a response");
		int number = input.nextInt();
		
		System.out.println(myFizzBuzz.response(number));
		input.close(); 
	}

}
