package cg.streams.a8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import cg.streams.classes.Fruit;
import cg.streams.classes.Trader;
import cg.streams.classes.Transaction;

public class A8 {

	public static void main(String[] args) {
		/*List<Trader> t = new ArrayList();
		t.add(new Trader("rohit","pune"));
		t.add(new Trader("anu","mumbai"));
		t.add(new Trader("zera","hyderabad"));
		t.add(new Trader("rahul","chennai"));
		*/
		
		List<Transaction> trs=new ArrayList();
		trs.add(new Transaction(new Trader("rohit","pune"),2020,400));
		trs.add(new Transaction(new Trader("anu","mumbai"),2020,405));
		trs.add(new Transaction(new Trader("rohit","pune"),2021,600));
		trs.add(new Transaction(new Trader("zera","hyderabad"),2021,1000));
		trs.add(new Transaction(new Trader("rahul","chennai"),2019,250));
		
		trs.stream().sorted(Comparator.comparingInt(Transaction::getValue)).forEach(System.out::println);
	}

}
