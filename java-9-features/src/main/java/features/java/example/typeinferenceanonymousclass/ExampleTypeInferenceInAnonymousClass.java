package features.java.example.typeinferenceanonymousclass;

public class ExampleTypeInferenceInAnonymousClass<T> {

	public static void main(String[] args) {
		
		//classe interna anonima 
		Sum<String> somaString = new Sum<>() {

			@Override
			public String soma(String a, String b) {
				return a + b;
			}
			
		};
		
		System.out.println(somaString.soma("tes", "te"));
	}
	
}
