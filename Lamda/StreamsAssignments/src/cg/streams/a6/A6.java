package cg.streams.a6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import cg.streams.classes.News;

public class A6 {

	public static void main(String[] args) {
		List<News> n = new ArrayList();
		n.add(new News(1, "varsha", "good", "thanks"));
		n.add(new News(3, "varsha", "wow", "thanks"));
		n.add(new News(3, "divya", "good", "thanks"));
		n.add(new News(3, "ritika", "good", "thanks"));
		n.add(new News(4, "varsha", "good", "thanks"));
		
		Map<String, Long> counters = n.stream()
				.collect(Collectors.groupingBy(p -> p.getPostedByUser(), Collectors.counting()));
		
		String a = counters.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
		
		System.out.print(a);

	}

}
