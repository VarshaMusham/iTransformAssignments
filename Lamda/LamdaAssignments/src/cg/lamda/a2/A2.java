package cg.lamda.a2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class A2 {

	public static void main(String[] args) {
		
		List<Order> orders=Arrays.asList(
				new Order(1,120,"completed"),
				new Order(2,10000,"accepted"),
				new Order(3,12000,"declined")
				);
		
		
		
		System.out.println("Order price more than 10000:");
		orders.stream().filter(p->p.price>10000).forEach(System.out::println);
		
		System.out.println("Order status is Accepted or Completed");
		orders.stream().filter(s->(s.status=="accepted")||(s.status=="completed")).forEach(System.out::println);
		
		

	}

}

