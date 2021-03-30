package cg.streams.a2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import cg.streams.classes.Fruit;

public class A2 {

	public static void main(String[] args) {
		List<Fruit> f = new ArrayList();
		f.add(new Fruit("banana", 100, 120, "yellow"));
		f.add(new Fruit("apple", 87, 140, "red"));
		f.add(new Fruit("orange", 99, 10, "orange"));
		f.add(new Fruit("watermelon", 120, 400, "green"));

		f.stream().sorted((x, y) -> x.getColor().compareTo(y.getColor())).forEach(System.out::println);

	}

}
