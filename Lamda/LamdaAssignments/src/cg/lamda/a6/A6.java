package cg.lamda.a6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class A6 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Rick");
		list.add("Negan");
		list.add("Daryl");
		list.add("Glenn");
		list.add("Carl");
		
		UnaryOperator<String> upstr= x-> x.replaceAll(x, x.toUpperCase());
		list.forEach(l->System.out.println(upstr.apply(l)));
		
		

	}

}
