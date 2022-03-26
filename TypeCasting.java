class Tcast {
	void implicit(char val) {
		long v1=val;
		double v2=val;
		System.out.println("\t\tImplicit:\nLong = "+v1+"\nDouble = "+v2);
	}
	void explicit(double k) {
		double k1=k;
		int p=(int)(k1);
		System.out.println("\t\tExplicit:\nDouble to Integer \n"+ k+" to "+p);
	}
}
public class TypeCasting {
public static void main(String[] args) {
	Tcast i=new Tcast();
	char b='r';
	double k=229.12;
	System.out.println("\t\t  ****Type Casting****");
	i.implicit(b);
	i.explicit(k);
}
}