class Implicit {
	void cast(char val) {
		int v1=val;
		double v2=val;
		System.out.println("Integer = "+v1+"\nDouble = "+v2);
	}
}
public class TypeCasting {
public static void main(String[] args) {
	Implicit i=new Implicit();
	char b='r';
	i.cast(b);
}
}