package cg.lamda.a7;

import java.util.HashMap;
import java.util.*;

public class A7 {

	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		h.put(1, "varsha");
		h.put(2, "navya");
		h.put(3, "gova");

		StringBuilder st = new StringBuilder();
		Set s = h.entrySet();
		Iterator it = s.iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			st.append(entry);
		}
		System.out.println(st);

	}

}
