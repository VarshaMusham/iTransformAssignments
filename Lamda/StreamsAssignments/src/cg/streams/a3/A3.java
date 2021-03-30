package cg.streams.a3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import cg.streams.classes.Fruit;

public class A3 {

	public static void main(String[] args) {
		List<Fruit> f = new ArrayList();
		f.add(new Fruit("banana", 100, 120, "yellow"));
		f.add(new Fruit("apple", 87, 140, "red"));
		f.add(new Fruit("orange", 99, 10, "orange"));
		f.add(new Fruit("watermelon", 120, 400, "green"));
		f.add(new Fruit("cherry", 77, 80, "red"));
		
		f.stream().filter(p->p.getColor()=="red").sorted(Comparator.comparingInt(Fruit::getPrice)).forEach(System.out::println);

	}

}
