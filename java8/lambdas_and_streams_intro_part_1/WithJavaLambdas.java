package java8.lambdas_and_streams_intro_part_1;

public class WithJavaLambdas {
	public static void main(String[] args) {
		
		Hello helloLambda = () ->System.out.println("hello world");
		
		helloLambda.sayHello();
	}
}
