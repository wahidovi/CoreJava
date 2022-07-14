package java8.lambdas_and_streams_intro_part_2;

import java.util.Random;

public class CalcLambda {

	public static void main(String[] args) {
		Calculate cal = (int x, int y) -> {
			Random rand = new Random();
			int ramdomNumber = rand.nextInt(5);
			
			return x*y + ramdomNumber;
			
		};
		
		System.out.println(cal.calc(2, 3));
		
	}
}
