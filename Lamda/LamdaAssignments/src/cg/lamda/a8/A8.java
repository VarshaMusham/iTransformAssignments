package cg.lamda.a8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class A8 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(25);
		list.add(31);
		
		Consumer<List<Integer>> l = (p) -> p.forEach(a -> System.out.println(a));

		Thread t = new Thread(() -> l.accept(list));

		t.start();

	}

}
