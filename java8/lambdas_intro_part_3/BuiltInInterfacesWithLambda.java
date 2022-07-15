package java8.lambdas_intro_part_3;

import java.util.Random;
import java.util.function.IntBinaryOperator;

/*java.util.function*/
public class BuiltInInterfacesWithLambda {
		public static void main(String[] args) {
			
			IntBinaryOperator calc = (int x, int y) ->{
				
				Random rand = new Random();
				int randomNumber = rand.nextInt(5);
				return x*y+randomNumber;
			};
			
			System.out.println(calc.applyAsInt(2, 3));
		}
}
