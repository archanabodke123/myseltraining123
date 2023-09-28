package practicepkg;

public class AssignmentOperator {
	public static void main(String[] args) {
		int i=10, sum=0, substract=0, mul=0, div=0, mod=0;
		
		i+=20;
		sum=i;
		System.out.println("sum: "+sum);
		i-=20;
		substract=i;
		System.out.println("substract: "+substract);
		i*=20;
		mul=i;
		System.out.println("multiplication: "+mul);
		i/=20;
		div=i;
		System.out.println("Division: "+div);
		i%=20;
		mod=i;
		System.out.println("Modulus: "+mod);
	
	}
}
