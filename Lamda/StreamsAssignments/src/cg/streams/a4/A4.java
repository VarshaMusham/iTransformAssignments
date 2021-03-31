package cg.streams.a4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import cg.streams.classes.News;
import cg.streams.classes.Transaction;

public class A4 {

	public static void main(String[] args) {
		List<News> n = new ArrayList();
		n.add(new News(1, "varsha", "good", "thanks"));
		n.add(new News(3, "shreya", "wow", "thanks"));
		n.add(new News(3, "divya", "good", "thanks"));
		n.add(new News(3, "ritika", "good", "thanks"));
		n.add(new News(4, "sindhu", "good", "thanks"));

		Map<Integer, Long> counters = n.stream()
				.collect(Collectors.groupingBy(p -> p.getNewsId(), Collectors.counting()));
		int a = counters.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();

		System.out.print(a);
	}

}
