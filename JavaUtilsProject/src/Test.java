import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		
		  //Runtime.getRuntime().exec("TextEdit");//will open a new notepad  
		  Runtime r=Runtime.getRuntime();  

		  System.out.println(Runtime.getRuntime().availableProcessors());  
		  System.out.println("Total Memory: "+r.totalMemory());  
		  System.out.println("Free Memory: "+r.freeMemory());  
		    

		PerformAddition sum = (int a, int b) -> a+b;

		System.out.println(sum.add(10, 20));

		/*
		 * for(int i=1; i<=1; i++) {
		 * 
		 * }
		 */
	}

}
@FunctionalInterface
interface Hello{
	void demo();
}