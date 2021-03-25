package cg.lamda.a5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A5 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Rick");
		list.add("Negan");
		list.add("Daryl");
		list.add("Glenn");
		list.add("Carl");

		StringBuilder s = new StringBuilder();

		list.forEach((x) -> s.append(x.charAt(0)));
		System.out.print(s);

	}

}
