package cg.streams.a13;

import java.util.ArrayList;
import java.util.List;

import cg.streams.classes.Trader;
import cg.streams.classes.Transaction;

public class A13 {

	public static void main(String[] args) {
		List<Transaction> trs=new ArrayList();
		trs.add(new Transaction(new Trader("rohit","delhi"),2020,400));
		trs.add(new Transaction(new Trader("anu","mumbai"),2020,405));
		trs.add(new Transaction(new Trader("rohit","pune"),2021,600));
		trs.add(new Transaction(new Trader("zera","delhi"),2021,1000));
		trs.add(new Transaction(new Trader("rahul","chennai"),2019,250));
		
		trs.stream().filter(p->p.getTrader().getCity()=="delhi").forEach(p->System.out.println(p.getValue()));

	}

}
