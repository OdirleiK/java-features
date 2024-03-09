package features.java.example.stringjoiner;

import java.util.StringJoiner;

public class ExampleStringJoiner {

	public static void main(String[] args) {
		
		StringJoiner sj = new StringJoiner(", ");
		
		sj.add("Joao");
		sj.add("Maria");
		sj.add("Ana");
		sj.add("Paulo");
		
		System.out.println(sj);
	}
}
