package cg.streams.a11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import cg.streams.classes.Trader;

public class A11 {

	public static void main(String[] args) {
		
		StringBuilder s=new StringBuilder();
		List<Trader> t = new ArrayList();
		t.add(new Trader("rohit", "pune"));
		t.add(new Trader("ahil", "pune"));
		t.add(new Trader("anu", "mumbai"));
		t.add(new Trader("zera", "hyderabad"));
		t.add(new Trader("rahul", "chennai"));
		
		List<Trader> sl=t.stream().sorted((x, y) -> x.getName().compareTo(y.getName())).collect(Collectors.toList());
		
		for(Trader i:sl) {
			s.append(i.getName());
		}
		String str=s.toString();
		System.out.println(str);

	}

}
