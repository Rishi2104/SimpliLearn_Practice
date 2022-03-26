class Calculate {
	private int a,b;
	int Addition(int a, int b) {
		this.a=a;
		this.b=b;
		return this.a+this.b;
	}
	int Subtraction(int a,int b) {
		this.a=a;
		this.b=b;
		return this.a-this.b;
	}
	double Multiplication(int a,int b)
	{
		this.a=a;
		this.b=b;
		return this.a*this.b;
	}
	float Division(int a,int b)
	{
		this.a=a;
		this.b=b;
		return this.a/this.b;
	}
	final void reply() {
		System.out.println("\t\t\t**Thank You**");
	}
}
public class Arithmatic_Calculator {
public static void main(String[] args) {
	int a=20,b=10,c=11,d=30;
	Calculate ca=new Calculate();
	System.out.println("\t\t\tArithmatic Calculator");
	System.out.println(a+" + "+b+" = "+ca.Addition(a, b));
	System.out.println(a+" - "+c+" = "+ca.Subtraction(a,c));
	System.out.println(a+" * "+d+" = "+ca.Multiplication(a,d));
	System.out.println(d+" / "+b+" = "+ca.Division(d,b));
	ca.reply();
	
}
}
