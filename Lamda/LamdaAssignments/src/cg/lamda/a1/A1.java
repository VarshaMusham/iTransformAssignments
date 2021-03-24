package cg.lamda.a1;

public class A1 {

	public static void main(String[] args) {
		Operations add=(a,b)->a+b;
		Operations sub=(a,b)->a-b;
		Operations mul=(a,b)->a*b;
		Operations div=(a,b)->a/b;
		System.out.println("addition="+add.op(3,4));
		System.out.println("subtraction="+sub.op(3,4));
		System.out.println("multiplication="+mul.op(3,4));
		System.out.println("division="+div.op(4,4));
	}
	
	

}
