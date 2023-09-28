package trainingarch;

public class MandAssInc1 {

	public static void main(String[] args) {
		int i=10;
		int j= i++ + i++ + --i + ++i + ++i;
		
		System.out.println(i);
		System.out.println(j);
		
		/*
		 * Value i=13

			j=57



Explanation:



i=10 //initial value of i

j= i++ + i++ + --i + ++i + ++i = 10+11+11+12+13= 57 //value of j

10 + 11 + 11 + 12 + 13

11 12 11 12 13

*/
	}
}
