interface Figura {

	void desenha();
}

public class LambdaExampleInterfaceFunctional {

	public static void main(String[] args) {
		
		//without lambda
		Figura fig1 = new Figura() {
			@Override
			public void desenha() {
				System.out.println("draw figure 1");
			}
		};
		
		fig1.desenha();

		//with lambda
		Figura fig2 = () -> System.out.println("draw figure 2");
		fig2.desenha();
	}
}
