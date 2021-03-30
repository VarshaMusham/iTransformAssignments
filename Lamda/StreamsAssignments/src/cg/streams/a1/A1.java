package cg.streams.a1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import cg.streams.classes.Fruit;

//Display  the  fruit  names  of  low  caloriesfruits 
//i.e.  calories  <  100  sorted  in descending order of calories.
public class A1 {

	public static void main(String[] args) {

		List<Fruit> f = new ArrayList();
		f.add(new Fruit("banana", 100, 120, "yellow"));
		f.add(new Fruit("apple", 87, 140, "red"));
		f.add(new Fruit("orange", 99, 10, "orange"));
		f.add(new Fruit("watermelon", 120, 400, "green"));

		List<Fruit> sortedList = f.stream().filter(p -> p.getCalories() < 100)
				.sorted(Comparator.comparingInt(Fruit::getCalories).reversed()).collect(Collectors.toList());

		sortedList.forEach(System.out::println);

	}

}
