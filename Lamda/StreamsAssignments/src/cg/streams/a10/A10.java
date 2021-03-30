package cg.streams.a10;

import java.util.ArrayList;
import java.util.List;

import cg.streams.classes.Trader;

public class A10 {

	public static void main(String[] args) {
		List<Trader> t = new ArrayList();
		t.add(new Trader("rohit", "pune"));
		t.add(new Trader("ahil", "pune"));
		t.add(new Trader("anu", "mumbai"));
		t.add(new Trader("zera", "hyderabad"));
		t.add(new Trader("rahul", "chennai"));

		t.stream().filter(p -> p.getCity() == "pune").sorted((x, y) -> x.getName().compareTo(y.getName()))
				.forEach(p -> System.out.println(p.getName()));

	}

}
