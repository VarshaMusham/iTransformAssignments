package cg.streams.a9;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

import cg.streams.classes.Trader;

public class A9 {

	public static void main(String[] args) {
		
		List<Trader> t = new ArrayList();
		t.add(new Trader("rohit", "pune"));
		t.add(new Trader("sahil", "pune"));
		t.add(new Trader("anu", "mumbai"));
		t.add(new Trader("zera", "hyderabad"));
		t.add(new Trader("rahul", "chennai"));

		t.stream().filter(distinctByKey(p -> p.getCity())).forEach(p->System.out.println(p.getCity()));

	}

	public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
		Set<Object> seen = ConcurrentHashMap.newKeySet();
		return t -> seen.add(keyExtractor.apply(t));
	}

}
