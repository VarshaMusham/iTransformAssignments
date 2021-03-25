package cg.lamda.a4;

import java.util.*;


public class A4 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Rick");
		list.add("Negan");
		list.add("Daryl");
		list.add("Glenn");
		list.add("Carl");
		
		
		list.removeIf(s->s.length()%2 != 0);
		for(String l:list) {
			System.out.println(l);
		}
	}

}
