package cg.streams.a5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import cg.streams.classes.News;

public class A5 {

	public static void main(String[] args) {
		List<News> n = new ArrayList();
		n.add(new News(1, "varsha", "budget", "thanks"));
		n.add(new News(1, "shreya", "wow", "thanks"));
		n.add(new News(2, "divya", "good", "thanks"));
		n.add(new News(3, "ritika", "good", "thanks"));
		n.add(new News(4, "sindhu", "budget and goods", "thanks"));
		
		
		long c=n.stream().filter(p->p.getCommentByUser().contains("budget")).count();
		
		System.out.print(c);

	}

}
