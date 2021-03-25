package cg.lamda.a3;

import java.util.function.Consumer;
import java.util.function.*;

public class A3 {

	public static void main(String[] args) {

		Predicate<Integer> p = n -> n % 2 == 0;
		System.out.println(p.test(5));

		Consumer<String> c = (String s) -> System.out.println(s);
		c.accept("Consumer Lambda");

		Supplier<String> s = () -> "Suplier Lamba";
		System.out.println(s.get());

		Function<String, Integer> sf = (str) -> str.length();
		System.out.println(sf.apply("varsha"));
	}

}
