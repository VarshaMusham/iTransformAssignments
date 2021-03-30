package cg.streams.a12;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import cg.streams.classes.Trader;

public class A12 {

	public static void main(String[] args) {
		List<Trader> t = new ArrayList();
		t.add(new Trader("rohit", "pune"));
		t.add(new Trader("ahil", "pune"));
		t.add(new Trader("anu", "mumbai"));
		t.add(new Trader("zera", "hyderabad"));
		t.add(new Trader("rahul", "chennai"));
		
		Consumer<Trader> c=i->{
			if(i.getCity()=="Indore") {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		};
		
		t.stream().forEach(c);

	}

}
